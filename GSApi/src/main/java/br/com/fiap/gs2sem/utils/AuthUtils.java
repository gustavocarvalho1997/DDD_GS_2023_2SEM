package br.com.fiap.gs2sem.utils;

public final class AuthUtils {
	private AuthUtils() {
	}

	// decodeAuth INICIO
	public static String[] decodeAuth(String authString) {
		String decodedAuth = "";
		String[] authParts = authString.split("\\s+");
		String authInfo = authParts[1];
		byte[] bytes = null;
		bytes = java.util.Base64.getDecoder().decode(authInfo);
		decodedAuth = new String(bytes);
		String[] credentials = decodedAuth.split(":");
		return credentials;
	}// decodeAuth FI
}// CLASS