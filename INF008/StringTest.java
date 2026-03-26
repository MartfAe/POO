package INF008;

public class StringTest {
 
    String saldacao = "Hello world"; // String literal(criada diretamente)
    String name = new String("Ana Emília"); // String object(criada usando o construtor da classe String)

    public void test(){ //Imprime o valor das variáveis saldacao e name
        System.out.println(saldacao);
        System.out.println(name);   
    }

    public void transformar(){//Imprime o valor das variáveis saldacao e name em letras minúsculas e maiúsculas, respectivamente
        System.out.println(saldacao.toLowerCase());
        System.out.println(name.toUpperCase());
    }

    public static void main(String[] args) {
        StringTest stringTest = new StringTest(); //Cria uma instância da classe StringTest para acessar os métodos test() e transformar()
        stringTest.test(); //Chama o método test() para imprimir os valores das variáveis saldacao e name
        stringTest.transformar(); //Chama o método transformar() para imprimir os valores das variáveis saldacao e name em letras minúsculas e maiúsculas, respectivamente
    }

}
