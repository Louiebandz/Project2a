import java.util.ArrayList;

public class Warehouse {
    private String WarehouseName;
    private ArrayList<BikePart> Contents;
    private String txtFileName;

    public Warehouse(String name){
        this.WarehouseName = name;
        this.Contents = new ArrayList<BikePart>();
    }
    public void addToInventory(BikePart part){
        Contents.add(part);
    }
    public BikePart getPartFromInventory(int index){
        return Contents.get(index);
    }
    public ArrayList<BikePart> Inventory(){
        return this.Contents;

    }
    public String getWarehouseName(){
        return this.WarehouseName;
    }

    public String getTxtFileName(){
        return this.txtFileName;
    }
    public void setTxtFileName(String filename){
        this.txtFileName = filename;
    }

}


