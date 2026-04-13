class InventoryItem{
    private int itemCode;
    private String description;
    private double unitPrice;
    private int quantityInStock;
    private int minimumStockLevel;


    public InventoryItem(int itemCode, String description, double unitPrice, int quantityInStock, int minimumStockLevel){
        this.itemCode = itemCode;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
        this.minimumStockLevel = minimumStockLevel;
    }

    public InventoryItem(int itemCode, String description, double unitPrice, int quantityInStock){
        this(itemCode, description, unitPrice, quantityInStock, 0);
    }

    public InventoryItem(int itemCode, String description, double unitPrice){
        this(itemCode, description, unitPrice, 0 , 0);
    }

//Getters e Setters
    public int getItemCode(){
        return this.itemCode;
    }

    public void setItemCode(int itemCode){
        if(itemCode<=0){
            System.out.println("ERRO: O código não pode ser negativo e nem zero");
            return;
        }
        this.itemCode = itemCode;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public double getUnitPrice(){
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        if(unitPrice<=0){
            System.out.println("ERRO: Preço unitário inválido");
            return;
        }
            this.unitPrice = unitPrice;
    }

    public int getQuantityInStock(){
        return this.quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock){
        if(quantityInStock <0){
            System.out.println("Erro: Quantidade inválida.");
            return;
        }
        this.quantityInStock = quantityInStock;
    }

    public int getMinimumStockLevel(){
        return this.minimumStockLevel;
    }

    public void setMinimumStockLevel(int minimumStockLevel){
        if(minimumStockLevel<=0){
            System.out.println("ERRO: Quant min inválida");
            return;
        }
        this.minimumStockLevel = minimumStockLevel;
    }


    public void applyDiscount(double percentage){
        if(percentage>0 && percentage<=100){
            this.unitPrice -= unitPrice*(percentage/100);
        }else{
            System.out.println("ERRO: Porcebtagem de desconto inválida");
        }
    }

    public void updateStock(int quantity){
        int newQuantity = getQuantityInStock()+ quantity;
        
        setQuantityInStock(newQuantity);
        isBelowMinimumStock();
    }

    public void updateStock(int quantity, String reason){
        updateStock(quantity);
        System.out.println("Movimentação: "+ reason + " | Alteração:" + quantity);
    }

    public void isBelowMinimumStock(){
        if(getQuantityInStock()<getMinimumStockLevel()){
            System.out.println("ATENÇÃO: Quantidade em estoque menor que a quantidade mínima.");
        }
    }
}

public class InventoryItemTest {
    public static void main(String[] args) {
        System.out.println("--- Teste 1: Criando item com construtor completo ---");
        InventoryItem item1 = new InventoryItem(101, "Notebook Gamer", 4500.0, 10, 3);
        System.out.println("Item: " + item1.getDescription() + " | Estoque: " + item1.getQuantityInStock());

        System.out.println("\n--- Teste 2: Aplicando Desconto ---");
        item1.applyDiscount(10); // 10% de 4500 = 450 de desconto
        System.out.println("Novo preço após 10% de desconto: R$ " + item1.getUnitPrice());

        System.out.println("\n--- Teste 3: Atualizando Estoque (Venda) ---");
        item1.updateStock(-8, "Venda realizada"); // Estoque vai para 2 (Abaixo do mínimo que é 3)
        // O método isBelowMinimumStock() que incluímos no updateStock deve avisar aqui!

        System.out.println("\n--- Teste 4: Testando Validações (Setters) ---");
        item1.setItemCode(-5); // Deve mostrar erro de código negativo
        item1.setUnitPrice(0); // Deve mostrar erro de preço inválido
        item1.setQuantityInStock(-50); // Deve mostrar erro de quantidade negativa

        System.out.println("\n--- Teste 5: Segundo Construtor (Padrão) ---");
        // Usando o construtor que não pede o nível mínimo (ele define como 0)
        InventoryItem item2 = new InventoryItem(202, "Mouse Sem Fio", 120.0, 50);
        System.out.println("Item: " + item2.getDescription() + " | Mínimo: " + item2.getMinimumStockLevel());

        System.out.println("\n--- Teste 6: Terceiro Construtor (Apenas Essencial) ---");
        InventoryItem item3 = new InventoryItem(303, "Teclado Mecânico", 250.0);
        System.out.println("Item: " + item3.getDescription() + " | Estoque Inicial: " + item3.getQuantityInStock());
    }
}