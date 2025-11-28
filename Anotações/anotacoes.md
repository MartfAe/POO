# Classe:
* Uma classe é um padrão estabelecido para a criação de objetos daquele determinado tipo. 
* A classe contém os atributos, ou seja os dados, e os métodos do objeto, as ações. 
    * Exemplo: nome e idade são **atributos**; já acelerar e apresentarProduto são **métodos**.
* Classes possuem um modificador de acesso e um nome.   
* Declarando uma classe:
    * **public class Dog{}**
* Além de métodos e atributos, uma classe pode conter um construtor, que é um método especial que possui o **mesmo nome da classe** que busca **inicializar** um objeto. 
* Basicamente uma classe define os atributos e métodos comuns que serão compartilhados com um objeto. 
* Uma classe pode não ser um objeto. 

# Objeto:
* Um objerto é criado a partir de uma classe, ou seja, um objeto é uma instância de uma classe. 
* Todo objeto variáveis de instância, é o seu estado, o que conhece sobre si mesmo,  e métodos, o que o objeto pode fazer.
* Cada objeto é único. 
* Todo objeto vai conter: atributos, métodos e estado

# Variáveis

# Métodos:
* **Métodos construtores:**
    * É um método especial utilizado na inicialização de objetos de uma classe no momento de sua criação; 
    * Possui o mesmo nome da **classe** e não possui tipo de retorno. 
    * É chamado automaticamente quando a palavra ***new*** é utilizada. 
    * Utilizados para definir valores iniciais dos atributos ou executar qualquer processamento necessário antes que um objeto possa ser utilizado. 
    * Existem alguns tipos de construtores, são eles: 
        * **Construtor padrão:** É quando nenhum construtor foi declarado na classe. Dessa forma, o Java fornece um construtor padrão sem nenhum parâmentro automaticamente. Dessa forma, ele **não inicializa** os atributos com valores específicos, mas garante a **criação de um objeto básico**.
        * **Construtor com parâmetro:** É um construtor que criamos para inicializar os atributos com valores específicos no momento em que estão sendo instanciados. Quando criamos um construtor com parâmetros, automaticamente **removemos o construtor padrão**. 
        * **Sobrecarga de construtores:** Uma classe p**ode ter vários construtores**, desde que tenham diferentes números ou diferentes parâmetros. Permite criar objetos de diferentes maneiras. 
    * Getters e Setters:
        * São sempre métodos públicos, utilizados para acessar e modificar atributos privados, protegendo os dados através do encapsulamento. 
            * **Métodos getter:** É o método de acesso, retorna o valor do atributo e por isso ele é declarado da seguinte forma:
            ```java
            public TipoRetorno getNomeAtributo() {
                // return atributo;
            }
            ```
            * **Método setter:**É o método de alteração, modificação, podendo definir ou atualizar o valor. 
                * Normalmente recebe um valor como parâmetro e o define para um atributo. Exemplo:
                ```java
                    public void setIdade(int idade){
                        this.Idade = idade;
                    }```

# Encapsulamento:
    * 