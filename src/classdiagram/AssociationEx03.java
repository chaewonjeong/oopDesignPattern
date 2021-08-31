package classdiagram;

class Student {
    private String name;
    ArrayList<Course> courses;
    
    public Student(String name) {
        this.naem = name;
        courses = new ArrayList<Course>();
    }
    
    public void registerCourse(Course course) {
        courses.add(course);
        course.add(this);
    }
    
}

class Course {
    private String name;
    ArrayList<Student> students;
    
    public Course(String name) {
        this.name = name;
        students = new ArrayList<Student>();
    }
    
    
}




//다대다 연관관계
public class AssociationEx03 {
}
