-- Default data for company
INSERT INTO company (Symbol, name, Description)   
VALUES ('CVX', 'Chevron', 'The Chevron Corp');


INSERT INTO company (Symbol, name, Description)   
VALUES ('RIG', 'Transocean LTD', 'Massive deep sea oil drilling company');


-- Default data for summary
INSERT INTO Summary ( Symbol, FiftyTwoWeekHigh, FiftytwoWeekLow, PE)   
VALUES ( 'RIG', 159.68, 123.84, 18.08);
INSERT INTO Summary ( Symbol, FiftyTwoWeekHigh, FiftytwoWeekLow, PE)   
VALUES ( 'RIG', 130.68, 111.84, 13.08);
INSERT INTO Summary ( Symbol, FiftyTwoWeekHigh, FiftytwoWeekLow, PE)   
VALUES ( 'RIG', 220.68, 129.84, 1.08);
INSERT INTO Summary ( Symbol, FiftyTwoWeekHigh, FiftytwoWeekLow, PE)   
VALUES ( 'RIG', 179.68, 153.84, 11.08);



INSERT INTO Summary ( Symbol, FiftyTwoWeekHigh, FiftytwoWeekLow, PE)   
VALUES ( 'CVX', 189.68, 122.84, 10.08);
INSERT INTO Summary ( Symbol, FiftyTwoWeekHigh, FiftytwoWeekLow, PE)   
VALUES ( 'CVX', 190.68, 121.84, 12.08);
INSERT INTO Summary ( Symbol, FiftyTwoWeekHigh, FiftytwoWeekLow, PE)   
VALUES ( 'CVX', 200.68, 125.84, 2.08);

INSERT INTO Dividend
(CashAmount,
 DeclarationDate,
 DividendType,
 ExDividendDate,
 Frequency,
 PayDate,
 RecordDate,
 Ticker)
 VALUES
 (0.22,
  "2021-10-28",
  "CD",
  "2021-11-06",
  4,
  "2021-11-11",
  "2021-11-08",
  "AAPL");