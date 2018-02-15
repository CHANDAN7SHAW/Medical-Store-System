package beans;

public class Customer {
	
	private String c_ph_no,c_name,c_email,c_address;

	public String getC_ph() {
		return c_ph_no;
	}

	public void setC_ph(String c_ph_no) {
		this.c_ph_no = c_ph_no;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_email() {
		return c_email;
	}

	public void setC_email(String c_email) {
		this.c_email = c_email;
	}

	public String getC_address() {
		return c_address;
	}

	public void setC_address(String c_address) {
		this.c_address = c_address;
	}

	@Override
	public String toString() {
		return "Customer [c_ph=" + c_ph_no + ", c_name=" + c_name + ", c_email="
				+ c_email + ", c_address=" + c_address + "]";
	}

	

}
