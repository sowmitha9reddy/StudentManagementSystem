package student_management_system;

public class Student {
	
	   private String name;

	    public Student(String name) {
	        this.name = name;
	}

	    public String getName() {
	        return name;
	    }

	    

	    @Override
	    public String toString() {
	        return  name +" ";
	    }
	

}
