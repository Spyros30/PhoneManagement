CREATE USER 'asset'@'localhost' IDENTIFIED BY 'asset';


GRANT ALL PRIVILEGES ON * . * TO 'asset'@'localhost';


ALTER USER 'asset'@'localhost' IDENTIFIED WITH mysql_native_password BY 'asset';



CREATE DATABASE  IF NOT EXISTS `asset`;
USE `asset`;


DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
`department_id` int NOT NULL AUTO_INCREMENT,
`department_name` varchar(40) NOT NULL ,
PRIMARY KEY (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;



DROP TABLE IF EXISTS `status`;

CREATE TABLE `status` (
`status_id` int NOT NULL AUTO_INCREMENT,
`status` varchar(20) NOT NULL ,
PRIMARY KEY (`status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;




DROP TABLE IF EXISTS `abroad`;

CREATE TABLE `abroad` (
`abroad_id` int NOT NULL AUTO_INCREMENT,
`abroad` varchar(20) NOT NULL ,
PRIMARY KEY (`abroad_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;



DROP TABLE IF EXISTS `phone`;

CREATE TABLE `phone` (
`phone_id` int NOT NULL AUTO_INCREMENT,
`brand` varchar(50) NOT NULL ,
`model` varchar(50) NOT NULL ,
`IMEI` bigint NOT NULL ,
`price` varchar(40) NOT NULL ,
`status_id` int NOT NULL ,
`department_id` int NOT NULL ,
`owner_name` varchar(60) NOT NULL ,
`full_number` bigint NOT NULL ,
`short_number` bigint NOT NULL ,
`program` varchar(30) NOT NULL ,
`Sim_No` varchar(30) NOT NULL ,
`PIN` int NOT NULL ,
`PUK` int NOT NULL ,
`abroad_id` int NOT NULL ,
`notes` varchar(200) NOT NULL ,

PRIMARY KEY (`phone_id`),

CONSTRAINT `FK_STATUS_PHONE` FOREIGN KEY (`status_id`) 
  REFERENCES `status` (`status_id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION,

CONSTRAINT `FK_DEPARTMENT_PHONE` FOREIGN KEY (`department_id`) 
  REFERENCES `department` (`department_id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION,
  
CONSTRAINT `FK_ABROAD_PHONE` FOREIGN KEY (`abroad_id`) 
  REFERENCES `abroad` (`abroad_id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION

) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;





INSERT INTO `status` (status_id, status)
Values 
(1, 'In Stock'),
(2, 'Faulty');



INSERT INTO `abroad` (abroad_id, abroad)
Values 
(1, 'Yes'),
(2, 'No');



INSERT INTO `department` (department_id, department_name)
Values 
(1, 'Front Office Westin & Romanos'),
(2, 'Executive Office'),
(3, 'PABX'),
(4, 'Romanos Housekeeping'),
(5, 'Culinary'),
(6, 'Westin Front Office'),
(7, 'Food & Beverage'),
(8, 'Romanos Front Office'),
(9, 'Conventions & Events'),
(10, 'Human Resources'),
(11, 'Navarino Collections'),
(12, 'Engineering'),
(13, 'Facility Management'),
(14, 'Golf'),
(15, 'Facility Management Administration'),
(16, 'Spa'),
(17, 'Sales & Marketing'),
(18, 'Finance'),
(19, 'Facility Management Engineering'),
(20, 'Revenue Management'),
(21, 'Anazoe Spa'),
(22, 'Westin Housekeeping'),
(23, 'Housekeeping'),
(24, 'Finance / Purchasing'),
(25, 'Kids Club'),
(26, 'ICT'),
(27, 'Reservations'),
(28, 'Purchasing'),
(29, 'Security'),
(30, 'Stewarding'),
(31, 'Banquest & Events'),
(32, 'Guest Relations Manager'),
(33, 'Golf Dunes'),
(34, 'Golf Department'),
(35, 'Golf Bay'),
(36, 'Finance Purchasing'),
(37, 'Front Office Romanos Ionian Exclusive'),
(38, 'Recreation'),
(39, 'Complex'),
(40, 'Westin');
