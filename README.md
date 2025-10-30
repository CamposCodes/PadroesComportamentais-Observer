# Padrão Observador — Mercado de Ações# Observer — Mercado de Ações (Observer Pattern)



![UFJF](https://upload.wikimedia.org/wikipedia/commons/3/36/UFJF_logo.png)![UFJF](https://upload.wikimedia.org/wikipedia/commons/3/36/UFJF_logo.png)



## 📝 Sumário## 📝 Sumário



- Sobre- Sobre

- Diagrama de Classe- Diagrama de Classe

- Funcionalidades- Funcionalidades

- Tecnologias- Tecnologias

- Exemplo de Uso- Exemplo de Uso

- Como Executar e Testes- Como Executar e Testes

- Autor- Autor



## 🧐 Sobre## 🧐 Sobre



Este repositório contém uma implementação didática do padrão comportamental Observador aplicada ao domínio de Mercado de Ações. O exercício faz parte da disciplina DCC078 — Aspectos Avançados em Engenharia de Software (UFJF/ICE). A ideia central é demonstrar como uma entidade observável (`Acao`) notifica observadores (`Investidor`) sobre mudanças de estado (preço).Este repositório contém uma implementação didática do padrão comportamental Observer aplicada ao domínio de Mercado de Ações. O exercício faz parte da disciplina DCC078 — Aspectos Avançados em Engenharia de Software (UFJF/ICE). A ideia central é demonstrar como uma entidade observável (Acao) notifica observadores (Investidor) sobre mudanças de estado (preço).



## 📐 Diagrama de Classe## 📐 Diagrama de Classe



- `Acao` (Observable)- Acao (Observable)

- `Investidor` (Observer)- Investidor (Observer)



O `Acao` mantém o estado do preço e notifica os `Investidor` quando o preço é atualizado.O `Acao` mantém o estado do preço e notifica os `Investidor` quando o preço é atualizado.



## 🚀 Funcionalidades## 🚀 Funcionalidades



- Notificação de um ou vários investidores quando o preço de uma ação muda.- Notificação de um ou vários investidores quando o preço de uma ação muda.

- Registro (inscrição) de investidores interessados em ações específicas.- Capacidade de inscrever (`acompanhar`) ou remover observadores via API de `Observable`.

- Testes cobrindo notificações individuais, múltiplas, ausência de notificação e isolamento por ação.

## 🔧 Tecnologias

## 🔧 Tecnologias

- Java 11+

- Java 11+- JUnit 5

- JUnit 5- Maven

- Maven

## 📊 Exemplo de Uso

## 📊 Exemplo de Uso

Exemplo (trecho de código):

Exemplo mínimo de uso:

```java

```javaAcao acao = new Acao("PETR4", "Petrobras", 28.5);

Acao acao = new Acao("PETR4", "Petrobras", 28.5);Investidor investidor = new Investidor("Investidor 1");

Investidor investidor = new Investidor("Investidor 1");investidor.acompanhar(acao);

investidor.acompanhar(acao);acao.atualizarPreco(29.0);

acao.atualizarPreco(29.0);// investidor.getUltimaNotificacao() retorna a notificação

System.out.println(investidor.getUltimaNotificacao());```

```

## 🧪 Como Executar e Testes

Saída esperada:

Este projeto utiliza Maven. Para compilar e executar os testes:

```

Investidor 1, preço atualizado na Acao{ticker='PETR4', empresa='Petrobras', preco=29.0}```bash

```mvn -q test

```

## 🧪 Como Executar e Testes

Os testes cobrem os cenários esperados para o padrão Observer no domínio de ações (notificação única, múltiplos observadores, nenhum observador, isolamento por ação).

O projeto usa Maven. Para compilar e executar os testes a partir do diretório raiz do repositório:

## 👨‍💻 Autor

```bash

mvn testExercício para a disciplina DCC078 — UFJF/ICE.

```# Observer — Mercado de Ações (Observer Pattern)



Os testes estão localizados em `src/test/java/padroescomportamentais/observer/AcaoTest.java`.![UFJF Logo](https://www.ufjf.br/wp-content/uploads/2019/07/brasao_ufjf1.png)



## 👨‍💻 Autor## 📝 Sumário



Exercício para a disciplina DCC078 — UFJF/ICE.- Sobre

- Diagrama de Classe

---- Funcionalidades

- Tecnologias

PadroesComportamentais-Observer — implementação didática do Padrão Observador.- Exemplo de Uso

- Como Executar e Testes
- Autor

## 🧐 Sobre

Exemplo acadêmico para a disciplina DCC078 (Aspectos Avançados em Engenharia de Software) da UFJF/ICE. Este projeto demonstra o padrão de projeto Comportamental Observer aplicado ao domínio do mercado de ações. A classe `Acao` funciona como o Observable, notificando instâncias de `Investidor` (Observers) quando o preço é atualizado.

## 📐 Diagrama de Classe

Acao (Observable) <-- observa -- Investidor (Observer)

Diagrama simples: Acao contém atributos (ticker, empresa, preco) e notifica Investidores inscritos através dos métodos herdados de `java.util.Observable`.

## 🚀 Funcionalidades

- Notificação de um ou mais investidores quando o preço de uma ação muda.
- Registro de investidores interessados em ações específicas.
- Testes cobrindo notificações individuais, múltiplas, ausência de notificação e isolamento por ação.

## 🔧 Tecnologias

- Java 11
- JUnit 5
- Maven

## 📊 Exemplo de Uso

Exemplo mínimo de uso:

```java
Acao acao = new Acao("PETR4", "Petrobras", 28.5);
Investidor investidor = new Investidor("Investidor 1");
investidor.acompanhar(acao);
acao.atualizarPreco(29.0);
System.out.println(investidor.getUltimaNotificacao());
```

Saída esperada:

```
Investidor 1, preço atualizado na Acao{ticker='PETR4', empresa='Petrobras', preco=29.0}
```

## 🧪 Como Executar e Testes

O projeto usa Maven. Para compilar e executar os testes, execute:

```bash
mvn -f stock-market-observer/pom.xml clean test
```

Os testes estão localizados em `src/test/java/padroescomportamentais/observer/AcaoTest.java` e cobrem os cenários descritos nas funcionalidades.

## 👨‍💻 Autor

Projeto adaptado para fins acadêmicos — Disciplina DCC078 (UFJF/ICE).
# PadroesComportamentais-Observer
DCC078 - ASPECTOS AVANÇADOS EM ENGENHARIA DE SOFTWARE - Observer Pattern
