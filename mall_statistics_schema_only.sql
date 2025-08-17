-- MySQL dump 10.13  Distrib 8.4.0, for macos14 (arm64)
--
-- Host: 127.0.0.1    Database: mall_statistics
-- ------------------------------------------------------
-- Server version	8.4.5

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `app_stat`
--

DROP TABLE IF EXISTS `app_stat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `app_stat` (
  `stat_id` bigint NOT NULL AUTO_INCREMENT,
  `stat_count` int DEFAULT NULL,
  `stat_key` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`stat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `chain_stat_orders`
--

DROP TABLE IF EXISTS `chain_stat_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chain_stat_orders` (
  `orders_id` bigint NOT NULL AUTO_INCREMENT,
  `admin_receive_pay_state` int DEFAULT NULL,
  `cancel_reason` int DEFAULT NULL,
  `cancel_role` varchar(255) DEFAULT NULL,
  `cancel_time` datetime DEFAULT NULL,
  `chain_id` int DEFAULT NULL,
  `chain_name` varchar(255) DEFAULT NULL,
  `chain_payment_name` varchar(255) DEFAULT NULL,
  `clerk_id` int DEFAULT NULL,
  `clerk_name` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_time_date` varchar(255) DEFAULT NULL,
  `create_time_hour` varchar(255) DEFAULT NULL,
  `delete_state` int DEFAULT NULL,
  `evaluation_state` int DEFAULT NULL,
  `evaluation_time` datetime DEFAULT NULL,
  `finish_time` datetime DEFAULT NULL,
  `member_id` int DEFAULT NULL,
  `member_name` varchar(255) DEFAULT NULL,
  `orders_amount` decimal(19,2) DEFAULT NULL,
  `orders_from` varchar(255) DEFAULT NULL,
  `orders_from1` varchar(255) DEFAULT NULL,
  `orders_sn` bigint DEFAULT NULL,
  `orders_state` int DEFAULT NULL,
  `orders_type` int DEFAULT NULL,
  `out_orders_sn` varchar(255) DEFAULT NULL,
  `pay_id` int DEFAULT NULL,
  `pay_sn` bigint DEFAULT NULL,
  `payment_client_type` varchar(255) DEFAULT NULL,
  `payment_code` varchar(255) DEFAULT NULL,
  `payment_time` datetime DEFAULT NULL,
  `predeposit_amount` decimal(19,2) DEFAULT NULL,
  `receiver_name` varchar(255) DEFAULT NULL,
  `receiver_phone` varchar(255) DEFAULT NULL,
  `take_time` datetime DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`orders_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `chain_stat_orders_goods`
--

DROP TABLE IF EXISTS `chain_stat_orders_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chain_stat_orders_goods` (
  `orders_goods_id` bigint NOT NULL AUTO_INCREMENT,
  `buy_num` int DEFAULT NULL,
  `category_id` int DEFAULT NULL COMMENT '分类ID',
  `category_id_1` int DEFAULT NULL,
  `category_id_2` int DEFAULT NULL,
  `category_id_3` int DEFAULT NULL,
  `chain_goods_id` int DEFAULT NULL,
  `chain_id` int DEFAULT NULL,
  `chain_name` varchar(255) DEFAULT NULL,
  `clerk_id` int DEFAULT NULL,
  `common_id` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_time_date` datetime DEFAULT NULL,
  `create_time_hour` int DEFAULT NULL,
  `goods_full_specs` varchar(255) DEFAULT NULL,
  `goods_id` int DEFAULT NULL,
  `goods_image` varchar(255) DEFAULT NULL,
  `goods_name` varchar(255) DEFAULT NULL,
  `goods_price` decimal(19,2) DEFAULT NULL,
  `goods_serial` varchar(255) DEFAULT NULL,
  `goods_services` varchar(4000) DEFAULT NULL,
  `member_id` int DEFAULT NULL,
  `member_name` varchar(255) DEFAULT NULL,
  `orders_id` int DEFAULT NULL,
  `unit_name` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`orders_goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `chain_stat_orders_update_task`
--

DROP TABLE IF EXISTS `chain_stat_orders_update_task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chain_stat_orders_update_task` (
  `task_id` bigint NOT NULL AUTO_INCREMENT,
  `add_time` datetime NOT NULL,
  `orders_id` int NOT NULL,
  `task_state` int NOT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `distribution_store_stat`
--

DROP TABLE IF EXISTS `distribution_store_stat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `distribution_store_stat` (
  `stat_id` bigint NOT NULL AUTO_INCREMENT,
  `commission_amount` decimal(19,2) NOT NULL,
  `distribution_num` bigint NOT NULL,
  `stat_date` datetime NOT NULL,
  `stat_hour` int NOT NULL,
  `store_id` int NOT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`stat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `stat_category_general`
--

DROP TABLE IF EXISTS `stat_category_general`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stat_category_general` (
  `stat_id` bigint NOT NULL AUTO_INCREMENT,
  `category_id` int NOT NULL,
  `category_id_1` int DEFAULT NULL,
  `category_id_2` int DEFAULT NULL,
  `category_id_3` int DEFAULT NULL,
  `category_name` varchar(255) NOT NULL,
  `deep` int DEFAULT NULL,
  `goods_count` bigint NOT NULL,
  `have_orders_goods_count` bigint NOT NULL,
  `no_orders_goods_count` bigint NOT NULL,
  `orders_amount` decimal(19,2) NOT NULL,
  `orders_num` bigint NOT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`stat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=76208 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `stat_hours`
--

DROP TABLE IF EXISTS `stat_hours`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stat_hours` (
  `stat_id` bigint NOT NULL AUTO_INCREMENT,
  `new_goods_common_num` bigint DEFAULT NULL,
  `new_member_num` bigint NOT NULL,
  `new_store_num` bigint NOT NULL,
  `orders_amount` decimal(19,2) NOT NULL,
  `orders_num` bigint NOT NULL,
  `predeposit_balance_amount` decimal(19,2) NOT NULL,
  `predeposit_cash_amount` decimal(19,2) NOT NULL,
  `predeposit_consume_amount` decimal(19,2) NOT NULL,
  `predeposit_recharge_amount` decimal(19,2) NOT NULL,
  `predeposit_refund_amount` decimal(19,2) NOT NULL,
  `refund_amount` decimal(19,2) DEFAULT NULL,
  `stat_date` datetime NOT NULL,
  `stat_hour` int NOT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`stat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=624 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `stat_member`
--

DROP TABLE IF EXISTS `stat_member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stat_member` (
  `stat_id` bigint NOT NULL AUTO_INCREMENT,
  `member_id` int NOT NULL,
  `member_name` varchar(255) NOT NULL,
  `orders_amount` decimal(19,2) NOT NULL,
  `orders_num` bigint NOT NULL,
  `points_increase` bigint NOT NULL,
  `points_reduce` bigint NOT NULL,
  `predeposit_increase` decimal(19,2) NOT NULL,
  `predeposit_reduce` decimal(19,2) NOT NULL,
  `stat_date` datetime NOT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`stat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1809 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `stat_orders`
--

DROP TABLE IF EXISTS `stat_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stat_orders` (
  `orders_id` bigint NOT NULL AUTO_INCREMENT,
  `admin_receive_pay_state` int DEFAULT NULL,
  `auto_receive_time` datetime DEFAULT NULL,
  `cancel_reason` int DEFAULT NULL,
  `cancel_role` varchar(255) DEFAULT NULL,
  `cancel_time` datetime DEFAULT NULL,
  `commission_amount` decimal(19,2) DEFAULT NULL,
  `conform_price` decimal(19,2) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_time_date` varchar(255) DEFAULT NULL,
  `create_time_hour` varchar(255) DEFAULT NULL,
  `delay_receive_state` int DEFAULT NULL,
  `evaluation_append_state` int DEFAULT NULL,
  `evaluation_state` int DEFAULT NULL,
  `evaluation_time` datetime DEFAULT NULL,
  `finish_time` datetime DEFAULT NULL,
  `freight_amount` decimal(19,2) DEFAULT NULL,
  `group_id` int DEFAULT NULL,
  `is_free_freight` int DEFAULT NULL,
  `limit_amount` decimal(19,2) DEFAULT NULL,
  `lock_state` int DEFAULT NULL,
  `member_id` int DEFAULT NULL,
  `member_name` varchar(255) DEFAULT NULL,
  `orders_amount` decimal(19,2) DEFAULT NULL,
  `orders_from` varchar(255) DEFAULT NULL,
  `orders_from1` varchar(255) DEFAULT NULL,
  `orders_sn` bigint DEFAULT NULL,
  `orders_state` int DEFAULT NULL,
  `orders_type` int DEFAULT NULL,
  `out_orders_sn` varchar(255) DEFAULT NULL,
  `pay_id` int DEFAULT NULL,
  `pay_sn` bigint DEFAULT NULL,
  `payment_client_type` varchar(255) DEFAULT NULL,
  `payment_code` varchar(255) DEFAULT NULL,
  `payment_time` datetime DEFAULT NULL,
  `payment_type_code` varchar(255) DEFAULT NULL,
  `predeposit_amount` decimal(19,2) DEFAULT NULL,
  `reciver_address` varchar(255) DEFAULT NULL,
  `receiver_area_id_1` int DEFAULT NULL,
  `receiver_area_id_2` int DEFAULT NULL,
  `receiver_area_id_3` int DEFAULT NULL,
  `receiver_area_id_4` int DEFAULT NULL,
  `receiver_area_info` varchar(255) DEFAULT NULL,
  `receiver_message` varchar(255) DEFAULT NULL,
  `receiver_name` varchar(255) DEFAULT NULL,
  `receiver_phone` varchar(255) DEFAULT NULL,
  `refund_amount` decimal(19,2) DEFAULT NULL,
  `refund_state` int DEFAULT NULL,
  `send_time` datetime DEFAULT NULL,
  `ship_code` varchar(255) DEFAULT NULL,
  `ship_name` varchar(255) DEFAULT NULL,
  `ship_note` varchar(255) DEFAULT NULL,
  `ship_sn` varchar(255) DEFAULT NULL,
  `store_id` int DEFAULT NULL,
  `store_name` varchar(255) DEFAULT NULL,
  `template_id` int DEFAULT NULL,
  `voucher_code` varchar(255) DEFAULT NULL,
  `voucher_price` decimal(19,2) DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`orders_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3400 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `stat_orders_goods`
--

DROP TABLE IF EXISTS `stat_orders_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stat_orders_goods` (
  `orders_goods_id` bigint NOT NULL AUTO_INCREMENT,
  `base_price` decimal(19,2) DEFAULT NULL,
  `bundling_id` int DEFAULT NULL,
  `buy_num` int DEFAULT NULL,
  `category_id` int DEFAULT NULL COMMENT '分类ID',
  `category_id_1` int DEFAULT NULL,
  `category_id_2` int DEFAULT NULL,
  `category_id_3` int DEFAULT NULL,
  `commission_rate` int DEFAULT NULL,
  `common_id` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_time_date` datetime DEFAULT NULL,
  `create_time_hour` int DEFAULT NULL,
  `goods_full_specs` varchar(255) DEFAULT NULL,
  `goods_id` int DEFAULT NULL,
  `goods_image` varchar(255) DEFAULT NULL,
  `goods_name` varchar(255) DEFAULT NULL,
  `goods_pay_amount` decimal(19,2) DEFAULT NULL,
  `goods_price` decimal(19,2) DEFAULT NULL,
  `goods_type` int DEFAULT NULL,
  `member_id` int DEFAULT NULL,
  `member_name` varchar(255) DEFAULT NULL,
  `orders_id` int DEFAULT NULL,
  `promotion_title` varchar(10) DEFAULT NULL,
  `store_id` int DEFAULT NULL,
  `store_name` varchar(255) DEFAULT NULL,
  `unit_name` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`orders_goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3829 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `stat_orders_update_task`
--

DROP TABLE IF EXISTS `stat_orders_update_task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stat_orders_update_task` (
  `task_id` bigint NOT NULL AUTO_INCREMENT,
  `add_time` datetime NOT NULL,
  `orders_id` int NOT NULL,
  `task_state` int NOT NULL,
  `task_type` varchar(255) NOT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9231 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `stat_price_range`
--

DROP TABLE IF EXISTS `stat_price_range`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stat_price_range` (
  `range_id` bigint NOT NULL AUTO_INCREMENT,
  `range_price` int NOT NULL,
  `range_type` varchar(255) NOT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`range_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `stat_promotion_hours`
--

DROP TABLE IF EXISTS `stat_promotion_hours`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stat_promotion_hours` (
  `stat_id` bigint NOT NULL AUTO_INCREMENT,
  `orders_amount` decimal(19,2) NOT NULL,
  `orders_goods_num` bigint NOT NULL,
  `orders_num` bigint NOT NULL,
  `promotion_type` int NOT NULL,
  `stat_date` datetime NOT NULL,
  `stat_hour` int NOT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`stat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `stat_setting`
--

DROP TABLE IF EXISTS `stat_setting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stat_setting` (
  `title` varchar(255) NOT NULL,
  `value` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `stat_store_hours`
--

DROP TABLE IF EXISTS `stat_store_hours`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stat_store_hours` (
  `stat_id` int NOT NULL AUTO_INCREMENT,
  `orders_amount` decimal(19,2) NOT NULL,
  `orders_goods_num` bigint NOT NULL,
  `orders_num` bigint NOT NULL,
  `stat_date` datetime NOT NULL,
  `stat_hour` int NOT NULL,
  `store_class_id` int DEFAULT NULL,
  `store_class_name` varchar(255) NOT NULL,
  `store_id` int NOT NULL,
  `store_name` varchar(255) NOT NULL,
  PRIMARY KEY (`stat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=274 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `stat_store_price_range`
--

DROP TABLE IF EXISTS `stat_store_price_range`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stat_store_price_range` (
  `range_id` int NOT NULL AUTO_INCREMENT,
  `range_price` int NOT NULL,
  `range_type` varchar(255) NOT NULL,
  `store_id` int NOT NULL,
  PRIMARY KEY (`range_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-07  6:04:44
