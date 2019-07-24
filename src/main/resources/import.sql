
INSERT INTO usuario(email, nome, senha) VALUES ('admin@admin.com', 'Admin', '123');
INSERT INTO usuario(email, nome, senha) VALUES ('debora.mendes@live.com', 'Debora Mendes', '123');

INSERT INTO empresa (nomefantasia, razaosocial, caminhoFoto) VALUES ('TUPA', 'TRANSPORTE URBANO DE PATO BRANCO', 'C:\Users\Debora\Downloads\img\empresa\1.jpg');

INSERT INTO linha (idempresa, descricao) VALUES (1, '101 - GRALHA AZUL - PARQUE INDUSTRIAL');
INSERT INTO linha (idempresa, descricao) VALUES (1, '102 - AVENIDA TUPI - UTFPR');
INSERT INTO linha (idempresa, descricao) VALUES (1, '103 - GRALHA AZUL - CENTRO (AVENIDA TUPI VIA ALVORADA)');
INSERT INTO linha (idempresa, descricao) VALUES (1, '104 - SAO VICENTE');
INSERT INTO linha (idempresa, descricao) VALUES (1, '105 - LA SALLE');
INSERT INTO linha (idempresa, descricao) VALUES (1, '106 - SAO LUIZ');
INSERT INTO linha (idempresa, descricao) VALUES (1, '107 - VENEZA - UTFPR');
INSERT INTO linha (idempresa, descricao) VALUES (1, '108 - GRALHA AZUL - CENTRO (VIA BONATO)');
INSERT INTO linha (idempresa, descricao) VALUES (1, '109 - PASSO DA PEDRA');
INSERT INTO linha (idempresa, descricao) VALUES (1, '110 - SAO CRISTOVAO TERMINAL RODOVIARIO');
INSERT INTO linha (idempresa, descricao) VALUES (1, '111 - FRARON');
INSERT INTO linha (idempresa, descricao) VALUES (1, '112 - PLANALTO - CENTRO (VIA RUA XINGU)');
INSERT INTO linha (idempresa, descricao) VALUES (1, '113 - SAO JOAO');
INSERT INTO linha (idempresa, descricao) VALUES (1, '114 - VILA VERDE');
INSERT INTO linha (idempresa, descricao) VALUES (1, '115 - PLANALTO - CENTRO (VIA RUA ITABIRA)');
INSERT INTO linha (idempresa, descricao) VALUES (1, '116 - NOVA ESPERO');
INSERT INTO linha (idempresa, descricao) VALUES (1, '117 - UTFPR - FADEP');
INSERT INTO linha (idempresa, descricao) VALUES (1, '118 - INTERBAIRROS');
INSERT INTO linha (idempresa, descricao) VALUES (1, '119 - SAO FRANCISCO');

INSERT INTO ponto (latitude, longitude, nome, descricao, parada, referencia, caminhoFoto) VALUES (-26.230346, -52.672959, 'Casa do Artesato - Ponto 1', 'R. Caramuru, 50', true, true, 'C:\Users\Debora\Downloads\img\ponto\1.jpg');
INSERT INTO ponto (latitude, longitude, nome, descricao, parada, referencia, caminhoFoto) VALUES (-26.230401, -52.673073, 'Casa do Artesato - Ponto 2', 'R. Tamoio, 407', true, true, 'C:\Users\Debora\Downloads\img\ponto\2.jpg');
INSERT INTO ponto (latitude, longitude, nome, descricao, parada, referencia, caminhoFoto) VALUES (-26.229182, -52.673721, 'Antiga Rodoviaria - Ponto 3', 'R. Tamoio, 561', true, true, 'C:\Users\Debora\Downloads\img\ponto\3.jpg');
INSERT INTO ponto (latitude, longitude, nome, descricao, parada, referencia, caminhoFoto) VALUES (-26.196737, -52.688936, 'UTFPR', 'Via do Conhecimento, KM 01, em frete a guarita', true, true, 'C:\Users\Debora\Downloads\img\ponto\4.jpg');
INSERT INTO ponto (latitude, longitude, nome, descricao, parada, referencia, caminhoFoto) VALUES (-26.2217067,-52.6802449, 'Rodoviaria - Ponto 1', 'Av. Brasil, 1990, ao lado da rodoviária', true, false, 'C:\Users\Debora\Downloads\img\ponto\5.jpg');
INSERT INTO ponto (latitude, longitude, nome, descricao, parada, referencia, caminhoFoto) VALUES (-26.2260829,-52.676557, 'Correios', 'R. Caramuru, 575', true, false, 'C:\Users\Debora\Downloads\img\ponto\6.jpg');
INSERT INTO ponto (latitude, longitude, nome, descricao, parada, referencia, caminhoFoto) VALUES (-26.2236499,-52.68472, 'Bar do Baixinho', 'R. Vitor Silvio Biazus, 366', true, false, 'C:\Users\Debora\Downloads\img\ponto\7.jpg');
INSERT INTO ponto (latitude, longitude, nome, descricao, parada, referencia, caminhoFoto) VALUES (-26.2187599,-52.6730941, 'Dom Burger', 'Av. Tupi, 1515', true, false, 'C:\Users\Debora\Downloads\img\ponto\8.jpg');
INSERT INTO ponto (latitude, longitude, nome, descricao, parada, referencia, caminhoFoto) VALUES (-26.2270738,-52.6717236, 'Praça Presidente Vargas', 'No Centro, proximo a Igreja Matriz de Sao Pedro , cor Amarela', false, true, 'C:\Users\Debora\Downloads\img\ponto\9.jpg');
