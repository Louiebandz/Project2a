import java.util.ArrayList;

public class Warehouse {
    private String WarehouseName;
    private ArrayList<BikePart> Contents;

    public Warehouse(String name){
        this.WarehouseName = name;
    }
    public void addToInventory(BikePart part){
        Contents.add(part);
    }
    public BikePart getPartFromInventory(int index){
        return Contents.get(index);
    }
    public ArrayList<BikePart> Inventory(){
        return Contents;
    }

}


