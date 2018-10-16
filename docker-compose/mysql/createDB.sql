CREATE DATABASE IF NOT EXISTS taller1;
USE taller1;
CREATE TABLE IF NOT EXISTS course (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(250) NOT NULL,
  themes varchar(250) DEFAULT NULL,
  CONSTRAINT course_pk PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO taller1.course (name, themes) VALUES
('Curso microservicios 1', 'Temas curso 1');
INSERT INTO taller1.course (name, themes) VALUES
('Curso microservicios 2', 'Temas curso 2');

COMMIT;
