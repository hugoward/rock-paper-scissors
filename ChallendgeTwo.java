//Write a program that plays Rock Paper Scissors. 
//It should take a user input of either paper, 
//scissors or rock, and then play against a computer opponent and print the winner.

import java.util.Scanner;

public class ChallendgeTwo {

	public static void main(String[] args) {
		int s=1;
		int p=2;
		int r=3;
		int computer = (int) (Math.random() * (3 -1) + 1); //(int)(Math.random() * (3 -1) + 1);
		boolean stuff =true;
		
		System.out.println("enter r/p/s: ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		
		//while (stuff);
		{
			//Paper
			if(input==p && computer == 1 && p>1)
			{
				System.out.println("Computer wins");
			}
			else if(input==p && computer == 3 && p<3)
			{
				System.out.println("You win");
			}
			else if(input==p && computer == 2 && p == 2)
			{
				System.out.println("Draw");
			}
			//Scissors
			else if(input==s && computer == 2 && s<2)
			{
				System.out.println("You win");
			}
			else if(input==s &&computer == 3 && s<3)
			{
				System.out.println("Computer wins");
			}
			else if(input==s && computer == 1 &&s == 1)
			{
				System.out.println("Draw");
			}
			//Rock
			else if(input==r &&computer == 1 && r>1 && r>=2)
			{
				System.out.println("You win");
			}
			else if(input==r && computer == 2&& r<=2)
			{
				System.out.println("Computer wins");
			}
			else if(input==r && computer == 3 &&r == 3)
			{
				System.out.println("Draw");
			}
			stuff=false;
	}
		

	}

}
