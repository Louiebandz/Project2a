import java.util.ArrayList;

public class Warehouse {
    private String WarehouseName;
    private ArrayList<BikePart> Inventory;

    public Warehouse(String name){
        this.WarehouseName = name;
    }
    public void addToInventory(BikePart part){
        Inventory.add(part);
    }
    public BikePart getPartFromInventory(int index){
        return Inventory.get(index);
    }
    public ArrayList<BikePart> getInventory(){
        return Inventory;
    }

}


