package example;

import java.util.ArrayList;
import java.util.Iterator;

class CartForSongs{
    ArrayList<Song> cart = new ArrayList<Song>();
    
    public double calculateTotalPrice() {
        double total = 0.0;
        
        Iterator<Song> ir = cart.iterator();
        
        while(ir.hasNext()){
            Song s = ir.next();
            total += s.getPrice();
        }
        
        
        return total;
    }
    
    public void add(Song s){
        cart.add(s);
    }
}

class Song {
    //private double price = 10.0; 
    private DiscountMode mode;
    private double price = 10.0;
    
    public void setDiscountMode(DiscountMode mode){
        this.mode = mode;
    }
    
    public double getPrice() {
        return price - (price * mode.getDiscountRate());
    }
    
}

abstract class DiscountMode {
    abstract public double getDiscountRate();    
}

class Onsale extends DiscountMode {
    @Override
    public double getDiscountRate(){
        return 0.1;
    }
}

class TodayEvent extends DiscountMode {
    @Override
    public double getDiscountRate(){
        return 0.3;
    }
}

class NonDiscount extends DiscountMode {
    @Override
    public double getDiscountRate(){
        return 0.0;
    }
}

public class DynamicClassificationEx01 {
    public static void main(String[] args) {
        Song s1 = new Song();
        s1.setDiscountMode(new Onsale());
        
        Song s2 = new Song();
        s2.setDiscountMode(new Onsale());
        
        Song s3 = new Song();
        s3.setDiscountMode(new Onsale());
        
        CartForSongs c = new CartForSongs();
        c.add(s1);
        c.add(s2);
        c.add(s3);
        
        System.out.println(c.calculateTotalPrice());
    }
}
