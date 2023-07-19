package day07.Practices;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class RemoveDuplicateTaskUsingHashSet {

    private int id;
    private String name;
    private LocalDate deadline;

    public RemoveDuplicateTaskUsingHashSet(String name, int id,String date) {
        this.name = name;
        this.id = id;
        this.deadline = LocalDate.parse(date);
    }

    @Override
    public String toString() {
        return "Task : "+ name + ", Deadline :" + deadline + ", Id :" + id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        RemoveDuplicateTaskUsingHashSet task = (RemoveDuplicateTaskUsingHashSet) obj;
        return Objects.equals(name, task.name) && Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, deadline);
    }

    public static void main(String[] args) {
        ArrayList<RemoveDuplicateTaskUsingHashSet> arr = new ArrayList <> ();
        RemoveDuplicateTaskUsingHashSet task1 = new RemoveDuplicateTaskUsingHashSet("Car Wash",1,"2011-09-01");
        RemoveDuplicateTaskUsingHashSet task4 = new RemoveDuplicateTaskUsingHashSet("Car Wash",4,"2011-09-01");
        RemoveDuplicateTaskUsingHashSet task2 = new RemoveDuplicateTaskUsingHashSet("Shopping",3,"2012-05-15");
        RemoveDuplicateTaskUsingHashSet task3 = new RemoveDuplicateTaskUsingHashSet("Haircut",5,"2013-02-24");
        arr.add(task1);
        arr.add(task2);
        arr.add(task3);
        arr.add(task4);

        HashSet<RemoveDuplicateTaskUsingHashSet> distinctTask = new HashSet<>(arr);

        for (RemoveDuplicateTaskUsingHashSet i: distinctTask) {
            System.out.println(i);
        }

    }
}