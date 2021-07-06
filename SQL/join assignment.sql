-- 1.    Write a query to find the addresses (location_id, street_address, city, 
--       state_province, country_name) of all the departments.

select DEPARTMENT_NAME, locations.location_id, street_address, city,state_province,
		country_name  from locations,departments,countries
        where locations.location_id=departments.location_id
        and locations.country_id=countries.country_id;


-- 2.	 Write a query to find the name (first_name, last name), department ID 
--       and name of all the employees.

select first_name,last_name,DEPARTMENT_NAME, employees.department_ID from employees,departments
where employees.DEPARTMENT_ID=departments.DEPARTMENT_ID;


-- 3.	 Write a query to find the name (first_name, last_name), job, department
--       ID and name of the employees who works in London.

select  first_name,last_name,jobs.job_id,departments.department_id,department_name from employees,locations,departments,jobs
where  locations.LOCATION_ID=departments.LOCATION_ID 
and departments.DEPARTMENT_ID=employees.DEPARTMENT_ID 
and employees.JOB_ID=jobs.JOB_ID
and city='london';


-- 4.	Write a query to find the employee id, name (last_name) along with
--      their manager_id and name (last_name).

select  Emp.employee_id, Mgr.last_name,Mgr.EMPLOYEE_ID as managerId,Emp.last_name from employees as Emp,employees as Mgr
where Mgr.manager_id=Emp.employee_id;

-- 5.	Write a query to find the name (first_name, last_name) and hire date
--      of the employees who was hired after 'Jones.

select Emp.first_name, Emp.last_name,Emp.HIRE_DATE from employees as Emp, employees as Mmp
where  Emp.HIRE_DATE > Mmp.HIRE_DATE and  Mmp.last_name='jones' ;



-- 6.	Write a query to get the department name and number of employees in the
--      department.

select DEPARTMENT_NAME, count(employees.department_id) from employees,departments
where departments.DEPARTMENT_ID=employees.DEPARTMENT_ID
group by employees.department_id;

-- 7.	Write a query to find the employee ID, job title, number of days between 
--      ending date and starting date for all jobs in department 90.


select employees.employee_ID, job_title, datediff(end_date , start_date) as 'date' from employees,job_history,jobs
where employees.employee_id=job_history.employee_id 
and job_history.job_id=jobs.job_id 
and employees.DEPARTMENT_ID=90;


-- 8.	Write a query to display the department ID and name and first name of manager. 

select employees.EMPLOYEE_ID, employees.DEPARTMENT_ID,DEPARTMENT_NAME,first_name,last_name 
from employees,departments
where employees.department_id=departments.DEPARTMENT_ID 
and employees.EMPLOYEE_ID=departments.MANAGER_ID;

-- 9.	Write a query to display the department name, manager name, and city.

select department_name, first_name,last_name,city 
from employees, departments ,locations
where employees.department_id=departments.DEPARTMENT_ID 
and employees.EMPLOYEE_ID=departments.MANAGER_ID
and locations.LOCATION_ID=departments.LOCATION_ID;


-- 10.  Write a query to display the job title and average salary of employees.

select job_title, avg(salary) from employees,jobs
where employees.JOB_ID=jobs.JOB_ID
group by job_title;



-- 11.  Write a query to display job title, employee name, and the difference
--      between salary of the employee and minimum salary for the job.\

select job_title,first_name,last_name, (SALARY-MIN_SALARY) as diffsal from employees,jobs
where employees.JOB_ID=jobs.JOB_ID;


-- 12.  Write a query to display the job history that were done by 
--      any employee who is currently drawing more than 10000 of salary.

select  first_name, employees.JOB_ID, job_history.* 
from employees,job_history
where employees.EMPLOYEE_ID=job_history.EMPLOYEE_ID;


-- 13.  Write a query to display department name, name (first_name, last_name),
--      hire date, salary of the manager for all managers whose experience is
--      more than 15 years.

select DEPARTMENT_NAME,first_name, last_name,HIRE_DATE,salary from departments,employees
where departments.DEPARTMENT_ID=employees.DEPARTMENT_ID
and employees.EMPLOYEE_ID=departments.MANAGER_ID
and (sysdate()-HIRE_DATE)>(15*365);

