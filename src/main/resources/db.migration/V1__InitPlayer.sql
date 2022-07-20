CREATE SCHEMA IF NOT EXISTS migrations;

CREATE TABLE IF NOT EXISTS migrations.player
(
    id SERIAL primary key,
    name varchar(255) not null
);

INSERT INTO migrations.player(name)
values (1,'cr7'),
       (2,'shaw'),
       (3,'kante'),
       (4,'bruno'),
       (5,'messi'),
       (6,'de gea'),
       (7,'de jong');