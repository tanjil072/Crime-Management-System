USE CMS;
CREATE TABLE CUSTODY_INFO
(
	CustodyNo int IDENTITY(1,1) PRIMARY KEY,
	CustodyType varchar(20) Not Null,
	Capacity int NOT NULL,
	RemainingSeats int NULL,
	
)

