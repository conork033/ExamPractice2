package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentListTest{

 Student Student;
 StudentList myList;

 @BeforeEach
    void setup()
 {
     Student = new Student("Conor","ck@gmit");//tets
     myList = new StudentList();//Hiifjwei
 }

 @Test
    void addStudent()
 {
     myList.add(Student);
     assertEquals(1,myList.getSize());
 }

 @Test
    void testfindName(){
     myList.add(Student);//bhgfgbh
     assertEquals(Student, myList.findName("Conor"));


 }
}