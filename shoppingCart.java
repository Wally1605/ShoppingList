import java.util.ArrayList;

public class shoppingCart {
    ArrayList<itemOrder> list;

    public shoppingCart(){
        this.list = new ArrayList<itemOrder>();
    }
    public void addToCart(itemOrder i){
        list.add(i);
    }
    public void removeFromCart(itemOrder i){
        list.remove(i);
    }
    public String search(int n){
        return list.get(n).getItem();
    }

    public int cartTotal(){
        int total = 0;
        for(int i = 0; i < list.size();i++){
            if(list.get(i).getQuantity() > 3){
                total += (list.get(i).getPrice() * list.get(i).getQuantity())-2;
            }else {
                total += list.get(i).getPrice() * list.get(i).getQuantity();
            }
        }
        return total;
    }
    public void cart(){
        for(int i =0; i <list.size();i++){
            System.out.print(list.get(i).getItem()+":"+list.get(i).getQuantity()+" ");
        }
    }
}
