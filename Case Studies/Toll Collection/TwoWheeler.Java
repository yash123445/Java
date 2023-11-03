public class TwoWheeler extends Vehicle{

	public TwoWheeler(int no_persons) {
		super(no_persons);
		
	}

	@Override
	public double calToll() {
		int extraCharges =0;
		if(no_persons > 2) {
			extraCharges = (no_persons - 2)* 10;
		}
		double toll = super.calToll()+ extraCharges;
		return toll;
	}
	
}
