package com.example.habitator;

public class Task {
	private long id;
	private String task;
	private int time;
	private int initdate;
	
	public long getId(){
		return id;
	}

	public void setId(long id){
		this.id=id;
	}
	
	public String getTask() {
		return task;
	}
	
	public void setTask(String task) {
		this.task = task;
	}
	
	public String toString() {
		return task;
	}
	
	public void setTime(int time){
		this.time = time;
	}
	public void setDate(int date){
		this.initdate = date;
	}
	
}
