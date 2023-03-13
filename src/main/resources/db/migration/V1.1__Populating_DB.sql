insert into employees (employee_id, full_name, email , phone_number, date_of_birth, completed_tasks, salary)
values (1, 'Vannie', 'vodyvoy0@illinois.edu', '874-188-1176', '8/4/2022', '85605', '203');
insert into employees (employee_id, full_name, email , phone_number, date_of_birth, completed_tasks, salary)
values (2, 'Hamid', 'hdevoiels1@mozilla.com', '638-899-4682', '5/23/2022', '26', '176');
insert into employees (employee_id, full_name, email , phone_number, date_of_birth, completed_tasks, salary)
values (3, 'Catha', 'cadamovicz2@comsenz.com', '415-424-5462', '8/5/2022', '939', '27484');
insert into employees (employee_id, full_name, email , phone_number, date_of_birth, completed_tasks, salary)
values (4, 'Emelyne', 'eprandini3@drupal.org', '383-992-9130', '8/10/2022', '051', '587');
insert into employees (employee_id, full_name, email , phone_number, date_of_birth, completed_tasks, salary)
values (5, 'Phillida', 'pcherrett4@businessweek.com', '628-934-0202', '11/26/2022', '69793', '58351');
insert into employees (employee_id, full_name, email , phone_number, date_of_birth, completed_tasks, salary)
values (6, 'Nevil', 'nberge5@slate.com', '111-304-9834', '10/6/2022', '53', '62');
insert into employees (employee_id, full_name, email , phone_number, date_of_birth, completed_tasks, salary)
values (7, 'Dion', 'dtomkin6@devhub.com', '685-700-5796', '11/12/2022', '56', '114');
insert into employees (employee_id, full_name, email , phone_number, date_of_birth, completed_tasks, salary)
values (8, 'Renee', 'rjaves7@wordpress.com', '185-342-4604', '6/28/2022', '3', '7');
insert into employees (employee_id, full_name, email , phone_number, date_of_birth, completed_tasks, salary)
values (9, 'Temp', 'tfilde8@go.com', '516-574-8769', '11/22/2022', '0', '855');
insert into employees (employee_id, full_name, email , phone_number, date_of_birth, completed_tasks, salary)
values (10, 'Joachim', 'jpavlenkov9@github.io', '537-838-8667', '2/20/2023', '75', '11809');

insert into tasks (task_id, title, description, phone_number, due_date, employee_id)
values (1, 'Payment Adjustment Coordinator', 'Invalid character class empty?', '441-765-8051', '12/29/2022', 1);
insert into tasks (task_id, title, description, phone_number, due_date, employee_id)
values (2, 'Cost Accountant', 'Invalid character class empty?', '878-628-8137', '7/14/2022', 2);
insert into tasks (task_id, title, description, phone_number, due_date, employee_id)
values (3, 'Environmental Tech', 'Invalid character class empty?', '441-636-4035', '2/28/2023', 3);
insert into tasks (task_id, title, description, phone_number, due_date, employee_id)
values (4, 'Administrative Assistant III', 'Invalid character class empty?', '730-522-3443', '6/16/2022', 4);
insert into tasks (task_id, title, description, phone_number, due_date, employee_id)
values (5, 'Librarian', 'Invalid character class empty?', '516-822-4536', '2/13/2023', 5);

insert into users (user_id, user_name, email, password, role)
values (1, 'UroMilo', 'uromilo@gmail.com', '$2a$12$lK3t8UxtFD5Kljsl2JqQwelyxUMoVuI6eJzVdOqTcJqDKYM9c9wqm', 'ADMIN')