-- Inserir dados em t_obs_estado
INSERT INTO t_obs_estado (id_estado, sg_estado, nm_estado)
VALUES (1, 'SP', 'São Paulo');

INSERT INTO t_obs_estado (id_estado, sg_estado, nm_estado)
VALUES (2, 'RJ', 'Rio de Janeiro');

INSERT INTO t_obs_estado (id_estado, sg_estado, nm_estado)
VALUES (3, 'MG', 'Minas Gerais');

INSERT INTO t_obs_estado (id_estado, sg_estado, nm_estado)
VALUES (4, 'ES', 'Espírito Santo');

INSERT INTO t_obs_estado (id_estado, sg_estado, nm_estado)
VALUES (5, 'PR', 'Paraná');

INSERT INTO t_obs_estado (id_estado, sg_estado, nm_estado)
VALUES (6, 'SC', 'Santa Catarina');

INSERT INTO t_obs_estado (id_estado, sg_estado, nm_estado)
VALUES (7, 'RS', 'Rio Grande do Sul');

INSERT INTO t_obs_estado (id_estado, sg_estado, nm_estado)
VALUES (8, 'GO', 'Goiás');

INSERT INTO t_obs_estado (id_estado, sg_estado, nm_estado)
VALUES (9, 'MT', 'Mato Grosso');

INSERT INTO t_obs_estado (id_estado, sg_estado, nm_estado)
VALUES (10, 'MS', 'Mato Grosso do Sul');

-- Inserir dados em t_obs_cidade
INSERT INTO t_obs_cidade (id_cidade, nm_cidade, nr_ddd, id_estado)
VALUES (1, 'São Paulo', 11, 1);

INSERT INTO t_obs_cidade (id_cidade, nm_cidade, nr_ddd, id_estado)
VALUES (2, 'Rio de Janeiro', 21, 2);

INSERT INTO t_obs_cidade (id_cidade, nm_cidade, nr_ddd, id_estado)
VALUES (3, 'Belo Horizonte', 31, 3);

INSERT INTO t_obs_cidade (id_cidade, nm_cidade, nr_ddd, id_estado)
VALUES (4, 'Vitória', 27, 4);

INSERT INTO t_obs_cidade (id_cidade, nm_cidade, nr_ddd, id_estado)
VALUES (5, 'Curitiba', 41, 5);

INSERT INTO t_obs_cidade (id_cidade, nm_cidade, nr_ddd, id_estado)
VALUES (6, 'Florianópolis', 48, 6);

INSERT INTO t_obs_cidade (id_cidade, nm_cidade, nr_ddd, id_estado)
VALUES (7, 'Porto Alegre', 51, 7);

INSERT INTO t_obs_cidade (id_cidade, nm_cidade, nr_ddd, id_estado)
VALUES (8, 'Goiânia', 62, 8);

INSERT INTO t_obs_cidade (id_cidade, nm_cidade, nr_ddd, id_estado)
VALUES (9, 'Cuiabá', 65, 9);

INSERT INTO t_obs_cidade (id_cidade, nm_cidade, nr_ddd, id_estado)
VALUES (10, 'Campo Grande', 67, 10);

-- Inserir dados em t_obs_bairro
INSERT INTO t_obs_bairro (id_bairro, nm_bairro, nm_zona, id_cidade)
VALUES (1, 'Santana', 'Zona Norte', 1);

INSERT INTO t_obs_bairro (id_bairro, nm_bairro, nm_zona, id_cidade)
VALUES (2, 'Morumbi', 'Zona Sul', 1);

INSERT INTO t_obs_bairro (id_bairro, nm_bairro, nm_zona, id_cidade)
VALUES (3, 'Tatuapé', 'Zona Leste', 1);

INSERT INTO t_obs_bairro (id_bairro, nm_bairro, nm_zona, id_cidade)
VALUES (4, 'Pinheiros', 'Zona Oeste', 1);

INSERT INTO t_obs_bairro (id_bairro, nm_bairro, nm_zona, id_cidade)
VALUES (5, 'República', 'Centro', 1);

INSERT INTO t_obs_bairro (id_bairro, nm_bairro, nm_zona, id_cidade)
VALUES (6, 'Tijuca', 'Zona Norte', 2);

INSERT INTO t_obs_bairro (id_bairro, nm_bairro, nm_zona, id_cidade)
VALUES (7, 'Copacabana', 'Zona Sul', 2);

INSERT INTO t_obs_bairro (id_bairro, nm_bairro, nm_zona, id_cidade)
VALUES (8, 'Penha', 'Zona Leste', 2);

INSERT INTO t_obs_bairro (id_bairro, nm_bairro, nm_zona, id_cidade)
VALUES (9, 'Barra da Tijuca', 'Zona Oeste', 2);

INSERT INTO t_obs_bairro (id_bairro, nm_bairro, nm_zona, id_cidade)
VALUES (10, 'Santa Tereza', 'Centro', 2);


-- Inserir dados em t_obs_logradouro
INSERT INTO t_obs_logradouro (id_logradouro, nm_logradouro, nr_cep, id_bairro)
VALUES (1, 'Rua Voluntários da Pátria', 2010200, 1);

INSERT INTO t_obs_logradouro (id_logradouro, nm_logradouro, nr_cep, id_bairro)
VALUES (2, 'Rua Almirante Soares Dutra', 05654000, 2);

INSERT INTO t_obs_logradouro (id_logradouro, nm_logradouro, nr_cep, id_bairro)
VALUES (3, 'Rua Artur Mendonça', 03067040, 3);

INSERT INTO t_obs_logradouro (id_logradouro, nm_logradouro, nr_cep, id_bairro)
VALUES (4, 'Jardim Borba Gato', 05415029, 4);

INSERT INTO t_obs_logradouro (id_logradouro, nm_logradouro, nr_cep, id_bairro)
VALUES (5, 'Praça Dom José Gaspar,', 01047010, 5);

INSERT INTO t_obs_logradouro (id_logradouro, nm_logradouro, nr_cep, id_bairro)
VALUES (6, 'Rua Afonso Pena', 20270242, 6);

INSERT INTO t_obs_logradouro (id_logradouro, nm_logradouro, nr_cep, id_bairro)
VALUES (7, 'Rua Tenente Marones de Gusmão', 22041060, 7);

INSERT INTO t_obs_logradouro (id_logradouro, nm_logradouro, nr_cep, id_bairro)
VALUES (8, 'Rua Delfina Enes', 21011400, 8);

INSERT INTO t_obs_logradouro (id_logradouro, nm_logradouro, nr_cep, id_bairro)
VALUES (9, 'Rua Deputado José da Rocha Ribas', 22630000, 9);

INSERT INTO t_obs_logradouro (id_logradouro, nm_logradouro, nr_cep, id_bairro)
VALUES (10, 'Rua Andres Belo', 20241210, 10);


-- Inserir dados em t_obs_endereco
INSERT INTO t_obs_endereco (id_endereco, nr_logradouro, ds_complemento, id_logradouro)
VALUES (1, 123, 'Apto 101', 1);

INSERT INTO t_obs_endereco (id_endereco, nr_logradouro, ds_complemento, id_logradouro)
VALUES (2, 456, 'Proximo a', 2);

INSERT INTO t_obs_endereco (id_endereco, nr_logradouro, ds_complemento, id_logradouro)
VALUES (3, 789, 'Sala 3 - Edifício Central', 3);

INSERT INTO t_obs_endereco (id_endereco, nr_logradouro, ds_complemento, id_logradouro)
VALUES (4, 101, 'Fundos', 4);

INSERT INTO t_obs_endereco (id_endereco, nr_logradouro, ds_complemento, id_logradouro)
VALUES (5, 202, 'Proximo ao Carrefour', 5);

INSERT INTO t_obs_endereco (id_endereco, nr_logradouro, ds_complemento, id_logradouro)
VALUES (6, 303, 'Casa dos Sonhos', 6);

INSERT INTO t_obs_endereco (id_endereco, nr_logradouro, ds_complemento, id_logradouro)
VALUES (7, 404, 'Apto 2 - Torre B', 7);

INSERT INTO t_obs_endereco (id_endereco, nr_logradouro, ds_complemento, id_logradouro)
VALUES (8, 505, 'Proximo a Drogasil', 8);

INSERT INTO t_obs_endereco (id_endereco, nr_logradouro, ds_complemento, id_logradouro)
VALUES (9, 606, 'Proximo a Casa Verde', 9);

INSERT INTO t_obs_endereco (id_endereco, nr_logradouro, ds_complemento, id_logradouro)
VALUES (10, 707, 'Apto 3 - Bloco C', 10);

-- Inserir dados em t_obs_paciente
INSERT INTO t_obs_paciente (id_paciente, fl_sexo_biologico, dt_nascimento, ds_email, nm_pessoa, ds_senha, tp_sanguineo, nr_altura, nr_peso, id_endereco)
VALUES (1, 'M', TO_DATE('1990-01-01', 'YYYY-MM-DD'), 'silvaa_joao@gmail.com', 'João Silva', 'js556677', 'O+', 175.50, 70.20, 1);

INSERT INTO t_obs_paciente (id_paciente, fl_sexo_biologico, dt_nascimento, ds_email, nm_pessoa, ds_senha, tp_sanguineo, nr_altura, nr_peso, id_endereco)
VALUES (2, 'F', TO_DATE('1985-05-15', 'YYYY-MM-DD'), 'm.oliveira.maria@gmail.com', 'Maria Oliveira', 'arievilo22', 'A-', 162.00, 55.80, 2);

INSERT INTO t_obs_paciente (id_paciente, fl_sexo_biologico, dt_nascimento, ds_email, nm_pessoa, ds_senha, tp_sanguineo, nr_altura, nr_peso, id_endereco)
VALUES (3, 'M', TO_DATE('1988-08-20', 'YYYY-MM-DD'), 'santoslucass35@gmail.com', 'Lucas Santos', 'lucas35', 'B+', 180.20, 85.50, 3);

INSERT INTO t_obs_paciente (id_paciente, fl_sexo_biologico, dt_nascimento, ds_email, nm_pessoa, ds_senha, tp_sanguineo, nr_altura, nr_peso, id_endereco)
VALUES (4, 'F', TO_DATE('1995-03-10', 'YYYY-MM-DD'), 'aninha.lima17@gmail.com', 'Ana Lima', 'batata123', 'AB-', 155.80, 50.00, 4);

INSERT INTO t_obs_paciente (id_paciente, fl_sexo_biologico, dt_nascimento, ds_email, nm_pessoa, ds_senha, tp_sanguineo, nr_altura, nr_peso, id_endereco)
VALUES (5, 'M', TO_DATE('1980-11-25', 'YYYY-MM-DD'), 'oliver_roberto5@gmail.com', 'Roberto Oliveira', 'Roberto@123', 'O-', 170.00, 80.50, 5);

INSERT INTO t_obs_paciente (id_paciente, fl_sexo_biologico, dt_nascimento, ds_email, nm_pessoa, ds_senha, tp_sanguineo, nr_altura, nr_peso, id_endereco)
VALUES (6, 'F', TO_DATE('1992-07-08', 'YYYY-MM-DD'), 'milaa_silvaa45@gmail.com', 'Camila Silva', 'silva4567', 'A+', 167.50, 60.30, 6);

INSERT INTO t_obs_paciente (id_paciente, fl_sexo_biologico, dt_nascimento, ds_email, nm_pessoa, ds_senha, tp_sanguineo, nr_altura, nr_peso, id_endereco)
VALUES (7, 'M', TO_DATE('1983-04-12', 'YYYY-MM-DD'), 'santosricardoo_57@gmail.com', 'Ricardo Santos', 'ricardo890', 'B-', 175.00, 78.00, 7);

INSERT INTO t_obs_paciente (id_paciente, fl_sexo_biologico, dt_nascimento, ds_email, nm_pessoa, ds_senha, tp_sanguineo, nr_altura, nr_peso, id_endereco)
VALUES (8, 'F', TO_DATE('1998-09-30', 'YYYY-MM-DD'), 'LimaFernanda845@gmail.com', 'Fernanda Lima', 'nanda@987', 'AB+', 160.00, 55.00, 8);

INSERT INTO t_obs_paciente (id_paciente, fl_sexo_biologico, dt_nascimento, ds_email, nm_pessoa, ds_senha, tp_sanguineo, nr_altura, nr_peso, id_endereco)
VALUES (9, 'M', TO_DATE('1987-02-18', 'YYYY-MM-DD'), 'edu_oliveira765@gmail.com', 'Eduardo Oliveira', 'oliveira535@', 'O+', 185.50, 90.20, 9);

INSERT INTO t_obs_paciente (id_paciente, fl_sexo_biologico, dt_nascimento, ds_email, nm_pessoa, ds_senha, tp_sanguineo, nr_altura, nr_peso, id_endereco)
VALUES (10, 'F', TO_DATE('1993-06-22', 'YYYY-MM-DD'), 'juliana_santos_321@gmail.com', 'Juliana Santos', 'mel5354', 'A-', 162.00, 58.50, 10);


-- Inserir dados em t_obs_laboratorio
INSERT INTO t_obs_laboratorio (id_laboratorio, nm_laboratorio, nr_telefone, nr_cnpj, ds_razao_social, ds_email, nm_responsavel_tecnico, id_endereco)
VALUES (1, 'Laboratório clínicas', 11965487432, 12345558901234, 'Clínicas Diagnósticos Ltda.', 'lab_clínicas@hotmail.com', 'Dra. Reis', 1);

INSERT INTO t_obs_laboratorio (id_laboratorio, nm_laboratorio, nr_telefone, nr_cnpj, ds_razao_social, ds_email, nm_responsavel_tecnico, id_endereco)
VALUES (2, 'Laboratório ABC Diagnósticos', 11912345678, 12345678901234, 'ABC Diagnósticos Ltda.', 'lab_abc@hotmail.com', 'Dra. Souza', 2);

INSERT INTO t_obs_laboratorio (id_laboratorio, nm_laboratorio, nr_telefone, nr_cnpj, ds_razao_social, ds_email, nm_responsavel_tecnico, id_endereco)
VALUES (3, 'Laboratório 123', 11945678901, 98765432109876, '123 Laboratório S.A.', 'lab_123@gmail.com', 'Dr. Pereira', 3);

INSERT INTO t_obs_laboratorio (id_laboratorio, nm_laboratorio, nr_telefone, nr_cnpj, ds_razao_social, ds_email, nm_responsavel_tecnico, id_endereco)
VALUES (4, 'Laboratório Diagnóstico Rápido', 11998765432, 23456789012345, 'Diagnóstico Rápido Ltda.', 'lab_diag@outlook.com', 'Dra. Lima', 4);

INSERT INTO t_obs_laboratorio (id_laboratorio, nm_laboratorio, nr_telefone, nr_cnpj, ds_razao_social, ds_email, nm_responsavel_tecnico, id_endereco)
VALUES (5, 'Lab Teste Diagnósticos', 11977654321, 87654321098765, 'Teste Diagnósticos S.A.', 'lab_teste@gmail.com', 'Dr. Almeida', 5);

INSERT INTO t_obs_laboratorio (id_laboratorio, nm_laboratorio, nr_telefone, nr_cnpj, ds_razao_social, ds_email, nm_responsavel_tecnico, id_endereco)
VALUES (6, 'Lab Resultados Rápidos', 21912345678, 34567890123456, 'Resultados Rápidos Ltda.', 'lab_result@gmail.com', 'Dra. Costa', 6);

INSERT INTO t_obs_laboratorio (id_laboratorio, nm_laboratorio, nr_telefone, nr_cnpj, ds_razao_social, ds_email, nm_responsavel_tecnico, id_endereco)
VALUES (7, 'Laboratório Genoma Diagnósticos', 21945678901, 65432109876543
, 'Genoma Diagnósticos Ltda.', 'lab_genoma@outlook.com', 'Dr. Gonçalves', 7);

INSERT INTO t_obs_laboratorio (id_laboratorio, nm_laboratorio, nr_telefone, nr_cnpj, ds_razao_social, ds_email, nm_responsavel_tecnico, id_endereco)
VALUES (8, 'Lab Saúde Diagnósticos', 21998765432, 45678901234567, 'Saúde Diagnósticos S.A.', 'lab_saude@hotmail.com', 'Dra. Silva', 8);

INSERT INTO t_obs_laboratorio (id_laboratorio, nm_laboratorio, nr_telefone, nr_cnpj, ds_razao_social, ds_email, nm_responsavel_tecnico, id_endereco)
VALUES (9, 'Lab Moderno Diagnósticos', 21977654321, 76543210987654, 'Moderno Diagnósticos Ltda.', 'lab_moderno@outlook.com', 'Dr. Santos', 9);

INSERT INTO t_obs_laboratorio (id_laboratorio, nm_laboratorio, nr_telefone, nr_cnpj, ds_razao_social, ds_email, nm_responsavel_tecnico, id_endereco)
VALUES (10, 'Laboratório Avançado Diagnósticos', 21912345678, 56789012345678, 'Avançado Diagnósticos S.A.', 'lab_avancado@gmail.com', 'Dra. Oliveira', 10);


-- Inserir dados em t_obs_tipo
INSERT INTO t_obs_tipo (id_tipo, nm_tipo)
VALUES (1, 'Hemograma');

INSERT INTO t_obs_tipo (id_tipo, nm_tipo)
VALUES (2, 'Glicemia');

INSERT INTO t_obs_tipo (id_tipo, nm_tipo)
VALUES (3, 'Colesterol');

INSERT INTO t_obs_tipo (id_tipo, nm_tipo)
VALUES (4, 'Tomografia');

INSERT INTO t_obs_tipo (id_tipo, nm_tipo)
VALUES (5, 'Eletrocardiograma');

INSERT INTO t_obs_tipo (id_tipo, nm_tipo)
VALUES (6, 'Ressonância Magnética');

INSERT INTO t_obs_tipo (id_tipo, nm_tipo)
VALUES (8, 'Raios-X');

INSERT INTO t_obs_tipo (id_tipo, nm_tipo)
VALUES (9, 'Endoscopia');

INSERT INTO t_obs_tipo (id_tipo, nm_tipo)
VALUES (10, 'Exame de Urina');


-- Inserir dados em t_obs_exame
INSERT INTO t_obs_exame (id_exame, ds_especializacao, dt_realizacao, id_laboratorio, id_tipo, id_paciente)
VALUES (1, 'Glicemia', TO_DATE('2023-05-27', 'YYYY-MM-DD'), 1, 2, 1);

INSERT INTO t_obs_exame (id_exame, ds_especializacao, dt_realizacao, id_laboratorio, id_tipo, id_paciente)
VALUES (2, 'Glicemia em Jejum', TO_DATE('2023-02-20', 'YYYY-MM-DD'), 2, 2, 2);

INSERT INTO t_obs_exame (id_exame, ds_especializacao, dt_realizacao, id_laboratorio, id_tipo, id_paciente)
VALUES (3, 'Colesterol Total', TO_DATE('2023-03-25', 'YYYY-MM-DD'), 3, 3, 3);

INSERT INTO t_obs_exame (id_exame, ds_especializacao, dt_realizacao, id_laboratorio, id_tipo, id_paciente)
VALUES (4, 'Hemograma Completo', TO_DATE('2023-04-12', 'YYYY-MM-DD'), 4, 1, 4);

INSERT INTO t_obs_exame (id_exame, ds_especializacao, dt_realizacao, id_laboratorio, id_tipo, id_paciente)
VALUES (5, 'Glicemia Pós-Prandial', TO_DATE('2023-05-03', 'YYYY-MM-DD'), 5, 2, 5);

INSERT INTO t_obs_exame (id_exame, ds_especializacao, dt_realizacao, id_laboratorio, id_tipo, id_paciente)
VALUES (6, 'Hemograma Infantil', TO_DATE('2023-06-08', 'YYYY-MM-DD'), 6, 1, 6);

INSERT INTO t_obs_exame (id_exame, ds_especializacao, dt_realizacao, id_laboratorio, id_tipo, id_paciente)
VALUES (7, 'Glicemia Pós-Prandial', TO_DATE('2023-07-17', 'YYYY-MM-DD'), 7, 2, 7);

INSERT INTO t_obs_exame (id_exame, ds_especializacao, dt_realizacao, id_laboratorio, id_tipo, id_paciente)
VALUES (8, 'Colesterol HDL', TO_DATE('2023-08-21', 'YYYY-MM-DD'), 8, 3, 8);

INSERT INTO t_obs_exame (id_exame, ds_especializacao, dt_realizacao, id_laboratorio, id_tipo, id_paciente)
VALUES (9, 'Hemograma Completo', TO_DATE('2023-09-30', 'YYYY-MM-DD'), 9, 1, 9);

INSERT INTO t_obs_exame (id_exame, ds_especializacao, dt_realizacao, id_laboratorio, id_tipo, id_paciente)
VALUES (10, 'Hemoglobina Glicada', TO_DATE('2023-10-15', 'YYYY-MM-DD'), 10, 2, 10);




-- Inserir dados em t_obs_resultado
INSERT INTO t_obs_resultado (id_resultado, ds_classificacao, id_exame, vl_parametro_1, vl_parametro_2, vl_parametro_3, vl_parametro_4, vl_parametro_5, vl_parametro_6, vl_parametro_7, vl_parametro_8, vl_parametro_9, vl_parametro_10, vl_parametro_11, vl_parametro_12, vl_parametro_13, vl_parametro_14, vl_parametro_15, vl_parametro_16, vl_parametro_17)
VALUES (1, 'Elevado', 1, 110.0, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0, 200.0, 210.0, 220.0, 230.0, 240.0, 250.0, 260.0, 270.0);

INSERT INTO t_obs_resultado (id_resultado, ds_classificacao, id_exame, vl_parametro_1, vl_parametro_2, vl_parametro_3, vl_parametro_4, vl_parametro_5, vl_parametro_6, vl_parametro_7, vl_parametro_8, vl_parametro_9, vl_parametro_10, vl_parametro_11, vl_parametro_12, vl_parametro_13, vl_parametro_14, vl_parametro_15, vl_parametro_16, vl_parametro_17)
VALUES (2, 'Elevado', 2, 6.0, 12.0, 18.0, 24.0, 30.0, 36.0, 42.0, 48.0, 54.0, 60.0, 66.0, 72.0, 78.0, 84.0, 90.0, 96.0, 102.0);

INSERT INTO t_obs_resultado (id_resultado, ds_classificacao, id_exame, vl_parametro_1, vl_parametro_2, vl_parametro_3, vl_parametro_4, vl_parametro_5, vl_parametro_6, vl_parametro_7, vl_parametro_8, vl_parametro_9, vl_parametro_10, vl_parametro_11, vl_parametro_12, vl_parametro_13, vl_parametro_14, vl_parametro_15, vl_parametro_16, vl_parametro_17)
VALUES (3, 'Limítrofe', 3, 155.0, 165.0, 175.0, 185.0, 195.0, 205.0, 215.0, 225.0, 235.0, 245.0, 255.0, 265.0, 275.0, 285.0, 295.0, 305.0, 315.0);

INSERT INTO t_obs_resultado (id_resultado, ds_classificacao, id_exame, vl_parametro_1, vl_parametro_2, vl_parametro_3, vl_parametro_4, vl_parametro_5, vl_parametro_6, vl_parametro_7, vl_parametro_8, vl_parametro_9, vl_parametro_10, vl_parametro_11, vl_parametro_12, vl_parametro_13, vl_parametro_14, vl_parametro_15, vl_parametro_16, vl_parametro_17)
VALUES (4, 'Normal', 4, 12.0, 24.0, 36.0, 48.0, 60.0, 72.0, 84.0, 96.0, 108.0, 120.0, 132.0, 144.0, 156.0, 168.0, 180.0, 192.0, 204.0);

INSERT INTO t_obs_resultado (id_resultado, ds_classificacao, id_exame, vl_parametro_1, vl_parametro_2, vl_parametro_3, vl_parametro_4, vl_parametro_5, vl_parametro_6, vl_parametro_7, vl_parametro_8, vl_parametro_9, vl_parametro_10, vl_parametro_11, vl_parametro_12, vl_parametro_13, vl_parametro_14, vl_parametro_15, vl_parametro_16, vl_parametro_17)
VALUES (5, 'Elevado', 5, 15.0, 30.0, 45.0, 60.0, 75.0, 90.0, 105.0, 120.0, 135.0, 150.0, 165.0, 180.0, 195.0, 210.0, 225.0, 240.0, 255.0);

INSERT INTO t_obs_resultado (id_resultado, ds_classificacao, id_exame, vl_parametro_1, vl_parametro_2, vl_parametro_3, vl_parametro_4, vl_parametro_5, vl_parametro_6, vl_parametro_7, vl_parametro_8, vl_parametro_9, vl_parametro_10, vl_parametro_11, vl_parametro_12, vl_parametro_13, vl_parametro_14, vl_parametro_15, vl_parametro_16, vl_parametro_17)
VALUES (6, 'Normal', 6, 4.0, 8.0, 12.0, 16.0, 20.0, 24.0, 28.0, 32.0, 36.0, 40.0, 44.0, 48.0, 52.0, 56.0, 60.0, 64.0, 68.0);

INSERT INTO t_obs_resultado (id_resultado, ds_classificacao, id_exame, vl_parametro_1, vl_parametro_2, vl_parametro_3, vl_parametro_4, vl_parametro_5, vl_parametro_6, vl_parametro_7, vl_parametro_8, vl_parametro_9, vl_parametro_10, vl_parametro_11, vl_parametro_12, vl_parametro_13, vl_parametro_14, vl_parametro_15, vl_parametro_16, vl_parametro_17)
VALUES (7, 'Normal', 7, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 85.0, 90.0, 95.0, 100.0, 105.0, 110.0, 115.0, 120.0, 125.0, 130.0);

INSERT INTO t_obs_resultado (id_resultado, ds_classificacao, id_exame, vl_parametro_1, vl_parametro_2, vl_parametro_3, vl_parametro_4, vl_parametro_5, vl_parametro_6, vl_parametro_7, vl_parametro_8, vl_parametro_9, vl_parametro_10, vl_parametro_11, vl_parametro_12, vl_parametro_13, vl_parametro_14, vl_parametro_15, vl_parametro_16, vl_parametro_17)
VALUES (8, 'Elevado', 8, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0, 200.0, 210.0, 220.0, 230.0, 240.0, 250.0, 260.0, 270.0, 280.0);

INSERT INTO t_obs_resultado (id_resultado, ds_classificacao, id_exame, vl_parametro_1, vl_parametro_2, vl_parametro_3, vl_parametro_4, vl_parametro_5, vl_parametro_6, vl_parametro_7, vl_parametro_8, vl_parametro_9, vl_parametro_10, vl_parametro_11, vl_parametro_12, vl_parametro_13, vl_parametro_14, vl_parametro_15, vl_parametro_16, vl_parametro_17)
VALUES (9, 'Elevado', 9, 70.0, 80.0, 90.0, 100.0, 110.0, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0, 200.0, 210.0, 220.0, 230.0);

INSERT INTO t_obs_resultado (id_resultado, ds_classificacao, id_exame, vl_parametro_1, vl_parametro_2, vl_parametro_3, vl_parametro_4, vl_parametro_5, vl_parametro_6, vl_parametro_7, vl_parametro_8, vl_parametro_9, vl_parametro_10, vl_parametro_11, vl_parametro_12, vl_parametro_13, vl_parametro_14, vl_parametro_15, vl_parametro_16, vl_parametro_17)
VALUES (10, 'Normal', 10, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0, 110.0, 120.0, 130.0, 140.0, 150.0, 160.0, 170.0, 180.0, 190.0);



-- Inserir dados em t_obs_recomendacao
INSERT INTO t_obs_recomendacao (id_recomendacao, ds_recomendacao, id_resultado)
VALUES (1, 'Acompanhamento em 3 meses', 1);

INSERT INTO t_obs_recomendacao (id_recomendacao, ds_recomendacao, id_resultado)
VALUES (2, 'Repita o exame em 6 meses', 2);

INSERT INTO t_obs_recomendacao (id_recomendacao, ds_recomendacao, id_resultado)
VALUES (3, 'Consulta com especialista necessário', 3);

INSERT INTO t_obs_recomendacao (id_recomendacao, ds_recomendacao, id_resultado)
VALUES (4, 'Acompanhamento regular recomendado', 4);

INSERT INTO t_obs_recomendacao (id_recomendacao, ds_recomendacao, id_resultado)
VALUES (5, 'Realizar exames complementares', 5);

INSERT INTO t_obs_recomendacao (id_recomendacao, ds_recomendacao, id_resultado)
VALUES (6, 'Estilo de vida saudável recomendado', 6);

INSERT INTO t_obs_recomendacao (id_recomendacao, ds_recomendacao, id_resultado)
VALUES (7, 'Consulta com cardiologista indicada', 7);

INSERT INTO t_obs_recomendacao (id_recomendacao, ds_recomendacao, id_resultado)
VALUES (8, 'Avaliação clínica necessária', 8);

INSERT INTO t_obs_recomendacao (id_recomendacao, ds_recomendacao, id_resultado)
VALUES (9, 'Manter hábitos alimentares saudáveis', 9);

INSERT INTO t_obs_recomendacao (id_recomendacao, ds_recomendacao, id_resultado)
VALUES (10, 'Acompanhamento médico recomendado', 10);

COMMIT;