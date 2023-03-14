create table BBS(
	no INT(10) primary key,
	TITLE VARCHAR(100),
	CONTENT VARCHAR(100),
	WRITER VARCHAR(100)
)

create table member (
	ID VARCHAR(100) primary key,
	PW VARCHAR(100),
	NAME VARCHAR(100),
	TEL VARCHAR(100)
)

insert into `member` values ('apple3','apple3','apple3','apple3')

select*from `member` m 

CREATE TABLE PRODUCT
   (	ID VARCHAR(200), 
	NAME VARCHAR(200), 
	CONTENT VARCHAR(200), 
	PRICE int(20), 
	COMPANY VARCHAR(200), 
	IMG VARCHAR(200) 
	 )