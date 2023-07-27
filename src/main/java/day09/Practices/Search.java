package day09.Practices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class Search {
    private int id;
    private String name;
    private LocalDate deadline;
    private int priority;

    public Search(int id, String name, LocalDate deadline, int priority) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public int getPriority() {
        return priority;
    }


    public static void main(String[] args) {

        List<Search> tasks = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter tasks (id, name, deadline, priority) or type 'exit' to stop:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                String[] taskStrings = input.split(",");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                int id = Integer.parseInt(taskStrings[0]);
                String name = taskStrings[1];
                LocalDate deadline = LocalDate.parse(taskStrings[2].trim(), formatter);
                int priority = Integer.parseInt(taskStrings[3].trim());

                Search task = new Search(id, name, deadline, priority);
                tasks.add(task);

                Collections.sort(tasks, Comparator
                        .comparing(Search::getDeadline)
                        .thenComparing(Search::getPriority));

                System.out.println("Sample Output:");
                for (Search t : tasks) {
                    System.out.println(t.getId() + "," + t.getName() + "," + t.getDeadline() + "," + t.getPriority());
                }
            }
        }

    
    }
    }
