public class TestAppConfig {
    public static void main(String[] args) {
        
        System.out.println("--- Teste 1: Construtor Padrão (Sem parâmetros) ---");
        // Deve acionar o encadeamento: Vazio -> 2 Params -> 5 Params
        AppConfig config1 = new AppConfig();
        config1.validateConfig();

        System.out.println("\n--- Teste 2: Construtor com 2 Parâmetros ---");
        // Deve acionar o encadeamento: 2 Params -> 5 Params
        AppConfig config2 = new AppConfig("MinhaApp", "2.1.5");
        config2.validateConfig();

        System.out.println("\n--- Teste 3: Construtor Completo ---");
        // Atribuição direta
        AppConfig config3 = new AppConfig("ServidorProducao", "v3", 500, 10, true);
        config3.validateConfig();

        System.out.println("\n--- Teste 4: Sobrecarga de updateSettings (Inteiros) ---");
        // Testa a atualização de conexões e timeout
        config1.updateSettings(100, 60);
        config1.validateConfig();

        System.out.println("\n--- Teste 5: Sobrecarga de updateSettings (Booleano) ---");
        // Testa a mudança do modo debug
        config1.updateSettings(true);
        System.out.println("Modo debug alterado com sucesso.");

        System.out.println("\n--- Teste 6: Validação de Configuração Inválida ---");
        // Forçando um estado inválido para testar o else do validateConfig
        config2.updateSettings(-1, 30);
        config2.validateConfig();
        
        System.out.println("\n--- Teste Finalizado ---");
    }
}