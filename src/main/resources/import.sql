insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');

insert into estado (id, nome) values (1, 'Acre');
insert into estado (id, nome) values (2, 'Alagoas');
insert into estado (id, nome) values (3, 'Amapá');
insert into estado (id, nome) values (4, 'Amazonas');
insert into estado (id, nome) values (5, 'Bahia');
insert into estado (id, nome) values (6, 'Ceará');
insert into estado (id, nome) values (7, 'Espirito Santo');
insert into estado (id, nome) values (8, 'Goiás');
insert into estado (id, nome) values (9, 'Maranhão');
insert into estado (id, nome) values (10, 'Mato Grosso');
insert into estado (id, nome) values (11, 'Mato Grosso do Sul');
insert into estado (id, nome) values (12, 'Minas Gerais');
insert into estado (id, nome) values (13, 'Pará');
insert into estado (id, nome) values (14, 'Paraíba');
insert into estado (id, nome) values (15, 'Paraná');
insert into estado (id, nome) values (16, 'Pernambuco');
insert into estado (id, nome) values (17, 'Piauí');
insert into estado (id, nome) values (18, 'Rio de Janeiro');
insert into estado (id, nome) values (19, 'Rio Grande do Norte');
insert into estado (id, nome) values (20, 'Rio Grande do Sul');
insert into estado (id, nome) values (21, 'Rondônia');
insert into estado (id, nome) values (22, 'Roraima');
insert into estado (id, nome) values (23, 'Santa Catarina');
insert into estado (id, nome) values (24, 'São Paulo');
insert into estado (id, nome) values (25, 'Sergipe');
insert into estado (id, nome) values (26, 'Tocantins');
insert into estado (id, nome) values (27, 'Distrito Federal');


insert into cidade(id, nome, estado_id) values (1, 'Rio Branco', 1);
insert into cidade(id, nome, estado_id) values (2, 'Maceió', 2);
insert into cidade(id, nome, estado_id) values (3, 'Macapá', 3);
insert into cidade(id, nome, estado_id) values (4, 'Manaus', 4);
insert into cidade(id, nome, estado_id) values (5, 'Salvador', 5);
insert into cidade(id, nome, estado_id) values (6, 'Fortaleza', 6);
insert into cidade(id, nome, estado_id) values (7, 'Vitória', 7);
insert into cidade(id, nome, estado_id) values (8, 'Goiânia', 8);
insert into cidade(id, nome, estado_id) values (9, 'São Luís', 9);
insert into cidade(id, nome, estado_id) values (10, 'Cuiabá', 10);
insert into cidade(id, nome, estado_id) values (11, 'Campo Grande', 11);
insert into cidade(id, nome, estado_id) values (12, 'Belo Horizonte', 12);
insert into cidade(id, nome, estado_id) values (13, 'Uberlândia', 12);
insert into cidade(id, nome, estado_id) values (14, 'Belém', 13);
insert into cidade(id, nome, estado_id) values (15, 'João Pessoa', 14);
insert into cidade(id, nome, estado_id) values (16, 'Curitiba', 15);
insert into cidade(id, nome, estado_id) values (17, 'Recife', 16);
insert into cidade(id, nome, estado_id) values (18, 'Teresina', 17);
insert into cidade(id, nome, estado_id) values (19, 'Rio de Janeiro', 18);
insert into cidade(id, nome, estado_id) values (20, 'Natal', 19);
insert into cidade(id, nome, estado_id) values (21, 'Porto Alegre', 20);
insert into cidade(id, nome, estado_id) values (22, 'Porto Velho', 21);
insert into cidade(id, nome, estado_id) values (23, 'Boa Vista', 22);
insert into cidade(id, nome, estado_id) values (24, 'Florianópolis', 23);
insert into cidade(id, nome, estado_id) values (25, 'São Paulo', 24);
insert into cidade(id, nome, estado_id) values (26, 'Aracaju', 25);
insert into cidade(id, nome, estado_id) values (27, 'Palmas', 26);
insert into cidade(id, nome, estado_id) values (28, 'Brasília', 27);

insert into restaurante (id, nome, taxa_frete, cozinha_id, endereco_cidade_id, endereco_cep, endereco_logradouro, endereco_numero, endereco_bairro) values (1, 'Thai Gourmet', 10, 1, 1, '38400-999', 'Rua João Pinheiro', '1000', 'Centro');
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (2, 'Thai Delivery', 9.50, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (3, 'Tuk Tuk Comida Indiana', 15, 2);

insert into forma_pagamento (id, descricao) values (1, 'Cartão de crédito');
insert into forma_pagamento (id, descricao) values (2, 'Cartão de débito');
insert into forma_pagamento (id, descricao) values (3, 'Dinheiro');

insert into permissao (id, nome, descricao) values (1, 'CONSULTAR_COZINHAS', 'Permite consultar cozinhas');
insert into permissao (id, nome, descricao) values (2, 'EDITAR_COZINHAS', 'Permite editar cozinhas');

insert into restaurante_forma_pagamento(restaurante_id, forma_pagamento_id) values (1, 1),(1, 2), (1, 3), (2, 3), (3, 2), (3, 3);