CREATE TABLE employees
(
    PRIMARY KEY (employee_id),
    employee_id            SERIAL,
    full_name    varchar(20),
    email         varchar(40) UNIQUE,
    phone_number varchar(255),
    date_of_birth    timestamp,
    salary    decimal(100)
);

CREATE TABLE tasks
(
    task_id            SERIAL,
    title    varchar(20),
    description         varchar(40) UNIQUE,
    phone_number varchar(255),
    due_date    timestamp,
    employee_id int NOT NULL,
    PRIMARY KEY (task_id),
    FOREIGN KEY (employee_id) REFERENCES employees (employee_id)
);