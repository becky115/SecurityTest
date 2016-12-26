insert into users(username, password, enabled) values ('admin', 'admin123!', true);
insert into authorities(username, authority) values ('admin', 'ROLE_ADMIN');
insert into users(username, password, enabled) values ('guest', 'guest', true);
insert into authorities(username, authority) values ('guest', 'ROLE_USER');