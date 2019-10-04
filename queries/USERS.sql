USE CMS;
CREATE TABLE USERS
(
	UserId int IDENTITY(1,1) PRIMARY KEY,
	Email varchar(50) UNIQUE NOT NULL,
	Password varchar(50) NOT NULL,
	SignInDistrict varchar(20) NOT  NULL,
	SignInPS varchar(50) NOT NULL,
	UNIQUE (SignInDistrict,SignInPS),
)



INSERT INTO USERS(Email,Password,SignInDistrict,SignInPS)
                        
						VALUES('a','123456','Dhaka','Shamoli');