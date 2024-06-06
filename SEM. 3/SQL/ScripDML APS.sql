INSERT INTO CLIENTE (IdCodigo, Nome, Tipo, Telefone, Email) VALUES (1, 'Cliente A', 'Fisíco', '123456789', 'clienteA@exemplo.com');
INSERT INTO CLIENTE (IdCodigo, Nome, Tipo, Telefone, Email) VALUES (2, 'Cliente B', 'Jurídico', '987654321', 'clienteB@exemplo.com');

INSERT INTO DEPARTAMENTO (IdCodigoInterno, Nome, IdGerente) VALUES (1, 'Departamento A', NULL);
INSERT INTO DEPARTAMENTO (IdCodigoInterno, Nome, IdGerente) VALUES (2, 'Departamento B', NULL);

INSERT INTO FUNCIONARIOS (IdMatricula, Nome, Salario, DataNascimento, Sexo, Endereco, Telefone, RamalInterno, IdDepartamento, IdSupervisor) VALUES (1, 'Funcionario A', 5000, TO_DATE('1980-01-01', 'YYYY-MM-DD'), 'M', 'Endereco A', '123456789', '101', 1, 1);
INSERT INTO FUNCIONARIOS (IdMatricula, Nome, Salario, DataNascimento, Sexo, Endereco, Telefone, RamalInterno, IdDepartamento, IdSupervisor) VALUES (2, 'Funcionario B', 4500, TO_DATE('1985-02-02', 'YYYY-MM-DD'), 'F', 'Endereco B', '987654321', '102', 1, 2);

UPDATE DEPARTAMENTO SET IdGerente = 1 WHERE IdCodigoInterno = 1;
UPDATE DEPARTAMENTO SET IdGerente = 2 WHERE IdCodigoInterno = 2;

INSERT INTO PROJETO (IdCodigo, Nome, DataInicio, DataTermino, IdDepartamento, IdCliente) VALUES (1, 'Projeto A', TO_DATE('2024-01-01', 'YYYY-MM-DD'), TO_DATE('2024-12-31', 'YYYY-MM-DD'), 1, 1);
INSERT INTO PROJETO (IdCodigo, Nome, DataInicio, DataTermino, IdDepartamento, IdCliente) VALUES (2, 'Projeto B', TO_DATE('2024-02-01', 'YYYY-MM-DD'), TO_DATE('2024-11-30', 'YYYY-MM-DD'), 2, 2);

INSERT INTO DEPENDENTES (IdDependente, Nome, DataNascimento, GrauParentesco, IdFuncionario) VALUES (1, 'Dependente A', TO_DATE('2010-01-01', 'YYYY-MM-DD'), 1, 1);
INSERT INTO DEPENDENTES (IdDependente, Nome, DataNascimento, GrauParentesco, IdFuncionario) VALUES (2, 'Dependente B', TO_DATE('2012-02-02', 'YYYY-MM-DD'), 2, 2);

INSERT INTO REGISTRODEHORAS (Id, IdFuncionario, IdProjeto, HorasTrabalhadas, Data) VALUES (1, 1, 1, 8, TO_DATE('2024-03-01', 'YYYY-MM-DD'));
INSERT INTO REGISTRODEHORAS (Id, IdFuncionario, IdProjeto, HorasTrabalhadas, Data) VALUES (2, 2, 2, 6, TO_DATE('2024-03-02', 'YYYY-MM-DD'));


