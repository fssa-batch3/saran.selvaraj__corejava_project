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

   
}