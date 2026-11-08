
package javaapplication12;

public class department {
    private String departmentName;

    public department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
    }
}
