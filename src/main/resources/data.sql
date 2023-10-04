insert into paciente(convênio,cpf,idade,nome)
values
	(true,'185.519.760-01',25,'Hugo Lucca Nelson Gonçalves'),
	(false,'913.732.561-25',60,'Marlene Isabel Luna da Costa'),
	(true,'073.525.272-65',78,'Carolina Carolina Aparecida Carvalho'),
	(true,'440.206.137-70',47,'José César das Neves'),
	(false,'923.242.323-59',32,'Lúcia Sandra Santos');
	
insert into medico(especialidade,nome)
values
	('Ortopedia','Mirella Valentina Sophia Campos'),
	('Geral','Luzia Josefa Fernandes'),
	('Cardiologia','Clara Luna de Paula'),
	('Neurologia','Giovana Clarice Oliveira'),
	('Oftalmologia','Bernardo Juan Pietro Teixeira');
	
insert into leito(disponivel,medico_id,paciente_id)
values
	(false,1,1),
	(false,2,2),
	(false,3,3),
	(false,4,4),
	(false,5,5);