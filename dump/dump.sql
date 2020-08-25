/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 100413
 Source Host           : localhost:3306
 Source Schema         : backend_cash

 Target Server Type    : MySQL
 Target Server Version : 100413
 File Encoding         : 65001

 Date: 25/08/2020 00:51:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for loans
-- ----------------------------
DROP TABLE IF EXISTS `loans`;
CREATE TABLE `loans`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `total` float NULL DEFAULT NULL,
  `user_id` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of loans
-- ----------------------------
INSERT INTO `loans` VALUES (1, 15000, 1);
INSERT INTO `loans` VALUES (2, 10000, 1);
INSERT INTO `loans` VALUES (3, 5000, 1);
INSERT INTO `loans` VALUES (4, 6000, 2);
INSERT INTO `loans` VALUES (5, 7000, 2);
INSERT INTO `loans` VALUES (6, 3500, 2);
INSERT INTO `loans` VALUES (7, 10000.5, 3);
INSERT INTO `loans` VALUES (8, 50000, 5);
INSERT INTO `loans` VALUES (9, 200, 6);
INSERT INTO `loans` VALUES (10, 1500, 6);
INSERT INTO `loans` VALUES (11, 56000, 8);
INSERT INTO `loans` VALUES (12, 9000, 8);
INSERT INTO `loans` VALUES (13, 50.69, 8);
INSERT INTO `loans` VALUES (14, 10, 8);
INSERT INTO `loans` VALUES (15, 8500, 9);
INSERT INTO `loans` VALUES (16, 9652, 9);
INSERT INTO `loans` VALUES (17, 12000, 9);
INSERT INTO `loans` VALUES (18, 9632, 9);
INSERT INTO `loans` VALUES (19, 1111, 9);
INSERT INTO `loans` VALUES (20, 2000000, 10);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `first_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `last_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `UK_6dotkott2kjsp8vw4d0m25fb7`(`email`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'moriacasan@test.com', 'Moria', 'Casan');
INSERT INTO `users` VALUES (2, 'nataliaoreiro@gmail.com', 'Natalia', 'Oreiro');
INSERT INTO `users` VALUES (3, 'ricardodarin@gmail.com', 'Ricardo', 'Darin');
INSERT INTO `users` VALUES (4, 'mirthalegrand1500@gmail.com', 'Mirtha', 'Legrand');
INSERT INTO `users` VALUES (5, 'luisbrandoni@gmail.com', 'Luis', 'Brandoni');
INSERT INTO `users` VALUES (6, 'diegoperetti@gmail.com', 'Diego', 'Peretti');
INSERT INTO `users` VALUES (7, 'susanagimenez@gmail.com', 'Susana', 'Gimenez');
INSERT INTO `users` VALUES (8, 'facundoarana@gmail.com', 'Facundo', 'Arana');
INSERT INTO `users` VALUES (9, 'pablorago@gmail.com', 'Pablo', 'Rago');
INSERT INTO `users` VALUES (10, 'oscarmartinez@gmail.com', 'Oscar', 'Martinez');

-- ----------------------------
-- Table structure for users_loans
-- ----------------------------
DROP TABLE IF EXISTS `users_loans`;
CREATE TABLE `users_loans`  (
  `user_id` bigint(20) NOT NULL,
  `loans_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`, `loans_id`) USING BTREE,
  UNIQUE INDEX `UK_1qvtw2kw7a8kynu6y1wugf3rc`(`loans_id`) USING BTREE,
  CONSTRAINT `FKm9w9062ou3gnjfslodyh1n289` FOREIGN KEY (`loans_id`) REFERENCES `loans` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKoaigfyayvi8icos8skr4v7eic` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users_loans
-- ----------------------------
INSERT INTO `users_loans` VALUES (1, 1);
INSERT INTO `users_loans` VALUES (1, 2);
INSERT INTO `users_loans` VALUES (1, 3);
INSERT INTO `users_loans` VALUES (2, 4);
INSERT INTO `users_loans` VALUES (2, 5);
INSERT INTO `users_loans` VALUES (2, 6);
INSERT INTO `users_loans` VALUES (3, 7);
INSERT INTO `users_loans` VALUES (5, 8);
INSERT INTO `users_loans` VALUES (6, 9);
INSERT INTO `users_loans` VALUES (6, 10);
INSERT INTO `users_loans` VALUES (8, 11);
INSERT INTO `users_loans` VALUES (8, 12);
INSERT INTO `users_loans` VALUES (8, 13);
INSERT INTO `users_loans` VALUES (8, 14);
INSERT INTO `users_loans` VALUES (9, 15);
INSERT INTO `users_loans` VALUES (9, 16);
INSERT INTO `users_loans` VALUES (9, 17);
INSERT INTO `users_loans` VALUES (9, 18);
INSERT INTO `users_loans` VALUES (9, 19);
INSERT INTO `users_loans` VALUES (10, 20);

SET FOREIGN_KEY_CHECKS = 1;
