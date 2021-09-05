// package classdiagram;
// //합성 관계 : 부분 객체가 전체 객체에 속하는 관계, 전체 객체가 사라지면 부분 객체도 사라지는 경우

// class Computer{
//     private MainBoard mb;
//     private CPU c;
//     private Memory m;
//     private PowerSupply ps;
    
//     public Computer(){
//         mb = new MainBoard();
//         c = new CPU();
//         m = new Memory();
//         ps = new PowerSupply();
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

// public class CompositionEx01 {
//     public static void main(String[] args) {
//         Computer computer1 = new Computer();
    
//         System.out.println(computer1.getMainBoard());
    
//         computer1 = null;
        
//         //mainBoard에 접근할 방법이 없다. -> 합성관계
        
        
        
//     }
// }
