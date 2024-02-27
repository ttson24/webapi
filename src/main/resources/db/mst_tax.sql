CREATE TABLE manager.mst_taxes(
    id SERIAL not null,
    tax_type numeric(2),
    tax_value numeric(3,2),
    tax_decription character varying(200),
primary key(id)
); 