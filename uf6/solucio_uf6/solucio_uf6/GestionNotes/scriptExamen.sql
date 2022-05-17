-- Create user for local access.
CREATE USER 'jonatan'@'localhost' IDENTIFIED BY 'jonatan';
-- Create database.
CREATE DATABASE examen
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;
-- Grant permissions.
GRANT SELECT, INSERT, UPDATE, DELETE ON examen.* TO 'jonatan'@'localhost';
-- Use database.
USE examen;
-- Create table 'countries'
CREATE TABLE `notas_modulo` (
`nom` VARCHAR(03) NOT NULL,
`uf` VARCHAR(04) DEFAULT NULL,
`hores_docencia` INT DEFAULT 0 CHECK (`hores_docencia`>0),
`nota` DOUBLE DEFAULT 0.0 CHECK (`nota`>=0 AND `nota`<=10),
PRIMARY KEY (`nom`,`uf`)
) ENGINE=InnoDB;
-- Data insertion. PART OPCIONAL, PODEU AFEGIR A MA SI VOLEU
INSERT INTO `notas_modulo` (`nom`, `uf`, `hores_docencia`,`nota`) 
VALUES
('MO3', 'UF5', 120, 10);