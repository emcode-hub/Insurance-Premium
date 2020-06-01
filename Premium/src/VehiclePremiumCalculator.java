import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class VehiclePremiumCalculator {
	private BigDecimal result;
	private ArrayList<Vehicle> vehiclesToCalculate;
	static final BigDecimal COLLISION_FACTOR = new BigDecimal("4.47");//assumption: same factor for all vehicles

	public VehiclePremiumCalculator(ArrayList<Vehicle> vehicleList) {
		this.vehiclesToCalculate = vehicleList;
		this.result = calculateResult();
	}

	private BigDecimal calculateResult() {
		BigDecimal sum = BigDecimal.ZERO;
		Iterator<Vehicle> vehicleIterator = vehiclesToCalculate.iterator();
		while(vehicleIterator.hasNext()) {
				sum = sum.add(vehicleIterator.next().getVehicleValue().multiply(COLLISION_FACTOR));
		}
		return sum;
	}

	public String getResultinDollars() {
		return NumberFormat.getCurrencyInstance(Locale.US).format(result);
	}	
}