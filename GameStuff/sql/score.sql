CREATE DATABASE score;

USE score;

CREATE TABLE score (
scrID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
scrName VARCHAR(50),
scrScore INT,
scrTime DATETIME DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO score (scrName,scrScore)VALUES ('The First One',0);

SELECT * FROM score;

SELECT scrName, scrScore FROM score ORDER BY scrTime Limit 0, 15