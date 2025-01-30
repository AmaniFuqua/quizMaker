package quizMaker;

import java.util.ArrayList;



public class Quiz
	{

		public static void main(String[] args)
			{
				String [] Answers = { "I taste good." , "May go splat maybe not.","it goes splat, its red and sticky.","plant me in the spring!", "The code will not execute."};
				
			}

		static ArrayList<Questions>board = new ArrayList<Questions>();
		public static void fillBoard()
		{
			board.add(new Questions("Fruit x = new Strawberry();  x.quish() What would print:  ",1));
			board.add(new Questions("Fruit x = new Strawberry();  x.quish() What would print:  ",1));
			board.add(new Questions("Fruit x = new Strawberry();  x.quish() What would print:  ",1));
			board.add(new Questions("Fruit x = new Strawberry();  x.quish() What would print:  ",1));
			board.add(new Questions("Fruit x = new Strawberry();  x.quish() What would print:  ",1));
			board.add(new Questions("Fruit x = new Strawberry();  x.quish() What would print:  ",1));
			board.add(new Questions("Fruit x = new Strawberry();  x.quish() What would print:  ",1));
			board.add(new Questions("Fruit x = new Strawberry();  x.quish() What would print:  ",1));
			board.add(new Questions("Fruit x = new Strawberry();  x.quish() What would print:  ",1));
			board.add(new Questions("Fruit x = new Strawberry();  x.quish() What would print:  ",1));
			board.add(new Questions("Fruit x = new Strawberry();  x.quish() What would print:  ",1));
			board.add(new Questions("Fruit x = new Strawberry();  x.quish() What would print:  ",1));
			
			
		}
	}
