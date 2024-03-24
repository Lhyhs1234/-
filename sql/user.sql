CREATE TABLE users (
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       username VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       age INT,
                       sex VARCHAR(10),
                       address VARCHAR(255)
);
INSERT INTO users (username, password, age, sex, address) VALUES ('Alice', 'password123', 25, '女', '123 Main Street');
INSERT INTO users (username, password, age, sex, address) VALUES ('Bob', 'pass456', 30, '男', '456 Elm Street');
INSERT INTO users (username, password, age, sex, address) VALUES ('Alice', 'pass789', 25, '女', '789 Maple Avenue');