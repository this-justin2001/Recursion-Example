import java.util.Scanner;
public class recursionProject {
	public static int userSum(int userNum[],int count,int length){ //initializes array, termination counter, and length counter
		if(count == length) { //compares the array count to the length to detect 
			return 000; //returns null when end of array is reached
		}else{
			return userNum[count] + userSum(userNum,count + 1,length); // calculates sum, method calls itself to count
		}
	}
	public static void main(String[] args) {
		int num1,num2,num3,num4,num5; //initialization of user input variables
		int arrLen = 5,sumTotal = 0; //arrLen: tells program how long the array is, sumTotal: variable of calculated sum
		
		Scanner scnr = new Scanner(System.in); //Opens scanner, accepts user input
		
		System.out.println("Please enter your 5 numbers"); 
		num1 = scnr.nextInt();//Scans user int input
		num2 = scnr.nextInt();
		num3 = scnr.nextInt();
		num4 = scnr.nextInt();
		num5 = scnr.nextInt(); 
		scnr.close(); //closes scanner, not necessary but is good practice 
		
		int userNum[] = {num1,num2,num3,num4,num5}; //adds user input to array
		sumTotal = userSum(userNum,0,arrLen); // calls recursive method, count starts at 0
		
		System.out.println("Sum of numbers: " + sumTotal); //prints sum

	}

}
