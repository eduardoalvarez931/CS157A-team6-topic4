INSERT INTO cat_chem VALUES(0, "para-acetylaminophenol", "found in acetaminophen");
INSERT INTO cat_chem VALUES(1, "propionic acid", "found in ibuprofen");
INSERT INTO cat_chem VALUES(2, "phenylpiperidine", "description for phenylpiperidine");
INSERT INTO cat_chem VALUES(3, "tetracycline", "description for tetracycline");
INSERT INTO cat_chem VALUES(4, "cannabinoids", "found in marijuana");

INSERT INTO generic VALUES(0, "acetaminophen", "found in Tylenol");
INSERT INTO generic VALUES(1, "ibuprofen", "found in Advil");
INSERT INTO generic VALUES(2, "amphetamine", "found in Adderall");
INSERT INTO generic VALUES(3, "amoxicillin", "found in Moxatag");
INSERT INTO generic VALUES(4, "alprazolam", "found in Xanax");

INSERT INTO disease VALUES(0, "fever", "hotness");
INSERT INTO disease VALUES(1, "ADHD", "attention deficit hyperactivity disorder");
INSERT INTO disease VALUES(2, "anxiety", "stress");
INSERT INTO disease VALUES(3, "tonsillitis", "bad tonsils");
INSERT INTO disease VALUES(4, "depression", "sadness");

INSERT INTO medication VALUES(0, 0, 0, 0, "Tylenol", "relieves pain", "325 mg", "pain reliever", "fever and pain", true);
INSERT INTO medication VALUES(1, 1, 1, 0, "Advil", "relieves pain", "200 mg", "anti-inflammatory", "reduce fever and treat pain or inflammation", true);
INSERT INTO medication VALUES(2, 2, 2, 1, "Adderall", "affect chemicals in brain and nerves that contribute to hyperactivity and impulse control", "10 mg orally per day", "antipsychotic", "ADHD", true);
INSERT INTO medication VALUES(3, 3, 3, 3, "Moxatag", "fights bacteria", "775 mg once daily", "penicillin antibiotic", "treat tonsillitis and/or pharyngitis", false);
INSERT INTO medication VALUES(4, 4, 4, 4, "Xanax", "affects chemicals in the brain that may be unbalanced in people with anxiety", "0.25 to 0.5 mg given three times daily", "benzodiazepine", "anxiety and panic disorders", false);

INSERT INTO patient VALUES("123", "Mary", "Sandoval", "762153370", 95112, "San Jose", "California", "United States", '1973-11-23');
INSERT INTO patient VALUES("456", "Kaden", "Richardson", "820711371", 95223, "Arnold", "California", "United States", '1994-03-05');
INSERT INTO patient VALUES("789", "Apple", "Bottom-Jeans", "597042222", 2000, "Sydney", "New South Wales", "Australia", '1990-10-01');
INSERT INTO patient VALUES("1234", "Holly", "Blossom", "328745313", 95834, "Sacramento", "California", "United States", '2001-12-15');
INSERT INTO patient VALUES("12345", "Wally", "West", "649311234", 90909, "Montreal", "Quebec", "Canada", '1999-05-22');

INSERT INTO visit VALUES(0, "123", 11, '2019-07-12 08:00:00', "");
INSERT INTO visit VALUES(1, "456", 12, '2019-07-30 03:05:55', "");
INSERT INTO visit VALUES(2, "789", 13, '2016-09-08 22:10:05', "");
INSERT INTO visit VALUES(3, "1234", 14, '2000-01-09 07:07:07', "");
INSERT INTO visit VALUES(4, "12345", 15, '2005-08-10 01:03:35', "");

INSERT INTO pharmacology VALUES(0, 0, "325mg", 4, "");
INSERT INTO pharmacology VALUES(1, 1, "200mg", 4, "");
INSERT INTO pharmacology VALUES(2, 2, "10mg", 4, "");
INSERT INTO pharmacology VALUES(3, 3, "775mg", 4, "");
INSERT INTO pharmacology VALUES(4, 4, "0.25mg", 4, "");