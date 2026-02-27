/**
 * Coffee Maker Technology by Gary Krisjon Wetter
 * Copyright (c), Gary Krisjon Wetter. All Rights Reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Gary Krisjon Wetter or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 * @author Gary Krisjon Wetter
 * @version 1.0
 * @since 1.0
 * 
 */

package test.coffeeapp;

import java.util.Scanner; 
//import java.io.File;
//import java.io.IOException;
//import java.io.FileWriter;
import java.io.*;

public class CoffeeMakerDemo {
	
	public static void main(String[] args ) {
			
			CoffeeMaker coffeePot = new CoffeeMaker();
			CoffeeMaker coffeeCup = new CoffeeMaker();
			
			System.out.println("\nCoffee Maker Technology v1.0\n by Gary K Wetter\n Make a great pot or cup"
					+ " of coffee.\n");
			Scanner scanner = new Scanner(System.in); 
			
			try {
			      	File logFile = new File("log.txt"); // Create File object
			      	
			      		if (logFile.createNewFile()) 
			      		{           // Try to create the file
			      				System.out.println("File created: " + logFile.getName());
			      		} else 
			      		{
			      				System.out.println("Log File is ready\n");
			      		}
			    } catch (IOException e) 
				{
			    	System.out.println("An error occurred.");
			    	e.printStackTrace(); // Print error details
			    }
		   
			System.out.println("Turn On The Coffee Pot:");
		    String powerSwitch = scanner.nextLine();  
		    
		    if(powerSwitch.equalsIgnoreCase("On"))
		    {
		    	coffeePot.turnOn(1);
		    	coffeeCup.turnOn(1);
		    	
		    	System.out.println("Enter Coffee Pot or Coffee Cup");
		    	String userSelection = scanner.nextLine();
		    
		    
		    	if (userSelection.equalsIgnoreCase("Coffee Pot")) 
		    	{
		    		coffeePot.selectPot(1);
				
		    		System.out.println("Select Cups, 8, 10, or 12\n");
		    		int selectCups = 0;
		    		
		    		if ((selectCups == 0)&&(scanner.hasNextInt()))
			    	{
		    			selectCups = scanner.nextInt();
		    			if((selectCups == 8)||(selectCups == 10)||(selectCups == 12))
	    				{
	    						coffeePot.selectCups(selectCups);
	    						System.out.println("Cups Selected " + coffeePot.cups);
	    				}
	    				else
	    				{
	    					System.out.println("invalid selection");
	    				}
		    		}
		    		else
		    		{
		    			System.out.println("Please Enter the number of cups to make. 8, 10, or 12");
		    			scanner.next();
		    			
		    			if ((selectCups == 0)&&(scanner.hasNextInt())) 
		    			{
		    				selectCups = scanner.nextInt();
		    				if((selectCups == 8)||(selectCups == 10)||(selectCups == 12))
		    				{
		    						coffeePot.selectCups(selectCups);
		    						System.out.println("Cups Selected " + coffeePot.cups);
		    				}
		    				else
		    				{
		    					System.out.println("invalid selection");
		    				}
		    			}
		    			else
		    			{
		    				System.out.println("Please Enter the number of cups to make.");
			    			scanner.next();
		    			}
		    		}
		    	
		    		
		    		System.out.println("Add Water\n");
		    		int fillWaterTank = 0;
		    		
		    		if ((fillWaterTank == 0)&&(scanner.hasNextInt()))
			    	{
		    			fillWaterTank = scanner.nextInt();
		    			coffeePot.addWater(fillWaterTank);
		    			System.out.println("Water Added " + coffeePot.waterTank);
		    		}
		    		else
		    		{
		    			System.out.println("Please fill the water tank.");
		    			scanner.next();
		    			
		    			if ((fillWaterTank == 0)&&(scanner.hasNextInt())) 
		    			{
		    				fillWaterTank = scanner.nextInt();
		    				coffeePot.addWater(fillWaterTank);
		    				System.out.println("Water Added " + coffeePot.waterTank);
		    			}
		    			else
		    			{
		    				System.out.println("Please fill the water tank.");
			    			scanner.next();
		    			}
		    		}
		    		
		    		System.out.println("Change Filter\n");
		    		int changeCoffeeFilter = 0; 
		    		
		    		if ((changeCoffeeFilter == 0)&&(scanner.hasNextInt()))
			    	{
		    			changeCoffeeFilter = scanner.nextInt();
		    			coffeePot.changeFilter(changeCoffeeFilter);
		    			System.out.println("Filter Changed " + coffeePot.coffeeFilter);
		    		}
		    		else
		    		{
		    			System.out.println("Please change the filter.");
		    			scanner.next();
		    			
		    			if ((changeCoffeeFilter == 0)&&(scanner.hasNextInt())) 
		    			{
		    				changeCoffeeFilter = scanner.nextInt();
		    				coffeePot.changeFilter(changeCoffeeFilter);
		    				System.out.println("Filter Changed " + coffeePot.coffeeFilter);
		    			}
		    			else
		    			{
		    				System.out.println("Please change the filter.");
			    			scanner.next();
		    			}	
		    		}
		    		
		    		
		    		System.out.println("Add Coffee Grinds\n");
		    		int fillCoffeeGrinds = 0;
		    		
		    		if ((fillCoffeeGrinds == 0)&&(scanner.hasNextInt()))
			    	{
		    			fillCoffeeGrinds = scanner.nextInt();
		    			coffeePot.addCoffeeGrinds(fillCoffeeGrinds);
		    			System.out.println("Coffee Added " + coffeePot.coffeeGrinds);
		    		}
		    		else
		    		{
		    			System.out.println("Please add coffee grinds.");
		    			scanner.next();
		    			
		    			if ((fillCoffeeGrinds == 0)&&(scanner.hasNextInt())) 
		    			{
		    				fillCoffeeGrinds = scanner.nextInt();
		    				coffeePot.addCoffeeGrinds(fillCoffeeGrinds);
		    				System.out.println("Coffee Added " + coffeePot.coffeeGrinds);
		    			}
		    			else
		    			{
		    				System.out.println("Please add coffee grinds.");
			    			scanner.next();
		    			}
		    		}
		    		
		    		
		    		System.out.println("Make Coffee\n");
		    		int brewPot = 0;
		    		
		    		if ((brewPot == 0)&&(scanner.hasNextInt()))
			    	{
		    			brewPot = scanner.nextInt();
		    			coffeePot.selectBrew(brewPot);
		    			System.out.println("Coffee Brewing " + coffeePot.brew);
		    		}
		    		else
		    		{
		    			System.out.println("Please Select 1 to Brew Coffee.");
		    			scanner.next();
		    			
		    			if ((brewPot == 0)&&(scanner.hasNextInt())) 
		    			{
		    				brewPot = scanner.nextInt();
		    				coffeePot.selectBrew(brewPot);
		    				System.out.println("Coffee Added " + coffeePot.brew);
		    			}
		    			else
		    			{
		    				System.out.println("Please select 1 to brew coffee.");
			    			scanner.next();
		    			}	
		    		}
		    		
		    		if ((brewPot == 1)&&(fillCoffeeGrinds == 1)&&(changeCoffeeFilter ==1)
		    		   &&(selectCups == 8)||(selectCups == 10)||(selectCups == 12)
		    		   &&(fillWaterTank <= 20))
			    	{
		    			coffeePot.makeCoffeePot(selectCups,fillWaterTank);
			    		coffeePot.turnOnPlateWarmer(1);
			    		coffeePot.keepPotWarm(8);
			    		coffeePot.printPotState();
			    		coffeePot.writeLog();
		    		}
		    		else
		    		{
		    			
		    				System.out.println("Unable to Make Cofee. Try Again.");
			    		
		    		}
		    	}
		    	else if (userSelection.equalsIgnoreCase("Coffee Cup")) 
		    	{
		    		//
		    		
					System.out.println("Select Cup\n");
		    		int selectCup = 0;
		    		
		    		if ((selectCup == 0)&&(scanner.hasNextInt()))
			    	{
		    			selectCup = scanner.nextInt();
		    			coffeeCup.selectCup(selectCup);
		    			System.out.println("Cup Selected " + coffeeCup.cup);
		    		}
		    		else
		    		{
		    			System.out.println("Please Select Cup.");
		    			scanner.next();
		    			
		    			if ((selectCup == 0)&&(scanner.hasNextInt())) 
		    			{
		    				selectCup = scanner.nextInt();
		    				coffeeCup.selectCup(selectCup);
		    				System.out.println("Cup Selected " + coffeeCup.cup);
		    			}
		    			else
		    			{
		    				System.out.println("Please Select Cup.");
			    			scanner.next();
		    			}	
		    		}
		    		//
		    		
		    		System.out.println("Select Cup Size, 8, 10, or 12 Ounces\n");
		    		int selectCupSize = 0;
		    		
		    		if ((selectCupSize == 0)&&(scanner.hasNextInt()))
			    	{
		    			selectCupSize = scanner.nextInt();
		    			if((selectCupSize == 8)||(selectCupSize == 10)||(selectCupSize == 12))
	    				{
	    						coffeeCup.selectOunces(selectCupSize);
	    						System.out.println("Cup Size Seleected " + coffeeCup.ounces);
	    				}
	    				else
	    				{
	    					System.out.println("invalid selection");
	    				}
		    		}
		    		else
		    		{
		    			System.out.println("Please Select Cup Size.");
		    			scanner.next();
		    			
		    			if ((selectCupSize == 0)&&(scanner.hasNextInt()))
		    			{
		    				selectCupSize = scanner.nextInt();
			    			if((selectCupSize == 8)||(selectCupSize == 10)||(selectCupSize == 12))
		    				{
		    						coffeeCup.selectOunces(selectCupSize);
		    						System.out.println("Cup Size Seleected " + coffeeCup.ounces);
		    				}
		    				else
		    				{
		    					System.out.println("invalid selection");
		    				}
		    			}
		    			else
		    			{
		    				System.out.println("Please Select Cup Size.");
			    			scanner.next();
		    			}	
		    		}
		    		//
		    		
		    		System.out.println("Change Coffee Pod\n");
		    		int changePod = 0;
		    		
		    		if ((changePod == 0)&&(scanner.hasNextInt()))
			    	{
		    			changePod = scanner.nextInt();
		    			coffeeCup.changeCoffeePod(changePod);
		    			System.out.println("Pod Changed " + coffeeCup.coffeePod);
		    		}
		    		else
		    		{
		    			System.out.println("Please Change Coffee Pod.");
		    			scanner.next();
		    			
		    			if ((changePod == 0)&&(scanner.hasNextInt()))
				    	{
			    			changePod = scanner.nextInt();
			    			coffeeCup.changeCoffeePod(changePod);
			    			System.out.println("Pod Changed " + coffeeCup.coffeePod);
			    		}
		    			else
		    			{
		    				System.out.println("Please Change Coffee Pod.");
			    			scanner.next();
		    			}	
		    		}
		    		//
		    		
		    		System.out.println("Add Water\n");
		    		int fillWaterTank = 0;
		    		
		    		if ((fillWaterTank == 0)&&(scanner.hasNextInt()))
			    	{
		    			fillWaterTank = scanner.nextInt();
		    			coffeeCup.addWater(fillWaterTank);
		    			System.out.println("Water Added " + coffeeCup.waterTank);
		    		}
		    		else
		    		{
		    			System.out.println("Please fill the water tank.");
		    			scanner.next();
		    			
		    			if ((fillWaterTank == 0)&&(scanner.hasNextInt())) 
		    			{
		    				fillWaterTank = scanner.nextInt();
		    				coffeeCup.addWater(fillWaterTank);
		    				System.out.println("Water Added " + coffeeCup.waterTank);
		    			}
		    			else
		    			{
		    				System.out.println("Please fill the water tank.");
			    			scanner.next();
		    			}
		    		}
		    		//
		    		
		    		System.out.println("Make Coffee\n");
		    		int brewCup = 0;
		    		
		    		if ((brewCup == 0)&&(scanner.hasNextInt()))
			    	{
		    			brewCup = scanner.nextInt();
		    			coffeeCup.selectBrew(brewCup);
		    			System.out.println("Coffee Brewing " + coffeeCup.brew);
		    		}
		    		else
		    		{
		    			System.out.println("Please Select 1 to Brew Coffee.");
		    			scanner.next();
		    			
		    			if ((brewCup == 0)&&(scanner.hasNextInt())) 
		    			{
		    				brewCup = scanner.nextInt();
		    				coffeeCup.selectBrew(brewCup);
		    				System.out.println("Coffee Brewing " + coffeeCup.brew);
		    			}
		    			else
		    			{
		    				System.out.println("Please select 1 to brew coffee.");
			    			scanner.next();
		    			}	
		    		}
		    		//
		    		
		    		if ((brewCup == 1)&&(changePod == 1)
				       &&(selectCupSize == 8)||(selectCupSize == 10)||(selectCupSize == 12)
				       &&(fillWaterTank <= 20))
					{
				    	coffeeCup.makeCoffeeCup(selectCupSize,fillWaterTank);
						coffeeCup.printCupState();
						coffeeCup.writeLog();
						
				    }
				    else
				    {
				    			
				    	System.out.println("Unable to Make Coffee. Try Again.");
					    		
				    }
		    		
		    	}
		    	else
		    	{
		    		System.out.println("Error " + userSelection);
		    	}	
		    }
		    else
		    {
		    	System.out.println("Error " + powerSwitch);
		    }
		    scanner.close();
		    
	}
}
