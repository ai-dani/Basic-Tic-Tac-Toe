import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) 
	{
		
		//scanner to get input from user
		Scanner in = new Scanner(System.in);
		
		//counts rounds in case of draw
		int count = 0;
		
		//use 2d array to store O/X data
		String[][] slots = new String[3][3];
		
		//fills in variables (for code)
		slots[0][0] = "TL";
		slots[0][1] = "TC";
		slots[0][2] = "TR";
		slots[1][0] = "ML";
		slots[1][1] = "MC";
		slots[1][2] = "MR";
		slots[2][0] = "BL";
		slots[2][1] = "BC";
		slots[2][2] = "BR";
		
		//game description/intro, name
		System.out.println("Let's play a really crappy game of tic tac toe!");
		
		System.out.print("Player 1 Name: ");
		String p1 = in.next();
		
		System.out.print("Player 2 Name: ");
		String p2 = in.next();
		
		System.out.println("\nLet's begin...");
		
		System.out.println("----------------------");
		display(slots);
		System.out.println("----------------------");
		
		//iterate through until winner                            or draw (9 rounds)
		while(winnerO(slots) == false && winnerX(slots) == false && count != 9)
		{
			//need if statement for some reason, cause winner is not registering with
			//in.next input of next player
			if(winnerO(slots) == false && winnerX(slots) == false && count != 9)
			{
			System.out.println("\n" + p1 + ", type in code to fill (O): ");
			String whereO = in.next();
			
			p1Decide(whereO, slots);
			System.out.println("----------------------");
			display(slots);
			System.out.println("----------------------");
			
			count++;
			}
			
			System.out.println();
			
			if(winnerO(slots) == false && winnerX(slots) == false && count != 9)
			{
			System.out.println("\n" + p2 + ", type in code to fill (O): ");
			System.out.println("Type in code to fill (X): ");
			String whereX = in.next();
			p2Decide(whereX, slots);
			System.out.println("----------------------");
			display(slots);	
			System.out.println("----------------------");
			
			count++;
			}
		}
		
		System.out.println();
		
		if(winnerO(slots) == true)
		{
			System.out.println("Congratulations, " + p1 + ". You won lol");
		}
		else if(winnerX(slots) == true)
		{
			System.out.println("Congratulations, " + p2 + ". You won lol");
		}
		else
		{
			System.out.println("It's a draw.");
		}

	}
	
	//--------------------------------------------------------------------------------------------------//
	//Check if Player 1 Wins Method
	//--------------------------------------------------------------------------------------------------//
	public static Boolean winnerO(String slots[][])
	{
		//O WINNER
		
		//HORIZONTAL
		if(slots[0][0].equals("O") && slots[0][1].equals("O") && slots[0][2].equals("O"))
		{
			return true;
		}
		else if(slots[1][0].equals("O") && slots[1][1].equals("O") && slots[1][2].equals("O"))
		{
			return true;
		}
		else if(slots[2][0].equals("O") && slots[2][1].equals("O") && slots[2][2].equals("O"))
		{
			return true;
		}
		
		//VERTICAL
		else if(slots[0][0].equals("O") && slots[1][0].equals("O") && slots[2][0].equals("O"))
		{
			return true;
		}
		else if(slots[0][1].equals("O") && slots[1][1].equals("O") && slots[2][1].equals("O"))
		{
			return true;
		}
		else if(slots[0][2].equals("O") && slots[1][2].equals("O") && slots[2][2].equals("O"))
		{
			return true;
		}
		
		//DIAGONAL
		else if(slots[0][0].equals("O") && slots[1][1].equals("O") && slots[2][2].equals("O"))
		{
			return true;
		}
		else if(slots[0][2].equals("O") && slots[1][1].equals("O") && slots[2][0].equals("O"))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}

	//--------------------------------------------------------------------------------------------------//
	//Check if Player 2 Wins Method
	//--------------------------------------------------------------------------------------------------//
	
	public static Boolean winnerX(String slots[][])
	{
		//O WINNER
		
		//HORIZONTAL
		if(slots[0][0].equals("X") && slots[0][1].equals("X") && slots[0][2].equals("X"))
		{
			return true;
		}
		else if(slots[1][0].equals("X") && slots[1][1].equals("X") && slots[1][2].equals("X"))
		{
			return true;
		}
		else if(slots[2][0].equals("X") && slots[2][1].equals("X") && slots[2][2].equals("X"))
		{
			return true;
		}
		
		//VERTICAL
		else if(slots[0][0].equals("X") && slots[1][0].equals("X") && slots[2][0].equals("X"))
		{
			return true;
		}
		else if(slots[0][1].equals("X") && slots[1][1].equals("X") && slots[2][1].equals("X"))
		{
			return true;
		}
		else if(slots[0][2].equals("X") && slots[1][2].equals("X") && slots[2][2].equals("X"))
		{
			return true;
		}
		
		//DIAGONAL
		else if(slots[0][0].equals("X") && slots[1][1].equals("X") && slots[2][2].equals("X"))
		{
			return true;
		}
		else if(slots[0][2].equals("X") && slots[1][1].equals("X") && slots[2][0].equals("X"))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	//--------------------------------------------------------------------------------------------------//
	//DISPLAY METHOD
	//--------------------------------------------------------------------------------------------------//
	public static void display(String slots[][])
	{
		for(int r = 0; r < slots.length; r ++)
		{
			for(int c = 0; c < slots[r].length; c++)
			{	//print f statement tabs the seat values
				System.out.printf("%-10s", slots[r][c]);
			}
			System.out.println();
		}
		
	}
	
	//--------------------------------------------------------------------------------------------------//
	//Player 1's Decision Method
	//--------------------------------------------------------------------------------------------------//
	public static void p1Decide(String whereO, String slots[][])
	{
		
		Scanner in = new Scanner(System.in);
		
		if(whereO.equals("TL") && slots[0][0] != "X")
		{
			slots[0][0] = "O";
		}
		else if(whereO.equals("TC") && slots[0][1] != "X")
		{
			slots[0][1] = "O";
		}
		else if(whereO.equals("TR") && slots[0][2] != "X")
		{
			slots[0][2] = "O";
		}
		else if(whereO.equals("ML") && slots[1][0] != "X")
		{
			slots[1][0] = "O";
		}
		else if(whereO.equals("MC") && slots[1][1] != "X")
		{
			slots[1][1] = "O";
		}
		else if(whereO.equals("MR") && slots[1][2] != "X")
		{
			slots[1][2] = "O";
		}
		else if(whereO.equals("BL") && slots[2][0] != "X")
		{
			slots[2][0] = "O";
		}
		else if(whereO.equals("BC") && slots[2][1] != "X")
		{
			slots[2][1] = "O";
		}
		else if(whereO.equals("BR") && slots[2][2] != "X")
		{
			slots[2][2] = "O";
		}
		else
		{
			System.out.println("invalid! Try again!");
			System.out.println("Type in code to fill (O): ");
			String whereOagain = in.next();
			p1Decide(whereOagain, slots);		
		}
	}
	
	//--------------------------------------------------------------------------------------------------//
	//Player 2's Decision Method
	//--------------------------------------------------------------------------------------------------//
	public static void p2Decide(String whereX, String slots[][])
	{
		Scanner in = new Scanner(System.in);
		
		if(whereX.equals("TL") && slots[0][0] != "O")
		{
			slots[0][0] = "X";
		}
		else if(whereX.equals("TC") && slots[0][1] != "O")
		{
			slots[0][1] = "X";
		}
		else if(whereX.equals("TR") && slots[0][2] != "O")
		{
			slots[0][2] = "X";
		}
		else if(whereX.equals("ML") && slots[1][0] != "O")
		{
			slots[1][0] = "X";
		}
		else if(whereX.equals("MC") && slots[1][1] != "O")
		{
			slots[1][1] = "X";
		}
		else if(whereX.equals("MR") && slots[1][2] != "O")
		{
			slots[1][2] = "X";
		}
		else if(whereX.equals("BL") && slots[2][0] != "O")
		{
			slots[2][0] = "X";
		}
		else if(whereX.equals("BC") && slots[2][1] != "O")
		{
			slots[2][1] = "X";
		}
		else if(whereX.equals("BR") && slots[2][2] != "O")
		{
			slots[2][2] = "X";
		}
		else
		{
			System.out.println("invalid! Try again!");
			System.out.println("Type in code to fill (X): ");
			String whereXagain = in.next();
			p2Decide(whereXagain, slots);		
		}
	}

}
