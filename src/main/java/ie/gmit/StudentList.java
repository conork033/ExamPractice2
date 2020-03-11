package ie.gmit;


import java.util.ArrayList;
import java.util.List;

public class StudentList{
   private ArrayList<Student> myList;

   public StudentList(){
       myList = new ArrayList<Student>();
   }

    public void add(Student myStudent){
        myList.add(myStudent);

    }

    public int getSize(){
        myList.size();
        return myList.size();
    }

    public Student findName(String name)
    {
       for(Student student : myList)
       {

           if(student.getName().equals(name))
           {
               return student;

           }
       }
       return null;
    }


}

