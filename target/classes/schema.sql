CREATE TABLE persona (
  id bigint(20) NOT NULL,
  apellido varchar(255) DEFAULT NULL,
  nombre varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;