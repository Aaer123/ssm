/*
Navicat MySQL Data Transfer

Source Server         : mysqls
Source Server Version : 50732
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50732
File Encoding         : 65001

Date: 2021-01-09 16:18:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `money` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', 'tom', '8000');
INSERT INTO `account` VALUES ('2', 'zhangsan', '5000');
INSERT INTO `account` VALUES ('3', 'lucy', '50000');
INSERT INTO `account` VALUES ('4', 'ddd', '5009887');
INSERT INTO `account` VALUES ('5', 'ccc', '9000');
INSERT INTO `account` VALUES ('6', 'vv', '8222');
