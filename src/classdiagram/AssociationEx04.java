package classdiagram;

import java.util.ArrayList;

class Student{
    private String name;
    private ArrayList<Transcript> transcriptsList;
    
    public Student(String name){
        this.name = name;
        transcriptsList = new ArrayList<Transcript>();
    }
    
    public void addTranscript(Transcript transcript){
        transcriptsList.add(transcript);
    }
    
    public ArrayList<Course> getCourses() {
        ArrayList<Course> coursesList = new ArrayList<Course>();
        
        for(int i = 0; i < transcriptsList.size(); i++){
            coursesList.add(transcriptsList.get(i).getCourse());
        }
        
        return coursesList;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return name;
    }
}

class Transcript {
    private Student student;
    private Course course;
    private String date;
    private String grade;
    
    public Transcript(Student student, Course course){
        this.student = student;
        this.student.addTranscript(this);
        this.course = course;
        this.course.addTranscript(this);
    }
    
    public Student getStudent(){
        return student;
    }
    
    public Course getCourse(){
        return course;
    }
    
    public String getDate(){
        return date;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public void setGrade(String grade){
        this.grade = grade;
    }
    
    @Override
    public String toString(){
        return student + " 학생의 " + course + "과목의 성적은 " + grade + "입니다.";
    }
    
}


class Course {
    private String name;
    private ArrayList<Transcript> transcriptsList;
    
    public Course(String name) {
        this.name = name;
        transcriptsList = new ArrayList<Transcript>();
    }
    
    public ArrayList<Student> getStudents(){
        ArrayList<Student> studentsList = new ArrayList<Student>();
        
        for(int i = 0; i < transcriptsList.size(); i++){
            studentsList.add(transcriptsList.get(i).getStudent());
        }
        
        return studentsList;
    }
    
    public void addTranscript(Transcript transcript) {
        transcriptsList.add(transcript);
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}


//연관 클래스 -> transcript 클래스를 이용하여 Student와 Course 클래스 사이의 '수강하다'라는 연관 관계 구현
//다대다 연관 관계는 자연스럽게 양방향 연관 관계가 되므로 구현하기가 생각보다 복잡하다. 따라서 보통 다대다 연관 관계를 일대다 단방향 연관 관계로 변환해 구현한다.
public class AssociationEx04 {
    public static void main(String[] args){
        
        Student s1 = new Student("이순신");
        Student s2 = new Student("김유신");
        
        Course mathCourse = new Course("수학과정");
        Course programingCourse = new Course("프로그래밍과정");
        Course se = new Course("소프트웨어 엔지니어링과정");
        Course dp = new Course("디자인 패턴과정");
        
        Transcript t1 = new Transcript(s1,mathCourse);
        Transcript t2 = new Transcript(s1,se);
        Transcript t3 = new Transcript(s2,dp);
        Transcript t4 = new Transcript(s2,mathCourse);
        Transcript t5 = new Transcript(s2,se);
        
        t1.setGrade("A+");
        t1.setDate("2012");
        System.out.println(t1);
        
        t2.setGrade("A");
        t2.setDate("2013");
        System.out.println(t2);
        
        t3.setGrade("C");
        t3.setDate("2011");
        System.out.println(t3);
        
        t4.setGrade("B+");
        t4.setDate("2012");
        System.out.println(t4);
        
        t5.setGrade("C+");
        t5.setDate("2014");
        System.out.println(t5);
        
        System.out.println("====================");
        
        
        ArrayList<Course> courses = s1.getCourses();
        ArrayList<Student> mathGroupStudents = mathCourse.getStudents();
        
        System.out.println("<" + s1 + "의 수강 목록>");
        for(Course course : courses) {
            System.out.println(course);
        }
        
        System.out.println("====================");
        
        System.out.println("<" + mathCourse + "의 수강인원 목록>");
        for(Student mathStudent : mathGroupStudents) {
            System.out.println(mathStudent);
        }
        
        
    }
    
    
    
    
    
}
