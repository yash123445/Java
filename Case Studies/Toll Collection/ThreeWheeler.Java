public class ThreeWheeler extends Vehicle{

	public ThreeWheeler(int no_persons) {
		super(no_persons);
	}

	@Override
	public double calToll() {
		int extraCharges = 0;
		if(no_persons>3) {
			extraCharges = (no_persons - 3) * 20;
		}
		double toll = super.calToll()+ extraCharges;
		return toll;
	}

}
