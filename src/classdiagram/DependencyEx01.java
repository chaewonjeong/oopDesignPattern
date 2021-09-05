package classdiagram;    

//일반적으로 한 클래스가 다른 클래스를 사용하는 경우는 다음과 같이 3가지이다.
/*
1. 클래스의 속성에서 참조할 때
2. 연산의 인자로 사용될 때
3. 메서드 내부의 지역 객체로 참조될 때
*/

// 아래의 Car와 Person은 연관관계이다.
class Person {
    private String name;
    private Car owns; //이 속성으로 연관 관계가 만들어진다.
    
    public Person(String name) {
        this.name = name;
    }
    
    public void setCar(Car car){
        owns = car;
    }
}

class Car {
    private String name;
    
    public Car(String name){
        this.name = name;
    }
    
    public void fillGas(GasPump p, int oil){
        p.getGas(oil);
    }
}
//연관 관계는 오랜 시간 동안 같이할 객체와의 관계며 의존 관계는 짧은 시간 동안 이용 하는 관계이다


//자동차와 주유기(GasPump클래스)의 관계는 어떨까?
//자동차가 주유를 항상 같은 주유기에서 하지는 않는다. 이런 경우 주유서비스를 받을 때마다
//이용하는 주유기가 매번 달라지는 것을 의미하며 객체 지향 프로그램에서는 사용되는 주유기를 인자나 지역 객체로 생성해 구현할 것이다. <- 의존관계

class GasPump {
    private int capacity;
    
    public GasPump(int capacity){
        this.capacity = capacity;
    }
    
    public void getGas(int amount){
        capacity -= amount;
        System.out.println(amount + "L가 주유됩니다.");
    }
    
    public void getCapacity(){
        System.out.println("남은 기름량은 " + capacity + "L 입니다.");
    }
}



public class DependencyEx01 {
    public static void main(String[] args){
        Person kim = new Person("이순신");
        Car car = new Car("제네시스");
        GasPump p1 = new GasPump(100);
        GasPump p2 = new GasPump(80);
        kim.setCar(car);
        
        car.fillGas(p1,10);
        p1.getCapacity();
    }
}
