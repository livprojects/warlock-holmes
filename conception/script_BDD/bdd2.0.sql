
CREATE TABLE player(
    player_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    player_name varchar(50),
    player_surname varchar(50),
    player_pseudo varchar(50),
    player_email varchar(100) NOT NULL,
    player_pw varchar(25)
);
CREATE TABLE suspect(
    suspect_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    suspect_name varchar(255),
    suspect_nickname varchar(255),
    suspect_occupation varchar(255),
    suspect_alibi varchar(255),
    suspect_url_photo varchar(255)
);
CREATE TABLE clue(
    clue_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    clue_description varchar(255),
    clue_image_url varchar(255)
);
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