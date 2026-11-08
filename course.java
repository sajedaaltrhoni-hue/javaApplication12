
package javaapplication12;

public class course {
   private String courseName;
    private int courseId;

    public course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course ID: " + courseId);
    }
} 

