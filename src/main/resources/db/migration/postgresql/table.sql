CREATE TABLE public.pdv_empresa
(
    empresa_id bigint NOT NULL,
    cnpj character varying(255) COLLATE pg_catalog."default",
    data_atualizacao timestamp without time zone,
    data_criacao timestamp without time zone,
    razao_social character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT pdv_empresa_pkey PRIMARY KEY (empresa_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.pdv_empresa
    OWNER to postgres;