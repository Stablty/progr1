package prog1;
	import java.util.Scanner;
public class ovn23 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in);
		
		System.out.print("skriv ålder");
		int ålder = input.nextInt();// 17
		
		int svar=(int)(ålder/10.0);   //      17/10=1,7     1
		
		int svar2 =svar*10 ;    //  10

		int svar3 = svar2+10;    // 20
		
		int årKvar= svar3-ålder;
		
		System.out.println("du har"+årKvar+"år kvar tills du fyller"+svar3);
		
	
	
	
	
	}
	
}
