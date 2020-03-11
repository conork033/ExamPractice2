package ie.gmit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest{

   @Test
    void testConstructor()
   {
       Student myStudent = new Student("Conor","ck@gmit");
       assertEquals("Conor",myStudent.getName());
       assertEquals("ck@gmit",myStudent.getEmail());//hrtfhrt
   }
   @Test
    void testConstructorNoName(){
       assertThrows(IllegalArgumentException.class,()-> new Student("","ck@gmit"));
   }

    @Test
    void testConstructorNoEmail(){
        assertThrows(IllegalArgumentException.class,()-> new Student("Conor",""));
    }



}