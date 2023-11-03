public class HeavyVehicle extends Vehicle{

	public HeavyVehicle(int no_persons) {
		super(no_persons);
	}

	public double calToll() {
		int extraCharges =0;
		if(no_persons > 2) {
			extraCharges = (no_persons - 6)* 100;
		}
		double toll = super.calToll()+ extraCharges;
		return toll;
	}
}
