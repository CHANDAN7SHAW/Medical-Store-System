package beans;

public class Supplier
{
	private String s_id,s_name,s_email,s_ph_no,s_vat_no;

	public String getS_id() {
		return s_id;
	}

	public void setS_id(String s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_email() {
		return s_email;
	}

	public void setS_email(String s_email) {
		this.s_email = s_email;
	}

	public String getS_ph_no() {
		return s_ph_no;
	}

	public void setS_ph_no(String s_ph_no) {
		this.s_ph_no = s_ph_no;
	}

	public String getS_vat_no() {
		return s_vat_no;
	}

	public void setS_vat_no(String s_vat_no) {
		this.s_vat_no = s_vat_no;
	}

	@Override
	public String toString() {
		return "Supplier [s_id=" + s_id + ", s_name=" + s_name + ", s_email="
				+ s_email + ", s_ph_no=" + s_ph_no + ", s_vat_no=" + s_vat_no
				+ "]";
	}
	
	

}
