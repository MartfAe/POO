public class InventoryItem {

    private int quantityInStock;
    private int minimumStockLevel;
    private String description;
    private String itemCode;
    private double unitPrice;


    public InventoryItem(String itemCode, String description, double unitPrice, int quantityInStock, int minimumStockLevel){
        this.itemCode = itemCode;
        this.description = description;
        this.setUnitPrice(unitPrice);
        this.setQuantityInStock(quantityInStock);
        this.minimumStockLevel = minimumStockLevel;
    }

    public InventoryItem(String itemCode, String description, double unitPrice){
        this(itemCode, description, unitPrice, 0,5);
    }

    public InventoryItem(){
        this("0000", "DEFAULT-DESCRIPTION", 0.0);
    }


    //Getters e Setters
    public String getItemCode(){
        return itemCode;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getMinimumStockLevel(){
        return minimumStockLevel;
    }
    public void setMinimumStockLevel(int minimumStockLevel){
        if(minimumStockLevel<0){
            System.out.println("Invalid Value");
        }
        this.minimumStockLevel = minimumStockLevel;
    }

    public int getQuantityInStock(){
        return quantityInStock;
    }
    public void setQuantityInStock(int quantityInStock){
        if(quantityInStock<0){
            System.out.println("Quantidade inválida.");
        }
        this.quantityInStock = quantityInStock;
    }


    public double getUnitPrice(){
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        if(unitPrice <0){
            System.out.println("Invalid value!");
        }
        this.unitPrice = unitPrice;
    }


}
