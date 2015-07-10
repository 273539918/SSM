测试用的数据库表脚本：
drop database ssm;
create database ssm;
use ssm;

CREATE TABLE `teacher` (
	`id` bigint NOT NULL DEFAULT 0 COMMENT '主键id',
	`name` varchar(40) NOT NULL DEFAULT '' COMMENT '名称',
	`age` smallint NOT NULL DEFAULT 0 COMMENT '年龄',
	PRIMARY KEY (`id`)
) COMMENT='教师表'; ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


insert  into `teacher`(`id`,`name`,`age`) values (1,'张三丰',56);