package labExam;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		
		System.out.println("Please enter two numbers : ");
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println("the greatest number is : ");
		if(a>b) {
			System.out.println(a);
		}else
			System.out.println(b);
	
	}

}
