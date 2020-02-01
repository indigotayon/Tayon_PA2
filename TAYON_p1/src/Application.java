import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		Encrypter encryptObject = new Encrypter();
		
		
	    System.out.print("Enter a 4-digit integer to encrypt:");
	    String fourDigit = input.nextLine();
	    
	    String encrypted = encryptObject.encrypt(fourDigit);
	   
	  
	  
	    System.out.println("Your encrypted number is:" + encrypted);
	    
	  
	    
	    
	    Decrypter decryptObject = new Decrypter();
	    
	    System.out.print("Enter a 4-digit integer to decrypt:");
	    String fourDigit2 = input.nextLine();
	    
	    
	    String decrypted = decryptObject.decrypt(fourDigit2);
	    
	    System.out.print("Your decrypted number is:" + decrypted);
	    		


	}

}
//take user input and call on encrypt and decrypt classes. 
// store outputs from both classes to declared variables and print out results. 
