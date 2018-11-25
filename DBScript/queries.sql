select * from MasterProduct.ItemMaster ;

select * from MasterProduct.ProductMaster;
select * from MasterProduct.ShopMaster;


 select DATE(now());
 
 Alter table ItemMaster add updUser varchar(20);
 Alter table ItemMaster add updtmstp timestamp;