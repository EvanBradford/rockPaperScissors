package com.revature.HelloWorld;

public class Paper extends Choice{
	public int winner(Choice c) {
		if(c instanceof Rock)
		{ 
			return 1;
		} 
		else if(c instanceof Paper)
		{
			return 0;
		}
		else if(c instanceof Scissors)
		{
			return -1;
		}
		throw new IllegalArgumentException("Must choose rock, paper, or scissors");
	}
}