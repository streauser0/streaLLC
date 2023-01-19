use strea;
DROP TABLE IF EXISTS strea.Summary;
DROP TABLE IF EXISTS strea.Company;

CREATE TABLE Company (
    Symbol varchar(255) NOT NULL,
    Name varchar(255),
    Description varchar(255),
    PRIMARY KEY (Symbol)
);

CREATE TABLE Summary (
    Id int NOT NULL,
    Symbol varchar(255) NOT NULL,
    FiftyTwoWeekHigh DECIMAL(8, 2),
	FiftyTwoWeekLow DECIMAL(8, 2),
    PE decimal(8,2),
    PRIMARY KEY (Id),
	FOREIGN KEY (symbol) REFERENCES Company(Symbol)
     
);

select * from Summary;


