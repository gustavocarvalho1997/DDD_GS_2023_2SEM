-- ESTADO
INSERT INTO T_OBS_ESTADO (ID_ESTADO, SG_ESTADO, NM_ESTADO)
VALUES (1, 'SP', 'S�o Paulo');

-- CIDADE 
INSERT INTO T_OBS_CIDADE (ID_CIDADE, ID_ESTADO, NM_CIDADE, NR_DDD)
VALUES (1, 1, 'S�o Paulo', 11);

-- BAIRRO
INSERT INTO T_OBS_BAIRRO (ID_BAIRRO, ID_CIDADE, NM_BAIRRO, NM_ZONA)
VALUES (1, 1, 'Itaquera', 'Zona Leste');

-- LOGRADOURO
INSERT INTO T_OBS_LOGRADOURO (ID_LOGRADOURO, ID_BAIRRO, NM_LOGRADOURO, NR_CEP)
VALUES (1, 1, 'Arraial de S�o Bartolomeu', '08240140');

--ENDERECO
INSERT INTO T_OBS_ENDERECO (ID_ENDERECO, NR_LOGRADOURO, DS_COMPLEMENTO, ID_LOGRADOURO) 
VALUES (1, 1, 'Casa 1', 1);

INSERT INTO T_OBS_PACIENTE (ID_PACIENTE, FL_SEXO_BIOLOGICO, DT_NASCIMENTO, DS_EMAIL, NM_PESSOA,
DS_SENHA, TP_SANGUINEO, NR_ALTURA, NR_PESO,ID_ENDERECO)
VALUES (1, 'M', TO_DATE('18/09/2004','DD/MM/YYYY'), 'EmailTeste@fiap.com', 'Ronald', '123', '0+', 1.86, 80, 1);

INSERT INTO T_OBS_LABORATORIO (ID_LABORATORIO, NM_LABORATORIO, NR_TELEFONE, NR_CNPJ, DS_RAZAO_SOCIAL,
DS_EMAIL, NM_RESPONSAVEL_TECNICO, ID_ENDERECO)
VALUES(1, 'LaboratorioTeste', '119876234', '1234567', 'Laboratorio', 'EmailTeste@fiap.com', 'Ronald', 1);

INSERT INTO T_OBS_TIPO (ID_TIPO, NM_TIPO)
VALUES (1, 'Hemograma');

INSERT INTO T_OBS_EXAME (ID_EXAME, DS_ESPECIALIZACAO, DT_REALIZACAO, ID_LABORATORIO, ID_TIPO, ID_PACIENTE)
VALUES (1, 'Especializa��o', SYSDATE, 1, 1, 1);

INSERT INTO T_OBS_RESULTADO (ID_RESULTADO,
DS_CLASSIFICACAO, VL_PARAMETRO_1, VL_PARAMETRO_2, VL_PARAMETRO_3, VL_PARAMETRO_4, VL_PARAMETRO_5, VL_PARAMETRO_6,
VL_PARAMETRO_7, VL_PARAMETRO_8, VL_PARAMETRO_9, VL_PARAMETRO_10, VL_PARAMETRO_11, VL_PARAMETRO_12, VL_PARAMETRO_13,
VL_PARAMETRO_14, VL_PARAMETRO_15, VL_PARAMETRO_16, VL_PARAMETRO_17,
ID_EXAME)
VALUES (1, 'Teste', 1.12, 2.23, 3.45, 5.56, 6.67, 7.89, 8.12, 9.23, 10.34, 11.45, 12.56, 13.67, 14.78, 15.89, 16.12, 17.23, 18.45, 1);

COMMIT;