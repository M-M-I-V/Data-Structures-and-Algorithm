-- Create a database called demo
CREATE DATABASE demo;

-- Use the demo database
USE demo;

-- Create tabled called employees
CREATE TABLE employees (
  id INT(11) PRIMARY KEY AUTO_INCREMENT,
  last_name VARCHAR(64),
  first_name VARCHAR(64),
  email VARCHAR(64),
  department VARCHAR(64),
  salary NUMERIC(10,2)
)

-- Insert records in the employees table
INSERT INTO employees (id,last_name, first_name, email, department, salary) 
VALUES (1,'Doe','John','john.doe@foo.com', 'HR', 55000.00),
       (2,'Public','Mary','mary.public@foo.com', 'Engineering', 75000.00)
       (3,'Queue','Susan','susan.queue@foo.com', 'Legal', 130000.00),
       (4,'Williams','David','david.williams@foo.com', 'HR', 120000.00),
       (5,'Johnson','Lisa','lisa.johnson@foo.com', 'Engineering', 50000.00),
       (6,'Smith','Paul','paul.smith@foo.com', 'Legal', 100000.00),
       (7,'Adams','Carl','carl.adams@foo.com', 'HR', 50000.00),
       (8,'Brown','Bill','bill.brown@foo.com', 'Engineering', 50000.00),
       (9,'Thomas','Susan','susan.thomas@foo.com', 'Legal', 80000.00),
       (10,'Davis','John','john.davis@foo.com', 'HR', 45000.00),
       (11,'Fowler','Mary','mary.fowler@foo.com', 'Engineering', 65000.00),
       (12,'Waters','David','david.waters@foo.com', 'Legal', 90000.00);
