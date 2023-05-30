-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.24-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para projeto_bar
CREATE DATABASE IF NOT EXISTS `projeto_bar` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `projeto_bar`;

-- Copiando estrutura para tabela projeto_bar.auditoria
CREATE TABLE IF NOT EXISTS `auditoria` (
  `codAuditoria` int(11) NOT NULL AUTO_INCREMENT,
  `acao` varchar(400) DEFAULT NULL,
  `tabela` varchar(50) DEFAULT NULL,
  `dataHora` datetime DEFAULT NULL,
  `usuario` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codAuditoria`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='Registra as principais alterações nesse BD';

-- Copiando dados para a tabela projeto_bar.auditoria: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `auditoria` DISABLE KEYS */;
INSERT INTO `auditoria` (`codAuditoria`, `acao`, `tabela`, `dataHora`, `usuario`) VALUES
	(1, 'Cliente inserido: Pedro Henrique com CPF: 15544455562 e endereço: Rua Augusta ', 'cliente', '2023-05-02 10:24:01', 'root@localhost'),
	(2, 'Preço do produto alterado para: 20.00Código do produtto: 50Nome do produto: Cuba Libre', 'produto', '2023-05-02 10:30:03', 'root@localhost'),
	(3, 'A: Corona Foi deletada do Sistema', 'marca', '2023-05-02 10:43:13', 'root@localhost'),
	(4, 'Cliente inserido: Esaú com CPF: 15449512512 e endereço: Rua Antonio Correa', 'cliente', '2023-05-09 10:34:55', 'root@localhost'),
	(5, 'Inserção de cliente menor de idade: Esaú', 'cliente', '2023-05-09 10:34:55', 'root@localhost');
/*!40000 ALTER TABLE `auditoria` ENABLE KEYS */;

-- Copiando estrutura para tabela projeto_bar.categoria
CREATE TABLE IF NOT EXISTS `categoria` (
  `codCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nomeCategoria` varchar(100) NOT NULL,
  PRIMARY KEY (`codCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela projeto_bar.categoria: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` (`codCategoria`, `nomeCategoria`) VALUES
	(1, 'Bebidas Alcoolicas'),
	(2, 'Salgados'),
	(3, 'Sucos Naturais'),
	(4, 'Prato Feito'),
	(5, ''),
	(6, 'Salgados Fritos');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;

-- Copiando estrutura para tabela projeto_bar.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `codCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nomeCliente` varchar(200) NOT NULL,
  `enderecoCliente` varchar(200) NOT NULL,
  `telefoneCliente` varchar(45) NOT NULL,
  `cpfCliente` varchar(45) NOT NULL,
  `dataNascimento` date DEFAULT NULL,
  PRIMARY KEY (`codCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela projeto_bar.cliente: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`codCliente`, `nomeCliente`, `enderecoCliente`, `telefoneCliente`, `cpfCliente`, `dataNascimento`) VALUES
	(2, 'Thiago', 'Rua Douglas', '1987453452', '098345345065', '1985-06-09'),
	(3, 'Joao Cardoso', 'Rua Douglas', '4309854832', '12356345698', '1986-11-25'),
	(4, 'Gustavo', 'Rua Douglas Goncalves', '1974854345', '04532497658', '2001-07-08'),
	(8, 'Leonardo', 'Rua Douglas', '3509384957', '483950489608', '2003-05-29'),
	(9, 'Samuel', 'Av Padre Peixoto', '3586975069', '0796897690708', '2001-07-21'),
	(13, 'Pedro Henrique', 'Rua Augusta ', '35998555514', '15544455562', '2001-09-11'),
	(14, 'Esaú', 'Rua Antonio Correa', '35998680509', '15449512512', '2009-05-22');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Copiando estrutura para procedure projeto_bar.consultaLogin
DELIMITER //
CREATE PROCEDURE `consultaLogin`(usuario varchar(100), senha varchar(100))
BEGIN
Select * from usuarios where usuarios.nome = usuario and usuarios.senha = senha;
END//
DELIMITER ;

-- Copiando estrutura para tabela projeto_bar.marca
CREATE TABLE IF NOT EXISTS `marca` (
  `codMarca` int(11) NOT NULL AUTO_INCREMENT,
  `nomeMarca` varchar(45) NOT NULL,
  PRIMARY KEY (`codMarca`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela projeto_bar.marca: ~14 rows (aproximadamente)
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` (`codMarca`, `nomeMarca`) VALUES
	(1, 'Heineken'),
	(2, 'Budweiser'),
	(3, 'Brahma'),
	(4, 'Kaiser'),
	(5, 'Del valle'),
	(6, 'Vodka'),
	(7, 'Whisky'),
	(8, 'Rum'),
	(9, 'Uísque'),
	(10, 'Licor de Pessego'),
	(11, 'Gin'),
	(12, 'Bourbon'),
	(13, 'Tequila'),
	(14, 'Espumante');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;

-- Copiando estrutura para procedure projeto_bar.proc_alteraCategoria
DELIMITER //
CREATE PROCEDURE `proc_alteraCategoria`(IN nomeAlterado varchar(200), IN codigo int)
BEGIN
	update categoria set nomeCategoria = nomeAlterado where codCategoria = codigo;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_alteraCliente
DELIMITER //
CREATE PROCEDURE `proc_alteraCliente`(IN nomeNovoCliente varchar(200), in enderecoNovoCliente varchar(200), in telefoneNovoCliente varchar(45), cpfNovoCliente varchar(45), in codigo int)
BEGIN
	update cliente set nomeCliente = nomeNovoCliente, enderecoCliente = enderecoNovoCliente, telefoneCliente = telefoneNovoCliente, cpfCliente = cpfNovoCliente where codCliente = codigo;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_alteraMarca
DELIMITER //
CREATE PROCEDURE `proc_alteraMarca`(IN nomeAlterado varchar(100), IN codigo int)
BEGIN
	update marca set nomeMarca = nomeAlterado where codMarca = codigo;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_alteraProduto
DELIMITER //
CREATE PROCEDURE `proc_alteraProduto`(IN nomeNovoProduto varchar(200), in precoNovoCusto decimal, in precoNovoVenda decimal, in fkcodMarca int, in fkcodCategoria int, codigo int)
BEGIN
	update produto set nomeProduto = nomeNovoProduto, precoCusto = precoNovoCusto, precoVenda = precoNovoVenda, MARCA_codMarca = fkcodMarca, CATEGORIA_codCategoria = fkcodCategoria where codProduto = codigo;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_alteraVenda
DELIMITER //
CREATE PROCEDURE `proc_alteraVenda`(in mesaNovoVenda int, in dataNovoHoraVenda datetime, in fkcodNovoCliente int, in codigo int)
BEGIN
	update venda set mesaVenda = mesaNovoVenda, dataHoraVenda = dataNovoHoraVenda, CLIENTE_codCliente = fkcodNovoCliente where codVenda = codigo;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_deleteCategoria
DELIMITER //
CREATE PROCEDURE `proc_deleteCategoria`(IN codigoApaga int)
BEGIN
	delete from categoria where codCategoria = codigoApaga;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_deleteCliente
DELIMITER //
CREATE PROCEDURE `proc_deleteCliente`(in codigo int)
BEGIN
	delete from cliente where codCliente = codigo;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_deleteMarca
DELIMITER //
CREATE PROCEDURE `proc_deleteMarca`(IN codigoApaga int)
BEGIN
	delete from marca where codMarca = codigoApaga;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_deleteProduto
DELIMITER //
CREATE PROCEDURE `proc_deleteProduto`(in codigo int)
BEGIN
	delete from produto where codProduto = codigo;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_deleteVenda
DELIMITER //
CREATE PROCEDURE `proc_deleteVenda`(in codigo int)
BEGIN
	delete from venda where codVenda = codigo;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_insereCategoria
DELIMITER //
CREATE PROCEDURE `proc_insereCategoria`(IN nomeNovo varchar(200))
BEGIN
	insert into `projeto_bar`.`categoria`
    (`nomeCategoria`)
    values
    (`nomeNovo`);
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_insereCliente
DELIMITER //
CREATE PROCEDURE `proc_insereCliente`(IN nomeCliente varchar(200), in enderecoCliente varchar(200), in telefoneCliente varchar(45), cpfCliente varchar(45))
BEGIN
	insert into cliente values(null, nomeCliente, enderecoCliente, telefoneCliente, cpfCliente);
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_insereMarca
DELIMITER //
CREATE PROCEDURE `proc_insereMarca`(IN nomeNovo varchar(200))
BEGIN
	insert into `projeto_bar`.`marca`
    (`nomeMarca`)
    values
    (`nomeNovo`);
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_insereProduto
DELIMITER //
CREATE PROCEDURE `proc_insereProduto`(IN nomeProduto varchar(200), in precoCusto decimal, in precoVenda decimal, in MARCA_codMarca int, in CATEGORIA_codCategoria int)
BEGIN
	insert into produto values(null, nomeProduto, precoCusto, precoVenda, MARCA_codMarca, CATEGORIA_codCategoria);
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_insereVenda
DELIMITER //
CREATE PROCEDURE `proc_insereVenda`(in mesaCliente int, in dataHoraVenda datetime, in fkcodCliente int)
BEGIN
	insert into venda values(null, mesaCliente, dataHoraVenda, fkcodCliente);
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_listaCategoria
DELIMITER //
CREATE PROCEDURE `proc_listaCategoria`()
BEGIN
	select * from categoria;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_listaCliente
DELIMITER //
CREATE PROCEDURE `proc_listaCliente`()
BEGIN
	SELECT codCliente,
    nomeCliente as "Nome",
    enderecoCliente as "Endereco",
    telefoneCliente as "Telefone",
    cpfCliente as "CPF"
    FROM cliente;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_listaClienteCodAndNome
DELIMITER //
CREATE PROCEDURE `proc_listaClienteCodAndNome`()
BEGIN
	SELECT codCliente,
    nomeCliente as "Nome"
    FROM cliente;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_listaMarca
DELIMITER //
CREATE PROCEDURE `proc_listaMarca`()
BEGIN
	select * from marca;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_listaProduto
DELIMITER //
CREATE PROCEDURE `proc_listaProduto`()
BEGIN
	SELECT codProduto,
		marca.nomeMarca as "Marca",
		nomeProduto as "Nome",
		PrecoVenda as "Preco",
		categoria.nomeCategoria as "Categoria"
	FROM produto
	INNER JOIN marca on
	    produto.MARCA_codMarca = marca.codMarca
	INNER JOIN categoria on
		produto.CATEGORIA_codCategoria = categoria.codCategoria;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_listaProdutoCodAndNome
DELIMITER //
CREATE PROCEDURE `proc_listaProdutoCodAndNome`()
BEGIN
	SELECT codProduto,
		nomeProduto as "Nome"
	FROM produto;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_listaVenda
DELIMITER //
CREATE PROCEDURE `proc_listaVenda`()
BEGIN
	SELECT codVenda,
    mesaVenda as "Mesa",
    dataHoraVenda as "Data e Hora",
    cliente.nomeCliente as "Cliente"
    FROM venda
    INNER JOIN cliente on
		venda.CLIENTE_codCliente = cliente.codCliente;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_listaVendaCodandNome
DELIMITER //
CREATE PROCEDURE `proc_listaVendaCodandNome`()
BEGIN
	SELECT codVenda,
    mesaVenda as "Mesa"
    FROM venda;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_UpdateCliente
DELIMITER //
CREATE PROCEDURE `proc_UpdateCliente`(nomeAlterado varchar(200), in enderecoAlterado varchar(200), in telefoneAlterado varchar(45), cpfAlterado varchar(45), codigo int)
BEGIN
	UPDATE cliente
	SET
	`nomeCliente` = nomeAlterado,
	`enderecoCliente` = enderecoAlterado,
	`telefoneCliente` = telefoneAlterado,
	`cpfCliente` = cpfAlterado
	WHERE `codCliente` = codigo;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_UpdateProduto
DELIMITER //
CREATE PROCEDURE `proc_UpdateProduto`(nomeAlterado varchar(200), custoAlterado decimal, vendaAlterado decimal, marcaAlterado int, categoriaAlterado int, codigo int)
BEGIN
	UPDATE produto
	SET
	`nomeProduto` = nomeAlterado,
	`precoCusto` = custoAlterado,
	`precoVenda` = vendaAlterado,
	`MARCA_codMarca` = marcaAlterado,
	`CATEGORIA_codCategoria` = categoriaAlterado
	WHERE `codProduto` = codigo;
END//
DELIMITER ;

-- Copiando estrutura para procedure projeto_bar.proc_UpdateVenda
DELIMITER //
CREATE PROCEDURE `proc_UpdateVenda`(in mesaAlterado int, in dataAlterado datetime, in fkcodClienteAlterado int, codigo int)
BEGIN
	UPDATE venda
	SET
	`mesaVenda` = mesaAlterado,
	`dataHoraVenda` = dataAlterado,
	`CLIENTE_codCliente` = fkcodClienteAlterado
	WHERE `codVenda` = codigo;
END//
DELIMITER ;

-- Copiando estrutura para tabela projeto_bar.produto
CREATE TABLE IF NOT EXISTS `produto` (
  `codProduto` int(11) NOT NULL AUTO_INCREMENT,
  `nomeProduto` varchar(200) NOT NULL,
  `precoCusto` decimal(10,2) unsigned NOT NULL,
  `precoVenda` decimal(10,2) NOT NULL,
  `MARCA_codMarca` int(11) NOT NULL,
  `CATEGORIA_codCategoria` int(11) NOT NULL,
  PRIMARY KEY (`codProduto`,`MARCA_codMarca`,`CATEGORIA_codCategoria`),
  KEY `fk_PRODUTO_MARCA1_idx` (`MARCA_codMarca`),
  KEY `fk_PRODUTO_CATEGORIA1_idx` (`CATEGORIA_codCategoria`),
  CONSTRAINT `fk_PRODUTO_CATEGORIA1` FOREIGN KEY (`CATEGORIA_codCategoria`) REFERENCES `categoria` (`codCategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUTO_MARCA1` FOREIGN KEY (`MARCA_codMarca`) REFERENCES `marca` (`codMarca`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela projeto_bar.produto: ~21 rows (aproximadamente)
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` (`codProduto`, `nomeProduto`, `precoCusto`, `precoVenda`, `MARCA_codMarca`, `CATEGORIA_codCategoria`) VALUES
	(38, 'Teste10', 1.00, 2.00, 2, 3),
	(40, 'Bloody Mary', 10.00, 32.00, 6, 1),
	(41, 'Manhattan', 10.00, 40.00, 11, 1),
	(42, 'Sex on the Beach', 10.00, 30.00, 10, 1),
	(43, 'Dry Martini', 20.00, 55.00, 11, 1),
	(44, 'Fresh Mojito', 10.00, 19.00, 6, 1),
	(45, 'Moscow Mulle', 10.00, 40.00, 6, 1),
	(46, 'Negroni', 50.00, 140.00, 12, 1),
	(47, 'Basel Smash', 10.00, 17.00, 9, 1),
	(48, 'Pina Colada', 5.00, 10.00, 6, 1),
	(49, 'Caipirinha', 3.00, 10.00, 6, 1),
	(50, 'Cuba Libre', 5.00, 20.00, 6, 1),
	(51, 'Mint Gulep', 5.00, 15.00, 7, 1),
	(52, 'Line Margarita', 5.00, 11.00, 10, 1),
	(53, 'Bellini', 10.00, 20.00, 11, 1),
	(54, 'Tequila Sunrise', 10.00, 26.00, 13, 1),
	(55, 'Suco de Laranja', 10.00, 15.00, 5, 3),
	(56, 'teste2', 20.00, 10.00, 2, 2),
	(58, 'Caipirinha', 10.00, 0.00, 6, 1),
	(59, 'Caipirinha Vodka', 11.00, 0.00, 6, 1),
	(60, 'Brahma', 11.00, 0.00, 3, 1);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;

-- Copiando estrutura para tabela projeto_bar.produtoporvenda
CREATE TABLE IF NOT EXISTS `produtoporvenda` (
  `PRODUTO_codProduto` int(11) NOT NULL,
  `VENDA_codVenda` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  PRIMARY KEY (`PRODUTO_codProduto`,`VENDA_codVenda`),
  KEY `fk_PRODUTO_has_VENDA_VENDA1_idx` (`VENDA_codVenda`),
  KEY `fk_PRODUTO_has_VENDA_PRODUTO1_idx` (`PRODUTO_codProduto`),
  CONSTRAINT `fk_PRODUTO_has_VENDA_PRODUTO1` FOREIGN KEY (`PRODUTO_codProduto`) REFERENCES `produto` (`codProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUTO_has_VENDA_VENDA1` FOREIGN KEY (`VENDA_codVenda`) REFERENCES `venda` (`codVenda`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela projeto_bar.produtoporvenda: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `produtoporvenda` DISABLE KEYS */;
/*!40000 ALTER TABLE `produtoporvenda` ENABLE KEYS */;

-- Copiando estrutura para tabela projeto_bar.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `idusuarios` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  PRIMARY KEY (`idusuarios`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela projeto_bar.usuarios: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`idusuarios`, `nome`, `senha`) VALUES
	(3, 'adm', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

-- Copiando estrutura para tabela projeto_bar.venda
CREATE TABLE IF NOT EXISTS `venda` (
  `codVenda` int(11) NOT NULL AUTO_INCREMENT,
  `mesaVenda` int(10) unsigned NOT NULL,
  `dataHoraVenda` datetime NOT NULL,
  `CLIENTE_codCliente` int(11) NOT NULL,
  PRIMARY KEY (`codVenda`,`CLIENTE_codCliente`),
  KEY `fk_VENDA_CLIENTE1_idx` (`CLIENTE_codCliente`),
  CONSTRAINT `fk_VENDA_CLIENTE1` FOREIGN KEY (`CLIENTE_codCliente`) REFERENCES `cliente` (`codCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela projeto_bar.venda: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
INSERT INTO `venda` (`codVenda`, `mesaVenda`, `dataHoraVenda`, `CLIENTE_codCliente`) VALUES
	(7, 1, '2022-10-11 00:00:00', 2),
	(10, 10, '2022-10-20 00:00:00', 2),
	(22, 23, '2021-05-05 00:00:00', 4),
	(23, 2, '2022-12-05 00:00:00', 3),
	(24, 8, '2022-05-20 00:00:00', 9);
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;

-- Copiando estrutura para trigger projeto_bar.tri_alteraPreco
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `tri_alteraPreco` AFTER UPDATE ON `produto` FOR EACH ROW BEGIN
	SET @mensagem = CONCAT("Preço do produto alterado para: ", NEW.precoVenda,
	" Código do produto: ", NEW.codProduto, " Nome do produto: ", NEW.nomeProduto);
	INSERT INTO auditoria VALUES(NULL, @mensagem, "produto", NOW(),
	USER());
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Copiando estrutura para trigger projeto_bar.tri_apagaMarca
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `tri_apagaMarca` AFTER DELETE ON `marca` FOR EACH ROW BEGIN
	SET @mensagem = CONCAT("A: ", old.nomeMarca, " Foi deletada do Sistema");
	INSERT INTO auditoria VALUES(NULL, @mensagem, "marca", NOW(),
	USER());
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Copiando estrutura para trigger projeto_bar.tri_cadastraCliente
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `tri_cadastraCliente` AFTER INSERT ON `cliente` FOR EACH ROW BEGIN
	SET @mensagem = CONCAT("Cliente inserido: ", NEW.nomeCliente,
	" com CPF: ", NEW.cpfCliente, " e endereço: ", NEW.enderecoCliente);
	
	INSERT INTO auditoria VALUES(NULL, @mensagem,
	"cliente", NOW(), USER());
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Copiando estrutura para trigger projeto_bar.tri_margemPrecoVenda
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `tri_margemPrecoVenda` BEFORE INSERT ON `produto` FOR EACH ROW BEGIN
SELECT precoCusto INTO @precoCusto FROM produto WHERE codProduto = NEW.codProduto;

if(@precoCusto > 10)
	then
		SET new.precoVenda = new.precoCusto + (0.5 * new.precoCusto);
		INSERT INTO auditoria VALUES(NULL, @mensagem, "Preço Venda: ",NOW(),USER());
END if;	
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Copiando estrutura para trigger projeto_bar.tri_verificaIdade
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `tri_verificaIdade` AFTER INSERT ON `cliente` FOR EACH ROW BEGIN
SELECT  FLOOR(DATEDIFF(CURDATE(),dataNascimento)/365) 
INTO @idade FROM cliente WHERE codCliente = NEW.codCliente;

if(@idade < 18)
	then
		SET @mensagem = CONCAT("Inserção de cliente menor de idade: ", NEW.nomeCliente);
		INSERT INTO auditoria VALUES(NULL, @mensagem, "cliente", NOW(), USER());
END if;	
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
