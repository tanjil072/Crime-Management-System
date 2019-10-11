USE CMS;
CREATE TABLE COMPLAINT_INFO
(
	ComplaintId int IDENTITY(1,1) PRIMARY KEY,
	FirstName varchar(30) Not NUll,
	LastName varchar(30) not null,
	Age tinyint not null,
	Occupation varchar(15) not null,
	Email varchar(30) null,
	Phone varchar(11) not null,
	NID varchar(15) not null,
	DateOfBirth date DEFAULT '0001-01-01' NOT NULL,
	Nationality varchar(40) not null,
	ComplaintType varchar(20) not null,
	FathersName varchar(30) not null,
	Address varchar(50) not null,

	
)

