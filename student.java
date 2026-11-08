package javaapplication12;
public class student extends person{
 private int studentID;
 private double grade;
 public student(String name,int age,int studentID,double grade){
   super(name,age);
   this.studentID=studentID;
   this.grade=grade;
 }
 @Override
 public void displayInfo(){
     super.displayInfo();
     System.out.println( "student ID:  "+ studentID);
     System.out.println("Grade:  " + grade);
 }
}
