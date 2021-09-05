package classdiagram;

import java.util.ArrayList;

class Student {
    private String name;
    private ArrayList<RentalHistory> rentalHistories;
    
    public Student(String name){
        this.name = name;
        rentalHistories = new ArrayList<RentalHistory>();
    }
    
    public ArrayList<RentalHistory> getRentalHistories(){
        return rentalHistories;
    }
    
    public ArrayList<Book> getRentalBooks(){
        ArrayList<Book> books = new ArrayList<Book>();
        RentalHistory rentalHistory;
        
        for(int i = 0; i < rentalHistories.size(); i++){
            rentalHistory = rentalHistories.get(i);
            books.add(rentalHistory.getBook());
        }
        return books;
    }
    
    public void addRentalHistory(RentalHistory rentalHistory){
        rentalHistories.add(rentalHistory);        
    }
    
    public String getName(){
        return name;
    }
    
    @Override 
    public String toString(){
        return name;
    }
}

class RentalHistory {
    private Student student;
    private Book book;
    private String rentalDate;
    
    public RentalHistory(Student student, Book book, String rentalDate){
        this.student = student;
        student.addRentalHistory(this);
        this.book = book;
        book.addRentalHistory(this);
        this.rentalDate = rentalDate; 
    }
    
    public Student getStudent(){
        return student;
    }

    public Book getBook(){
        return book;
    }
    
    public String getRentalDate(){
        return rentalDate;
    }
    
}

class Book {
    private String name;
    private int bookId;
    private ArrayList<RentalHistory> rentalHistories;
    
    public Book(String name, int bookId){
        this.name = name;
        this.bookId = bookId;
        rentalHistories = new ArrayList<RentalHistory>();
    }
    
    public void addRentalHistory(RentalHistory rentalHistory) {
        rentalHistories.add(rentalHistory);
    }
    
    public String getName(){
        return name;
    }
    
    public int getBookId(){
        return bookId;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
  
    @Override
    public boolean equals(Object obj) {
	    return (this.name == ((Book)obj).getName() && this.bookId == ((Book)obj).getBookId());
    }
    
    
    
}


public class AssociationEx05 {
    public static void main(String[] args) {
        
        Student s1 = new Student("김유신");
        Student s2 = new Student("이순신");
        
        Book b1 = new Book("나목", 100);
        Book b2 = new Book("날개", 200);
        Book b3 = new Book("해리포터",300);
        Book b4 = new Book("데미안",400);
        
        RentalHistory rs1 = new RentalHistory(s1,b1,"2021-10-6");
        RentalHistory rs2 = new RentalHistory(s1,b2,"2021-9-4");
        RentalHistory rs3 = new RentalHistory(s1,b3,"2021-11-12");
        
        RentalHistory rs4 = new RentalHistory(s2,b4,"2021-6-6");
        
        ArrayList<Book> books1 = new ArrayList<Book>();
        ArrayList<Book> books2 = new ArrayList<Book>();
        
        books1 = s1.getRentalBooks();
        books2 = s2.getRentalBooks();
        
        for(Book book : books1){
            System.out.println(book);
        }
        
        System.out.println("======================");
        
        for(Book book : books2){
            System.out.print(book);
        }
          
    }
}
























