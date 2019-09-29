USE CMS;
CREATE TABLE CUSTODY_INFO
(
	CustodyNo int IDENTITY(1,1) PRIMARY KEY,
	Capacity int NOT NULL,
	RemainingSeats int NOT NULL,
	
)



INSERT INTO CUSTODY_INFO(Capacity,RemainingSeats)
                        VALUES(50,12);