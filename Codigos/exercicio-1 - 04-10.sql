CREATE TABLE Produtos
(
CodProd int,
DescricaoProd varchar(30) NOT NULL,
CONSTRAINT PK_Produtos Primary Key (CodProd),
)

CREATE TABLE Fornecedores
(
CodForn int,
NomeForn varchar(40) NOT NULL,
CONSTRAINT PK_Fornecedores Primary Key (CodForn),
)

CREATE TABLE Distribuicao
(
CodigoProd int NOT NULL,
CodigoForn int NOT NULL,
CONSTRAINT FK_Produtos Foreign Key (CodigoProd)
REFERENCES Produtos (CodProd),
CONSTRAINT FK_Fornecedores Foreign Key (CodigoForn)
REFERENCES Fornecedores (CodForn)
)