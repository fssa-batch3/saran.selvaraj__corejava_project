package day09.Practices;
import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortAListOfIntegers {
    private ArrayList<Integer> arr;

    public SortAListOfIntegers() {
        arr = new ArrayList<>();
    }

    public ArrayList<Integer> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    public void addInteger(int num) {
        arr.add(num);
    }

    public void sortIntegers() {
        Collections.sort(arr);
    }
}
