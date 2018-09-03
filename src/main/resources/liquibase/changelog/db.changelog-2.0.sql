--liquibase formatted sql

-- changeset Jayaraman:0.0.2

DROP TABLE if exists `student_info124`;
DROP TABLE if exists `employee.details`;
CREATE TABLE `employee`.`student_info124` (
 	 `idStudent` INT NOT NULL,
	 `firstname` VARCHAR(100) NULL,
         `name` VARCHAR(110) NULL,
         `age` INT NULL,
         PRIMARY KEY (`idStudent`)
                  );

