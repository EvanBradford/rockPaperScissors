package com.revature.HelloWorld;

import java.util.Scanner;
//import java.util.Random;

public class HelloWorld
{
	public static Scanner jin = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int res = 2;
		boolean c = false;
		boolean playing = true;
		String response;
		int players;
		//System.out.println("Hello World");
		//Player p1 = new Player();
		while(playing)
		{
			do
			{
				c = false;
				System.out.println("This is rock paper scissors, so type rock paper or scissors to play your move.");
				System.out.println("Player 1's Move");
				String p1 = jin.nextLine();
				System.out.println("Player 2's Move");
				String p2 = jin.nextLine();
				if(p1.equals("rock"))
				{
					//System.out.println("first if");
					if(p2.equals("paper"))
					{
						Rock r = new Rock();
						Paper p = new Paper();
						res = r.winner(p);
						try
						{
							res = r.winner(p);
						}
						catch (Exception e) {
						}
					}
					else if(p2.equals("rock"))
					{
						Rock r = new Rock();
						Rock r2 = new Rock();
						res = r.winner(r2);
						try
						{
							res = r.winner(r2);
						}
						catch (Exception e) {
						}
					}
					else if(p2.equals("scissors"))
					{
						Rock r = new Rock();
						Scissors s = new Scissors();
						res = r.winner(s);
						try
						{
							res = r.winner(s);
						}
						catch (Exception e) {
						}
					}
					else
					{
						c = true;
						System.out.println("Move must be rock paper or scissors, Restart because somebody is a commedian");
					}
				}
				else if(p1.equals("paper"))
				{
					if(p2.equals("paper"))
					{
						Paper p = new Paper();
						Paper P2 = new Paper();
						res = p.winner(P2);
						try
						{
							res = p.winner(P2);
						}
						catch (Exception e) {
						}
					}
					else if(p2.equals("rock"))
					{
						Paper p = new Paper();
						Rock r = new Rock();
						res = p.winner(r);
						try
						{
							res = p.winner(r);
						}
						catch (Exception e) {
						}
					}
					else if(p2.equals("scissors"))
					{
						Paper p = new Paper();
						Scissors s = new Scissors();
						res = p.winner(s);
						try
						{
							res = p.winner(s);
						}
						catch (Exception e) {
						}
					}
					else
					{
						c = true;
						System.out.println("Move must be rock paper or scissors, Restart because somebody is a commedian");
					}
					
				}
				else if(p1.equals("scissors")) 
				{
					if(p2.equals("paper"))
					{
						Scissors s = new Scissors();
						Paper p = new Paper();
						res = s.winner(p);
						try
						{
							res = s.winner(p);
						}
						catch (Exception e) {
						}
					}
					else if(p2.equals("rock"))
					{
						Scissors s = new Scissors();
						Rock r = new Rock();
						res = s.winner(r);
						try
						{
							res = s.winner(r);
						}
						catch (Exception e) {
						}
					}
					else if(p2.equals("scissors"))
					{
						Scissors s = new Scissors();
						Scissors s2 = new Scissors();
						res = s.winner(s2);
						try
						{
							res = s.winner(s2);
						}
						catch (Exception e) {
						}
					}
					else
					{
						c = true;
						System.out.println("Move must be rock paper or scissors, Restart because somebody is a commedian");
					}
				}
				else
				{
					c = true;
					System.out.println("Move must be rock paper or scissors, Restart because somebody is a commedian");
				}
			}while(c != false);
			if(res == -1)
			{
				System.out.println("Player 2 Wins");
			}
			else if(res == 0)
			{
				System.out.println("You Tie");
			}
			else if(res == 1)
			{
				System.out.println("Player 1 Wins");
			}
			else {
				System.out.println("something went wrong");
			}
			do
			{
				System.out.println("Do you want to play again yes/no?");
				response = jin.next();
			}while(!(response.equals("yes") || response.equals("no")));
			if(response.equals("no"))
			{
				playing = !playing;
			}
		}
	}
}