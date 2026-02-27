package test.coffeeapp;

interface CofeeeMaker {
	
	void turnOn(int newValue);
	void selectPot(int newValue);
	void selectCups(int newValue);
	void selectCup(int newValue);
	void selectBrew(int newValue);
	void makeCoffeePot(int increment, int decrement);
	void makeCoffeeCup(int increment, int decrement);
	void selectOunces(int newValue);
	void turnOnPlateWarmer(int newalue);
	void keepPotWarm(int increment);
	void addWater(int increment);
	void changeFilter(int newValue);
	void addCoffeeGrinds(int increment);
	void changeCoffeePod(int newValue);
	void printCupState();
	void writeLog();

}
