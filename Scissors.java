package com.revature.HelloWorld;

public class Scissors extends Choice{
	public int winner(Choice c) {
		if(c instanceof Rock)
		{ 
			return -1;
		} 
		else if(c instanceof Paper)
		{
			return 1;
		}
		else if(c instanceof Scissors)
		{
			return 0;
		}
		throw new IllegalArgumentException("Must choose rock, paper, or scissors");
	}
}