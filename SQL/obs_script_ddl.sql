DROP TABLE t_obs_bairro CASCADE CONSTRAINTS;
DROP TABLE t_obs_cidade CASCADE CONSTRAINTS;
DROP TABLE t_obs_endereco CASCADE CONSTRAINTS;
DROP TABLE t_obs_estado CASCADE CONSTRAINTS;
DROP TABLE t_obs_exame CASCADE CONSTRAINTS;
DROP TABLE t_obs_laboratorio CASCADE CONSTRAINTS;
DROP TABLE t_obs_logradouro CASCADE CONSTRAINTS;
DROP TABLE t_obs_paciente CASCADE CONSTRAINTS;
DROP TABLE t_obs_recomendacao CASCADE CONSTRAINTS;
DROP TABLE t_obs_resultado CASCADE CONSTRAINTS;
DROP TABLE t_obs_tipo CASCADE CONSTRAINTS;
DROP SEQUENCE SQ_T_OBS_RECOMENDACAO;
DROP SEQUENCE SQ_ID_EXAME;
DROP SEQUENCE SQ_ID_RESULTADO;


CREATE TABLE t_obs_bairro (
    id_bairro NUMBER(5) NOT NULL,
    nm_bairro VARCHAR2(60) NOT NULL,
    nm_zona   VARCHAR2(10) NOT NULL,
    id_cidade INTEGER NOT NULL
);

ALTER TABLE t_obs_bairro ADD CONSTRAINT t_obs_bairro_pk PRIMARY KEY ( id_bairro );

CREATE TABLE t_obs_cidade (
    id_cidade INTEGER NOT NULL,
    nm_cidade VARCHAR2(50) NOT NULL,
    nr_ddd    NUMBER(2) NOT NULL,
    id_estado NUMBER(5) NOT NULL
);

ALTER TABLE t_obs_cidade ADD CONSTRAINT t_obs_cidade_pk PRIMARY KEY ( id_cidade );

CREATE TABLE t_obs_endereco (
    id_endereco    NUMBER(5) NOT NULL,
    nr_logradouro  NUMBER(4) NOT NULL,
    ds_complemento VARCHAR2(100),
    id_logradouro  NUMBER(5) NOT NULL
);

ALTER TABLE t_obs_endereco ADD CONSTRAINT t_obs_endereco_pk PRIMARY KEY ( id_endereco );

CREATE TABLE t_obs_estado (
    id_estado NUMBER(5) NOT NULL,
    sg_estado VARCHAR2(2) NOT NULL,
    nm_estado VARCHAR2(20) NOT NULL
);

ALTER TABLE t_obs_estado ADD CONSTRAINT t_obs_estado_pk PRIMARY KEY ( id_estado );

CREATE TABLE t_obs_exame (
    id_exame          NUMBER(5) NOT NULL,
    ds_especializacao VARCHAR2(30) NOT NULL,
    dt_realizacao     DATE NOT NULL,
    id_laboratorio    NUMBER(5) NOT NULL,
    id_tipo           NUMBER(5) NOT NULL,
    id_paciente       NUMBER(5) NOT NULL
);

ALTER TABLE t_obs_exame ADD CONSTRAINT t_obs_exame_pk PRIMARY KEY ( id_exame );

CREATE TABLE t_obs_laboratorio (
    id_laboratorio         NUMBER(5) NOT NULL,
    nm_laboratorio         VARCHAR2(150) NOT NULL,
    nr_telefone            VARCHAR2(12) NOT NULL,
    nr_cnpj                VARCHAR2(15) NOT NULL,
    ds_razao_social        VARCHAR2(250) NOT NULL,
    ds_email               VARCHAR2(100) NOT NULL,
    nm_responsavel_tecnico VARCHAR2(50) NOT NULL,
    id_endereco            NUMBER(5) NOT NULL
);

ALTER TABLE t_obs_laboratorio ADD CONSTRAINT t_obs_laboratorio_pk PRIMARY KEY ( id_laboratorio );

ALTER TABLE t_obs_laboratorio ADD CONSTRAINT t_obs_laboratorio_un UNIQUE ( nr_cnpj,
                                                                           ds_email );

CREATE TABLE t_obs_logradouro (
    id_logradouro NUMBER(5) NOT NULL,
    nm_logradouro VARCHAR2(250) NOT NULL,
    nr_cep        VARCHAR2(9) NOT NULL,
    id_bairro     NUMBER(5) NOT NULL
);

ALTER TABLE t_obs_logradouro ADD CONSTRAINT t_obs_logradouro_pk PRIMARY KEY ( id_logradouro );

CREATE TABLE t_obs_paciente (
    id_paciente       NUMBER(5) NOT NULL,
    fl_sexo_biologico CHAR(1) NOT NULL,
    dt_nascimento     DATE NOT NULL,
    ds_email          VARCHAR2(100) NOT NULL,
    nm_pessoa         VARCHAR2(40) NOT NULL,
    ds_senha          VARCHAR2(10) NOT NULL,
    tp_sanguineo      VARCHAR2(6) NOT NULL,
    nr_altura         NUMBER(5, 2) NOT NULL,
    nr_peso           NUMBER(5, 2) NOT NULL,
    id_endereco       NUMBER(5) NOT NULL
);

ALTER TABLE t_obs_paciente ADD CONSTRAINT fl_sexo_biologico_ck CHECK ( fl_sexo_biologico IN ( 'F', 'I', 'M' ) );

ALTER TABLE t_obs_paciente ADD CONSTRAINT t_obs_paciente_pk PRIMARY KEY ( id_paciente );

ALTER TABLE t_obs_paciente ADD CONSTRAINT t_obs_paciente_un UNIQUE ( ds_email );

CREATE TABLE t_obs_recomendacao (
    id_recomendacao NUMBER(5) NOT NULL,
    ds_recomendacao VARCHAR2(200) NOT NULL,
    id_resultado    NUMBER(5) NOT NULL
);

ALTER TABLE t_obs_recomendacao ADD CONSTRAINT t_obs_recomendacao_pk PRIMARY KEY ( id_recomendacao );

CREATE TABLE t_obs_resultado (
    id_resultado     NUMBER(5) NOT NULL,
    ds_classificacao VARCHAR2(100) NOT NULL,
    id_exame         NUMBER(5) NOT NULL,
    vl_parametro_1   NUMBER(4, 1),
    vl_parametro_2   NUMBER(4, 1),
    vl_parametro_3   NUMBER(4, 1),
    vl_parametro_4   NUMBER(4, 1),
    vl_parametro_5   NUMBER(4, 1),
    vl_parametro_6   NUMBER(4, 1),
    vl_parametro_7   NUMBER(4, 1),
    vl_parametro_8   NUMBER(4, 1),
    vl_parametro_9   NUMBER(4, 1),
    vl_parametro_10  NUMBER(4, 1),
    vl_parametro_11  NUMBER(4, 1),
    vl_parametro_12  NUMBER(4, 1),
    vl_parametro_13  NUMBER(4, 1),
    vl_parametro_14  NUMBER(4, 1),
    vl_parametro_15  NUMBER(4, 1),
    vl_parametro_16  NUMBER(4, 1),
    vl_parametro_17  NUMBER(4, 1)
);


ALTER TABLE t_obs_resultado ADD CONSTRAINT t_obs_resultado_pk PRIMARY KEY ( id_resultado );

CREATE TABLE t_obs_tipo (
    id_tipo NUMBER(5) NOT NULL,
    nm_tipo VARCHAR2(25) NOT NULL
);

ALTER TABLE t_obs_tipo ADD CONSTRAINT t_obs_tipo_pk PRIMARY KEY ( id_tipo );

ALTER TABLE t_obs_bairro
    ADD CONSTRAINT t_obs_bairro_cidade_fk FOREIGN KEY ( id_cidade )
        REFERENCES t_obs_cidade ( id_cidade );

ALTER TABLE t_obs_cidade
    ADD CONSTRAINT t_obs_cidade_estado_fk FOREIGN KEY ( id_estado )
        REFERENCES t_obs_estado ( id_estado );

ALTER TABLE t_obs_exame
    ADD CONSTRAINT t_obs_exame_laboratorio_fk FOREIGN KEY ( id_laboratorio )
        REFERENCES t_obs_laboratorio ( id_laboratorio );

ALTER TABLE t_obs_exame
    ADD CONSTRAINT t_obs_exame_paciente_fk FOREIGN KEY ( id_paciente )
        REFERENCES t_obs_paciente ( id_paciente );

ALTER TABLE t_obs_laboratorio
    ADD CONSTRAINT t_obs_laboratorio_endereco_fk FOREIGN KEY ( id_endereco )
        REFERENCES t_obs_endereco ( id_endereco );

ALTER TABLE t_obs_logradouro
    ADD CONSTRAINT t_obs_logradouro_bairro_fk FOREIGN KEY ( id_bairro )
        REFERENCES t_obs_bairro ( id_bairro );

ALTER TABLE t_obs_endereco
    ADD CONSTRAINT t_obs_logradouro_endereco_fk FOREIGN KEY ( id_logradouro )
        REFERENCES t_obs_logradouro ( id_logradouro );

ALTER TABLE t_obs_paciente
    ADD CONSTRAINT t_obs_paciente_endereco_fk FOREIGN KEY ( id_endereco )
        REFERENCES t_obs_endereco ( id_endereco );

ALTER TABLE t_obs_recomendacao
    ADD CONSTRAINT t_obs_recomenda_resultado_fk FOREIGN KEY ( id_resultado )
        REFERENCES t_obs_resultado ( id_resultado );

ALTER TABLE t_obs_resultado
    ADD CONSTRAINT t_obs_resultado_exame_fk FOREIGN KEY ( id_exame )
        REFERENCES t_obs_exame ( id_exame );

ALTER TABLE t_obs_exame
    ADD CONSTRAINT t_osb_exame_tipo_fk FOREIGN KEY ( id_tipo )
        REFERENCES t_obs_tipo ( id_tipo );


ALTER TABLE t_obs_tipo
MODIFY nm_tipo VARCHAR2(50);

ALTER TABLE t_obs_paciente
MODIFY ds_senha VARCHAR2(20);

ALTER TABLE t_obs_paciente
MODIFY ds_email VARCHAR2(100);

CREATE SEQUENCE SQ_T_OBS_RECOMENDACAO START WITH 11 INCREMENT BY 1;
CREATE SEQUENCE SQ_ID_EXAME START WITH 11 INCREMENT BY 1;
CREATE SEQUENCE SQ_ID_RESULTADO START WITH 11 INCREMENT BY 1;