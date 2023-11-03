public class FourWheeler extends Vehicle{

	public FourWheeler(int no_persons) {
		super(no_persons);
	}

	public double calToll() {
		int extraCharges =0;
		if(no_persons > 2) {
			extraCharges = (no_persons - 4)* 40;
		}
		double toll = super.calToll()+ extraCharges;
		return toll;
	}
}
