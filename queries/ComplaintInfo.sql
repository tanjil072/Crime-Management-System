USE CMS;
CREATE TABLE COMPLAINT_INFO
(
	ComplaintId int IDENTITY(1,1) PRIMARY KEY,
	FirstName varchar(100) Not NUll,
	LastName varchar(100) not null,
	Age varchar(100) not null,
	Occupation varchar(100) not null,
	Email varchar(100) null,
	Phone varchar(100) not null,
	NID varchar(100) not null,
	DateOfBirth date DEFAULT '0001-01-01' NOT NULL,
	Nationality varchar(100) not null,
	ComplainantType varchar(100) not null,
	FathersName varchar(100) not null,
	Address varchar(100) not null,

	FirNo varchar(100) not null,
	YearOfFir varchar(100) not null,
	DateOfFir date DEFAULT '0001-01-01' NOT Null,
	TimeOfFir varchar(100) not null,
	Act varchar(100) not null,
	Section varchar(100) not null,
	

	DateFrom date DEFAULT '0001-01-01' NOT NULL,
	DateTo date DEFAULT '0001-01-01' NOT NULL,
	TimeFrom varchar(100) not null,
	TimeTo varchar(100) not null,
	DirectionFromPS varchar(100) not null,
	DistanceFromPS varchar(100) not null,
	DamagedProperties varchar(100) null,
	AddressComplaint varchar(100) not null,
	Details varchar(200) not null,
	TotalAccused varchar(100) not null,

	AccusedFirstName varchar(100) not null,
	AccusedLastName varchar(100) not null,
	AccusedDetails varchar(200) not null,
	AccusedImage image null,
	
	ComplaintType varchar(50) not null,
	Status varchar(20) null,
	

	
)


