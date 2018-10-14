USE taller1;
CREATE TABLE 'course' (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(250) NOT NULL,
  themes varchar(250) DEFAULT NULL,
  CONSTRAINT categorias_pk PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO 'course' ('id', 'name', 'themes') VALUES
(1,  'Curso microservicios 1', 'Temas curso 1');
INSERT INTO 'course' ('id', 'name', 'themes') VALUES
(2,  'Curso microservicios 2', 'Temas curso 2');
