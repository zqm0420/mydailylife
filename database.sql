CREATE DATABASE mydailylife;

use dailylife;
CREATE TABLE user
(
    userID   int auto_increment comment '用户ID'
        primary key,
    password varchar(20)  not null comment '密码',
    username varchar(100) not null comment '用户名',
    age      int          null comment '年龄',
    gender   varchar(5)   null comment '性别',
    tel      varchar(11)  null comment '电话'
)ENGINE=INNODB, CHARSET =utf8;
INSERT INTO user(password, username, age, gender, tel) VALUES('zqm','123',25,'男','17626044324');
CREATE TABLE spendingCategory(
                                 categoryID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                                 categoryName VARCHAR(50) NOT NULL COMMENT '支出类别名称'
)ENGINE=INNODB, CHARSET =utf8;
INSERT INTO spendingcategory(categoryName) VALUES('餐饮');
INSERT INTO spendingcategory(categoryName) VALUES('交通');
CREATE TABLE account(
                        accountID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                        accountName VARCHAR(100) NOT NULL COMMENT '账户名称',
                        balance DECIMAL(10,3) NOT NULL DEFAULT 0.0
)ENGINE=INNODB, CHARSET =utf8;
INSERT INTO account(accountName, balance) VALUES('招商银行借记卡',2000.0);
INSERT INTO account(accountName) VALUES('农业银行借记卡');
CREATE TABLE bill(
                     billID INT PRIMARY KEY AUTO_INCREMENT,
                     spendingCategoryID INT NOT NULL,
                     money DECIMAL(10, 3) NOT NULL,
                     payDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                     detail varchar(100)
)ENGINE=INNODB, CHARSET=utf8;
ALTER TABLE bill ADD FOREIGN KEY (spendingCategoryID) REFERENCES spendingCategory(categoryID);
INSERT INTO bill(spendingCategoryID, money, detail) VALUES (1, 10, '一食堂午餐');
INSERT INTO bill(spendingCategoryID, money, detail) VALUES (2, 3, '坐地铁');