-- Création BDD
-- CREATE DATABASE db_name COLLATE utf8_general_ci;
-- USE db_name;

CREATE TABLE Utilisateur(
	nom varchar(255),
	prenom varchar(255),
	pseudo varchar(255),
	email varchar(255) NOT NULL,
	password varchar(255)
);

INSERT INTO Utilisateur VALUES ('Saraya', 'Chak', 'Saraya', 'sarayachak.com', 'secret');
INSERT INTO Utilisateur VALUES ('Liv', 'Audigane', 'Lili', 'livaudi.com', 'admin');
INSERT INTO Utilisateur VALUES ('Jonathan', 'Triqueneau', 'JojoTrinqueno', 'jojo.com', 'admin');



CREATE TABLE Plainte(
	plaignant varchar(255),
	procesVerbal varchar(255),
	urlIllustration varchar(255)
);

INSERT INTO Plainte(plaignant, procesVerbal, urlIllustration) VALUES ('John Duff', 'Lorem ipsum blablablou', 'blabla');


CREATE TABLE Suspect(
	nom varchar(255),
	prenom varchar(255),
	occupation varchar(255),
	alibi varchar(255),
	urlPhoto varchar(255)
);

INSERT INTO Suspect(nom, prenom, occupation, alibi, urlPhoto) VALUES ('Sarah', 'Chakra', 'Directrice de M2i', 'Jétais pas au cinéma', 'blabla');


CREATE TABLE Indice(
	description varchar(255),
	imageUrl varchar(255)
);

INSERT INTO Indice(description, imageUrl) VALUES ('Un couteau très coupant', 'blabla')