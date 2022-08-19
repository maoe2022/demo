package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList1 {
    private String name;
    private List<Task1> taskList;

    public TaskList1(String name) {//constructor solo para name
        this.name=name;
        this.taskList = new ArrayList<Task1>();//inicializar la variable taskList

    }
//crear otro metodo para agregar una tarea a la lista
    public void addTaskList(Task1 task){
        this.taskList.add(task);
    }
    public List<Task1> getTaskList() {
        return this.taskList;
    }

    public void setTaskList(List<Task1> taskList) {
        this.taskList = taskList;
    }
    public String getName() {//setters y getters para name
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //https://www.arquitecturajava.com/java-stream-filter-y-predicates/
    //https://www.arquitecturajava.com/java-8-lambda-expressions/
    //https://www.youtube.com/watch?v=E3BU2fvolfY&feature=emb_logo
   public void removeTask(String description){
        this.taskList = taskList.stream().filter(t->{
            return !t.getDescription().equals(description);
        }).collect(Collectors.toList());
    }

    public void printTasks(){
        this.taskList.forEach(task->{
            System.out.println("descripcion: ");
            System.out.println(task.getDescription());
            System.out.println("fecha: ");
            System.out.println(task.getDueDate());
            System.out.println("realizada: ");
            System.out.println(task.getDone());
            System.out.println("-----------------------");
        });
    }

}
