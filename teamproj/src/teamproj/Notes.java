package teamproj;

public class Notes {

}
/**
 * 
 * CREATE TABLE VISIT(
PATIENT_ID int not null auto_increment primary key,
PATIENT_NAME VARCHAR(64) not null,
THC_NUMBER int not null,
SEQUENCE_NUMBER int not null,
VISIT_DATE date not null
);

CREATE TABLE AUDIOLOGICAL(
R25 boolean,
R50 boolean,
R1 boolean,
R2 boolean,
R3 boolean,
R4 boolean,
R6 boolean,
R8 boolean,
R10 boolean,
R12 boolean,
L25 boolean,
L50 boolean,
L1 boolean,
L2 boolean,
L3 boolean,
L4 boolean,
L6 boolean,
L8 boolean,
L10 boolean,
L12 boolean
);

CREATE TABLE MEDICATION(
MEDICATION_ID int not null primary key,
MEDICATION_NAME VARCHAR(64) not null,
MEDICATION_DESCRIPTION VARCHAR(128) not null,
USUAL_DOSE VARCHAR(32) not null,
GENERIC VARCHAR(64) not null,
CHEMICAL_CATEGORY VARCHAR(32) not null,
APPLICATION VARCHAR(128) not null
);

CREATE TABLE DISEASE(
DISEASE_ID int not null primary key,
DISEASE_NAME VARCHAR(64) not null,
DISEASE_DESCRIPTION VARCHAR(128) not null
);

CREATE TABLE GENERIC(
GENERIC_ID int not null primary key,
GENERIC_NAME VARCHAR(64) not null,
GENERIC_DESCRIPTION VARCHAR(128) not null
);

CREATE TABLE CHEMICAL(
CHEMICAL_ID int not null primary key,
CHEMICAL_NAME VARCHAR(64) not null,
CHEMICAL_DESCRIPTION VARCHAR(128) not null
);
	
 * 
 * 
 */