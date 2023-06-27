-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: restaurant_sys_mng
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bills`
--

DROP TABLE IF EXISTS `bills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bills` (
  `id` int NOT NULL AUTO_INCREMENT,
  `bill_no` int NOT NULL,
  `drink_id` int DEFAULT NULL,
  `menu_id` int DEFAULT NULL,
  `menutype_id` int DEFAULT NULL,
  `unite_price` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_fatura_menu1_idx` (`menu_id`),
  KEY `fk_bills_drink1_idx` (`drink_id`),
  KEY `fk_bills_menutype1_idx` (`menutype_id`),
  CONSTRAINT `fk_bills_drink1` FOREIGN KEY (`drink_id`) REFERENCES `drink` (`id`),
  CONSTRAINT `fk_bills_menutype1` FOREIGN KEY (`menutype_id`) REFERENCES `menutype` (`id`),
  CONSTRAINT `fk_fatura_menu1` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bills`
--

LOCK TABLES `bills` WRITE;
/*!40000 ALTER TABLE `bills` DISABLE KEYS */;
/*!40000 ALTER TABLE `bills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drink`
--

DROP TABLE IF EXISTS `drink`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drink` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `code_id` varchar(45) NOT NULL,
  `desctiption` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drink`
--

LOCK TABLES `drink` WRITE;
/*!40000 ALTER TABLE `drink` DISABLE KEYS */;
INSERT INTO `drink` VALUES (6,'Coca-Cola','CC001','Classic carbonated soft drink'),(7,'Pepsi','P001','Carbonated cola beverage'),(8,'Sprite','SP001','Lemon-lime flavored carbonated drink'),(9,'Fanta','F001','Orange-flavored carbonated soft drink'),(10,'Mountain Dew','MD001','Citrus-flavored carbonated drink'),(11,'Coca-Cola','CC001','Classic carbonated soft drink'),(12,'Pepsi','P001','Carbonated cola beverage'),(13,'Sprite','SP001','Lemon-lime flavored carbonated drink'),(14,'Fanta','F001','Orange-flavored carbonated soft drink'),(15,'Mountain Dew','MD001','Citrus-flavored carbonated drink');
/*!40000 ALTER TABLE `drink` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `profession_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_employee_profession1_idx` (`profession_id`),
  CONSTRAINT `fk_employee_profession1` FOREIGN KEY (`profession_id`) REFERENCES `profession` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (31,'Albon','Idrizi','Tetov',3),(32,'Luljeta','Gjokaj','Shkodra',2),(33,'Gentian','Zaimi','Tetov',3),(34,'Elona','Dervishi','Tetov',1),(35,'Ervin','Hoxha','Korca',2),(36,'Ermal','Kuqo','Tetov',1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(425) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (12,'Pizza Margherita','Classic Italian pizza with tomato sauce, mozzarella cheese, and basil'),(13,'Pasta Carbonara','Pasta dish with eggs, pancetta or bacon, cheese, and black pepper'),(14,'Lasagna Bolognese','Layered pasta dish with Bolognese sauce, cheese, and béchamel sauce'),(15,'Risotto ai Funghi','Creamy risotto with mushrooms'),(16,'Tiramisu','Traditional Italian dessert made with ladyfingers, coffee, mascarpone cheese, and cocoa'),(17,'Pizza Margherita','Classic Italian pizza with tomato sauce, mozzarella cheese, and basil'),(18,'Pasta Carbonara','Pasta dish with eggs, pancetta or bacon, cheese, and black pepper'),(19,'Lasagna Bolognese','Layered pasta dish with Bolognese sauce, cheese, and béchamel sauce'),(20,'Risotto ai Funghi','Creamy risotto with mushrooms'),(21,'Tiramisu','Traditional Italian dessert made with ladyfingers, coffee, mascarpone cheese, and cocoa');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menutype`
--

DROP TABLE IF EXISTS `menutype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menutype` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menutype`
--

LOCK TABLES `menutype` WRITE;
/*!40000 ALTER TABLE `menutype` DISABLE KEYS */;
INSERT INTO `menutype` VALUES (1,'Appetizer'),(2,'Main Course'),(3,'Dessert'),(4,'Beverage'),(5,'Appetizer'),(6,'Main Course'),(7,'Dessert'),(8,'Beverage');
/*!40000 ALTER TABLE `menutype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orari`
--

DROP TABLE IF EXISTS `orari`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orari` (
  `id` int NOT NULL AUTO_INCREMENT,
  `turni` varchar(45) NOT NULL,
  `employee_id` int NOT NULL,
  `by_hour` time NOT NULL,
  `until_hour` time NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_orari_employee1_idx` (`employee_id`),
  CONSTRAINT `fk_orari_employee1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orari`
--

LOCK TABLES `orari` WRITE;
/*!40000 ALTER TABLE `orari` DISABLE KEYS */;
INSERT INTO `orari` VALUES (1,'Morning',31,'08:00:00','12:00:00'),(2,'Afternoon',32,'12:00:00','16:00:00'),(3,'Evening',33,'16:00:00','20:00:00'),(4,'Morning',34,'08:00:00','12:00:00'),(5,'Afternoon',35,'12:00:00','16:00:00'),(6,'Morning',36,'08:00:00','12:00:00');
/*!40000 ALTER TABLE `orari` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profession`
--

DROP TABLE IF EXISTS `profession`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profession` (
  `id` int NOT NULL,
  `profession_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profession`
--

LOCK TABLES `profession` WRITE;
/*!40000 ALTER TABLE `profession` DISABLE KEYS */;
INSERT INTO `profession` VALUES (1,'Kamarjer'),(2,'Shankist'),(3,'Menaxher');
/*!40000 ALTER TABLE `profession` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `total_bills`
--

DROP TABLE IF EXISTS `total_bills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `total_bills` (
  `id` int NOT NULL AUTO_INCREMENT,
  `employee_id` int NOT NULL,
  `bills_id` int NOT NULL,
  `total_price` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_total_bills_employee1_idx` (`employee_id`),
  KEY `fk_total_bills_bills1_idx` (`bills_id`),
  CONSTRAINT `fk_total_bills_bills1` FOREIGN KEY (`bills_id`) REFERENCES `bills` (`id`),
  CONSTRAINT `fk_total_bills_employee1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `total_bills`
--

LOCK TABLES `total_bills` WRITE;
/*!40000 ALTER TABLE `total_bills` DISABLE KEYS */;
/*!40000 ALTER TABLE `total_bills` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-27 19:46:03
