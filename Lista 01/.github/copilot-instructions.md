# Copilot Instructions for AI Coding Agents

## Visão Geral do Projeto
Este projeto é uma aplicação Java para gerenciamento de contatos, localizada em `Lista 01/gerenciamentodecontato/`. Os principais componentes são:
- `Contact.java`: Define o modelo de contato, incluindo nome, telefone e email, com construtores, getters/setters e métodos de atualização/exibição.
- `AddressBook.java`: (não fornecido, mas presumido como responsável por gerenciar múltiplos contatos).

## Padrões e Convenções Específicas
- **Construtores**: O padrão é fornecer dois construtores para `Contact`: um com nome/telefone e outro com nome/telefone/email. O email padrão é "Não informado" se não especificado.
- **Atualização de Dados**: O método `UpdateContact` atualiza telefone e email, exibindo mensagem de sucesso no console.
- **Exibição**: O método `displayInfo` retorna uma string formatada com os dados do contato.
- **Getters/Setters**: Todos os campos possuem getters. Os setters de telefone/email não recebem parâmetros (devem ser ajustados para receber o valor correto).

## Fluxos de Trabalho
- **Compilação**: Para compilar, use:
  ```powershell
  javac *.java
  ```
  Execute este comando dentro do diretório `gerenciamentodecontato`.
- **Execução**: O arquivo principal (provavelmente `AddressBook.java`) deve conter o método `main`. Execute com:
  ```powershell
  java AddressBook
  ```
- **Estrutura de Pacotes**: O pacote é definido como `gerenciamentodecontato`. Certifique-se de que o diretório corresponda ao nome do pacote.

## Convenções de Código
- **Mensagens**: Mensagens de atualização são impressas no console em português.
- **Nomes de Métodos**: Métodos seguem o padrão camelCase, exceto `UpdateContact` (deve ser padronizado para `updateContact`).
- **Campos Privados**: Todos os atributos de `Contact` são privados, acessados via métodos públicos.

## Pontos de Atenção
- **Setters**: Os métodos `setPhone` e `setEmail` não recebem parâmetros, mas deveriam. Corrija para aceitar o novo valor.
- **Validação**: Não há validação de dados nos métodos; adicione se necessário.
- **Extensibilidade**: Para adicionar novos campos ao contato, siga o padrão de encapsulamento e métodos de acesso.

## Exemplos
```java
Contact contato = new Contact("João", "123456789");
contato.updateContact("987654321", "joao@email.com");
System.out.println(contato.displayInfo());
```

## Arquivos-Chave
- `Contact.java`: Modelo de dados e lógica de contato.
- `AddressBook.java`: Gerenciamento de múltiplos contatos (presumido).

---

**Feedback:**
Seções sobre fluxos de trabalho, padrões ou integração estão incompletas ou imprecisas? Informe para ajustes e melhorias.