
-- 创建weight表
CREATE TABLE
    weight
    (
        id INT NOT NULL AUTO_INCREMENT,
        userId VARCHAR(40),
        weight DOUBLE,
        weightDay VARCHAR(20),
        insertTime DATETIME,
        updateTime DATETIME,
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;

