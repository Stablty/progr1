package prog1;

import javax.swing.JOptionPane;

public class Strings1 {

	public static void main(String[] args) {
		
		
		String förnamn= JOptionPane.showInputDialog("ange ditt förnamn");	
		
		String efternamn= JOptionPane.showInputDialog("ange ditt efternamn");	
		

	
	int längd = förnamn.length();
	
	char tecken= förnamn.charAt(förnamn.length()-1);
	
	int pos = förnamn.lastIndexOf("");
	
	int posmellan = förnamn.IndexOf('a');
	
	
	int längd1 = efternamn.length();
	
	char tecken1= efternamn.charAt(efternamn.length()-1);
	
	int pos1 = efternamn.lastIndexOf("");
	
	
	System.out.println(förnamn+"  "+längd+"  "+tecken1+"  "+pos+"  "+efternamn+"  "+längd1+"  "+tecken1+"  "+pos1 );
		
		
		
	}
	
	
	
	
	
	
	
}
