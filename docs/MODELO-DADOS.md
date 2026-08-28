# Modelo de dados inicial

O modelo abaixo é conceitual. Os nomes e tipos definitivos serão definidos na implementação.

## Unidade

- id
- nome
- ativo

## Oficina/Turma

- id
- unidade_id
- nome
- ativo

## Educando

- id
- oficina_id
- nome
- ativo

## Chamada

- id
- oficina_id
- data
- horario_inicio
- horario_fim
- status

## Presença

- id
- chamada_id
- educando_id
- status (presente/ausente)
- horario_registro

## Relacionamentos

```text
Unidade 1 ─── N Oficina/Turma
Oficina 1 ─── N Educando
Oficina 1 ─── N Chamada
Chamada 1 ─── N Presença
Educando 1 ─── N Presença
```

## Observação de privacidade

O repositório deve conter apenas dados fictícios para testes. Cadastros reais devem permanecer no ambiente de execução apropriado e nunca em commits públicos.
