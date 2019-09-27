USE CMS;
CREATE TABLE POLICE_INFO
(
	PoliceId int IDENTITY(1,1) PRIMARY KEY,
	FirstName varchar(15) NOT NULL,
	LastName varchar(15) NULL,
	Age tinyint NOT NULL,
	Gender varchar(6) NOT NULL,
	DateOfBirth date DEFAULT '0001-01-01' NOT NULL,
	Phone varchar(11) NOT NULL,
	Designation varchar(30) NOT NULL,
	LivingAddress varchar(300) NOT NULL,
	PermanentAddress varchar(300) NOT NULL,
	Email varchar(30) UNIQUE NULL,
	NID varchar(15) UNIQUE NOT NULL,
	District varchar(20) NOT NULL,
	PoliceStation varchar(20) NOT NULL,
	JoiningDate date DEFAULT '0001-01-01' NOT NULL,
	ResigningDate date DEFAULT '0001-01-01' NULL,
	Salary money NOT NULL,
	Image image NULL,
)

SELECT *,ISNULL(FirstName,'')+' '+ISNULL(LastName,'') AS Name FROM POLICE_INFO;
ALTER TABLE POLICE_INFO ALTER COLUMN DateOfBirth varchar(15) NULL;
ALTER TABLE POLICE_INFO ALTER COLUMN JoiningDate varchar(15) NULL;
ALTER TABLE POLICE_INFO ALTER COLUMN ResigningDate varchar(15) NULL;

INSERT INTO POLICE_INFO(FirstName,LastName,Age,Gender,DateOfBirth,Phone,Designation,LivingAddress,PermanentAddress,Email,NID,District,PoliceStation,JoiningDate,Salary)
                        VALUES('a','a',12,'a','1997-12-12',1,'a','a','a','a',1,'a','a','1997-12-12',10.00);