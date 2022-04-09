CREATE TABLE IF NOT EXISTS employees
(
    id                       BIGINT AUTO_INCREMENT NOT NULL,
    name                     VARCHAR(20)           NOT NULL,
    surname                  VARCHAR(30)           NOT NULL,
    department               VARCHAR(30)           NOT NULL,
    salary                   INT                   NOT NULL,
    PRIMARY KEY (id)
);





