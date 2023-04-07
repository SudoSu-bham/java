/* 1.Design three classes: Student, Exam and Result. The student class has data members such as roll no, name etc.
Create a class Exam by inheriting the Student class. The Exam class adds data members representing the marks scored in six subjects.
Derive the Result from class Exam and it has its own members such as total marks and average. Calculate the total marks and average.*/

import java.util.Scanner;
class student{
    Scanner s = new Scanner(System.in);
    public String name;
    public int roll;
}

class exam extends student{
    public int[] array = new int[6];
    void detail(){
        System.out.print("Enter student's name: ");
        name = s.nextLine();
        System.out.print("Enter roll number: ");
        roll = s.nextInt();
    }
    void marks(){
        System.out.println("Enter the Marks: ");
        int i=0;
        for(i=0;i<6;i++){
            array[i] = s.nextInt();
        }
    }
}

class result extends exam{
    void s_result(){
        int total=0;
        for(int i=0;i<6;i++){
            total+=array[i];
        }
        System.out.println("Total marks is: "+total);
        System.out.println("Average marks is: "+total/6);
    }
}

class prog1{
     public static void main(String[] args){
        result r = new result();
        r.detail();
        r.marks();
        r.s_result();
     }

}