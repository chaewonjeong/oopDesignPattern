// package classdiagram;

// class Professor {
//     private Student student;
    
//     public void setStudent(Student student) {
//         this.student = student;
//         student.setAdvisor(this);
//     }
    
//     public void advise() {
//         student.advise("상담내용은 여기에..");
//     }
    
// }

// class Student {
//     private Professor advisor;
    
//     public void setAdvisor(Professor advisor) {
//         this.advisor = advisor;
//     }
    
//     public void advise(String msg) {
//         System.out.println(msg);
//     }
    
//     public Professor getAdvisor(){
//         return advisor;
//     }
// }

// //Professor class와 Student clss의 연관 관계는 양방향 연관 관계이므로 Professor 클래스 캑체에서 Student 클래스 객체를 참조할 수 있는 속성이 있고 Student 클래스 객체에서 Professor 클래스 객체를 참조할 수 있는 속성이 있다. 또한 이 속성의 이름이 역할 이름을 활용한 것임을 알 수 있다.

// public class AssociationEx01 {
//     public static void main(String[] args) {
//         Professor hongGilDong = new Professor();
//         Student jeong = new Student();
//         hongGilDong.setStudent(jeong);
//         hongGilDong.advise();
        
//     }
// }
