
CREATE TABLE player(
    player_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    player_name varchar(50),
    player_surname varchar(50),
    player_pseudo varchar(50),
    player_email varchar(100) NOT NULL,
    player_pw varchar(25)
);


INSERT INTO player(player_name, player_surname, player_pseudo, player_email, player_pw) VALUES ('Saraya', 'Chak', 'Saraya', 'sarayachak.com', 'secret');
INSERT INTO player(player_name, player_surname, player_pseudo, player_email, player_pw) VALUES ('Liv', 'Audigane', 'Lili', 'livaudi.com', 'admin');
INSERT INTO player(player_name, player_surname, player_pseudo, player_email, player_pw) VALUES ('Jonathan', 'Triqueneau', 'JojoTrinqueno', 'jojo.com', 'Marie');


CREATE TABLE suspect(
    suspect_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    suspect_name varchar(255),
    suspect_nickname varchar(255),
    suspect_occupation varchar(255),
    suspect_alibi varchar(255),
    suspect_url_photo varchar(255)
);

INSERT INTO suspect(suspect_name, suspect_nickname, suspect_occupation, suspect_alibi, suspect_url_photo) VALUES ('Sarah', 'Chakra', 'Directrice de M2i', 'Jétais pas au cinéma', 'blabla');
INSERT INTO suspect(suspect_name, suspect_nickname, suspect_occupation, suspect_alibi, suspect_url_photo) VALUES ('Cépamoi', 'Célui', 'Mangeuse de bonbon', 'La main bloquée dans la jare à cookies', 'nope');

CREATE TABLE clue(
    clue_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    clue_description varchar(255),
    clue_image_url varchar(255)
);

INSERT INTO clue(clue_description, clue_image_url) VALUES ('Un couteau très coupant', 'https://cdn.pixabay.com/photo/2014/11/30/14/11/cat-551554__340.jpg');
INSERT INTO clue(clue_description, clue_image_url) VALUES ('Une mauvaise foi en acier trempé', 'https://images-na.ssl-images-amazon.com/images/I/81BES+tsVvL.png');

CREATE TABLE current_case(
    current_case_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    current_case_plaintive_name varchar(50),
    current_case_report varchar(255),
    current_case_url_illustration varchar(100),   
    current_case_suspect_id int,
    current_case_clue_id int,
    FOREIGN KEY (current_case_suspect_id) references suspect(suspect_id),
    FOREIGN KEY (current_case_clue_id) references clue(clue_id)
);

INSERT INTO current_case(current_case_plaintive_name, current_case_report, current_case_url_illustration) VALUES ('John Duff', 'Lorem ipsum blablablou', 'blabla');
