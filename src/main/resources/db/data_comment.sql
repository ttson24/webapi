CREATE TABLE shop.data_comments(
    id character varying(16) not null,
    product_id character varying(16),
    decription text,
    show numeric(1),
    user_id character varying(16),
    created_at character varying(20),
    updated_at character varying(20),
    deleted_at character varying(20),
primary key(id)
);