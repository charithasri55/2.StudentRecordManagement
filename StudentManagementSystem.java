
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    static ArrayList<Student> std = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    //Add Student Record
    public static void addRecord() {

        System.out.print("\nEnter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter the Student Marks: ");
        double marks = sc.nextDouble();

        std.add(new Student(id, name, marks));

        System.out.println("===Record Successfully added===");
    }

    //Update Record
    public static void updateRecord() {

        System.out.print("\nEnter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : std) {
            if (s.getId() == id) {
                System.out.print("Enter new Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter new Student Marks: ");
                double marks = sc.nextDouble();

                s.setName(name);
                s.setMarks(marks);

                System.out.println("\n===Record Successfully Updated===");

                return;
            }
        }
        System.out.println("\n===Record Not Found===");
    }

    //View Record
    public static void viewRecord() {
        if (std.isEmpty()) {
            System.out.println("\n===No Records Found===");
            return;
        }
        System.out.println("\n*****Student Records*****");

        for (Student s : std) {
            s.display();
        }
    }

    //Delete Records
    public static void deleteRecord() {

        System.out.print("\nEnter ID to delete record: ");
        int id = sc.nextInt();

        for (int i = 0; i < std.size(); i++) {

            if (std.get(i).getId() == id) {
                std.remove(i);
                System.out.println("\n===Record Successfully Deleted===");
                return;
            }
        }
        System.out.println("\n===Record not found===");
    }

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n>>>>>Student Reocrd Management Menu<<<<<");
            System.out.println("1.Add Reocrd");
            System.out.println("2.Update Reocrd");
            System.out.println("3.View Reocrds");
            System.out.println("4.Delete Reocrd");
            System.out.println("5.Exit\n");

            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addRecord();
                    break;
                case 2:
                    updateRecord();
                    break;
                case 3:
                    viewRecord();
                    break;
                case 4:
                    deleteRecord();
                    break;
                case 5:
                    running = false;
                    System.out.println("\n====Program closed, Thank you===\n");
                    break;
                default:
                    System.out.println("===Invalid Choice===");
            }
        }
        sc.close();
    }
}
