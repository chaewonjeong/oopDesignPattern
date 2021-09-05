// package classdiagram;
// //집약(Aggregation)관계 : 한 객체가 다른 객체를 포함하는 것, 전체 객체와 부분 객체의 생명 주기가 다르다.

// class Computer{
//     private MainBoard mb;
//     private CPU c;
//     private Memory m;
//     private PowerSupply ps;
    
//     public Computer(MainBoard mb, CPU c, Memory m, PowerSupply ps){
//         this.mb = mb;
//         this.c = c;
//         this.m = m;
//         this.ps = ps;
//     }
    
//     public MainBoard getMainBoard(){
//         return mb;
//     }
// }

// class MainBoard{
    
// }

// class CPU{
    
// }

// class Memory{
    
// }

// class PowerSupply{
    
// }


// public class AggregationEx01 {
//     public static void main(String[] args) {
//         MainBoard mb = new MainBoard();
//         CPU c = new CPU();
//         Memory m = new Memory();
//         PowerSupply ps = new PowerSupply();
        
//         Computer computer1 = new Computer(mb,c,m,ps);
    
//         System.out.println(computer1.getMainBoard());
    
//         computer1 = null;
        
//         System.out.println(mb);
        
    
//     }
// }
