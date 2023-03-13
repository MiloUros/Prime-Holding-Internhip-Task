CREATE TABLE employees
(
    PRIMARY KEY (employee_id),
    employee_id            SERIAL,
    full_name    varchar(255),
    email         varchar(255),
    phone_number varchar(255),
    date_of_birth    timestamp,
    completed_tasks integer,
    salary    decimal(255)
);

CREATE TABLE tasks
(
    task_id            SERIAL,
    title    varchar(255),
    description         varchar(255),
    phone_number varchar(255),
    due_date    timestamp,
    employee_id int NOT NULL,
    PRIMARY KEY (task_id),
    FOREIGN KEY (employee_id) REFERENCES employees (employee_id)
);

CREATE TABLE users
(
    PRIMARY KEY (user_id),
    user_id            SERIAL,
    user_name    varchar(255) UNIQUE,
    email         varchar(255),
    password varchar(255),
    role     varchar(255)
);