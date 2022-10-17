package prog1;
	import java.util.Scanner;
	
	public class Kassa{
		   
	public static void main(String[] args) {
	
	Scanner input = new Scanner( System.in);
	
	System.out.print("Vad kostar varorna?");
		int kostnad= input.nextInt();
	
	
	System.out.print("Vad betalar kunden med?");
		int betalar= input.nextInt();
	
	int tillbaka= betalar-kostnad;
	
	int svar1=tillbaka/500;
	int rest1=tillbaka%500;
	
	
	int svar2=rest1/200;
	int rest2=rest1%200;
	
	
	int svar3=rest2/100;
	int rest3=rest2%100;
	
	
	int svar4=rest3/50;
	int rest4=rest3%50;
	
	int svar5=rest4/20;
	int rest5=rest4%20;
	
	
	int svar6=rest5/10;
	int rest6=rest5%10;
	
	
	int svar7=rest6/5;
	int rest7=rest6%5;
			
	int svar8=rest7/2;
	int rest8=rest7%2;
	
	int svar9=rest8/1;
	int rest9=rest8%1;
	
	
	System.out.println("femhundra"+ svar1+"st");
	System.out.println("tvåhundra"+ svar2+"st");
	System.out.println("hundra"+ svar3+"st");
	System.out.println("femtio"+ svar4+"st");
	System.out.println("tjugo"+ svar5+"st");
	System.out.println("tio"+ svar6+"st");
	System.out.println("fem"+ svar7+"st");
	System.out.println("två"+ svar8+"st");
	System.out.println("ett"+ svar9+"st");
	
	}
	
	}