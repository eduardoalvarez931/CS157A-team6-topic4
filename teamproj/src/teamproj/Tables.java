package teamproj;

public class Tables {
	public static String[] Tables = 
		{
			"CREATE TABLE patient (" + 
			"    thc_number VARCHAR(6) NOT NULL," + 
			"    first_name VARCHAR(15) NOT NULL," + 
			"    last_name  VARCHAR(25) NOT NULL," + 
			"    ssn        VARCHAR(10) NOT NULL," + 
			"    zip_code   SMALLINT NOT NULL," + 
			"    city       VARCHAR(32) NOT NULL," + 
			"    state      VARCHAR(25) NOT NULL," + 
			"    country	VARCHAR(25) NOT NULL," + 
			"    dob		DATE NOT NULL);" ,
			
			"CREATE TABLE visit (" + 
					"    visit_id 		INT NOT NULL,\r\n" + 
					"    thc				VARCHAR(6) NOT NULL,\r\n" + 
					"    visit_number	SMALLINT NOT NULL,\r\n" + 
					"    visit_date		DATETIME NOT NULL,\r\n" + 
					"    comments		VARCHAR(256)\r\n" + 
					");"	,
			
			"CREATE TABLE audiological (\r\n" + 
			"	visit_id 			INT NOT NULL,\r\n" + 
			"    comments 			VARCHAR(255),\r\n" + 
			"    r25                 SMALLINT NOT NULL,\r\n" + 
			"    l25                 SMALLINT NOT NULL,\r\n" + 
			"    r50                 NUMERIC(28) NOT NULL,\r\n" + 
			"    l50                 NUMERIC(28) NOT NULL,\r\n" + 
			"    r1                  NUMERIC(28) NOT NULL,\r\n" + 
			"    l1                  NUMERIC(28) NOT NULL,\r\n" + 
			"    r2                  NUMERIC(28) NOT NULL,\r\n" + 
			"    l2                  NUMERIC(28) NOT NULL,\r\n" + 
			"    r3                  NUMERIC(28) NOT NULL,\r\n" + 
			"    l3                  NUMERIC(28) NOT NULL,\r\n" + 
			"    r4                  NUMERIC(28) NOT NULL,\r\n" + 
			"    l4                  NUMERIC(28) NOT NULL,\r\n" + 
			"    r6                  NUMERIC(28) NOT NULL,\r\n" + 
			"    l6                  NUMERIC(28) NOT NULL,\r\n" + 
			"    r8                  NUMERIC(28) NOT NULL,\r\n" + 
			"    l8                  NUMERIC(28) NOT NULL,\r\n" + 
			"    r10                 NUMERIC(28) NOT NULL,\r\n" + 
			"    l10                 NUMERIC(28) NOT NULL,\r\n" + 
			"    r12                 NUMERIC(28) NOT NULL,\r\n" + 
			"    l12                 NUMERIC(28) NOT NULL,\r\n" + 
			"    t_rm				VARCHAR(6) NOT NULL,\r\n" + 
			"    t_lr				NUMERIC(28) NOT NULL,\r\n" + 
			"    th_r				NUMERIC(28) NOT NULL,\r\n" + 
			"    t_rls				NUMERIC(28) NOT NULL,\r\n" + 
			"    t_pl				NUMERIC(28) NOT NULL,\r\n" + 
			"    t_lm				VARCHAR(6) NOT NULL,\r\n" + 
			"    t_ll				NUMERIC(28) NOT NULL,\r\n" + 
			"    th_l				NUMERIC(28) NOT NULL,\r\n" + 
			"    t_ls				NUMERIC(28) NOT NULL,\r\n" + 
			"    wnr				    NUMERIC(28) NOT NULL,\r\n" + 
			"    wnl					NUMERIC(28) NOT NULL,\r\n" + 
			"    mrr					NUMERIC(28) NOT NULL,\r\n" + 
			"    mrl					NUMERIC(28) NOT NULL,\r\n" + 
			"    mrb					NUMERIC(28) NOT NULL,\r\n" + 
			"    mlr					NUMERIC(28) NOT NULL,\r\n" + 
			"    mll					NUMERIC(28) NOT NULL,\r\n" + 
			"    mlb					NUMERIC(28) NOT NULL,\r\n" + 
			"    mbr					NUMERIC(28) NOT NULL,\r\n" + 
			"    m_bl				NUMERIC(28) NOT NULL,\r\n" + 
			"    m_bb				NUMERIC(28) NOT NULL,\r\n" + 
			"    r_sd				NUMERIC(28) NOT NULL,\r\n" + 
			"    l_sd				NUMERIC(28) NOT NULL,\r\n" + 
			"    lr50				NUMERIC(28) NOT NULL,\r\n" + 
			"    lr1					NUMERIC(28) NOT NULL,\r\n" + 
			"    lr2					NUMERIC(28) NOT NULL,\r\n" + 
			"    lr3					NUMERIC(28) NOT NULL,\r\n" + 
			"    lr4					NUMERIC(28) NOT NULL,\r\n" + 
			"    lr6					NUMERIC(28) NOT NULL,\r\n" + 
			"    lr8					NUMERIC(28) NOT NULL,\r\n" + 
			"    lr12				NUMERIC(28) NOT NULL,\r\n" + 
			"    lrtp				NUMERIC(28) NOT NULL,\r\n" + 
			"    ll50				NUMERIC(28) NOT NULL,\r\n" + 
			"    ll1					NUMERIC(28) NOT NULL,\r\n" + 
			"    ll2					NUMERIC(28) NOT NULL,\r\n" + 
			"    ll3					NUMERIC(28) NOT NULL,\r\n" + 
			"    ll4					NUMERIC(28) NOT NULL,\r\n" + 
			"    ll6					NUMERIC(28) NOT NULL,\r\n" + 
			"    ll8					NUMERIC(28) NOT NULL," + 
			"    ll12				NUMERIC(28) NOT NULL," + 
			"    lltp				NUMERIC(28) NOT NULL );"	,
			
			"CREATE TABLE cat_chem (\r\n" + 
			"    chemical_id 			SMALLINT NOT NULL,\r\n" + 
			"    chemical_name 			VARCHAR(25) NOT NULL,\r\n" + 
			"    chemical_description 	VARCHAR(256) NOT NULL);"	,
			
			"CREATE TABLE disease (" + 
			"    disease_id 			SMALLINT NOT NULL,\r\n" + 
			"    disease_name 		VARCHAR(25) NOT NULL,\r\n" + 
			"    disease_description VARCHAR(256) NOT NULL);"	,
			
			"CREATE TABLE generic (" + 
			"    generic_id 			SMALLINT NOT NULL,\r\n" + 
			"    generic_name 		VARCHAR(25) NOT NULL,\r\n" + 
			"    generic_description VARCHAR(256) NOT NULL);" ,
			
			"CREATE TABLE medication (\r\n" + 
			"    medication_id                  SMALLINT NOT NULL,\r\n" + 
			"    generic_id					   SMALLINT NOT NULL,\r\n" + 
			"    chem_id						   SMALLINT NOT NULL,\r\n" + 
			"    disease_id					   SMALLINT NOT NULL,\r\n" + 
			"    medication_name                VARCHAR(25) NOT NULL,\r\n" + 
			"    medication_description         VARCHAR(256) NOT NULL,\r\n" + 
			"    usual_dose                     NUMERIC(28) NOT NULL);"	,
			
			"CREATE TABLE pharmacology (\r\n" + 
			"    medicament_id     SMALLINT NOT NULL,\r\n" + 
			"    visit_id		  INT NOT NULL,\r\n" + 
			"    dose              NUMERIC(28) NOT NULL,\r\n" + 
			"    duration_mo       NUMERIC(28)NOT NULL,\r\n" + 
			"    comments		  VARCHAR(256));"			
		};
	
	public static String[] alterTableCmnds = {
			"ALTER TABLE patient ADD CONSTRAINT patient_pk PRIMARY KEY ( thc_number );"	,
			
			"ALTER TABLE visit ADD CONSTRAINT visit_pk PRIMARY KEY ( visit_id );"	,
			
			"ALTER TABLE visit ADD CONSTRAINT patient_fk FOREIGN KEY ( thc ) REFERENCES patient (thc_number);"	,
			
			"ALTER TABLE audiological ADD CONSTRAINT audiological_visit_fk FOREIGN KEY ( visit_id ) REFERENCES visit (visit_id);"	,
			
			"ALTER TABLE cat_chem ADD CONSTRAINT chemical_pk PRIMARY KEY ( chemical_id );"	,
			
			"ALTER TABLE disease ADD CONSTRAINT disease_pk PRIMARY KEY ( disease_id );"	,
			
			"ALTER TABLE generic ADD CONSTRAINT generic_pk PRIMARY KEY ( generic_id );"	,
			
			"ALTER TABLE medication ADD CONSTRAINT medication_pk PRIMARY KEY ( medication_id );"	,
			
			"ALTER TABLE medication ADD CONSTRAINT disease_fk FOREIGN KEY ( disease_id ) REFERENCES disease (disease_id);"	,
			
			"ALTER TABLE medication ADD CONSTRAINT generic_fk FOREIGN KEY ( generic_id ) REFERENCES generic (generic_id);"	,
			
			"ALTER TABLE medication ADD CONSTRAINT cat_chem_fk FOREIGN KEY ( chem_id ) REFERENCES cat_chem (chemical_id);"	,
			
			"ALTER TABLE pharmacology ADD CONSTRAINT medicament_fk FOREIGN KEY (medicament_id) REFERENCES medication(medication_id);"	,
			
			"ALTER TABLE pharmacology ADD CONSTRAINT pharmacology_visit_fk FOREIGN KEY (visit_id) REFERENCES visit (visit_id);" 
	};

	public static String[] populateVisitTable = 
		{
			"INSERT INTO visit"
		};
	
}
