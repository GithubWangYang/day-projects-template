CREATE TABLE `country` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `countryname` varchar(255) DEFAULT NULL,
   `countrycode` varchar(255) DEFAULT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8
 
insert  into `country`(`id`,`countryname`,`countrycode`) values (1,'中国','CN'),(2,'美国','US'),(3,'俄罗斯','RU'),(4,'英国','GB'),(5,'法国','FR');