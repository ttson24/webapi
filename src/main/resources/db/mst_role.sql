CREATE TABLE manager.mst_roles(
    id  SERIAL not null,
    role_name character varying(50),
    created_at character varying(20),
    updated_at character varying(20),
    deleted_at character varying(20),
primary key(id)
);