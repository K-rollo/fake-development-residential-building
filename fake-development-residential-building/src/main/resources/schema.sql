CREATE TABLE APARTMENT (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    building VARCHAR(100) NOT NULL,
    staircase VARCHAR(100) NOT NULL,
    floor BIGINT NOT NULL,
    apartment_number BIGINT NOT NULL,
    apartment_area FLOAT NOT NULL,
    amount_of_rooms TINYINT NOT NULL,
    status VARCHAR(100) NOT NULL,
    client_id BIGINT
);

CREATE TABLE CLIENT (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(400) NOT NULL,
    last_name VARCHAR(400) NOT NULL,
    street VARCHAR(400),
    number_as_string VARCHAR(400),
    city VARCHAR(400),
    zip_code_as_string VARCHAR(100),
    phone_number_as_string VARCHAR(100) NOT NULL,
    email_address_as_string VARCHAR(400) NOT NULL
);

ALTER TABLE APARTMENT
    ADD CONSTRAINT apartment_client_id
    FOREIGN KEY (client_id) REFERENCES CLIENT(id)
;

CREATE TABLE AP_ACTION (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    apartment_id BIGINT NOT NULL,
    action_type VARCHAR(100) NOT NULL,
    client_id BIGINT,
    created DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL
);

ALTER TABLE AP_ACTION
    ADD CONSTRAINT modification_apartment_id
    FOREIGN KEY (apartment_id) REFERENCES APARTMENT(id)
;

CREATE TABLE CLT_ACTION (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    apartment_id BIGINT NOT NULL,
    modification_type VARCHAR(100) NOT NULL,
    client_id BIGINT,
    created timestamp NOT NULL
);

ALTER TABLE CLT_ACTION
    ADD CONSTRAINT modification_apartment_client_id
    FOREIGN KEY (client_id) REFERENCES CLIENT(id)
;
