
public class Decrypter 
{
	public String decrypt(String fourDigit)
	{
		int arr[] = new int[4];
	     for(int i=0;i<4;i++) 
	      {
	          char ch = fourDigit.charAt(i);
	           arr[i] = Character.getNumericValue(ch);
	           
	           if(arr[i] < 7)
	           {
	        	   arr[i] += 3;
	           }
	           
	           else
	           {
	        	   arr[i] -= 7;
	           }
			   
	      }
//iterate through each index of string fourDigit. At each index, get numeric value
//of the character. perform arithmetic operations. store value in integer array.     
		int temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		temp = arr[1];
		arr[1] = arr[3];
		arr[3] = temp;
		
//first digit swapped with the third, and the second digit swapped with the fourth. 
	 
	       String output = "";
		     for(int i=0;i<4;i++) 
	       {
		       output += Integer.toString(arr[i]);   
	       }
	       
		   return output;	          

    }
//Iterating through the array to convert it back into a string 
}
