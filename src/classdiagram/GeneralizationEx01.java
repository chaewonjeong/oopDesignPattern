package classdiagram;

import java.util.ArrayList;

abstract class HomeAppliancies{
    private int serialNo;
    private String manufacturer;
    private int year;
    
    public HomeAppliancies(int serialNo, String manufacturer, int year) {
        this.serialNo = serialNo;
        this.manufacturer = manufacturer;
        this.year = year;
    }
    
    abstract public void turnOn();
    abstract public void turnOff();
}

class Washer extends HomeAppliancies {
    
    public Washer(int serialNo, String manufacturer, int year){
        super(serialNo, manufacturer, year);
    }
    
    @Override
    public void turnOn(){
        System.out.println("세탁기의 전원을 킵니다.");
    }
    
    @Override
    public void turnOff(){
        System.out.println("세탁기의 전원을 끕니다.");
    }
}

class Freezer extends HomeAppliancies {
    
    public Freezer(int serialNo, String manufacturer, int year){
        super(serialNo, manufacturer, year);
    }
    
    @Override
    public void turnOn(){
        System.out.println("냉장고의 전원을 킵니다.");
    }
    
    @Override
    public void turnOff(){
        System.out.println("냉장고의 전원을 끕니다.");
    }
}

class DishWasher extends HomeAppliancies {
    
    public DishWasher(int serialNo, String manufacturer, int year){
        super(serialNo, manufacturer, year);
    }
    
    @Override
    public void turnOn(){
        System.out.println("식기세척기의 전원을 킵니다.");
    }
    
    @Override
    public void turnOff(){
        System.out.println("식기세척기의 전원을 끕니다.");
    }
}

public class GeneralizationEx01 {
    public static void main(String[] args){
        HomeAppliancies freezer = new Freezer(100, "삼성", 2021);
        HomeAppliancies washer = new Washer(200, "LG", 2021);
        HomeAppliancies dishWasher = new DishWasher(300, "애플", 2021);
        
        ArrayList<HomeAppliancies> haList = new ArrayList<HomeAppliancies>();
        haList.add(freezer);
        haList.add(washer);
        haList.add(dishWasher);
        
        for(HomeAppliancies ha : haList){
            ha.turnOn();
        }
        
    }
}
