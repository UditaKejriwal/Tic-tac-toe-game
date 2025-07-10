package tictactoe;

import java.util.Scanner;

public class Tictactoe {
	static int[][] board=new int[3][3];
	static String[][] sboard=new String[3][3];
	public static void main(String args[]) {
		System.out.println("Welcome to tic tac toe game");
		int counter=1;
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				board[row][col]=counter;
				counter++;
			}
		}
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				sboard[row][col]="_";
			}
		}
		printboard();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which player plays first");
		String first= sc.next();
		System.out.println("Enter which player plays second");
		String second= sc.next();
		
		int[] player1=new int[5];
		int[] player2=new int[4];
		
		int a=0;
		int b=0;
		
		printboard();
		
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				board[row][col]=0;
			}
		}
		String winner="tie";
		boolean win=false;
		
		outerloop:
		for(int i=0;i<9;i++) {
			System.out.println("enter the box");
			int choice=sc.nextInt();
			if(i%2==0) {
				player1[a]= choice;
				a++;
				switch(choice) {
				case 1:
					board[0][0]=2;
					sboard[0][0]="X";
					break;
				case 2:
					board[0][1]=2;
					sboard[0][1]="X";
					break;
				case 3:
					board[0][2]=2;
					sboard[0][2]="X";
					break;
				case 4:
					board[1][0]=2;
					sboard[1][0]="X";
					break;
				case 5:
					board[1][1]=2;
					sboard[1][1]="X";
					break;
				case 6:
					board[1][2]=2;
					sboard[1][2]="X";
					break;
				case 7:
					board[2][0]=2;
					sboard[2][0]="X";
					break;
				case 8:
					board[2][1]=2;
					sboard[2][1]="X";
					break;
				case 9:
					board[2][2]=2;
					sboard[2][2]="X";
					break;
				}
			}else {
				player2[b]= choice;
				b++;
				switch(choice) {
				case 1:
					board[0][0]=1;
					sboard[0][0]="O";
					break;
				case 2:
					board[0][1]=1;
					sboard[0][1]="O";
					break;
				case 3:
					board[0][2]=1;
					sboard[0][2]="O";
					break;
				case 4:
					board[1][0]=1;
					sboard[1][0]="O";
					break;
				case 5:
					board[1][1]=1;
					sboard[1][1]="O";
					break;
				case 6:
					board[1][2]=1;
					sboard[1][2]="O";
					break;
				case 7:
					board[2][0]=1;
					sboard[2][0]="O";
					break;
				case 8:
					board[2][1]=1;
					sboard[2][1]="O";
					break;
				case 9:
					board[2][2]=1;
					sboard[2][2]="O";
					break;
				}
			}
			sprintboard();
			int var= board[0][1]&board[0][2]&board[0][0];
			if(var==2||var==1) {
				win=true;
				break outerloop;
			}
			var= board[1][1]&board[1][2]&board[1][0];
			if(var==2||var==1) {
				win=true;
				break outerloop;
			}
			var= board[2][1]&board[2][2]&board[2][0];
			if(var==2||var==1) {
				win=true;
				break outerloop;
			}
			var= board[0][0]&board[1][0]&board[2][0];
			if(var==2||var==1) {
				win=true;
				break outerloop;
			}
			var= board[0][1]&board[1][1]&board[2][1];
			if(var==2||var==1) {
				win=true;
				break outerloop;
			}
			var= board[0][2]&board[1][2]&board[2][2];
			if(var==2||var==1) {
				win=true;
				break outerloop;
			}
			var= board[0][0]&board[1][1]&board[2][2];
			if(var==2||var==1) {
				win=true;
				break outerloop;
			}
			var= board[0][2]&board[1][1]&board[2][0];
			if(var==2||var==1) {
				win=true;
				break outerloop;
			}
		
		}
		if(win==true) {
			if((sboard[1][1]=="X")||(sboard[0][1]=="X")||(sboard[2][1]=="X")) {
				winner=first;
			}
			else {
				winner=second;
			}
		}
		System.out.print(winner);
		
		
	}
	
	public static void printboard() {
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(board[row][col]+" ");
			}
			System.out.println();
		}
	}
	public static void sprintboard() {
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(sboard[row][col]+" ");
			}
			System.out.println();
		}
	}
}

