# Decisões do projeto

## D001 — Começar pelo MVP

A primeira versão terá somente o necessário para realizar e consultar chamadas.

**Motivo:** reduzir complexidade e validar o uso real antes de investir em funcionalidades secundárias.

## D002 — Priorizar Android

O primeiro alvo será celular e tablet Android.

**Motivo:** corresponde ao cenário de uso previsto e permite distribuição controlada por APK durante a fase inicial.

## D003 — Armazenamento local no MVP

A chamada deverá funcionar sem depender permanentemente de internet.

**Motivo:** uma chamada não pode parar por causa de conexão instável.

## D004 — Sincronização será posterior

A comunicação entre as duas unidades e um banco central será planejada depois que o fluxo local estiver validado.

**Motivo:** evita adicionar servidor, autenticação e sincronização antes de comprovar a necessidade e o fluxo de uso.

## D005 — Sem IA na função principal

Claude Code e Antigravity serão ferramentas de desenvolvimento, não dependências da chamada.

**Motivo:** registrar presença é uma operação determinística e deve continuar funcionando independentemente de serviços de IA.

## D006 — Privacidade desde o início

Dados reais de educandos não serão versionados no GitHub.

**Motivo:** o aplicativo poderá processar dados pessoais e o desenvolvimento deve separar código/documentação de dados institucionais reais.
