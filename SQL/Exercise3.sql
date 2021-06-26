use cdac;

select concat(upper(substr(Sname,1,1)),lower(substr(Sname,2))) from Supplier;

select upper(Sname) from Supplier;

select lower(Sname) from Supplier;

select lpad(Sname,25,'*') from Supplier;

select replace(Sname,'la','ro') from Supplier;

select replace(replace(Sname,'l','r'),'a','o') from Supplier;

select Sname,length(Sname) "Lengths" from Supplier;

select Sname from Supplier where soundex(Sname)=soundex('BLOKE');

select Sname, case when Status = 10 then 'Ten'
when Status = 20 then 'Twenty' 
when Status = 30 then 'Thirty' 
else 'others'
end 'STATUS' from Supplier; 

select dayname(sysdate()) from dual;



