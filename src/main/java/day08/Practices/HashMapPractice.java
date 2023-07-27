
package day08.Practices;
import java.util.*;
import java.util.HashMap;

public class HashMapPractice {
    private HashMap<String, Integer> arrayNew;

    public HashMap<String, Integer> getArrayNew() {
        return arrayNew;
    }

    public void setArrayNew(HashMap<String, Integer> arrayNew) {
        this.arrayNew = arrayNew;
    }

    public void processString(String line1) {
        arrayNew = new HashMap<>();
        String[] linesplit = line1.split(",");
        
        for (String i : linesplit) {
            arrayNew.put(i.toLowerCase().trim(), arrayNew.getOrDefault(i.toLowerCase().trim(), 0) + 1);
        }
    }
}
