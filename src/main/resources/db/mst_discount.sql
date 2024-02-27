CREATE TABLE shop.mst_discounts(
    id character varying(16) not null,
    dis_value numeric(3,2),
    dis_decription character varying(200)
primary key(id)
);