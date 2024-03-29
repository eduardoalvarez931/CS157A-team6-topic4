-- Generated by Oracle SQL Developer Data Modeler 19.2.0.182.1216
--   at:        2019-11-16 14:55:19 PST
--   site:      Oracle Database 11g
--   type:      Oracle Database 11g



CREATE TABLE audiological (
    audiotest_id   VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    comments       CLOB
);

ALTER TABLE audiological ADD CONSTRAINT audiological_pk PRIMARY KEY ( audiotest_id );

CREATE TABLE chemical (
    chemical_id                VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    chemical_name              VARCHAR2(64 CHAR) NOT NULL,
    chemical_description       VARCHAR2(64 CHAR) NOT NULL,
    medication_medication_id   INTEGER NOT NULL
);

CREATE UNIQUE INDEX chemical__idx ON
    chemical (
        medication_medication_id
    ASC );

ALTER TABLE chemical ADD CONSTRAINT chemical_pk PRIMARY KEY ( chemical_id );

CREATE TABLE disease (
    disease_id            VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    disease_name          VARCHAR2(64 CHAR) NOT NULL,
    disease_description   VARCHAR2(64 CHAR) NOT NULL
);

ALTER TABLE disease ADD CONSTRAINT disease_pk PRIMARY KEY ( disease_id );

CREATE TABLE generic (
    generic_id                 VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    generic_name               VARCHAR2(64 CHAR) NOT NULL,
    generic_description        VARCHAR2(64 CHAR) NOT NULL,
    medication_medication_id   INTEGER NOT NULL
);

CREATE UNIQUE INDEX generic__idx ON
    generic (
        medication_medication_id
    ASC );

ALTER TABLE generic ADD CONSTRAINT generic_pk PRIMARY KEY ( generic_id );

CREATE TABLE medication (
    medication_id                  INTEGER NOT NULL,
    medication_name                VARCHAR2(64) NOT NULL,
    medication_description         CLOB NOT NULL,
    dose                           VARCHAR2(32 CHAR) NOT NULL,
    generic                        VARCHAR2(64 CHAR) NOT NULL,
    chemical_category              VARCHAR2(32 CHAR) NOT NULL,
    application                    VARCHAR2(128 CHAR) NOT NULL,
    duration                       DATE,
    pharmacology_pharmacology_id   NUMBER NOT NULL
);

ALTER TABLE medication ADD CONSTRAINT medication_pk PRIMARY KEY ( medication_id );

CREATE TABLE minimal_masking_level_test (
    audiological_audiotest_id VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL
);

CREATE TABLE patient (
    patient_id                     VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    fisrt_name                     unknown 
--  ERROR: Datatype UNKNOWN is not allowed 
     NOT NULL,
    last_name                      unknown 
--  ERROR: Datatype UNKNOWN is not allowed 
     NOT NULL,
    street                         unknown 
--  ERROR: Datatype UNKNOWN is not allowed 
     NOT NULL,
    building_number                unknown 
--  ERROR: Datatype UNKNOWN is not allowed 
     NOT NULL,
    zip_code                       unknown 
--  ERROR: Datatype UNKNOWN is not allowed 
     NOT NULL,
    city                           unknown 
--  ERROR: Datatype UNKNOWN is not allowed 
     NOT NULL,
    state                          unknown 
--  ERROR: Datatype UNKNOWN is not allowed 
     NOT NULL,
    thc#                           unknown 
--  ERROR: Datatype UNKNOWN is not allowed 
     NOT NULL,
    phone_number                   unknown 
--  ERROR: Datatype UNKNOWN is not allowed 
     NOT NULL,
    pharmacology_pharmacology_id   NUMBER NOT NULL
);

ALTER TABLE patient ADD CONSTRAINT patient_pk PRIMARY KEY ( patient_id );

CREATE TABLE pharmacology (
    t_side            CHAR(1) NOT NULL,
    usual_dose        VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    pharma_id         unknown 
--  ERROR: Datatype UNKNOWN is not allowed 
     NOT NULL,
    pharmacology_id   NUMBER NOT NULL
);

ALTER TABLE pharmacology ADD CONSTRAINT pharmacology_pk PRIMARY KEY ( pharmacology_id );

ALTER TABLE pharmacology ADD CONSTRAINT pharmacology_pharma_id_un UNIQUE ( pharma_id );

--  ERROR: Table name length exceeds maximum allowed length(30) 
CREATE TABLE pure_tone_loudness_discomfort_level_test (
    audiological_audiotest_id VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL
);

CREATE TABLE puretonetest (
    test_id                     VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    audiological_audiotest_id   VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    r25                         CHAR(1) NOT NULL,
    l25                         CHAR(1) NOT NULL,
    r50                         CHAR(1) NOT NULL,
    l50                         CHAR(1) NOT NULL,
    r1                          CHAR(1) NOT NULL,
    l1                          CHAR(1) NOT NULL,
    r2                          CHAR(1) NOT NULL,
    l2                          CHAR(1) NOT NULL,
    r3                          CHAR(1) NOT NULL,
    l3                          CHAR(1) NOT NULL,
    r4                          CHAR(1) NOT NULL,
    l4                          CHAR(1) NOT NULL,
    r6                          CHAR(1) NOT NULL,
    l6                          CHAR(1) NOT NULL,
    r8                          CHAR(1) NOT NULL,
    l8                          CHAR(1) NOT NULL,
    r10                         CHAR(1) NOT NULL,
    l10                         CHAR(1) NOT NULL,
    r12                         CHAR(1) NOT NULL,
    l12                         CHAR(1) NOT NULL
);

ALTER TABLE puretonetest ADD CONSTRAINT puretonetest_pk PRIMARY KEY ( test_id );

CREATE TABLE sd (
    audiological_audiotest_id   VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    sd_test_id                  VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    sd_left_ear                 VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    sd_right_ear                VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL
);

ALTER TABLE sd ADD CONSTRAINT sd_pk PRIMARY KEY ( sd_test_id );

CREATE TABLE symptoms (
    medication_medication_id   INTEGER NOT NULL,
    symptom_id                 VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    symptom_name               VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
    ,
    symptom_description        CLOB,
    disease_disease_id         VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL
);

ALTER TABLE symptoms
    ADD CONSTRAINT symptoms_pk PRIMARY KEY ( medication_medication_id,
                                             disease_disease_id,
                                             symptom_id );

CREATE TABLE tinnitus_test (
    pitch_match                 VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    match_type                  VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    loudness_match              VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
    ,
    audiological_audiotest_id   VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL
);

CREATE TABLE vist (
    visit_date           DATE NOT NULL,
    sequence_number      INTEGER NOT NULL,
    patient_patient_id   VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL
);

ALTER TABLE vist ADD CONSTRAINT vist_pk PRIMARY KEY ( patient_patient_id,
                                                      sequence_number );

CREATE TABLE wn (
    audiological_audiotest_id   VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    wnr                         VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    wnl                         VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    wn_test_id                  unknown 
--  ERROR: Datatype UNKNOWN is not allowed 
     NOT NULL
);

ALTER TABLE wn ADD CONSTRAINT wn_pk PRIMARY KEY ( wn_test_id );

ALTER TABLE chemical
    ADD CONSTRAINT chemical_medication_fk FOREIGN KEY ( medication_medication_id )
        REFERENCES medication ( medication_id );

ALTER TABLE generic
    ADD CONSTRAINT generic_medication_fk FOREIGN KEY ( medication_medication_id )
        REFERENCES medication ( medication_id );

ALTER TABLE medication
    ADD CONSTRAINT medication_pharmacology_fk FOREIGN KEY ( pharmacology_pharmacology_id )
        REFERENCES pharmacology ( pharmacology_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE minimal_masking_level_test
    ADD CONSTRAINT minimal_masking_level_test_audiological_fk FOREIGN KEY ( audiological_audiotest_id )
        REFERENCES audiological ( audiotest_id );

ALTER TABLE patient
    ADD CONSTRAINT patient_pharmacology_fk FOREIGN KEY ( pharmacology_pharmacology_id )
        REFERENCES pharmacology ( pharmacology_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE pure_tone_loudness_discomfort_level_test
    ADD CONSTRAINT pure_tone_loudness_discomfort_level_test_audiological_fk FOREIGN KEY ( audiological_audiotest_id )
        REFERENCES audiological ( audiotest_id );

ALTER TABLE puretonetest
    ADD CONSTRAINT puretonetest_audiological_fk FOREIGN KEY ( audiological_audiotest_id )
        REFERENCES audiological ( audiotest_id );

ALTER TABLE sd
    ADD CONSTRAINT sd_audiological_fk FOREIGN KEY ( audiological_audiotest_id )
        REFERENCES audiological ( audiotest_id );

ALTER TABLE symptoms
    ADD CONSTRAINT symptoms_disease_fk FOREIGN KEY ( disease_disease_id )
        REFERENCES disease ( disease_id );

ALTER TABLE symptoms
    ADD CONSTRAINT symptoms_medication_fk FOREIGN KEY ( medication_medication_id )
        REFERENCES medication ( medication_id );

ALTER TABLE tinnitus_test
    ADD CONSTRAINT tinnitus_test_audiological_fk FOREIGN KEY ( audiological_audiotest_id )
        REFERENCES audiological ( audiotest_id );

ALTER TABLE vist
    ADD CONSTRAINT vist_patient_fk FOREIGN KEY ( patient_patient_id )
        REFERENCES patient ( patient_id );

ALTER TABLE wn
    ADD CONSTRAINT wn_audiological_fk FOREIGN KEY ( audiological_audiotest_id )
        REFERENCES audiological ( audiotest_id );

CREATE SEQUENCE pharmacology_pharmacology_id START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER pharmacology_pharmacology_id BEFORE
    INSERT ON pharmacology
    FOR EACH ROW
    WHEN ( new.pharmacology_id IS NULL )
BEGIN
    :new.pharmacology_id := pharmacology_pharmacology_id.nextval;
END;
/



-- Oracle SQL Developer Data Modeler Summary Report: 
-- 
-- CREATE TABLE                            15
-- CREATE INDEX                             2
-- ALTER TABLE                             26
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           1
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          1
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                  39
-- WARNINGS                                 0
