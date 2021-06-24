use cdac;

select * from Supplier order by City desc;

select * from Parts order by City,Pname;

select Sname from Supplier where Status between 10 and 20;

select Pname,Weight from Parts where Weight not between 10 and 15;

select Pname from Parts where Pname like 'S%';

select Sname from Supplier where City like 'L%';

select Jname from Projects where Jname like '__N%';