# Especificação tecnológica — MVP

## Stack proposta

- Kotlin
- Jetpack Compose
- Android Jetpack
- Room para persistência local
- Navigation Compose para navegação
- Material 3 para componentes de interface

## Justificativa

A combinação mantém o aplicativo nativo Android, adequado a celulares e tablets, com uma arquitetura relativamente simples para desenvolvimento assistido por Claude Code e Antigravity.

O MVP não dependerá de internet, API externa ou serviço de IA para realizar a chamada.

## Estrutura conceitual

```
UI — Jetpack Compose
        ↓
ViewModel / estado da tela
        ↓
Repositório
        ↓
Room
```

## Dados de demonstração

Durante o desenvolvimento serão usados apenas dados fictícios.

## Evolução

A sincronização entre dispositivos e unidades será projetada depois da validação do MVP local.
