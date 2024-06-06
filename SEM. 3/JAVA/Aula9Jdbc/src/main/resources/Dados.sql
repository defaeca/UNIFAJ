CREATE TABLE pessoa (
 id INT AUTO_INCREMENT PRIMARY KEY,
 nome VARCHAR(100) NOT NULL,
 endereco VARCHAR(200) NOT NULL,
 telefone VARCHAR(25) DEFAULT NULL
);

INSERT INTO pessoa (nome, endereco, telefone) VALUES
 ('Maria', 'Nazaré', '12345678'),
 ('José', 'Galileia', '2345678'),
 ('Pedro', 'Samaria', '3454657');

SELECT * FROM PESSOA

SELECT id, nome, endereco, telefone from pessoa

SELECT * FROM PESSOA  where id = 2

update pessoa set nome = 'Pedro', endereco='XXX', telefone='345567679'
where id = 2


delete from pessoa where ID = 4
