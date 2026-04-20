
---

# ☕ Minhas Anotações de POO - Java

## 📑 Sumário
1. [Classe](#classe)
2. [Objeto](#objeto)
3. [Atributos](#atributos)
4. [Métodos e Construtores](#métodos-e-construtores)
5. [Pacotes e Maven](#pacotes-e-maven)
6. [Visibilidade e Pacotes](#visibilidade-e-pacotes)
7. [Encapsulamento](#encapsulamento)
8. [Relacionamentos entre Classes](#relacionamentos-entre-classes)
9. [Herança](#herança)
10. [Polimorfismo](#polimorfismo)

---

## Classe
* Uma classe é um padrão estabelecido para a criação de objetos daquele determinado tipo. 
* Contém os **atributos** (dados) e os **métodos** (ações) do objeto.
    * *Exemplo:* nome e idade são atributos; acelerar e apresentarProduto são métodos.
* Classes possuem um modificador de acesso e um nome.
* **Atributos Estáticos (static):** Pertencem à classe, não a objetos individuais. Compartilham uma única cópia na memória. Acessados por: `NomeDaClasse.atributo`.



```java
public class Dog {
    // Atributos
    int size;
    String name;
    String breed;
    boolean sit;

    // Métodos
    public void bark() {
        System.out.println("Au Au!");
    }

    public void sitNow() {
        this.sit = true;
    }
}
```

---

## Objeto
* Um objeto é uma instância de uma classe (criado com a palavra-chave `new`).
* Contém variáveis de instância (seu estado) e métodos (o que pode fazer).
* Cada objeto é único e contém: atributos, métodos e estado.

```java
Dog p1 = new Dog(); // Instanciando um objeto
p1.name = "Scooby";
```

---

## Atributos
* Variáveis associadas a uma classe que armazenam características.
* **Tipos de Dados:**
    * `int`: Inteiros.
    * `float`: Reais (precisão simples). Ex: `1.60f`.
    * `double`: Reais (alta precisão).
    * `String`: Texto.
    * `boolean`: `true` ou `false`.

> **Nota:** Use sempre ponto (`.`) para decimais em Java.
> **OBS:** Use sempre (`f`) em float após o número.

---

## Métodos e Construtores
### Construtores
* Método especial com o **mesmo nome da classe**.
* Serve para **inicializar** o objeto.
* **Sobrecarga:** Ter vários construtores com diferentes parâmetros.

### Getters e Setters
* **Getter:** Retorna o valor do atributo.
* **Setter:** Modifica o valor do atributo (usa-se `this` para referenciar o atributo da classe).

### 💡 Detalhes Importantes sobre Métodos

* **Palavra-chave `this`**: Utilizada para referenciar o próprio objeto. É essencial dentro de construtores e setters para distinguir o atributo da classe de um parâmetro com o mesmo nome.
    * *Exemplo:* `this.nome = nome;`
* **Retorno de Valores**:
    * **`void`**: Indica que o método não retorna nada.
    * **Tipos de Retorno**: Se o método não for `void`, ele deve obrigatoriamente usar a palavra-chave `return` seguida de um valor compatível com o tipo declarado.
* **Assinatura do Método**: É o que identifica o método unicamente dentro da classe (Nome + Lista de Parâmetros). O tipo de retorno **não** faz parte da assinatura.
* **Sobrecarga de Métodos (Overload)**:
    * Ocorre quando temos métodos com o mesmo nome na mesma classe, mas com assinaturas diferentes.
    * Exemplo: somar(int a, int b) e somar(int a, int b, int c).
    ```java
    public class Calculadora {
    // Método original
    public int somar(int a, int b) {
        return a + b;
        }

    // Sobrecarga: muda a QUANTIDADE de parâmetros
    public int somar(int a, int b, int c) {
        return a + b + c;
        }

    // Sobrecarga: muda o TIPO de parâmetros
    public double somar(double a, double b) {
        return a + b;
        }
    }
    ```
---
## Pacotes e Maven <a name="pacotes-e-maven"></a>
### 📦 Pacotes (Packages)
#### Características e funções principais:
* **O que fazem**: Agrupam classes relacionadas e organizam a estrutura de pastas.

* **Controle de acesso**: Permitem restringir a visibilidade de classes e métodos (nível de pacote).
* **Evitar Conflitos**: Permitem que classes com o mesmo nome existam no mesmo projeto, **desde que em pacotes distintos**. 
* **Estrutura de pastas**: O nome do pacote reflete a estrutura de diretórios no sistema operacional(ex: `package com.exemplo.projeto -> com/exemplo/projeto`).

#### Tipos de pacotes:
* **Pacotes integrados (built-in packages)**: Parte da API JAVA: 
    * *java.lang*: Importado automaticamente, contém classes fundamentais (String, Math, System).
    * *java.util*: Classes utilitárias, coleções(Collections API), data e hora. 
    * *java.io*: Entrada e saída de dados. 
* **Pacotes definidos pelo usuário**: Criados pelos desenvolvedores para organizar o próprio código. 


### 🛠️ Maven
* **Função**: Gerenciador de dependências e automação de build.

* **pom.xml**: Arquivo de configuração onde se declaram as bibliotecas e a versão do projeto.

* **Padrão**: Define uma estrutura de pastas universal (ex: src/main/java).
    

---

## Visibilidade e Pacotes
* **Pacotes (packages):** Agrupamento de classes relacionadas.
* **Níveis de Acesso:**
    1. `public`: Acesso total de qualquer lugar.
    2. `private`: Acesso apenas dentro da própria classe.
    3. `protected`: Acesso pela classe e suas subclasses.
    4. `default`: (sem modificador) Acesso apenas dentro do mesmo pacote.

---

## Encapsulamento
* Oculta detalhes da implementação e protege os dados.
* **Interface:** Lista de serviços fornecidos por um componente (o "contrato" da classe).



---

## Relacionamentos entre Classes
* **Agregação:** O objeto "parte" pode existir sem o "todo".
* **Composição:** O objeto "parte" é destruído se o "todo" for destruído (uso exclusivo).

---

## Herança
Permite que uma classe (subclasse) herde características de outra (superclasse) via `extends`.

* **super()**: Chama o construtor da classe pai (deve ser a primeira linha).
* **Classe Abstrata:** Não pode ser instanciada (`new`), serve apenas como modelo.
* **Método Abstrato:** Declarado na mãe, mas a implementação é obrigatória na filha.
* **Classe Final:** Não pode ter filhas (classe folha).

---

## Polimorfismo
Significa "muitas formas". Um mesmo nome de método pode ter comportamentos diferentes.

### Assinatura do Método
* É composta pela **quantidade** e pelos **tipos** de parâmetros.

### Tipos de Polimorfismo
1. **Sobreposição (@Override):** Substitui um método da superclasse na subclasse com a **mesma assinatura**.
2. **Sobrecarga:** A sobrecarga ocorre **quando temos dois ou mais métodos com o mesmo nome dentro da mesma classe, mas que possuem assinaturas diferentes**. Isso permite que um método execute tarefas semelhantes com diferentes tipos ou quantidades de dados de entrada.




---
