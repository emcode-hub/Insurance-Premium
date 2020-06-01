import java.math.BigDecimal;

public final class Vehicle {
	private BigDecimal vehicleValue;

	Vehicle(String string){
		setVehicleValue(string);
	}

	private void setVehicleValue(String desiredVehicleValue) {
		if(valueIsValid(desiredVehicleValue)) {
			this.vehicleValue = new BigDecimal(desiredVehicleValue);
		}
		else {
			this.vehicleValue = BigDecimal.ZERO;
		}
	}

	private boolean valueIsValid(String userInput) {
		try {
			Double.parseDouble(userInput);
			if(Double.valueOf(userInput)<0) {
				throw new NumberFormatException();
			}
			return true;
		}
		catch(Exception e){
			System.out.println("\"" + userInput +"\" is not a valid value. Value must be a positive number. Setting value to 0.");
			return false;
		}
	}

	public BigDecimal getVehicleValue(){
		return vehicleValue;
	}
}