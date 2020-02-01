import java.util.Scanner;
public class BMICalculator 
{
	float weight = 0;
	float height = 0;
	boolean isUnitImperial;
	float BMI = 0; 
	String category = "";
	Scanner input = new Scanner(System.in);
	
//must use readUnitType and readMeasurementData
	public void readUserData()
	{
		readUnitType();
		readMeasurementData();
		
	}
//prompt user for unit choice. Verify proper input and assign to boolean. Loop prompt until user puts proper input. 
	
	private void readUnitType()
	{
		
		String userInput;
		
		do 
		{
			System.out.print("Calculate BMI unit options: type \"imperial\" or \"metric\":");
			userInput = input.nextLine();
			
		} while (!userInput.contentEquals("imperial") && !userInput.contentEquals("metric") );
		
		if ( userInput.contentEquals("imperial"))
		{
			isUnitImperial = true;
		}
		else
		{
			isUnitImperial =false;
		}	
		
	}
	
//must call readMetricData or readImperialData
//check value of boolean variable. Call appropriate read method. 
	private void readMeasurementData()
	{
		if (isUnitImperial)
		{
			readImperialData();
		}
		else
		{
			readMetricData();
		}
		
		
	}
//prompt user to input height and weight and then set it. 
	private void readMetricData()
	{
		
		System.out.print("Please ener your height in meters:");
		setHeight(input.nextFloat());
		System.out.print("Please ener your weight in kilograms:");
		setWeight(input.nextFloat());
		
	}
//prompt user for height and weight and then set it. 
	private void readImperialData()
	{
		
		System.out.print("Please ener your height in inches:");
		setHeight(input.nextFloat());
		System.out.print("Please ener your weight in pounds:");
		setWeight(input.nextFloat());		
	}
// implement BMI equation for each unit type and then call calculateBmiCategory. 
	public void calculateBmi()
	{
		if(isUnitImperial)
		{
			BMI = (float) ((703 * weight) / Math.pow(height, 2.0));
		}
		else
		{
			BMI = (float) (weight / Math.pow(height, 2.0));
		}
		
		calculateBmiCategory();
	
	}
//method determines which category user falls under based on BMI value 
	private void calculateBmiCategory()
	{
		if (BMI < 18.5)
		{
			category = "Underweight";
		}
			
	   else if (BMI <25)
	   {
		   category = "Normal Weight";
	   }
	   else if (BMI <30)
	   {
		   category = "Overweight";
	   }
	   else 
	   {
		   category = "Obesity";
	   }		
	
	}
//Display of BMI value and category to the user
	public void displayBmi()
	{
		System.out.println("Your BMI is: " + BMI + " and your BMI category is: " + category);
	}
	
	public float getWeight()
	{
		return weight;
		
	}
// Program exits if the user tries to input a negative weight. Otherwise, storing the weight. 
	private void setWeight(float newWeight)
	{
		if (newWeight <0)
			System.exit(1);
			
		
		weight = newWeight;
	}
	
	public float getHeight()
	{
		return height;
	}
//Program exits if user tries to input negative height. Otherwise, storing the height. 	
	public void setHeight( float newHeight)
	{
		if (newHeight <0)
			System.exit(1);
		
		height = newHeight;
	}
	
	
	public float getBmi()
	{
		return BMI;
	}
	
	public String getBmiCategory()
	{
		return category;
	}



public static void main(String[] args) 
{
	BMICalculator app = new BMICalculator();
    app.readUserData();
    app.calculateBmi();
    app.displayBmi();
}

}