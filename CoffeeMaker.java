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
import java.io.*;

public class CoffeeMaker {

			int pot = 0;
			int cup = 0;
			int brew = 0;
			int ounces = 0;
			int cups = 0;
			int power = 0;
			int fillCup = 0;
			int fillPot = 0;
			int plateWarmer = 0;
			int warmPlate = 0;
			int waterTank = 0;
			int coffeeFilter = 0;
			int coffeeGrinds = 0;
			int coffeePod = 0;
			
			void turnOn(int newValue){ 
				power = newValue;
			}
			
			void selectPot(int newValue){
				pot = newValue;
			}
			
			void selectCups(int newValue){
				cups = newValue;
			}
			
			void selectCup(int newValue){
				cup = newValue;
			}
			
			void selectBrew(int newValue){
				brew = newValue;
			}
			
			void makeCoffeePot(int increment, int decrement){
				
					fillPot = fillPot + increment;
				    waterTank = decrement - fillPot;
			}
			
			void makeCoffeeCup(int increment, int decrement){
				
				fillCup = fillCup + increment;
				waterTank = decrement - fillCup;
			}
			
			void selectOunces(int newValue){
				ounces = newValue;
			}
			
			void turnOnPlateWarmer(int newValue){
				plateWarmer = newValue;
			}
			
			void keepPotWarm(int increment){
				warmPlate = warmPlate + increment;
			}
			
			void addWater(int increment){ 
				waterTank = waterTank + increment;
			}
			
			void changeFilter(int newValue){
				coffeeFilter = newValue;
			}
			
			void addCoffeeGrinds(int increment){
				coffeeGrinds = coffeeGrinds + increment;
			}
			
			void changeCoffeePod(int newValue){
				coffeePod = newValue;
			}
			
			void printPotState() {
			IO.println("power button, on or off: " +
			power + ", Select Pot: " + pot + ", Select Cups: " + cups + ", Select Brew: "  + 
			brew + ", Make A Pot: " + fillPot + ", Plate Warmer, On or Off: " +
			plateWarmer + ", Keep Pot Warm: " + warmPlate + ", Fill Water Tank: " + waterTank + 
			", Change Filter: " + coffeeFilter + ", Measure Coffee Grinds: " + coffeeGrinds );
			}
					
			void printCupState() {
			IO.println("power button, on or off: " +
			power + ", Select Cup: " + cup + ", Select Ounces: " + ounces + ", Select Brew: " + brew +
			", Make A Cup: " + fillCup + ", Fill Water Tank: " +
			waterTank + ", insert coffee pod: " + coffeePod);
			}
			
			void writeLog() {
				
				try (FileWriter logWriter = new FileWriter("log.txt", true)) {
				      
					logWriter.write("\nPot: " + "power button, on or off: " + power + ", Select Pot: " + pot + 
							", Select Cups: " + cups + ", Select Brew: "  + 
							brew + ", Make A Pot: " + fillPot + ", Plate Warmer, On or Off: " +
							plateWarmer + ", Keep Pot Warm: " + warmPlate + ", Fill Water Tank: " + waterTank + 
							", Change Filter: " + coffeeFilter + ", Measure Coffee Grinds: " + coffeeGrinds +
							
							"\nCup: " + "power button, on or off: " +
							power + ", Select Cup: " + cup + ", Select Ounces: " + ounces + ", Select Brew: " + brew +
							", Make A Cup: " + fillCup + ", Fill Water Tank: " +
							waterTank + ", insert coffee pod: " + coffeePod);
					
					System.out.println("\nSuccessfully appended to the file.");
					logWriter.close();
					
			    } catch (IOException e) 
				{
			      
			    	System.out.println("An error occurred.");
			    	e.printStackTrace();
			    }
			}
			
}
