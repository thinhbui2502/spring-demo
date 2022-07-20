CREATE TABLE IF NOT EXISTS migrations.club
(
    id SERIAL primary key,
    name varchar(255) not null
);

insert into migrations.club(name)
values (1,'mu'),
       (2,'mc'),
       (3,'chelsea'),
       (4,'liv');