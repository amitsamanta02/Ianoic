create schema MasterProduct;

CREATE TABLE MasterProduct.ShopMaster 
( 
  org_id CHAR(15) NOT NULL 
, gstin_no CHAR(15) NULL 
, country CHAR(30) NULL 
, shop_name VARCHAR(500) NULL 
, contact_phonno CHAR(10) NOT NULL 
, contact_email VARCHAR(255) NULL 
, shop_detail VARCHAR(1000) NULL 
, CONSTRAINT PRIMARY KEY ( org_id ) 
);





