CREATE TABLE CLIENTE (
    IdCodigo NUMBER PRIMARY KEY,
    Nome CHAR(100),
    Tipo CHAR(20),
    Telefone VARCHAR2(20),
    Email VARCHAR2(50)
);

CREATE TABLE DEPARTAMENTO (
    IdCodigoInterno NUMBER PRIMARY KEY,
    Nome CHAR(100),
    IdGerente NUMBER
);

CREATE TABLE FUNCIONARIOS (
    IdMatricula NUMBER PRIMARY KEY,
    Nome VARCHAR2(80),
    Salario NUMBER,
    DataNascimento DATE,
    Sexo CHAR(1),
    Endereco VARCHAR2(80),
    Telefone VARCHAR2(20),
    RamalInterno VARCHAR2(10),
    IdDepartamento NUMBER,
    IdSupervisor NUMBER,
    CONSTRAINT FUNCIONARIOS_DEPARTAMENTO_FK FOREIGN KEY 
    (IdDepartamento) REFERENCES DEPARTAMENTO(IdCodigoInterno),
    CONSTRAINT FUNCIONARIOS_SUPERVISOR_FK FOREIGN KEY 
    (IdSupervisor) REFERENCES FUNCIONARIOS(IdMatricula)
);

ALTER TABLE DEPARTAMENTO
ADD CONSTRAINT GERENTE_FUNCIONARIOS_FK FOREIGN KEY 
(IdGerente) REFERENCES FUNCIONARIOS(IdMatricula);

CREATE TABLE PROJETO (
    IdCodigo NUMBER PRIMARY KEY,
    Nome VARCHAR2(100),
    DataInicio DATE,
    DataTermino DATE,
    IdDepartamento NUMBER,
    IdCliente NUMBER,
    CONSTRAINT PROJETO_DEPARTAMENTO_FK FOREIGN KEY 
    (IdDepartamento) REFERENCES DEPARTAMENTO(IdCodigoInterno),
    CONSTRAINT PROJETO_CLIENTE_FK FOREIGN KEY 
    (IdCliente) REFERENCES CLIENTE(IdCodigo)
);

CREATE TABLE DEPENDENTES (
    IdDependente NUMBER PRIMARY KEY,
    Nome CHAR(100),
    DataNascimento DATE,
    GrauParentesco NUMBER,
    IdFuncionario NUMBER,
    CONSTRAINT DEPENDENTES_FUNCIONARIOS_FK FOREIGN KEY 
    (IdFuncionario) REFERENCES FUNCIONARIOS(IdMatricula)
);

CREATE TABLE REGISTRODEHORAS (
    Id NUMBER PRIMARY KEY,
    IdFuncionario NUMBER,
    IdProjeto NUMBER,
    HorasTrabalhadas NUMBER,
    Data DATE,
    CONSTRAINT REGISTRODEHORAS_FUNCIONARIO_FK FOREIGN KEY 
    (IdFuncionario) REFERENCES FUNCIONARIOS(IdMatricula),
    CONSTRAINT REGISTRODEHORAS_PROJETO_FK FOREIGN KEY 
    (IdProjeto) REFERENCES PROJETO(IdCodigo)
);

SELECT * FROM CLIENTE;
SELECT * FROM DEPARTAMENTO;
SELECT * FROM FUNCIONARIOS;
SELECT * FROM PROJETO;
SELECT * FROM DEPENDENTES;
SELECT * FROM REGISTRODEHORAS;

DROP TABLE REGISTRODEHORAS CASCADE CONSTRAINTS;
DROP TABLE DEPENDENTES CASCADE CONSTRAINTS;
DROP TABLE PROJETO CASCADE CONSTRAINTS;
DROP TABLE FUNCIONARIOS CASCADE CONSTRAINTS;
DROP TABLE DEPARTAMENTO CASCADE CONSTRAINTS;
DROP TABLE CLIENTE CASCADE CONSTRAINTS;
