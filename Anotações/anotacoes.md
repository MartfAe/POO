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

        * Métodos abstratos:


# Encapsulamento:
* Ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior. 
* O encapsulamento ele agrupa os dados (atributos) e métodos que operam sobre esses dados dentro de uma única classe, **restringindo** o acesso direto a esses atributos.
* Ao manter os atributos privados, você obriga o uso de getters e setters.
* Um bom objeto encapsulado irá possuir uma interface. 
* Encapsular **não é obrigatório**, mas é uma boa prática para produzir Classes mais eficientes. 
* Vantagens do encapsulamento: 
    * **Segurança:** Protege os dados internos da classe contra manipulação indevida ou acidental por outras partes do código, garantido a consistencia dos dados. 
    * **Flexibilidade:** Permite que os detalhes da implementação de uma classe sejam alterados sem afetar outras classes que a utilizam, **desde que os getters e setters permaneçam os mesmos**.
    * **Manutenção e organização:** Torna o código mais limpo e fácil de entender, pois os detalhes das implementações se encontram dentro da classe e a interação com a classe é feita por meio dos *getters e setters*. 
    * **Reutilização do código:** A abordagem modular e bem definida facilita a reutilização de classes em diferentes partes de uma aplicação. 

## Interface: 
* É uma lista de serviços fornecidos por um  componente. É o contato com o mundo exteriro, que define o que pode ser feito com um objeto dessa classe. 