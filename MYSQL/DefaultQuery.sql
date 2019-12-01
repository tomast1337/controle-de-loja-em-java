CREATE SCHEMA IF NOT EXISTS DBControleLoja DEFAULT CHARACTER SET utf8 ;
USE DBControleLoja  ;

CREATE TABLE IF NOT EXISTS Cliente (
  Codigo INT NOT NULL,
  Nome VARCHAR(45) NOT NULL,
  Telefone VARCHAR(12) NULL,
  Celular VARCHAR(13) NULL,
  PRIMARY KEY (Codigo));

CREATE TABLE IF NOT EXISTS Venda (
  Numero INT NOT NULL,
  Data VARCHAR(10) NULL,
  Cliente_Codigo INT NOT NULL,
  PRIMARY KEY (Numero, Cliente_Codigo),
  INDEX fk_Venda_Cliente1_idx (Cliente_Codigo ASC),
  CONSTRAINT fk_Venda_Cliente1
    FOREIGN KEY (Cliente_Codigo)
    REFERENCES mydb.Cliente (Codigo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS Produto (
  Codigo INT NOT NULL,
  Nome VARCHAR(45) NULL,
  Tipo VARCHAR(45) NULL,
  Descricao VARCHAR(200) NULL,
  Preco INT NULL,
  PRIMARY KEY (Codigo))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS Estoque (
  idEstoque INT NOT NULL,
  Produto_Codigo INT NOT NULL,
  Quantidade INT NULL,
  PRIMARY KEY (idEstoque, Produto_Codigo),
  INDEX fk_Estoque_Produto1_idx (Produto_Codigo ASC),
  CONSTRAINT fk_Estoque_Produto1
    FOREIGN KEY (Produto_Codigo)
    REFERENCES mydb.Produto (Codigo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS ItensVenda (
  Venda_Numero INT NOT NULL,
  Produto_Codigo INT NOT NULL,
  Quantidade INT NULL,
  PRIMARY KEY (Venda_Numero, Produto_Codigo),
  INDEX fk_Venda_has_Produto_Produto1_idx (Produto_Codigo ASC),
  INDEX fk_Venda_has_Produto_Venda1_idx (Venda_Numero ASC),
  CONSTRAINT fk_Venda_has_Produto_Venda1
    FOREIGN KEY (Venda_Numero)
    REFERENCES mydb.Venda (Numero)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Venda_has_Produto_Produto1
    FOREIGN KEY (Produto_Codigo)
    REFERENCES mydb.Produto (Codigo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
