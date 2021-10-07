-- Création BDD
-- CREATE DATABASE db_name COLLATE utf8_general_ci;
-- USE db_name;

CREATE TABLE Player(
	id SERIAL PRIMARY KEY,
	name varchar(50),
	surname varchar(50),
	pseudo varchar(50),
	email varchar(100) NOT NULL,
	password varchar(25)
);

INSERT INTO Player(name, surname, pseudo, email, password) VALUES ('Saraya', 'Chak', 'Saraya', 'sarayachak.com', 'secret');
INSERT INTO Player(name, surname, pseudo, email, password) VALUES ('Liv', 'Audigane', 'Lili', 'livaudi.com', 'admin');
INSERT INTO Player(name, surname, pseudo, email, password) VALUES ('Jonathan', 'Triqueneau', 'JojoTrinqueno', 'jojo.com', 'admin');



CREATE TABLE Complaint(
	id INTEGER NOT NULL UNIQUE GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	plaintiveName varchar(50),
	report varchar(255),
	linkedCase integer,
	urlIllustration varchar(100),
	FOREIGN KEY (linkedCase) REFERENCES Affaire(id)
	
);

INSERT INTO Complaint(plaintiveName, report, urlIllustration) VALUES ('John Duff', 'Lorem ipsum blablablou', 'blabla');


CREATE TABLE Suspect(
	id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	name varchar(255),
	surname varchar(255),
	occupation varchar(255),
	alibi varchar(255),
	urlPhoto varchar(255)
);

INSERT INTO Suspect(name, surname, occupation, alibi, urlPhoto) VALUES ('Sarah', 'Chakra', 'Directrice de M2i', 'Jétais pas au cinéma', 'blabla');


CREATE TABLE Clue(
	id INTEGER NOT NULL PRIMARY KEY,
	FOREIGN KEY (id) REFERENCES Complaints(id),
	description varchar(255),
	imageUrl varchar(255)
	
);

INSERT INTO Clue(id, description, imageUrl) VALUES (1, 'Un couteau très coupant', 'blabla')

CREATE TABLE ClueSuspectRelation(
	ClueId Int NOT NULL UNIQUE,
	SuspectId Int NOT NULL UNIQUE,
	FOREIGN KEY (ClueId) REFERENCES Clue(id),
	FOREIGN KEY (SuspectId) REFERENCES Suspect(id)
);

CREATE TABLE Affaire(
	id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	complaint_id int,
	suspect_id int,
	clue_id int,
	FOREIGN KEY (complaint_id) references complaints(id),
	FOREIGN KEY (suspect_id) references suspect(id),
	FOREIGN KEY (clue_id) references clue(id)
);

--------------------------------------------------------------------------------
