CREATE TABLE Departamentos
(
CodDepto int,
NomeDepto varchar(50) NOT NULL,
constraint PK_Departamentos Primary Key (CodDepto)
)

CREATE TABLE Funcionarios
(
CodFunc int,
NomeFunc varchar(40) NOT NULL,
SalFunc money,
CodigoDepto int NOT NULL,
CONSTRAINT PK_Funcionarios Primary key (CodFunc),
CONSTRAINT FK_Funcionarios Foreign Key (CodigoDepto)
REFERENCES Departamentos (CodDepto)
)

ALTER TABLE Funcionarios ALTER COLUMN NomeFunc varchar(60) NOT NULL

ALTER TABLE Departamentos ADD Sala int NOT NULL

ALTER TABLE Funcionarios DROP COLUMN SalFunc

