# APP Chamada Eufraten

Aplicativo Android para registro simples e rápido da frequência dos educandos nas oficinas da Fundação Eufraten, contemplando as duas unidades de Campinas.

## Objetivo

Substituir ou simplificar o processo manual de chamada, permitindo que educadores realizem a frequência pelo celular ou tablet Android com poucos toques.

## MVP

- Seleção da unidade
- Seleção da oficina/turma
- Lista de educandos
- Registro de presente/ausente
- Data e horário da chamada
- Correção de registros antes do encerramento
- Fechamento da chamada com resumo de presentes e ausentes
- Histórico básico de chamadas

## Princípios do projeto

1. Simplicidade acima de quantidade de funcionalidades.
2. Interface adequada para toque em celular e tablet.
3. Operação rápida durante a rotina das oficinas.
4. Funcionamento confiável mesmo com conexão instável.
5. Dados reais de educandos não devem ser armazenados no repositório.
6. Arquitetura preparada para futura sincronização entre as duas unidades.

## Status

**Fase 0 — Documentação e definição do MVP.**

## Documentação

- [Requisitos](docs/REQUISITOS.md)
- [Arquitetura](docs/ARQUITETURA.md)
- [Fluxo](docs/FLUXO.md)
- [Modelo de dados](docs/MODELO-DADOS.md)
- [Roadmap](docs/ROADMAP.md)
- [Decisões](docs/DECISOES.md)

## Desenvolvimento

O desenvolvimento será planejado para uso conjunto de Antigravity e Claude Code, mantendo a documentação como fonte de verdade do projeto.

## Privacidade

O projeto poderá lidar com dados pessoais de educandos. Dados reais, planilhas reais, exportações e credenciais nunca devem ser commitados no GitHub. Durante o desenvolvimento devem ser utilizados dados fictícios.
