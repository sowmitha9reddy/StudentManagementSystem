package student_management_system;

import java.util.ArrayList;

import java.util.Scanner;

public class StudentManagementSystem {
	

	
	    static ArrayList<Student> students=new ArrayList<Student>();
	    static Scanner scanner = new Scanner(System.in);

	    

	    public static void addStudent() {
	      System.out.println("Enter student Name");
	      String name=scanner.nextLine();
	        students.add(new Student(name));
	        System.out.println("Student added.");
	    }

	    public static void removeStudent() {
	        System.out.print("Enter student name to remove: ");
	        String name = scanner.nextLine();
	     
	        for (Student student : students) {
	            if (student.getName().equalsIgnoreCase(name)) 
	         {
	                 students.remove(student);
	    	        System.out.println("Student removed.");
	               break;
	            }
	        }
	     

    }

	    public static void displayStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No students to display.");
	        } else {
        
	        	System.out.println(students);
	        }
	    }

	  
		public static void searchStudent() {
	        System.out.print("Enter student name to search: ");
	        String name = scanner.nextLine();
	     
	        if (students.contains(new Student(name))) {
	            System.out.println("Student found: " + name);
	        } else {
	            System.out.println("Student not found.");
	        }


	        
	    }

	    public static  void updateStudent() {
	        System.out.print("Enter student name to update: ");
	        String name = scanner.nextLine();
	        int i=0;
	        for (Student student : students) {
	            if (student.getName().equalsIgnoreCase(name)) {
	            	
	            	i=students.indexOf(student);
	                System.out.print("Enter new name: ");
	                String newName = scanner.nextLine();
	                students.set(i, new Student(newName));
	                System.out.println("Student updated.");
	              
	                return;
	            }
	        }
	     
	    }

	   
	    

	    public static void main(String[] args) {
	    	   
	    	 Scanner scanner = new Scanner(System.in);
	    	 while (true) {
	    		    System.out.println("\nStudent Management System");
	    		    System.out.println("1. Add Student");
	    		    System.out.println("2. Remove Student");
	    		    System.out.println("3. Display Students");
	    		    System.out.println("4. Search Student");
	    		    System.out.println("5. Update Student");
	    		   System.out.println();
	    		    System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    addStudent();
	                    break;
	                case 2:
	                    removeStudent();
	                    break;
	                case 3:
	                   displayStudents();
	                    break;
	                case 4:
	                    searchStudent();
	                    break;
	                case 5:
	                   updateStudent();
	                    break;
	               
	                default:
	                    System.out.println("Invalid choice");
	            }
	        }
	    }
	

}
