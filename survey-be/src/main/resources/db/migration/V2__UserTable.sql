CREATE TABLE survey.USERS (
         ID         NUMBER PRIMARY KEY,
         NAME       VARCHAR2(200) NOT NULL,
         EMAIL      VARCHAR2(100) NOT NULL
)
   TABLESPACE survey_ts;

COMMENT ON TABLE survey.USERS IS 'Users table';