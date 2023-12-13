CREATE TABLE user (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(150) NOT NULL,
    create_date datetime NOT NULL,
    PRIMARY KEY (id)
) engine=InnoDB default charset=utf8;

CREATE TABLE permission (
    id BIGINT NOT NULL AUTO_INCREMENT,
    description VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
) engine=InnoDB default charset=utf8;

CREATE TABLE user_permission (
    user_id BIGINT NOT NULL AUTO_INCREMENT,
    permission_id BIGINT(20) NOT NULL,
    PRIMARY KEY (user_id, permission_id),
    FOREIGN KEY (user_id) REFERENCES user (id),
    FOREIGN KEY (permission_id) REFERENCES permission (id)
) engine=InnoDB default charset=utf8;
