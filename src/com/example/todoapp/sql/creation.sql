CREATE TABLE todo (
    id VARCHAR(50) PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    priority VARCHAR(20),
    end_date DATE,
    completed BOOLEAN NOT NULL DEFAULT FALSE
);