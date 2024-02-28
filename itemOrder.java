public class itemOrder{
    int quantity;
    Item item;
    public itemOrder(Item i, int quantity){
        this.item = i;
        this.quantity = quantity;
    }

    public String getItem(){
        return item.getName();
    }
    public int getPrice(){ return item.getPrice();}
    public int getQuantity(){
        return quantity;
    }
    public String purchase(Item i, int quantity){
        if(quantity > 2){
            return i.getName() + " " + (i.getPrice() * quantity-1);
        }else {
            return i.getName() + " " + i.getPrice() * quantity;
        }
    }


}
