-- CREATE TABLE FLAGS (
--   ID VARCHAR(255) NOT NULL,
--   NAME VARCHAR(255),
--   PRIMARY KEY (ID)
-- ) ENGINE = INNODB DEFAULT CHARSET utf8;

-- INSERT INTO FLAGS(ID, NAME) VALUES('0','Money Laundering');
-- INSERT INTO FLAGS(ID, NAME) VALUES('1','Identification/Documentation');

-- CREATE TABLE ML_TYPES (
--   ID VARCHAR(255) NOT NULL,
--   CODE VARCHAR(255),
--   NAME VARCHAR(255),
--   PRIMARY KEY (ID)
-- ) ENGINE = INNODB DEFAULT CHARSET utf8;

-- INSERT INTO ML_TYPES(ID, CODE, NAME) VALUES('0','L','Transaction out of pattern for customer');

-- CREATE TABLE DOCUMENTATION_TYPES (
--   ID VARCHAR(255) NOT NULL,
--   CODE VARCHAR(255),
--   NAME VARCHAR(255),
--   PRIMARY KEY (ID)
-- ) ENGINE = INNODB DEFAULT CHARSET utf8;

-- INSERT INTO DOCUMENTATION_TYPES(ID, CODE, NAME) VALUES('0','A','Changes spelling or arrangement of name');
-- INSERT INTO DOCUMENTATION_TYPES(ID, CODE, NAME) VALUES('1','D','Refused or avoided request for documentation');

ALTER TABLE TICKETS ADD COLUMN FLAG VARCHAR(255) DEFAULT NULL;
ALTER TABLE TICKETS ADD COLUMN FLAGDESC VARCHAR(255) DEFAULT NULL;

UPDATE TICKETS SET FLAG = "Money Laundering", FLAGDESC = "Transaction out of pattern for customer" WHERE TICKETID=261; --chip diller
UPDATE TICKETS SET FLAG = "Identification/Documentation", FLAGDESC = "Multiple individuals with same or similar identities" WHERE TICKETID=130; --margot tenenbaum
UPDATE TICKETS SET FLAG = "Identification/Documentation", FLAGDESC = "Multiple individuals with same or similar identities" WHERE TICKETID=125; --royal tenenbaum
UPDATE TICKETS SET FLAG = "Identification/Documentation", FLAGDESC = "Provided questionable or false documentation" WHERE TICKETID=218; --kent dorfman