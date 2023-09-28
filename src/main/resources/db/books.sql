CREATE TABLE IF NOT EXISTS books
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(100),
    description VARCHAR(500)
);