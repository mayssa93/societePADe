CREATE TABLE Article (
  id bigint(20) PRIMARY KEY NOT NULL AUTO_INCREMENT ,
  libel varchar(100) NOT NULL,
  reference varchar(50) NOT NULL,
  prix_achatht float NOT NULL,
  stock int(11) NOT NULL,
  UNIQUE KEY UK_reference (reference)
);
CREATE TABLE Achat (
  id bigint(20)  PRIMARY KEY NOT NULL AUTO_INCREMENT,
  date DATE NOT NULL,
  totalHT float ,
  remise float
) ;
CREATE TABLE ligne_achat (
  id bigint(20) PRIMARY KEY NOT NULL AUTO_INCREMENT ,
  quantite int(11) NOT NULL,
  id_achat bigint(20) NOT NULL,
  id_article bigint(20) NOT NULL
) ;
alter table ligne_achat add constraint FK_ACHAT foreign key (id_achat) references Achat(id);
alter table ligne_achat add constraint FK_ARTICLE foreign key (id_article) references Article(id);
INSERT INTO Article (libel,reference,prix_achatht,stock) VALUES ('Huile','Exon', 45.0, 5);
INSERT INTO Article (libel,reference,prix_achatht,stock) VALUES ('Filtre','Gif', 50.0, 10);
INSERT INTO Article (libel,reference,prix_achatht,stock) VALUES ('Piston','EE123456', 25.0, 15);
INSERT INTO Article (libel,reference,prix_achatht,stock) VALUES ('Batterie', 'Assad', 120.0, 30);
INSERT INTO Article (libel,reference,prix_achatht,stock) VALUES ('Patain', '05P007', 40.0, 7);
INSERT INTO Achat (date,totalHT,remise) VALUES (NOW(),140.0,20);
INSERT INTO Achat (date,totalHT,remise) VALUES ('2019-12-28',75.0,10);
INSERT INTO ligne_achat(quantite,id_achat,id_article) VALUES (3,1,1);
INSERT INTO ligne_achat(quantite,id_achat,id_article) VALUES (2,2,3);

