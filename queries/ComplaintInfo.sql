USE CMS;
CREATE TABLE COMPLAINT_INFO
(
	ComplaintId int IDENTITY(1,1) PRIMARY KEY,
	ComplaintType Varchar(20) NOT NULL,
	ComplainantName Varchar(20) NOT NULL,
	ComplainantType Varchar(20) NOT NULL,
	DateOfIssue date DEFAULT '0001-01-01' NOT NULL,
	
)



INSERT INTO COMPLAINT_INFO(ComplaintType,ComplainantName,ComplainantType,DateOfIssue)
                        VALUES('Murder','Akash','General','2019-09-30');