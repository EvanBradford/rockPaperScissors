package com.revature.HelloWorld;

public class Player implements Serializable{
	String name;
	Choice choice;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String name, Choice choice) {
		super();
		this.name = name;
		this.choice = choice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Choice getChoice() {
		return choice;
	}

	public void setChoice(Choice choice) {
		this.choice = choice;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", choice=" + choice + "]";
	}
	
}

