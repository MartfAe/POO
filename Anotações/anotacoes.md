# Classe:
* Uma classe é um padrão estabelecido para a criação de objetos daquele determinado tipo. 
* A classe contém os atributos, ou seja os dados, e os métodos do objeto, as ações. 
    * Exemplo: nome e idade são **atributos**; já acelerar e apresentarProduto são **métodos**.
* Classes possuem um modificador de acesso e um nome.   
* Declarando uma classe:
    ```java
    public class Dog{
        //Atributos (caractéristicas)
        int size;
        String name;
        String breed;
        boolean sit;

        //Métodos (o que ele faz);
        public void bark(){
            System.out.println("Au AU")!
    }
        public void sitNow(){
            this.sit = true;

        }

    }
    ```
* Além de métodos e atributos, uma classe pode conter um construtor, que é um método especial que possui o **mesmo nome da classe** que busca **inicializar** um objeto. 
* Basicamente uma classe define os atributos e métodos comuns que serão compartilhados com um objeto. 
* Uma classe pode não ser um objeto. 

# Objeto:
* Um objerto é criado a partir de uma classe, ou seja, um objeto é uma instância de uma classe. 
* Todo objeto contém variáveis de instância, é o seu estado, o que conhece sobre si mesmo,  e métodos, o que o objeto pode fazer.
* Cada objeto é único. 
* Todo objeto vai conter: atributos, métodos e estado.
```java
    public class DogTest{
        public static void main(String [] args){
            Dog p1 = new Dog();
            p1.name = "Scooby";
            p1.size = 30;
            p1.bark();

        }
    }
```

# Variáveis
* São contêineres para armazenar dados na memória do computador. 
* Antes de serem utilizadas é necessário declará-la com um tipo de dado específico. 
* Podem ser do tipo:
    * **Int:** são variáveis do tipo inteiro, ou seja, só recebem dados do tipo inteiro. 
    * **Char:** Variáveis que recebem apenas um caractere. 
    * **Float:** Recebem dados numéricos do tipo **Real**, ou seja, aceitam números com casas decimais e sua precisão é menor que o double. 
    * **Double:** Basicamente a mesma coisa que o ***float***, a diferença está na precisão. 
    * **String:** São variáveis que armazem texto, ao contrário do tipo ***char***, esse tipo de dado armazena mais de um caractere. 
    * **Boolean:** Variáveis do tipo lógica, retornam *true* ou *false*.
    * **OBSERVAÇÃO: Quando estamos utilizando números reais, lembrar que em vez da vírgula que normalmente utilizamos, devemos utilizar um ponto.**
    ```java
    public class DeclarandoVariável{
        int v1 = 5;
        char sexo = 'F';
        float media = 2.5f;
        double media2 = 25.68; 
        String nome = "Jubileu";
        Boolean isWorking = true;
    }
    ```
* Além de se ter que declarar a variável com um determinado tipo, existem algumas regras de nomenclatura. São elas:
    * Pode conter letras, números, sublinhados e cifrões, **após o primeiro caractere que deve ser uma letra**.
    * Java diferencia maiúsculas e minúsculas(ex: nome é diferente de Nome).
    * **Não é permitido** usar palavras reservadas do java, como *class* ou *int*, como nome de variável. 

* Existem também algumas convenções de nomenclatura: 
    * **Camel Case:** Para nomes compostos, a primeira palavra começa com minúscla e as demais começam com maiúscula (ex: **m**inha**I**dade).
    * **Constantes:** São declaradas com a palavra chave *final* e *static*. O nome deve ser todo em maiúsculas. 
    
# Métodos:
* **Métodos construtores:**
    * É um método especial utilizado na inicialização de objetos de uma classe no momento de sua criação; 
    * Possui o mesmo nome da **classe** e não possui tipo de retorno. 
    * É chamado automaticamente quando a palavra ***new*** é utilizada. 
    * Utilizados para definir valores iniciais dos atributos ou executar qualquer processamento necessário antes que um objeto possa ser utilizado. 
    * Existem alguns tipos de construtores, são eles: 
        * **Construtor padrão:** É quando nenhum construtor foi declarado na classe. Dessa forma, o Java fornece um construtor padrão sem nenhum parâmentro automaticamente. Dessa forma, ele **não inicializa** os atributos com valores específicos, mas garante a **criação de um objeto básico**.
        * **Construtor com parâmetro:** É um construtor que criamos para inicializar os atributos com valores específicos no momento em que estão sendo instanciados. Quando criamos um construtor com parâmetros, automaticamente **removemos o construtor padrão**. 
        * **Sobrecarga de construtores:** Uma classe **pode ter vários construtores**, desde que tenham diferentes números ou diferentes parâmetros. Permite criar objetos de diferentes maneiras. 
    * Getters e Setters:
        * São sempre métodos públicos, utilizados para acessar e modificar atributos privados, protegendo os dados através do encapsulamento. 
            * **Métodos getter:** É o método de acesso, retorna o valor do atributo e por isso ele é declarado da seguinte forma:
            ```java
            public TipoRetorno getNomeAtributo() {
                // return atributo;
            }
            ```
            * **Método setter:** É o método de alteração, modificação, podendo definir ou atualizar o valor. 
                * Normalmente recebe um valor como parâmetro e o define para um atributo. Exemplo:
                
                ```java
                    public void setIdade(int idade){
                        this.Idade = idade;
                    }
                    ```

        * Métodos abstratos:


# Encapsulamento:
* Ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior. 
* O encapsulamento ele agrupa os dados (atributos) e métodos que operam sobre esses dados dentro de uma única classe, **restringindo** o acesso direto a esses atributos.
* Ao manter os atributos privados, você obriga o uso de getters e setters.
* Um bom objeto encapsulado irá possuir uma interface. 
* Encapsular **não é obrigatório**, mas é uma boa prática para produzir **classes** mais eficientes. 
* Vantagens do encapsulamento: 
    * **Segurança:** Protege os dados internos da classe contra manipulação indevida ou acidental por outras partes do código, garantido a consistencia dos dados. 
    * **Flexibilidade:** Permite que os detalhes da implementação de uma classe sejam alterados sem afetar outras classes que a utilizam, **desde que os getters e setters permaneçam os mesmos**.
    * **Manutenção e organização:** Torna o código mais limpo e fácil de entender, pois os detalhes das implementações se encontram dentro da classe e a interação com a classe é feita por meio dos *getters e setters*. 
    * **Reutilização do código:** A abordagem modular e bem definida facilita a reutilização de classes em diferentes partes de uma aplicação. 

## Interface: 
* É uma lista de serviços fornecidos por um  componente. É o contato com o mundo exterior, que define o que pode ser feito com um objeto dessa classe. 

# Herança:
* A herança permite então que uma nova classe seja baseada na definição de outra classe previamente existente. 
* A herança será aplicada tanto para as características quanto para os comportamentos, ou seja, tanto para os atributos quanto para os métodos.
* Uma classe "mãe" é também chamada de **superclasse** ou **progenitora**.
* Já classes filhas, podem ser chamadas de **subclasse**. 
* Para dizer que uma classe filha está herdando características e métodos de uma classe mãe, utilizamos a palavra ***extends*** logo após a definição da classe. Exemplo:
```java
public class Pessoa(){ //Classe mãe
    private String name;
    private int age;
    private char sex;
}

public class Aluno extends Pessoa(){
    //Bloco de código
}
```
* Caso tenha sido definido um **construtor** na classe mãe, ele será exigido na classe filha, é possível personalizar com os atributos exclusivos da classe filha. Para isso, definimos o construtor com o cabeçalho definido na classe mãe e os atributos exclusivos da filha e dentro dele, a primeir linha deverá ser **super(atributos classe mãe)**. Exemplo:
```java
public class Pessoa(){ //Classe mãe
    private String name;
    private int age;
    private char sex;
    
    public Pessoa(String name, int age, char sex){
        this.name = name;
        this.age = age; 
        this.sex = sex;
    }
}

public class Aluno extends Pessoa(){
    private String curso;
    private int matricula;

    public Aluno(String name, int age, char sex, String curso, int matricula){ // Cabeçalho igual ao da classe mãe junto com os atributos exclusivos da filha.

    super(name, age, sex);
    this.curso = curso;
    this.matricula = matricula;
    }
}
```
* Nesse caso do uso de construtores, é possível gerar outros construtores normalmente utilizando o ***this*** como é feito.
* Quando queremos invocar um construtor da classe mãe que não seja o padrão, ou seja, o construtor vazio, utilizamos a palavra ***super*** na primeira linha dentro do construtor da classe filha. 
* Uma subclasse também pode ser uma superclasse, vai depender do ponto de vista. 
* Toda subclasse vai herdar **todos** os conteúdos das ancestrais. 
* Uma classe que não é subclasse de nenhuma outra, ou seja, que não tem mãe, essa classe passa a ser considerada como **raiz da árvore hierárquica**. 
* Subclasse que não tem filha, é chamada de **folha**.
* **Ancestral** é como nos referimos ao "antecessor" de uma classe, sem contar sua mãe, é como se o ancestral fosse os "avós".
* **Descendente** é como nos referimos ao "sucessor" da classe filha, exemplo, a classe Aluno vista acima, é descente da classe Pessoa. 

    ## Tipos de Herança:
    * **Herança de implementação:** É responsável por implementar uma classe abstrata, podendo também adicionar atributos e métodos próprios.
        * **Herança pobre:** Um tipo de herança onde uma classe filha herda **todos** os atributos e métodos da classe pai, mas **não adiciona nenhuma funcionalidade própria**. 
    * **Herança para diferença:** É a herança em que uma subclasse herda tudo de uma classe já existente e, além disso, **adiciona novos atributos e métodos ou modifica o comportamento dos métodos herdados**. 

* **Classe Abstrata**: Não pode ser instanciada, só pode servir como progenitora. Ou seja, ela não poderá gerar objetos.

* **Método Abstrato:** É um método declarado, mas não implementado na progenitora. Só pode ser colocado em uma interface ou em uma classe abstrata.

* **Classe Final:** Não pode ser herdada por outra classe. É obrigatoriamente **folha**, ou seja, ela não pode ter filho.

* **Método final:** É um método que não pode ser sobrescrito pelas suas sub-classes. Precisa ser obrigatoriamente herdado. 
* Ou seja, é um método que não pode ter a palavra **@Override** antes da sua declaração.
    * Para definir que um método é **final**, colocamos após o modificador de visibilidade a palavra ***final***.
    ```java
    public final void pagarMensalidade(){
    }
    ```

# @Override:
* Nos permite reescrever um método, ou seja, podemos reescrever nas classes filhas métodos criados inicialmente na classe pai. 
* Métodos que serão sobrepostos (reescritos), devem possuir o mesmo nome, tipo de retorno e quantidade de parâmetros do método inicial. Porém, será implementado com especificações da classe atual, podendo adicionar um algo a mais ou não.

# Polimorfismo:
* O significado da palavra é *muitas formas*, ou seja, quer dizer que um mesmo método possui comportamentos diferentes.
* Permite que um mesmo nome represente vários comportamentos diferentes.  
    **Assinatura do método**
    * Consiste na quantidade e tipos dos **parâmetros**. 
    * Exemplo:
    ```java
    public float calcMedia(float n1, float n2){} 

    public int calcMedia(float v1, float v2){} // Esse método é igual ao primeiro, mesma quantidade de parâmetros e tipo. 
    
    public float calcMedia(int bim, float n1, float n2){}// Esse método não é igual aos anteriores pois tem um parâmetro a mais e de tipo diferente. 
    ```
    ### Tipos de Polimorfismo:
    * **Sobreposição:** Acontece quando **substituímos** um método de uma superclasse na sua subclasse, usando a **mesma assinatura.** Utilizamos a anotação **@Override** antes do método para indicar a sobreescrita.  
        * É necessário que os métodos tenham a mesma assinatura e estejam em classes diferentes. 


    * **Sobrecarga:** Ocorre quando temos assinaturas diferentes em uma mesma classe. 