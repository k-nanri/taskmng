DROP TABLE IF EXISTS task CASCADE;
DROP SEQUENCE IF EXISTS task_id_seq CASCADE;

CREATE SEQUENCE task_id_seq;
CREATE TABLE IF NOT EXISTS task (
  id integer DEFAULT nextval('task_id_seq') PRIMARY KEY,
  title varchar(30),
  detail varchar(300),
  progress integer,
  starttime timestamp ,
  endtime timestamp 
);