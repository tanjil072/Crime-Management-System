USE CMS;
CREATE TABLE CRIMINAL_INFO
(
	CriminalId int IDENTITY(1,1) PRIMARY KEY,
	FirstName varchar(15) NOT NULL,
	LastName varchar(15) NULL,
	FathersName varchar(15) NULL,
	Age tinyint NOT NULL,
	Gender varchar(6) NOT NULL,
	DateOfBirth date DEFAULT '0001-01-01' NOT NULL,
	Phone varchar(11) NOT NULL,
	LivingAddress varchar(300) NOT NULL,
	PermanentAddress varchar(300) NOT NULL,
	NID varchar(15) UNIQUE NOT NULL,
	District varchar(20) NOT NULL,
	PreviousActs varchar(15) NULL,
	Image image NULL,
)

SELECT *,ISNULL(FirstName,'')+' '+ISNULL(LastName,'') AS Name FROM CRIMINAL_INFO;


INSERT INTO CRIMINAL_INFO(FirstName,LastName,FathersName,Age,Gender,DateOfBirth,Phone,LivingAddress,PermanentAddress,NID,District,PreviousActs)
                        VALUES('Toshib','Ahmed','Null',21,'Male','1997-09-27',123456,'Dhaka','Dhaka','12354','Dhaka','Murder');