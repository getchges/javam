//10. Create a Student class with data members Rollno, Name, marks in subjects. Include  
//methods to compute average. Raise an exception if the student has more than 4 
//backlogs.

class TooManyBacklogsException extends Exception {
    public TooManyBacklogsException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int[] marks;

    public Student(int rollNo, String name, int[] marks) throws TooManyBacklogsException {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

        int backlogs = 0;
        for (int mark : marks) {
            if (mark < 35) {
                backlogs++;
            }
        }

        if (backlogs > 4) {
            throw new TooManyBacklogsException("Student has more than 4 backlogs.");
        }
    }

    public double computeAverage() {
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] marks1 = {75, 80, 60, 55};
        int[] marks2 = {40, 45, 30, 25, 20};

        try {
            Student student1 = new Student(101, "John Doe", marks1);
            System.out.println("Student 1 average marks: " + student1.computeAverage());

            // This will throw TooManyBacklogsException
            Student student2 = new Student(102, "Alice", marks2);
        } catch (TooManyBacklogsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
