CREATE TABLE `country` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `countryname` varchar(255) DEFAULT NULL,
   `countrycode` varchar(255) DEFAULT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8
 
insert  into `country`(`id`,`countryname`,`countrycode`) values (1,'�й�','CN'),(2,'����','US'),(3,'����˹','RU'),(4,'Ӣ��','GB'),(5,'����','FR');