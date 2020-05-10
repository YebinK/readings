-- ONE
CREATE TABLE IF NOT EXISTS chessGame (
    id bigint primary key auto_increment,
    name varchar(255) not null,
    active bit default 1
);

-- ONE TO MANY
CREATE TABLE IF NOT EXISTS parent (
    id bigint primary key auto_increment,
    parent_name varchar(20) not null
);

CREATE TABLE IF NOT EXISTS child (
    id bigint primary key auto_increment,
    child_name varchar(20) not null,
    parent bigint not null
);

ALTER TABLE child
ADD FOREIGN KEY (parent) REFERENCES parent (id);


-- MANY TO MANY
CREATE TABLE line (
    id bigint primary key auto_increment,
    line_name varchar(255) not null
);

CREATE TABLE station (
    id bigint primary key auto_increment,
    station_name varchar(255) not null
);

CREATE TABLE line_station (
    line bigint not null,
    station bigint not null
);