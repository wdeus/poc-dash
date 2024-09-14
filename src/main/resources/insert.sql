INSERT INTO dim_acao_seletiva (id_dim_acao_seletiva, tipo, dt_hora)
VALUES
    (1, 'Entrevista Técnica', '2024-09-14'),
    (2, 'Prova de Lógica', '2024-09-13');

INSERT INTO dim_contratacao (id_dim_contratacao, dt_contratacao, salario_inicial, tipo_contrato, dt_aceite_oferta)
VALUES
    (1, '2024-09-10', 4500.00, 1, '2024-09-09'),
    (2, '2024-09-12', 5500.00, 2, '2024-09-11');


INSERT INTO dim_entrevista (id_dim_entrevista, dt_entrevista, entrevistador, resultado)
VALUES
    (1, '2024-09-08', 'João Silva', 'Aprovado'),
    (2, '2024-09-09', 'Maria Souza', 'Reprovado');


INSERT INTO dim_feedback (id_dim_feedback, descricao)
VALUES
    (1, 'Bom conhecimento técnico'),
    (2, 'Falta experiência prática');


INSERT INTO dim_participante_rh (id_dim_participante_rh, nome, cargo)
VALUES
    (1, 'Pedro Lima', 'Gerente de RH'),
    (2, 'Ana Oliveira', 'Analista de RH');


INSERT INTO dim_periodo (id_dim_periodo, dt_abertura, dt_fechamento)
VALUES
    (1, '2024-09-01', '2024-09-30'),
    (2, '2024-10-01', '2024-10-31');


INSERT INTO dim_processo_seletivo (id_dim_processo_seletivo, nome, dt_inicio, dt_fim, status, criador, descricao)
VALUES
    (1, 'Processo Desenvolvedor', '2024-09-01', '2024-09-30', 'Em andamento', 'RH', 'Seleção para desenvolvedores'),
    (2, 'Processo Analista', '2024-09-05', '2024-09-25', 'Finalizado', 'RH', 'Seleção para analistas');

INSERT INTO dim_vaga (id_dim_vaga, titulo, nr_posicoes, requisitos, status, localizacao, responsavel)
VALUES
    (1, 'Desenvolvedor Java', 3, 'Java, Spring', 'Aberta', 'São Paulo', 'João Silva'),
    (2, 'Analista de Dados', 2, 'SQL, Python', 'Fechada', 'Rio de Janeiro', 'Maria Souza');


INSERT INTO fato_entrevista (id_fato_entrevista, id_dim_entrevista, id_dim_vaga, id_dim_feedback, id_dim_acao_seletiva, id_dim_participante_rh, pontuacao_candidato, id_dim_contratacao, nr_entrevistas, nr_contratacoes)
VALUES
    (1, 1, 1, 1, 1, 1, 85, 1, 2, 1),
    (2, 2, 2, 2, 2, 2, 70, 2, 1, 0);


INSERT INTO fato_vaga (id_fato_vaga, id_dim_vaga, id_dim_processo_seletivo, nr_posicoes_abertas, nr_candidatos_inscritos, salario_inicial_medio, tempo_medio_processo, id_dim_periodo)
VALUES
    (1, 1, 1, 3, 15, 5000.00, 10, 1),
    (2, 2, 2, 2, 8, 4500.00, 12, 2);
