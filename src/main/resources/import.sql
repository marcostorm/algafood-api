insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');

insert into restaurante (id, nome, taxa_frete, cozinha_id) values (1, 'Thai Gourmet', 10, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (2, 'Thai Delivery', 9.50, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (3, 'Tuk Tuk Comida Indiana', 15, 2);

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


insert into cidade (id, nome, estado_id) values (1, 'Uberlândia', 12);
insert into cidade (id, nome, estado_id) values (2, 'Belo Horizonte', 12);
insert into cidade (id, nome, estado_id) values (3, 'São Paulo', 24);
insert into cidade (id, nome, estado_id) values (4, 'Campinas', 24);
insert into cidade (id, nome, estado_id) values (5, 'Fortaleza', 6);

insert into forma_pagamento (id, descricao) values (1, 'Cartão de crédito');
insert into forma_pagamento (id, descricao) values (2, 'Cartão de débito');
insert into forma_pagamento (id, descricao) values (3, 'Dinheiro');

insert into permissao (id, nome, descricao) values (1, 'CONSULTAR_COZINHAS', 'Permite consultar cozinhas');
insert into permissao (id, nome, descricao) values (2, 'EDITAR_COZINHAS', 'Permite editar cozinhas');