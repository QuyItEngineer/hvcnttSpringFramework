package day3;

public class Address {
	private String numberAddress;

	public String getNumberAddress() {
		return numberAddress;
	}

	public void setNumberAddress(String numberAddress) {
		this.numberAddress = numberAddress;
	}
	
	@Override
	public String toString() {
		return this.numberAddress+".";
	}
}
