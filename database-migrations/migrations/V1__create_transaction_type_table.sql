CREATE TABLE IF NOT EXISTS transaction_type
(
    id               BIGINT NOT NULL,
    name             VARCHAR(255) NOT NULL,
    priority         SMALLINT DEFAULT 0,
    CONSTRAINT active_configuration_pkey PRIMARY KEY (id)
);