
use empresa;

create table funcionario(
id int not null auto_increment,
nome varchar(20),
profissao varchar (15),
primary key (id)
);
insert into funcionario(nome,profissao) value ('Samuel', 'quimico'	);
insert into funcionario(nome,profissao) value ('Daniel','engenheiro');	
insert into funcionario(nome,profissao) value ('Bruno','progamador');
select*from funcionario;

