USE CMS;
CREATE TABLE CRIMINAL_INFO
(
	CriminalId int IDENTITY(1,1) PRIMARY KEY,
	FirstName varchar(15) NOT NULL,
	FathersName varchar(15) NULL,
	Age tinyint NOT NULL,
	PreviousActs varchar(15) NULL,
)



INSERT INTO CRIMINAL_INFO(FirstName,FathersName,Age,PreviousActs)
                        VALUES('Toshib','Ahmed',21,'Murder');