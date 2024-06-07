package in.student;
public class address
{   
	private int houseno;
	private String city;
	private long pin;
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "hno is : "+houseno+" city is : "+city+" pin code is : "+pin;
	}
	
}
