public class Main {
    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement(5);

        em.addEmployee(new Employee(1, "Alice", "Manager", 60000));
        em.addEmployee(new Employee(2, "Bob", "Developer", 45000));
        em.addEmployee(new Employee(3, "Charlie", "HR", 40000));

        System.out.println("\nAll Employees:");
        em.displayAll();

        System.out.println("\nSearch Employee with ID 2:");
        Employee found = em.searchEmployee(2);
        System.out.println(found != null ? found : "Not Found");

        System.out.println("\nDeleting Employee with ID 1...");
        em.deleteEmployee(1);

        System.out.println("\nUpdated Employee List:");
        em.displayAll();
    }
}
