public class Dog{
    //Variáveis de instância, o que um cachorro tem, nome,tamanho, idade e raça.
    int size;
    int age;
    String name;
    String breed;

    void bark(){ // Isso é um método, é o que o cachorro pode fazer.
        System.out.println("Au au!");
    }

    class dogTest{
        public static void main(String[] args) {
            Dog d = new Dog(); //Crio um objeto da classe dog, exemplo, posso criar Scooby pois ele tem todas as informações de cima. 
            d.age = 8;
            d.size = 40;// Usando o ponto, consigo acessar as inforamções da classe Dog para configurar no meu novo objeto. 
            d.bark();// Posso também chamar para execução de um método. 
        }
    }
}