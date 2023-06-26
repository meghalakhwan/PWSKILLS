class Student{
        String name;
        int roll_no;
    }
    public class AssignValue {
        public static void main(String[] args) {
            Student s = new Student();
            s.name = "megha";
            s.roll_no = 23;
            System.out.println("Name of student s is: " + s.name + " and roll number is: " + s.roll_no);
        }
    }

