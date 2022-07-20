/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : liuyanban

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 20/07/2022 13:24:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for infomation
-- ----------------------------
DROP TABLE IF EXISTS `infomation`;
CREATE TABLE `infomation`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `message` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `post_time` datetime(0) NULL DEFAULT NULL,
  `ip` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `province` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of infomation
-- ----------------------------
INSERT INTO `infomation` VALUES (1, '孙衎衎', '的撒', '2022-05-12 09:00:26', '192.168.8.17', '');
INSERT INTO `infomation` VALUES (2, '孙衎衎', '的撒', '2022-05-12 09:01:04', '192.168.8.17', '');
INSERT INTO `infomation` VALUES (3, '的撒', '大大大', '2022-05-12 09:02:15', '192.168.8.17', '匿名好友');
INSERT INTO `infomation` VALUES (4, '的撒', '大大大', '2022-05-12 09:02:55', '192.168.8.17', '匿名好友');
INSERT INTO `infomation` VALUES (5, '孙衎衎', '的撒', '2022-05-12 09:03:47', '192.168.8.17', '的撒对的');
INSERT INTO `infomation` VALUES (6, '孙衎衎', '的撒', '2022-05-12 09:06:02', '192.168.8.17', '野猪');
INSERT INTO `infomation` VALUES (7, '', '', '2022-05-12 09:16:00', '192.168.8.17', '匿名好友');
INSERT INTO `infomation` VALUES (8, '孙衎衎', '大苏打萨达萨达是', '2022-05-12 10:36:11', '192.168.8.17', '匿名好友');
INSERT INTO `infomation` VALUES (9, '孙衎衎', '倒萨倒萨倒萨dsa\n大撒大撒\n大撒大撒\n大撒大撒', '2022-05-12 10:36:34', '192.168.8.17', '匿名好友');
INSERT INTO `infomation` VALUES (10, '孙衎衎', '是顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶的撒啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊的撒啊啊啊顶顶顶顶顶顶顶顶顶顶顶顶顶顶的撒啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊的撒啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊', '2022-05-12 10:37:17', '192.168.8.17', '匿名好友');
INSERT INTO `infomation` VALUES (11, 'qy', 'sds', '2022-05-12 10:45:29', '192.168.8.17', '匿名好友');
INSERT INTO `infomation` VALUES (12, 'qy', 'sss', '2022-05-12 10:46:27', '192.168.8.17', '匿名好友');

SET FOREIGN_KEY_CHECKS = 1;
