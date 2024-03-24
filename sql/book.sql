CREATE TABLE book (
                      book_id INT PRIMARY KEY AUTO_INCREMENT,
                      name VARCHAR(255) NOT NULL,
                      price INT,
                      user_id INT
);
INSERT INTO book (name, price, user_id) VALUES ('Book 1', 20, 1);
INSERT INTO book (name, price, user_id) VALUES ('Book 2', 25, 1);
INSERT INTO book (name, price, user_id) VALUES ('Book 3', 30, 2);