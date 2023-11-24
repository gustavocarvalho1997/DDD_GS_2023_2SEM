# Global Solution 2023

## Nomes

Gustavo Carvalho - RM 552466


Ronald de Oliveira - RM 552364


Lucas Serbato - RM 551821


Nicolly de Almeida - RM 552579


Vitor Teixeira - RM 552228



# Endpoints


Verbo: GET

Endpoint: http://localhost:8080/GSApi/api/paciente/endereco/{id}

Descrição: Retorna o endereço de acordo com o ID fornecido, e verifica tambem se pertence ao usuario dono das credenciais enviadas.

Precisa de credenciais (email, senha): SIM.



Verbo: GET

Endpoint: http://localhost:8080/GSApi/api/laboratorio

Descrição: Retorna uma lista com todos os laboratórios cadastrados.

Precisa de credenciais (email, senha): NÃO.



Verbo: GET

Endpoint: http://localhost:8080/GSApi/api/laboratorio/{id}

Descrição: Retorna o laboratório do id informado.

Precisa de credenciais (email, senha): NÃO.



Verbo: GET

Endpoint: http://localhost:8080/GSApi/api/paciente/auth

Descrição: Retorna o paciente de acordo com as credenciais fornecidas.

Precisa de credenciais (email, senha): SIM.



Verbo: PUT

Endpoint: http://localhost:8080/GSApi/api/paciente/senha

Descrição: Permite fazer a alteração da senha cadastrada do usuário.

Precisa de credenciais (email, senha): SIM.



Verbo: GET

Endpoint: http://localhost:8080/GSApi/api/resultados

Descrição: Retorna uma lista com todos os resultados da tabela.

Precisa de credenciais (email, senha): NÃO.



Verbo: GET

Endpoint: http://localhost:8080/GSApi/api/tipoExame

Descrição: Retorna uma lista com todos os tipos de exames.

Precisa de credenciais (email, senha): NÃO.



Verbo: GET

Endpoint: http://localhost:8080/GSApi/api/tipoExame/{id}

Descrição: Retorna o tipo de exame referente a esse id.

Precisa de credenciais (email, senha): NÃO.



Verbo: GET

Endpoint: http://localhost:8080/GSApi/api/recomendacao

Descrição: Retorna uma lista com todas as recomendações.

Precisa de credenciais (email, senha): NÃO.



Verbo: GET

Endpoint: http://localhost:8080/GSApi/api/recomendacao/{id}

Descrição: Retorna a recomendação referente a esse id.

Precisa de credenciais (email, senha): NÃO.



Verbo: POST

Endpoint: http://localhost:8080/GSApi/api/recomendacao

Descrição: Permite cadastrar uma recomendação.

Precisa de credenciais (email, senha): NÃO.



Verbo: DELETE

Endpoint: http://localhost:8080/GSApi/api/recomendacao/{id}

Descrição: Permite deletar uma recomendação conforme id informado.

Precisa de credenciais (email, senha): NÃO.



Verbo: PUT

Endpoint: http://localhost:8080/GSApi/api/recomendacao/{id}

Descrição: Permite atualizar uma recomendação.

Precisa de credenciais (email, senha): NÃO.
