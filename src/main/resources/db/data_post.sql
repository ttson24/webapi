CREATE TABLE news.data_posts(
    id character varying(16) not null,
    title character varying(100),
    description text,
    author character varying(50),
    image character varying(255),
    created_at character varying(20),
    updated_at character varying(20),
    deleted_at character varying(20),
primary key (id)
);