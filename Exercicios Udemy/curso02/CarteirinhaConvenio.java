public class CarteirinhaConvenio {
    public static void main(String[] args){
        int codigoSaida = 9;

        for(int codigoCarteirinha = 1; codigoCarteirinha<=10; codigoCarteirinha++){
            if(codigoCarteirinha == codigoSaida){
                System.out.println("Código de saida encontrado, loop sendo interrompido");
                break;
            }
            if(codigoCarteirinha == 3 || codigoCarteirinha == 8 || codigoCarteirinha == 5){
                System.out.println("O código " + codigoCarteirinha +" é aceito no hospital.");
                continue;
            }
            System.out.println("O código " + codigoCarteirinha + " não é aceito no hospital.");
        }
    }
}
