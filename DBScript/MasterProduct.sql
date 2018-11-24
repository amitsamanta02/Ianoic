CREATE TABLE MasterProduct.ProductMaster 
( 
  ProductID CHAR(10) NOT NULL 
, ProductName VARCHAR(450) NOT NULL 
, ProductDesc VARCHAR(500) NULL 
, ProductCatagory CHAR(20) NOT NULL 
, CONSTRAINT PRIMARY KEY ( ProductID ) );

CREATE INDEX MasterProduct.ProductMaster_INDEX1 ON MasterProduct.ProductMaster ( ProductID ASC);
