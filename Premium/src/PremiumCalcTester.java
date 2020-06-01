import java.util.ArrayList;

public class PremiumCalcTester {
	public static void main(String[] args) {
		
		Vehicle car1 = new Vehicle("77000");
		Vehicle car2 = new Vehicle("test");
		Vehicle car3 = new Vehicle("-6573");
		Vehicle car4 = new Vehicle("47000.96");
		Vehicle car5 = new Vehicle("0");
		Vehicle car6 = new Vehicle("zero");
		Vehicle car7 = new Vehicle("-1");
		Vehicle car8 = new Vehicle("");	
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		
		vehicleList.add(car1);
		vehicleList.add(car2);
		vehicleList.add(car3);
		vehicleList.add(car4);
		vehicleList.add(car5);
		vehicleList.add(car6);
		vehicleList.add(car7);
		vehicleList.add(car8);
		
		VehiclePremiumCalculator premiumCalculator = new VehiclePremiumCalculator(vehicleList);
		
		System.out.println("The final premium is " + premiumCalculator.getResultinDollars());
	}
}