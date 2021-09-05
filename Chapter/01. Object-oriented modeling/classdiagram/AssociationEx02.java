// package classdiagram;

// import java.util.ArrayList;

// class Student {
//     private String name;
//     private ArrayList<Course> courses;
    
//     public Student(String name){
//         this.name = name;
//         courses = new ArrayList<Course>();
//     }
    
    // public void registerCourse(Course course) {
    //     courses.add(course);
    // }
    
//     public void dropCourse(Course course) {
//         if(courses.contains(course)){
//             courses.remove(course);
//         }
//     }
    
//     public String getName(){
//         return name;
//     }
    
//     public ArrayList<Course> getCourses(){
//         return courses;
//     }
// }

// class Course {
//     String name;
    
//     public Course(String name) {
//         this.name = name;
//     }
    
//     public String getName(){
//         return name;
//     }
    
//     @Override
//     public String toString(){
//         return name;
//     }
// }

// //Student와 Course는 단방향 연관관계이다.

// public class AssociationEx02 {
//     public static void main(String[] args) {
//         Student jeong = new Student("정채원");
//         Course mathCourse = new Course("수학과정");
//         Course programingCourse = new Course("프로그래밍과정");
//         jeong.registerCourse(mathCourse);
//         jeong.registerCourse(programingCourse);
        
//         ArrayList<Course> courses = jeong.getCourses();
        
//         for(Course course : courses) {
//             System.out.println(course);
//         }
        
//         System.out.println("====================");
        
//         jeong.dropCourse(mathCourse);
        
//         for(Course course : courses) {
//             System.out.println(course);
//         }
//     }
    
    
// }
