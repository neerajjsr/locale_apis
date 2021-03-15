CREATE SCHEMA locale;


CREATE TABLE locale.m_language
(
    id serial NOT NULL PRIMARY KEY ,
    language_code character varying(2) NOT NULL UNIQUE,
    language_display character varying(255)  ,
    enabled boolean NOT NULL DEFAULT true,
	create_date timestamp with time zone NOT NULL DEFAULT now(),
    update_date timestamp with time zone DEFAULT now(),
	created_by character varying(200)  NOT NULL,
    updated_by character varying(200) 

);
 
CREATE TABLE locale.language_details
(
    id serial NOT NULL PRIMARY KEY ,
    language_id integer NOT NULL,
    unique_code character varying(200) NOT NULL,
    display_label character varying(500),
	create_date timestamp with time zone NOT NULL DEFAULT now(),
    update_date timestamp with time zone DEFAULT now(),
	created_by character varying(200)  NOT NULL,
    updated_by character varying(200) 

);

INSERT INTO locale.m_language(
	language_code, language_display, enabled, create_date, update_date,created_by)
	VALUES ('EN', 'English', true, now(), now(),'neerajjsr'),
	('ES', 'Español', true, now(), now(),'neerajjsr');
	
INSERT INTO locale.language_details(
	language_id, unique_code, display_label,created_by)
	VALUES (1, 'btn.save', 'Save','neerajjsr'),
	(1, 'btn.cancel', 'Cancel','neerajjsr'),
	(1, 'btn.reset', 'Reset','neerajjsr'),
	(1, 'btn.clear', 'Clear','neerajjsr'),(1, 'placeholder.role_name', 'Role Name','neerajjsr'),
	(1, 'placeholder.role_desc', 'Role Description','neerajjsr'), (1, 'placeholder.selectLanguage', 'Select Language','neerajjsr'),
	(1, 'placeholder.uniqueCode', 'Unique Key','neerajjsr'),
	(1, 'placeholder.displayLabel', 'Display Label','neerajjsr');
	
	INSERT INTO locale.language_details(
    	language_id, unique_code, display_label,created_by)
	VALUES (1, 'typeUserName', 'Type User Name','neerajjsr'),
	(1, 'userFullName', 'User Full Name','neerajjsr'),
	(1, 'typeEmailId', 'Type Email Id','neerajjsr'),
	(1, 'role', 'Role','neerajjsr'),
	(1, 'subRole', 'Sub Role','neerajjsr'),
	(1, 'user', 'User','neerajjsr'),
	(1, 'userAssignments', 'User Assignments','neerajjsr');
