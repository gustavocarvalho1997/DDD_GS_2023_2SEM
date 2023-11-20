package br.com.fiap.gs2sem.models;

public final class Resultado {
	// Atributos
	private int id;
	private String classificacao;
	private double p1;
	private double p2;
	private double p3;
	private double p4;
	private double p5;
	private double p6;
	private double p7;
	private double p8;
	private double p9;
	private double p10;
	private double p11;
	private double p12;
	private double p13;
	private double p14;
	private double p15;
	private double p16;
	private double p17;
	private Exame exame;
	
	// Construtores
	public Resultado(int id, String classificacao, double p1, double p2, double p3, double p4, double p5, double p6,
			double p7, double p8, double p9, double p10, double p11, double p12, double p13, double p14, double p15,
			double p16, double p17, Exame exame) {
		super();
		this.id = id;
		this.classificacao = classificacao;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
		this.p7 = p7;
		this.p8 = p8;
		this.p9 = p9;
		this.p10 = p10;
		this.p11 = p11;
		this.p12 = p12;
		this.p13 = p13;
		this.p14 = p14;
		this.p15 = p15;
		this.p16 = p16;
		this.p17 = p17;
		this.exame = exame;
	}
	public Resultado() {
		super();
	}
	public Resultado(int id) {
		super();
		this.id = id;
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public double getP1() {
		return p1;
	}
	public double getP2() {
		return p2;
	}
	public double getP3() {
		return p3;
	}
	public double getP4() {
		return p4;
	}
	public double getP5() {
		return p5;
	}
	public double getP6() {
		return p6;
	}
	public double getP7() {
		return p7;
	}
	public double getP8() {
		return p8;
	}
	public double getP9() {
		return p9;
	}
	public double getP10() {
		return p10;
	}
	public double getP11() {
		return p11;
	}
	public double getP12() {
		return p12;
	}
	public double getP13() {
		return p13;
	}
	public double getP14() {
		return p14;
	}
	public double getP15() {
		return p15;
	}
	public double getP16() {
		return p16;
	}
	public double getP17() {
		return p17;
	}
	public Exame getExame() {
		return exame;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public void setP1(double p1) {
		this.p1 = p1;
	}
	public void setP2(double p2) {
		this.p2 = p2;
	}
	public void setP3(double p3) {
		this.p3 = p3;
	}
	public void setP4(double p4) {
		this.p4 = p4;
	}
	public void setP5(double p5) {
		this.p5 = p5;
	}
	public void setP6(double p6) {
		this.p6 = p6;
	}
	public void setP7(double p7) {
		this.p7 = p7;
	}
	public void setP8(double p8) {
		this.p8 = p8;
	}
	public void setP9(double p9) {
		this.p9 = p9;
	}
	public void setP10(double p10) {
		this.p10 = p10;
	}
	public void setP11(double p11) {
		this.p11 = p11;
	}
	public void setP12(double p12) {
		this.p12 = p12;
	}
	public void setP13(double p13) {
		this.p13 = p13;
	}
	public void setP14(double p14) {
		this.p14 = p14;
	}
	public void setP15(double p15) {
		this.p15 = p15;
	}
	public void setP16(double p16) {
		this.p16 = p16;
	}
	public void setP17(double p17) {
		this.p17 = p17;
	}
	public void setExame(Exame exame) {
		this.exame = exame;
	}
}//CLASS