CREATE TABLE MasterProduct.ItemMaster 
( 
  ItemID CHAR(15) NOT NULL 
, ItemName VARCHAR(250) NOT NULL 
, ItemDesc VARCHAR(500) NULL 
, Manufacturer VARCHAR(255) NULL 
, UoM VARCHAR(255) NULL 
, UnitPrice DECIMAL NULL 
, MinQlt INT NULL 
, MaxQlt INT NULL 
, TaxIndusive VARCHAR(10) NULL 
, MfgDate DATE NULL 
, Expdate DATE NULL 
, LaunchDate DATE NULL 
, ProductID CHAR(10) NOT NULL 
, CONSTRAINT PRIMARY KEY ( ItemID ) ) 
COMMENT = 'This is an Item List table which holds all the items in the eco system.';

CREATE INDEX MasterProduct.ItemMaster_INDEX1 ON MasterProduct.ItemMaster ( ItemID ASC);
