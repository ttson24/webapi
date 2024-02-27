CREATE TABLE shop.data_stars(
    id character varying(16),
    product_id character varying(16),
    user_id character varying(16),
    star_value numeric(2,1),
primary key(id)
);