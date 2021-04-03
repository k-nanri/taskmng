DROP TABLE IF EXISTS task CASCADE;

CREATE TABLE IF NOT EXISTS task (
  title varchar(30),
  detail varchar(300),
  progress int,
  starttime timestamp ,
  endtime timestamp 
);