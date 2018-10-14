USE taller1;
CREATE TABLE 'course' (
  'id_course' int(11) NOT NULL,
  'name' varchar(250) NOT NULL,
  'themes' varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO 'course' ('id_course', 'name', 'themes') VALUES
(1,  'Curso microservicios 1', 'Temas curso 1');
INSERT INTO 'course' ('id_course', 'name', 'themes') VALUES
(2,  'Curso microservicios 2', 'Temas curso 2');
