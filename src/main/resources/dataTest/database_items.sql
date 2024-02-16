CREATE DATABASE  IF NOT EXISTS `catalog_items` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `catalog_items`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: catalog_items
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `codigo` int NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `precio` decimal(10,2) DEFAULT NULL,
  `tipo_impuesto` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Milk',2.50,'super_reduced'),(2,'Bread',1.20,'reduced'),(3,'Eggs',3.00,'general'),(4,'Rice',1.80,'reduced'),(5,'Pasta',1.50,'reduced'),(6,'Potatoes',2.00,'super_reduced'),(7,'Tomatoes',2.50,'super_reduced'),(8,'Onions',1.80,'super_reduced'),(9,'Carrots',1.70,'super_reduced'),(10,'Apples',2.00,'super_reduced'),(11,'Bananas',2.50,'super_reduced'),(12,'Chicken',5.00,'general'),(13,'Beef',7.50,'general'),(14,'Pork',4.00,'general'),(15,'Salmon',8.00,'reduced'),(16,'Tuna',6.50,'reduced'),(17,'Shrimp',9.00,'general'),(18,'Prawns',10.00,'general'),(19,'Lettuce',1.50,'super_reduced'),(20,'Broccoli',2.00,'super_reduced'),(21,'Zucchini',1.80,'super_reduced'),(22,'Eggplant',2.00,'super_reduced'),(23,'Strawberries',3.50,'super_reduced'),(24,'Oranges',2.80,'super_reduced'),(25,'Peaches',3.00,'super_reduced'),(26,'Grapes',4.00,'super_reduced'),(27,'Mango',2.50,'super_reduced'),(28,'Pears',2.20,'super_reduced'),(29,'Cherries',4.00,'super_reduced'),(30,'French fries',1.20,'super_reduced'),(31,'Chocolate',2.00,'reduced'),(32,'Cookies',1.50,'reduced'),(33,'Coffee',3.50,'general'),(34,'Tea',2.80,'reduced'),(35,'Soda',1.20,'super_reduced'),(36,'Orange juice',2.00,'reduced'),(37,'Mineral water',0.80,'super_reduced'),(38,'Almond milk',3.00,'reduced'),(39,'Yogurt',1.50,'reduced'),(40,'Ice cream',2.50,'super_reduced'),(41,'Pizza',4.00,'reduced'),(42,'Hamburger',3.50,'reduced'),(43,'Hot dogs',3.00,'reduced'),(44,'Sandwich',2.00,'reduced'),(45,'Salad',3.50,'super_reduced'),(46,'Soup',2.00,'super_reduced'),(47,'Mashed potatoes',1.80,'super_reduced'),(48,'Paella',7.50,'general'),(49,'Lasagna',5.50,'general'),(50,'Meat pie',4.00,'reduced'),(51,'Sushi',10.00,'reduced'),(52,'Tacos',8.50,'general'),(53,'Burritos',6.00,'reduced'),(54,'Empanadas',3.00,'super_reduced'),(55,'Churros',2.50,'super_reduced'),(56,'Crème brûlée',3.50,'reduced'),(57,'Tiramisu',4.00,'reduced'),(58,'Flan',2.00,'super_reduced'),(59,'Rice pudding',2.50,'super_reduced'),(60,'Baked fruits',3.00,'reduced'),(61,'Chocolate mousse',3.50,'reduced'),(62,'Brownie',2.00,'super_reduced'),(63,'Donuts',1.50,'super_reduced'),(64,'Cupcakes',2.50,'super_reduced'),(65,'Muffins',2.00,'super_reduced'),(66,'Apple pie',3.00,'reduced'),(67,'Cheesecake',4.00,'general'),(68,'Carrot cake',3.50,'general'),(69,'Gelatin',1.50,'super_reduced'),(70,'Chocolate cake',4.50,'general'),(71,'Lemon tart',3.00,'super_reduced'),(72,'Strawberry tart',3.50,'super_reduced'),(73,'Sponge cake',2.00,'super_reduced'),(74,'Tortilla chips',1.80,'super_reduced'),(75,'Popcorn',1.50,'super_reduced'),(76,'Hot chocolate',2.50,'reduced'),(77,'Iced coffee',3.00,'super_reduced'),(78,'Cola',1.20,'super_reduced'),(79,'Lemonade',1.20,'super_reduced'),(80,'Iced tea',2.00,'reduced'),(81,'Sparkling water',0.80,'super_reduced'),(82,'Apple juice',2.00,'super_reduced'),(83,'Grape juice',2.50,'super_reduced'),(84,'Pineapple juice',2.20,'super_reduced'),(85,'Peach juice',2.80,'super_reduced'),(86,'Beer',1.50,'super_reduced'),(87,'Red wine',5.00,'general'),(88,'White wine',4.50,'general'),(89,'Vodka',10.00,'general'),(90,'Whiskey',12.00,'general'),(91,'Rum',8.00,'general'),(92,'Tequila',7.00,'general'),(93,'Gin',9.00,'general'),(94,'Brandy',6.50,'general'),(95,'Cava',5.50,'general'),(96,'Champagne',15.00,'general'),(97,'Cognac',20.00,'general'),(98,'Coffee liqueur',6.00,'general'),(99,'Mint liqueur',5.00,'general'),(100,'Amaretto',8.00,'general');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-17  0:34:37
