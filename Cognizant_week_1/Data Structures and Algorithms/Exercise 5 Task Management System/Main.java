public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Setup Database", "In Progress"));
        taskList.addTask(new Task(3, "Implement Backend", "Pending"));

        System.out.println("\nAll Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearch for Task ID 2:");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Task not found");

        System.out.println("\nDeleting Task ID 1...");
        taskList.deleteTask(1);

        System.out.println("\nUpdated Task List:");
        taskList.displayTasks();
    }
}
