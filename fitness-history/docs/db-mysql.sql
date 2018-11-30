-- 创建fitness_history表
CREATE TABLE
    fitness_history
    (
        id INT NOT NULL AUTO_INCREMENT,
        userId VARCHAR(40),
        trainingDay VARCHAR(20),
        trainingLevel VARCHAR(10),
		trainingName VARCHAR(255),
		calorie DOUBLE,
		calorieUnit VARCHAR(20) DEFAULT '',
		trainingTime INT,
		trainingTimeUnit VARCHAR(20) DEFAULT '',
		mainTrainingPoint VARCHAR(255),
		trainingPoints VARCHAR(255),
		validStatus VARCHAR(2),
        insertTime DATETIME,
        updateTime DATETIME,
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 增加消耗热量单位
-- alter table fitness_history add column calorieUnit VARCHAR(20) DEFAULT '' after calorie;
-- alter table fitness_history add column trainingTime INT after calorieUnit;
-- alter table fitness_history add column trainingTimeUnit VARCHAR(20) DEFAULT '' after trainingTime;
