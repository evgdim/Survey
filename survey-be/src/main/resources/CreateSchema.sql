CREATE BIGFILE TABLESPACE survey_ts
  DATAFILE 'survey_ts.dat'
  SIZE 20M AUTOEXTEND ON;

CREATE USER survey IDENTIFIED BY survey
DEFAULT TABLESPACE survey_ts;

GRANT CONNECT TO survey;
GRANT RESOURCE TO survey;

ALTER USER survey QUOTA UNLIMITED ON survey_ts;

--revert
drop user survey cascade;
drop tablespace survey_ts including contents and datafiles;