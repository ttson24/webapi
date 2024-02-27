CREATE TABLE shop.data_products(
    id character varying(16) not null,
    title character varying(100),
    description text,
    image character varying(255),
    price numeric(10,2),
    discount_id character varying(16),
    tax_id character varying(16),
    stock numeric(50),
    created_at character varying(20),
    updated_at character varying(20),
    deleted_at character varying(20),
primary key (id)
);