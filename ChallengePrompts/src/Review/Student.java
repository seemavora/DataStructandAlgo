package Review;

public class Student {
    public String name;
    public int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    public static void main (String args[]) {
    	Student joe = new Student("Joe", 12909);
    	Student evilJoe = joe;

    	evilJoe.name = "Evil Joe";
    	System.out.println(joe.name);
    }
}