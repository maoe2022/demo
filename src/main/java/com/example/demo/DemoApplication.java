package com.example.demo;

import java.time.LocalDate;
//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		Task1 t1 = new Task1("Recordar POO", false, LocalDate.of(2022, 8, 19));
		Task1 t2 = new Task1("Conocer Intellij IDEA", false, LocalDate.of(2022,  8, 20));
		Task1 t3 = new Task1("Conocer de Spring Boot", false, LocalDate.of(2022, 8, 22));
		Task1 t4 = new Task1("Finalizando Tareas...", false, LocalDate.of(2022, 8, 25));
/*
		System.out.println("descripcion de la tarea:");
		System.out.println(t1.getDescription());
		System.out.println("fecha de la tarea:");
		System.out.println(t1.getDueDate());
		System.out.println("estado de la tarea realizada?");
		System.out.println(t1.getDone());

	//Ahora se pretende modificar la propiedad de la descripción de t1

		t1.setDescription("Recordando POO");
*/

		TaskList1 metas=new TaskList1("Tareas Iniciales");

		metas.addTaskList(t1);
		metas.addTaskList(t2);
		metas.addTaskList(t3);
		metas.addTaskList(t4);


/*		System.out.println("nueva descripcion de la tarea 1:");
		System.out.println(t1.getDescription());*/



		//Control + Alt + / o Control + Shift + /
		System.out.println("Tareas iniciales:");
		metas.printTasks();


		metas.removeTask("Finalizando Tareas...");
		System.out.println("Tareas finales:");
		metas.printTasks();
	}
}
