package example;

class Person{
    private String name;
    private Role role;
    
    public Person(String name){
        this.name = name;
    }
    
    public void setRole(Role role){
        this.role = role;
    }
    
    public Role getRole(){
        return role;
    }
    
    public void doIt(){
        role.doIt();
    }
    
}

abstract class Role {
    abstract public void doIt();
}

class Driver extends Role{
    public void doIt(){
        System.out.println("차량을 운전합니다.");
    }
}

class Worker extends Role{
    public void doIt(){
        System.out.println("일을 합니다.");
    }
}

public class PeterCoadEx01 {
    public static void main(String[] args){
        Person p = new Person("이순신");
        
        p.setRole(new Driver()); //운전자 역할로 변경
        p.doIt(); 
        
        p.setRole(new Worker());
        p.doIt();
    }
}
