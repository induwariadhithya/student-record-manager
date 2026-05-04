import java.util.ArrayList;


public class Main {
    static ArrayList<String> students = new ArrayList<>();

    public static void main(String[] args) {
        students.add("John");
        System.out.println("Student Added");
        viewStudents();
        deleteStudent("Alice");
        countStudents();




    }

    static void viewStudents() {
        System.out.println("Student List:");
        for (String s : students) {
        System.out.println(s);
        }
       }

       static void deleteStudent(String name) {
       students.remove(name);
       System.out.println(name + " removed.");
}
    static void countStudents() {
    System.out.println("Total students: " + students.size());
}


static void searchStudent(String name) {
    boolean found = false;
    for (String s : students) {
        if (s.equalsIgnoreCase(name)) {
            found = true;
            break;
        }
    }
    if (found) {
        System.out.println(name + " found.");
    } else {
        System.out.println(name + " not found.");
    }
}

    



    

    
}