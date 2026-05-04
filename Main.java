import java.util.ArrayList;


public class Main {
    static ArrayList<String> students = new ArrayList<>();

    public static void main(String[] args) {
        students.add("John");
        System.out.println("Student Added");
    }

    static void viewStudents() {
        System.out.println("Student List:");
        for (String s : students) {
        System.out.println(s);
        }
       }



    

    
}