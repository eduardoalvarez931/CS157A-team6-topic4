CREATE TABLE patient (
    thc_number                     VARCHAR(6) NOT NULL,
    first_name                     VARCHAR(15) NOT NULL,
    last_name                      VARCHAR(25) NOT NULL,
    ssn							   VARCHAR(10) NOT NULL,
    zip_code                       INT NOT NULL,
    city                           VARCHAR(32) NOT NULL,
    state                          VARCHAR(25) NOT NULL,
    country						   VARCHAR(25) NOT NULL,
    dob							   DATE NOT NULL
);
ALTER TABLE patient ADD CONSTRAINT patient_pk PRIMARY KEY ( thc_number );

CREATE TABLE visit (
    visit_id 		INT NOT NULL,
    thc				VARCHAR(6) NOT NULL,
    visit_number	SMALLINT NOT NULL,
    visit_date		DATETIME NOT NULL,
    comments		VARCHAR(256)
);
ALTER TABLE visit ADD CONSTRAINT visit_pk PRIMARY KEY ( visit_id );
ALTER TABLE visit ADD CONSTRAINT patient_fk FOREIGN KEY ( thc ) REFERENCES patient (thc_number);

CREATE TABLE audiological (
	visit_id 			INT NOT NULL,
    comments 			VARCHAR(255),
    r25                 SMALLINT NOT NULL,
    l25                 SMALLINT NOT NULL,
    r50                 NUMERIC(28) NOT NULL,
    l50                 NUMERIC(28) NOT NULL,
    r1                  NUMERIC(28) NOT NULL,
    l1                  NUMERIC(28) NOT NULL,
    r2                  NUMERIC(28) NOT NULL,
    l2                  NUMERIC(28) NOT NULL,
    r3                  NUMERIC(28) NOT NULL,
    l3                  NUMERIC(28) NOT NULL,
    r4                  NUMERIC(28) NOT NULL,
    l4                  NUMERIC(28) NOT NULL,
    r6                  NUMERIC(28) NOT NULL,
    l6                  NUMERIC(28) NOT NULL,
    r8                  NUMERIC(28) NOT NULL,
    l8                  NUMERIC(28) NOT NULL,
    r10                 NUMERIC(28) NOT NULL,
    l10                 NUMERIC(28) NOT NULL,
    r12                 NUMERIC(28) NOT NULL,
    l12                 NUMERIC(28) NOT NULL,
    t_pr				NUMERIC(28) NOT NULL,
    t_rm				VARCHAR(6) NOT NULL,
    t_lr				NUMERIC(28) NOT NULL,
    th_r				NUMERIC(28) NOT NULL,
    t_rls				NUMERIC(28) NOT NULL,
    t_pl				NUMERIC(28) NOT NULL,
    t_lm				VARCHAR(6) NOT NULL,
    t_ll				NUMERIC(28) NOT NULL,
    th_l				NUMERIC(28) NOT NULL,
    t_ls				NUMERIC(28) NOT NULL,
    wnr				    NUMERIC(28) NOT NULL,
    wnl					NUMERIC(28) NOT NULL,
    mrr					NUMERIC(28) NOT NULL,
    mrl					NUMERIC(28) NOT NULL,
    mrb					NUMERIC(28) NOT NULL,
    mlb					NUMERIC(28) NOT NULL,
    mbr					NUMERIC(28) NOT NULL,
    m_bl				NUMERIC(28) NOT NULL,
    r_sd				NUMERIC(28) NOT NULL,
    l_sd				NUMERIC(28) NOT NULL,
    lr50				NUMERIC(28) NOT NULL,
    lr1					NUMERIC(28) NOT NULL,
    lr2					NUMERIC(28) NOT NULL,
    lr3					NUMERIC(28) NOT NULL,
    lr4					NUMERIC(28) NOT NULL,
    lr6					NUMERIC(28) NOT NULL,
    lr8					NUMERIC(28) NOT NULL,
    lr12				NUMERIC(28) NOT NULL,
    lrtp				NUMERIC(28) NOT NULL,
    ll50				NUMERIC(28) NOT NULL,
    ll1					NUMERIC(28) NOT NULL,
    ll2					NUMERIC(28) NOT NULL,
    ll3					NUMERIC(28) NOT NULL,
    ll4					NUMERIC(28) NOT NULL,
    ll6					NUMERIC(28) NOT NULL,
    ll8					NUMERIC(28) NOT NULL,
    ll12				NUMERIC(28) NOT NULL,
    lltp				NUMERIC(28) NOT NULL
);
ALTER TABLE audiological ADD CONSTRAINT audiological_visit_fk FOREIGN KEY ( visit_id ) REFERENCES visit (visit_id);

CREATE TABLE cat_chem (
    chemical_id 			SMALLINT NOT NULL,
    chemical_name 			VARCHAR(25) NOT NULL,
    chemical_description 	VARCHAR(256) NOT NULL
);
ALTER TABLE cat_chem ADD CONSTRAINT chemical_pk PRIMARY KEY ( chemical_id );

CREATE TABLE disease (
    disease_id 			SMALLINT NOT NULL,
    disease_name 		VARCHAR(25) NOT NULL,
    disease_description VARCHAR(256) NOT NULL
);
ALTER TABLE disease ADD CONSTRAINT disease_pk PRIMARY KEY ( disease_id );

CREATE TABLE generic (
    generic_id 			SMALLINT NOT NULL,
    generic_name 		VARCHAR(25) NOT NULL,
    generic_description VARCHAR(256) NOT NULL
);
ALTER TABLE generic ADD CONSTRAINT generic_pk PRIMARY KEY ( generic_id );

CREATE TABLE medication (
    medication_id                  SMALLINT NOT NULL,
    generic_id					   SMALLINT NOT NULL,
    chem_id						   SMALLINT NOT NULL,
    disease_id					   SMALLINT NOT NULL,
    medication_name                VARCHAR(25) NOT NULL,
    medication_description         VARCHAR(256) NOT NULL,
    usual_dose                     VARCHAR(45) NOT NULL,
    medication_action		   VARCHAR(48) NOT NULL,
    application			   VARCHAR(128) NOT NULL,
    t_side			   BOOLEAN NOT NULL,
    med_comments		   VARCHAR(256)
);
ALTER TABLE medication ADD CONSTRAINT medication_pk PRIMARY KEY ( medication_id );
ALTER TABLE medication ADD CONSTRAINT disease_fk FOREIGN KEY ( disease_id ) REFERENCES disease (disease_id);
ALTER TABLE medication ADD CONSTRAINT generic_fk FOREIGN KEY ( generic_id ) REFERENCES generic (generic_id);
ALTER TABLE medication ADD CONSTRAINT cat_chem_fk FOREIGN KEY ( chem_id ) REFERENCES cat_chem (chemical_id);

CREATE TABLE pharmacology (
    medicament_id     SMALLINT NOT NULL,
    visit_id		  INT NOT NULL,
    dose              VARCHAR(20) NOT NULL,
    duration_mo       NUMERIC(28)NOT NULL,
    comments		  VARCHAR(256)
);
ALTER TABLE pharmacology ADD CONSTRAINT medicament_fk FOREIGN KEY (medicament_id) REFERENCES medication(medication_id);
ALTER TABLE pharmacology ADD CONSTRAINT pharmacology_visit_fk FOREIGN KEY (visit_id) REFERENCES visit (visit_id);
