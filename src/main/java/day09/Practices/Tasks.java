package day09.Practices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Tasks {
	private int id;
	private String name;
    private LocalDate deadline;
    
    public Tasks(int id, String name, LocalDate deadline) {
    	this.id = id;
    	this.name = name;
    	this.deadline = deadline;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setDeadline(LocalDate deadline) {
    	this.deadline = deadline;
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
    
    
    public static void main(String[] args) {
    	
    	ArrayList<Tasks> arr = new ArrayList<>();
    	
    	Tasks t1 = new Tasks(3,"Coding",LocalDate.of(2022,10,22));
    	Tasks t2 = new Tasks(5,"Product Design",LocalDate.of(2022,10,01));
    	Tasks t3 = new Tasks(1,"Software Design",LocalDate.of(2022,10,07));
    	Tasks t4 = new Tasks(3,"Coding",LocalDate.of(2022,10,22));
    	
    	arr.add(t1);
    	arr.add(t2);
    	arr.add(t3);
    	arr.add(t4);
    	
    	Collections.sort(arr,Comparator.comparing(Tasks::getDeadline));
    	
    	 for (Tasks task : arr) {
             System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline());
         }
    }
}







