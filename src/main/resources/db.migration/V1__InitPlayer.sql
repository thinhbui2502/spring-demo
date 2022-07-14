create table player (
    id SERIAL primary key,
    name varchar (255) not null
);

insert into player(name)
values ('cr7'),
       ('shaw'),
       ('kante'),
       ('bruno'),
       ('messi'),
       ('de gea'),
       ('de jong');