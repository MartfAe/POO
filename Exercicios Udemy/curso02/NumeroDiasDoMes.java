public class NumeroDiasDoMes {
    public static void main(String[] args) {
        int mes = 10;
        String dias;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> dias = "31 dias";
            case 4, 6, 9, 11 -> dias = "30 dias";
            case 2 -> dias = "28 ou 29 dias";
            default -> dias = "Mês inválido";
        }
        System.out.println(dias);
    }

}
