use cdac;
create table SEMP(
EMPNO char(4),
EMPNAME char(20),
BASIC float(9,2),
DEPTNO char(2),
DEPTHEAD char(4)
);

CREATE table SDEPT(
DEPTNO char(2),
DEPTNAME char(15)
);

INSERT INTO SDEPT(DEPTNO,DEPTNAME)
values
('10','Development'),
('20','Training');

insert into SEMP(EMPNO,EMPNAME,BASIC,DEPTNO,DEPTHEAD)
values
('0001','SUNIL',6000,'10',null),
('0002','HIREN',8000,'20',null),
('0003','ALI','4000',10,'0001'),
('0004','GEORGE',6000,null,'0002');



select * FROM SEMP;
select * from SDEPT;

create table Supplier(
Sno varchar(5),
Sname varchar(20),
Status varchar(2),
City varchar(20),
primary key(Sno)
);

create table Parts(
Pno varchar(5),
Pname varchar(20),
Color varchar(10),
Weight float(5,2),
City varchar(20),
primary key(Pno)
);

create table Projects(
Jno varchar(5),
Jname varchar(20),
City varchar(20),
primary key(Jno)
);

create table SPJ(
Sno varchar(5),
Pno varchar(5),
Jno varchar(5),
Qty int(5)
);



INSERT INTO Supplier (Sno,Sname,Status,City) VALUES
          ('S1','KRUNAL',10,'LONDON'),    
          ('S2','RAMESH',5,'INDIA'),    
          ('S3','VIVEK',4,'LONDON'),   
            ('S4','VIMAL',3,'JAPAN'),   
            ('S5','HEMAL',10,'KORIA'),    
            ('S6','RAJU',2,'CHINA'),  
            ('S7','VINU',3,'CHINA'),
            ('S8','SHAHBAZ',11,'PARIS'),    
            ('S9','ZOHAAN',20,'ATHENS'); 
            
	
    
    INSERT INTO Parts (Pno,Pname,Color,Weight,City) VALUES
         ('P1','PARTA','RED',45,'NEW YORK'),
	     ('P2','PARTB','WHITE',4,'LONDON'),
         ('P3','PARTC','GREY',24,'CHINA'),
         ('P4','PARTD','CYCAN',16,'CHINA'),
		 ('P5','PARTE','BLACK',58,'NEW YORK');
    
    
    
    INSERT INTO Projects (Jno,Jname,City) VALUES
    ('J1','PRJ1','LONDON'),
    ('J2','PRJ2','CHINA'),
    ('J3','PRJ3','CHINA'), 
    ('J4','PRJ4','INDIA'),
    ('J5','PRJ5','ATHENS')
    ; 
    
    
    INSERT INTO SPJ (Sno,Pno,Jno,Qty) VALUES
    ('S1','P2','J1',300),
    ('S1','P2','J2',800),
    ('S3','P4','J3',115),
    ('S4','P2','J4',130),
    ('S1','P3','J4',75);
    
select * from Supplier;

select Sno,Sname from Supplier;

select Pname,Color from Parts where City = 'LONDON';

select * from Supplier where City = 'LONDON';

select * from Supplier where City = 'PARIS' or City ='ATHENS';

select Jname from Projects where City = 'ATHENS';

select Pname from Parts where Weight between 12 and 14;

select Sname from Supplier where Status>=20;

select * from Supplier where City != 'LONDON';

select City from Supplier;

select Weight*100 "Milligrams",Weight/1000 "Kilogram" from Parts;
