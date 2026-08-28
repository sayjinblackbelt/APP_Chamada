# Arquitetura inicial

## Diretriz

A arquitetura deve ser pequena, compreensível e adequada ao uso em Android. O projeto não deve começar com uma infraestrutura de servidor desnecessária.

## Estratégia do MVP

**Aplicativo Android + banco local**.

A chamada deve continuar utilizável quando a internet estiver indisponível ou instável. A sincronização com uma base central será uma etapa posterior.

## Camadas conceituais

```text
Interface Android
       ↓
Regras de chamada
       ↓
Repositório de dados
       ↓
Banco local
```

## Evolução prevista

```text
MVP
Android + armazenamento local

        ↓

Versão 2
Sincronização com servidor/banco central

        ↓

Versão 3
Relatórios, gestão administrativa e integrações
```

## Critérios técnicos

- Priorizar tecnologia Android moderna e bem suportada.
- Separar interface, regras de negócio e persistência.
- Evitar dependências desnecessárias.
- Manter o projeto fácil de entender para Claude Code e Antigravity.
- Não armazenar credenciais ou dados reais no código-fonte.

## Decisão ainda pendente

A tecnologia exata do aplicativo (por exemplo, Kotlin/Jetpack Compose ou outra abordagem) será definida na fase de implementação, considerando simplicidade, manutenção e capacidade de gerar APK para os dispositivos da instituição.
