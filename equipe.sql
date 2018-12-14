--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.4
-- Dumped by pg_dump version 9.6.4

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: postgres; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'French_Canada.1252' LC_CTYPE = 'French_Canada.1252';


ALTER DATABASE postgres OWNER TO postgres;

\connect postgres

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: postgres; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE postgres IS 'default administrative connection database';


--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


--
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: joueur; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE joueur (
    id_joueur integer NOT NULL,
    nom text,
    poids text,
    naissance text,
    numero integer NOT NULL
)
WITH (autovacuum_enabled='true');


ALTER TABLE joueur OWNER TO postgres;

--
-- Name: joueur_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE joueur_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE joueur_id_seq OWNER TO postgres;

--
-- Name: joueur_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE joueur_id_seq OWNED BY joueur.id_joueur;


--
-- Name: palmares_joueur; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE palmares_joueur (
    titre text,
    numero_joueur integer NOT NULL,
    date text,
    id integer NOT NULL
);


ALTER TABLE palmares_joueur OWNER TO postgres;

--
-- Name: palmares_joueur_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE palmares_joueur_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE palmares_joueur_id_seq OWNER TO postgres;

--
-- Name: palmares_joueur_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE palmares_joueur_id_seq OWNED BY palmares_joueur.id;


--
-- Name: joueur id_joueur; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY joueur ALTER COLUMN id_joueur SET DEFAULT nextval('joueur_id_seq'::regclass);


--
-- Name: palmares_joueur id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY palmares_joueur ALTER COLUMN id SET DEFAULT nextval('palmares_joueur_id_seq'::regclass);


--
-- Data for Name: joueur; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO joueur VALUES (8, 'Romain', '5 juin 1997', '85', 19);
INSERT INTO joueur VALUES (9, 'Alec', '4 mai 1998', '60', 10);
INSERT INTO joueur VALUES (10, 'Allan', '12 juin 1998', '45', 78);


--
-- Name: joueur_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('joueur_id_seq', 10, true);


--
-- Data for Name: palmares_joueur; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Name: palmares_joueur_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('palmares_joueur_id_seq', 1, false);


--
-- Name: joueur cle_id_Joueur; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY joueur
    ADD CONSTRAINT "cle_id_Joueur" PRIMARY KEY (id_joueur);


--
-- Name: joueur joueur_Numero_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY joueur
    ADD CONSTRAINT "joueur_Numero_key" UNIQUE (numero);


--
-- Name: palmares_joueur numero_joueur; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY palmares_joueur
    ADD CONSTRAINT numero_joueur PRIMARY KEY (numero_joueur);


--
-- Name: palmares_joueur numero_joueur; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY palmares_joueur
    ADD CONSTRAINT numero_joueur FOREIGN KEY (numero_joueur) REFERENCES joueur(numero);


--
-- PostgreSQL database dump complete
--

