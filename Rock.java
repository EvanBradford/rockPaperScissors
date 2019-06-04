package com.revature.HelloWorld;

public class Rock extends Choice{
	public int winner(Choice c) {
		if(c instanceof Rock)
		{ 
			return 0;
		} 
		else if(c instanceof Paper)
		{
			return -1;
		}
		else if(c instanceof Scissors)
		{
			return 1;
		}
		throw new IllegalArgumentException("Must choose rock, paper, or scissors");
		//throw(throwable);
		// you can throw any error but its pointless to catch anything other than exceptions
		
		//throwable is an interface that includes all throwable objects
		
		
	}
}