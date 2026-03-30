package com.example.todoapp.main;

import java.util.Scanner;
import com.example.todoapp.model.Todo;
import com.example.todoapp.service.TodoService;

public class MainApp {

    public static void main(String argds[]) {
        Scanner sc = new Scanner(System.in);
        TodoService service = new TodoService();
        String id;
        String title;
        String description;
        String priority;
        java.sql.Date endDate;

        while (true) {
            System.out.println("1. Add Todo");
            System.out.println("2. View All Todos");
            System.out.println("3. View Todo by ID");
            System.out.println("4. Update Todo");
            System.out.println("5. Exit");
            System.out.println("====================================");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Title: ");
                    title = sc.nextLine();
                    System.out.println("Enter ID: ");
                    id = sc.nextLine();
                    System.out.println("Enter Description: ");
                    description = sc.nextLine();
                    System.out.println("Enter Priority: ");
                    priority = sc.nextLine();
                    System.out.println("Enter End Date (yyyy-mm-dd): ");
                    endDate = java.sql.Date.valueOf(sc.nextLine());
                    service.addTodo(new Todo(title, id, description, priority, endDate, false));
                    break;
                case 2:
                    service.getAllTodos().forEach(todo -> {
                        System.out.println("TITLE: " + todo.getTitle() + "\nID: " + todo.getId() + "\nDescription: "
                                + todo.getDescription() + "\nPriority: " + todo.getPriority() + "\nEnd Date: "
                                + todo.getEndDate() + "\nCompleted: " + todo.getCompleted());
                    });

                    break;
                case 3:
                    System.out.println("Enter ID: ");
                    id = sc.nextLine();
                    Todo todo = service.getTodoById(id);
                    if (todo != null) {
                        System.out.println("TITLE: " + todo.getTitle() + "\nID: " + todo.getId() + "\nDescription: "
                                + todo.getDescription() + "\nPriority: " + todo.getPriority() + "\nEnd Date: "
                                + todo.getEndDate() + "\nCompleted: " + todo.getCompleted());
                    } else {
                        System.out.println("Todo not found with ID: " + id);
                    }
                    break;
                case 4:
                    System.out.println("Enter ID of the Todo to update: ");
                    id = sc.nextLine();
                    Todo existingTodo = service.getTodoById(id);
                    if (existingTodo == null) {
                        System.out.println("Todo not found with ID: " + id);
                        break;
                    }
                    
                    title = existingTodo.getTitle();
                    description = existingTodo.getDescription();
                    priority = existingTodo.getPriority();
                    endDate = existingTodo.getEndDate();
                    boolean completed = existingTodo.getCompleted();
                    System.out.println("Select the field to update:");
                    System.out.println("1. Title");
                    System.out.println("2. Description");
                    System.out.println("3. Priority");
                    System.out.println("4. End Date");
                    System.out.println("5. Completed");
                    System.out.print("Enter your choice: ");
                    int fieldChoice = sc.nextInt();
                    sc.nextLine();
                    switch (fieldChoice) {
                        case 1:
                            System.out.println("Enter new Title: ");
                            title = sc.nextLine();
                            break;
                        case 2:
                            System.out.println("Enter new Description: ");
                            description = sc.nextLine();
                            break;
                        case 3:
                            System.out.println("Enter new Priority: ");
                            priority = sc.nextLine();
                            break;
                        case 4:
                            System.out.println("Enter new End Date (yyyy-mm-dd): ");
                            endDate = java.sql.Date.valueOf(sc.nextLine());
                            break;
                        case 5:
                            System.out.println("Is the task completed? (true/false): ");
                            completed = sc.nextBoolean();
                            break;
                        default:
                            System.out.println("Invalid choice. No changes made.");
                    }
                    service.updateTodo(new Todo(title, id, description, priority, endDate, completed));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}