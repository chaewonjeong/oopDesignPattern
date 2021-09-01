// package classdiagram;

// import java.util.ArrayList;

// class Student {
//     private String name;
//     ArrayList<Course> courses;
    
//     public Student(String name) {
//         this.name = name;
//         courses = new ArrayList<Course>();
//     }
    
//     public void registerCourse(Course course) {
//         courses.add(course);
//         course.addStudent(this);
//     }
    
//     public void dropCourse(Course course) {
//         courses.remove(course);
//         course.removeStudent(this);
//     }
    
//     public ArrayList<Course> getCourses(){
//         return courses;
//     }
    
//     @Override
//     public String toString() {
//         return name;
//     }
// }

// class Course {
//     private String name;
//     ArrayList<Student> students;
    
//     public Course(String name) {
//         this.name = name;
//         students = new ArrayList<Student>();
//     }
    
//     public void addStudent(Student student){
//         students.add(student);
//     }
    
//     public void removeStudent(Student student) {
//         students.remove(student);
//     }
    
//     public ArrayList<Student> getStudents() {
//         return students;
//     }
    
//     public String getName() {
//         return name;
//     }
    
//     @Override
//     public String toString() {
//         return name;
//     }
// }




// //다대다 연관관계
// public class AssociationEx03 {
//     public static void main(String[] args) {
//         Student jeong = new Student("정채원");
//         Student kim = new Student("김유신");
        
//         Course mathCourse = new Course("수학과정");
//         Course programingCourse = new Course("프로그래밍과정");
//         jeong.registerCourse(mathCourse);
//         jeong.registerCourse(programingCourse);
//         kim.registerCourse(mathCourse);
        
//         ArrayList<Course> courses = jeong.getCourses();
//         ArrayList<Student> mathGroupStudents = mathCourse.getStudents();
        
//         for(Course course : courses) {
//             System.out.println(course);
//         }
        
//         System.out.println("====================");
        
//         for(Student mathStudent : mathGroupStudents) {
//             System.out.println(mathStudent);
//         }
//     }
// }
