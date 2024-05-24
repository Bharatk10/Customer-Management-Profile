-- Table: users
CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    user_name VARCHAR NOT NULL, --> Unique
    password VARCHAR NOT NULL,
    email VARCHAR NOT NULL, --> Unique
    phone_no NUMERIC 
);

-- Table: roles
CREATE TABLE roles (
    role_id SERIAL PRIMARY KEY,
    role_name VARCHAR NOT NULL --> Unique
);

-- Table: user_role
CREATE TABLE user_role (
    user_id INTEGER,
    role_id INTEGER,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (role_id) REFERENCES roles(role_id)
);

-- Table: software_tech
CREATE TABLE software_tech (
    soft_tech_id SERIAL PRIMARY KEY,
    soft_tech_title VARCHAR, ---> NOT NULL, UNIQUE
    soft_tech_desc VARCHAR
);

-- Table: turnover_ranges
CREATE TABLE turnover_ranges (
    range_id SERIAL PRIMARY KEY,
    min_turnover NUMERIC,
    max_turnover NUMERIC,
    range_description VARCHAR  --> Is it required?
);

-- Table: organization
CREATE TABLE organization (
    org_id SERIAL PRIMARY KEY,
    legal_name VARCHAR NOT NULL, ---> UNIQUE
    parent_group_name VARCHAR,
    crm_name VARCHAR,
    industry_sector VARCHAR,
    no_of_employees NUMERIC,
    phone_number_1 NUMERIC,
    phone_number_2 NUMERIC,
    landline_number NUMERIC,
    turnover_value FLOAT,  ---> to be included in Turnover table 
    website_url VARCHAR, ---> UNIQUE, NOT NULL
    org_email VARCHAR, --> NOT NULL, UNIQUE
    additional_info VARCHAR,
    address_line1 VARCHAR,
    address_line2 VARCHAR,
    state VARCHAR, ---> NOT NULL
    country VARCHAR,  ---> NOT NULL
    range_id INTEGER,
    FOREIGN KEY (range_id) REFERENCES turnover_ranges(range_id)
);

-- Table: org_contacts
CREATE TABLE org_contacts (
    person_id SERIAL PRIMARY KEY,
    person_name VARCHAR NOT NULL,
    person_email VARCHAR NOT NULL, --> unique
    role VARCHAR,
    designation VARCHAR,  --- role and designation two diff columns? and role is a flag...

    phone_number_1 NUMERIC,
    phone_number_2 NUMERIC,
    landline_number NUMERIC,
    contact_additional_info VARCHAR(1000),
    linkedin_url VARCHAR,
    facebook_url VARCHAR,
    other_urls_1 VARCHAR,
    other_urls_2 VARCHAR,
    org_id INTEGER,
    FOREIGN KEY (org_id) REFERENCES organization(org_id)
);

-- Table: opportunities
CREATE TABLE opportunities (
    opportunity_id SERIAL PRIMARY KEY,
    soft_tech_id INTEGER,
    sw_tech_additional_info VARCHAR(1000),
    opportunity_type VARCHAR,
    opportunity_status VARCHAR,
    opportunity_additional_info VARCHAR(1000),
    timeline_availability DATE,
    org_id INTEGER,
    FOREIGN KEY (org_id) REFERENCES organization(org_id),
    FOREIGN KEY (soft_tech_id) REFERENCES software_tech(soft_tech_id)
);

-- Table: org_files
CREATE TABLE org_files (
    file_id SERIAL PRIMARY KEY,
    file_name VARCHAR NOT NULL,
    file_data BYTEA,
    file_desc VARCHAR,
    org_id INTEGER,
    FOREIGN KEY (org_id) REFERENCES organization(org_id)
);

-- Table: ERP
CREATE TABLE ERP (
    erp_id SERIAL PRIMARY KEY,
    org_id INTEGER,
    partner_name VARCHAR,
    additional_info_1 VARCHAR,
    additional_info_2 VARCHAR,
    FOREIGN KEY (org_id) REFERENCES organization(org_id)
);

-- Table: erp_files
CREATE TABLE erp_files (
    file_id SERIAL PRIMARY KEY,
    file_name VARCHAR NOT NULL,
    file_data BYTEA,
    file_desc VARCHAR,
    erp_id INTEGER,
    FOREIGN KEY (erp_id) REFERENCES ERP(erp_id)
);

-- Table: AMS
CREATE TABLE AMS (
    ams_id SERIAL PRIMARY KEY,
    org_id INTEGER,
    partner_name VARCHAR,
    expiry_month INTEGER, ---> date
    expiry_year INTEGER, ---> date
    additional_info_1 VARCHAR,
    additional_info_2 VARCHAR,
    FOREIGN KEY (org_id) REFERENCES organization(org_id)
);


