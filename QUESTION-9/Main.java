// Q : 9
// AUTHOR: Argha Digar
// TITLE: Student Grade Management System
// DESCRIPTION: This Java program defines a class called Student with private instance variables student_id, student_name, and grades. It provides public getter and setter methods to access and modify the student_id and student_name variables. Additionally, it offers a method called addGrade() that allows adding a grade to the grades array while performing validation to ensure the grade is between 0 and 100. The program demonstrates how to create a Student instance, access its properties, and manage student grades using arrays.

class Student {
    private int student_id;
    private String student_name;
    public int[] grades;
    private int gradeCount; 
  
    public Student(int student_id, String student_name, int maxGradeCount) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new int[maxGradeCount];
        this.gradeCount = 0;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

  
    // Method to add a grade with validation
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100 && gradeCount < grades.length) {
            grades[gradeCount] = grade;
            gradeCount++;
            System.out.println("Grade added: " + grade);
        } else if (gradeCount >= grades.length) {
            System.out.println("Cannot add more grades. Maximum grade count reached.");
        } else {
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
        }
    }


    public int[] getGrades() {
        return grades;
    }

}

public class Main {
    public static void main(String[] args) {
      
        Student student = new Student(101, "Argha Digar", 5); // Maximum 5 grades

        // Use getter methods to access the values
        System.out.println("Student ID: " + student.getStudent_id());
        System.out.println("Student Name: " + student.getStudent_name());

        // Add grades
        student.addGrade(85);
        student.addGrade(92);
        student.addGrade(105); // Invalid grade
        student.addGrade(75);
        student.addGrade(98);
        student.addGrade(88); // Maximum grade count reached

        // Access grades
      
        System.out.print("All Grades: ");
        for (int i=0;i<5;i++){
        System.out.print(student.grades[i]+"  ");
        }
    }

        
    }


