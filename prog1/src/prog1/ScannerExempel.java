package prog1;


import java.util.Scanner; // <- VIKTIG

public class ScannerExempel {



	public static void main( String[]args )
{
	Scanner input = new Scanner	(System.in);
	
	System.out.print("skriv namn:");
	String namn = input.nextLine();
	
	System.out.print("skriv ålder:");
	int ålder = input.nextInt();
	
	System.out.print("skriv längd:");
	double längd = input.nextDouble();
	
	System.out.println( namn+" är "+ålder+" år gammal och "+ längd+"m lång." );
	System.out.println( "stämmer det?" ); 
	
	

}
}