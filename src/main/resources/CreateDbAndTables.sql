DROP DATABASE IF EXISTS `appdirect_isv`;
CREATE DATABASE  IF NOT EXISTS `appdirect_isv`;

use `appdirect_isv`;

Drop table if exists `company` ;
CREATE TABLE `company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_on` DATETIME DEFAULT NULL,
  `last_modified` DATETIME DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;



DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_on` DATETIME DEFAULT NULL,
  `last_modified` DATETIME DEFAULT NULL,
  `first_name` varchar(128) DEFAULT NULL,
   `last_name` varchar(128) DEFAULT NULL,
   `email_address` varchar(128) DEFAULT NULL,
   `status` varchar(128) DEFAULT NULL,
   `is_admin` char(1) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  
  PRIMARY KEY (`id`),
  
  KEY `FK_COMPANY_idx` (`company_id`),
  
  CONSTRAINT `FK_COMPANY_USER` 
  FOREIGN KEY (`company_id`) 
  REFERENCES `company` (`id`)
  
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `event`;
CREATE TABLE `event` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_on` DATETIME DEFAULT NULL,
  `last_modified` DATETIME DEFAULT NULL,
  `type` varchar(128) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
   `user_id` int(11) DEFAULT NULL,
   `consumed` char(1) DEFAULT NULL,
  
  PRIMARY KEY (`id`),
  
  KEY `FK_COMPANY_idx` (`company_id`),
  
  CONSTRAINT `FK_COMPANY_EVENT` 
  FOREIGN KEY (`company_id`) 
  REFERENCES `company` (`id`),
  
  KEY `FK_USER_idx` (`user_id`),
  
  CONSTRAINT `FK_USER_EVENT`
  foreign key  (`user_id`)
  references `user` (`id`)
  
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `subscription`;
CREATE TABLE `subscription` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_on` DATETIME DEFAULT NULL,
  `last_modified` DATETIME DEFAULT NULL,
  `application` varchar(128) DEFAULT NULL,
   `edition` varchar(128) DEFAULT NULL,
   `status` varchar(128) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  
  PRIMARY KEY (`id`),
  
  KEY `FK_COMPANY_idx` (`company_id`),
  
  CONSTRAINT `FK_COMPANY_SUBSCRIPTION` 
  FOREIGN KEY (`company_id`) 
  REFERENCES `company` (`id`)
  
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;