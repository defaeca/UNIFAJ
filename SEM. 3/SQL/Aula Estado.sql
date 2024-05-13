INSERT INTO ESTADO (ID_ESTADO, NOME, SIGLA)
VALUES (10, 'TESTE', 'TS')

INSERT INTO MUNICIPIO(ID_MUNICIPIO, ID_ESTADO, NOME)
VALUES (10, 10, 'MUNICIPIO_TESTE')

DELETE FROM MUNICIPIO WHERE ID_ESTADO = 10

ALTER TABLE MUNICIPIO ADD CONSTRAINT FK_ESTADO_MUNICIPIO
    FOREIGN KEY (ID_ESTADO)
    REFERENCES ESTADO(ID_ESTADO)
    ON DELETE CASCADE

SELECT * FROM ESTADO
SELECT * FROM MUNICIPIO
