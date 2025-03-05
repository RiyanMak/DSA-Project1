import java.util.List;

class MyItem implements IDedObject{
    private int itemID;  //intialize all the variables and the list
    private int itemPrice; 
    private List<Integer> itemDescription;

    public MyItem(int itemID, int itemPrice, List<Integer> itemDescription){  //default constructor
        this.itemID = itemID;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
    }

    @Override
    public int getID(){ //gettter function to get ID value from user
        return itemID;
    }
    public void setID(int itemID){
        this.itemID = itemID;
    }
    
    @Override
    public String printID() {
        StringBuilder sb = new StringBuilder();
        sb.append(itemID).append(" ").append(itemPrice);
        for (Integer desc : itemDescription) {
            sb.append(" ").append(desc);
        }
        return sb.toString();
    }

    public int getItemPrice(){
        return itemPrice;
    }
    public void setItemPrice(int itemPrice){
        if(itemPrice > 0){
            this.itemPrice = itemPrice; 
        }else{
            System.out.println("Item Price cannot be negative: ");
        }

    }

    public List<Integer> getItemDescription(){
        return itemDescription;
    }
    public void setItemDescription(List<Integer> itemDescription){
        this.itemDescription = itemDescription;
    }
}