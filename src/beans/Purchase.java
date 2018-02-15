package beans;

public class Purchase 
{
	
	private String st_id,m_name,batch_no,comp_name,cost_price,mrp,no_of_boxes;

	public String getSt_id() {
		return st_id;
	}

	public void setSt_id(String st_id) {
		this.st_id = st_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getBatch_no() {
		return batch_no;
	}

	public void setBatch_no(String batch_no) {
		this.batch_no = batch_no;
	}

	public String getComp_name() {
		return comp_name;
	}

	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}

	public String getCost_price() {
		return cost_price;
	}

	public void setCost_price(String cost_price) {
		this.cost_price = cost_price;
	}

	public String getMrp() {
		return mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public String getNo_of_boxes() {
		return no_of_boxes;
	}

	public void setNo_of_boxes(String no_of_boxes) {
		this.no_of_boxes = no_of_boxes;
	}

	@Override
	public String toString() {
		return "Purchase [st_id=" + st_id + ", m_name=" + m_name
				+ ", batch_no=" + batch_no + ", comp_name=" + comp_name
				+ ", cost_price=" + cost_price + ", mrp=" + mrp
				+ ", no_of_boxes=" + no_of_boxes + "]";
	}
	
	

}
