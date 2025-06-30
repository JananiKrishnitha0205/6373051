public class Main {
    public static void main(String[] args) {
        // Step 1: Create Model
        Student student = new Student("Aarav", "ST101", "A");

        // Step 2: Create View
        StudentView view = new StudentView();

        // Step 3: Create Controller
        StudentController controller = new StudentController(student, view);

        // Initial display
        controller.updateView();

        // Modify data via controller
        controller.setStudentName("Aarav Sharma");
        controller.setStudentGrade("A+");

        // Display after update
        System.out.println("\n--- After Update ---");
        controller.updateView();
    }
}
