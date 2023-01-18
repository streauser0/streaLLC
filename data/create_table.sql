use strea;

CREATE TABLE Company (
    Id int NOT NULL,
    Symbol varchar(255) NOT NULL,
    Description varchar(255),
    PRIMARY KEY (Id)
);

CREATE TABLE Summary (
    Id int NOT NULL,
    Symbol varchar(255) NOT NULL,
    PRIMARY KEY (Id)
);