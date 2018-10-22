package model.flight_order;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.customer.CustomerBean;
import model.national.NationalBean;

@Entity
@Table(name = "Flight_Order")
public class FlightOrderBean {
	@Id
	@Column(columnDefinition="char(10)")
	private String F_order_id;
	@Column(columnDefinition="char(10)")
	private String Customer_id;
	@Column(columnDefinition="varchar(50)")
	private String F_order_name;
	@Column(columnDefinition="varchar(50)")
	private String F_order_phone;
	@Column(columnDefinition="varchar(100)")
	private String F_order_email;
	private Boolean F_order_salutation;
	private Integer F_order_total;
	private Boolean F_order_segment;
	private Integer F_order_adult;
	private Integer F_order_child;
	@Column(columnDefinition="char(2)")
	private String F_order_national;

	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Customer_id")
	private CustomerBean CustomerBean;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="F_order_national")
	private NationalBean NationalBean;
	
	
	public FlightOrderBean() {}
	
	public FlightOrderBean(String f_order_id, String customer_id, String f_order_name, String f_order_phone,
			String f_order_email, Boolean f_order_salutation, Integer f_order_total, Boolean f_order_segment,
			Integer f_order_adult, Integer f_order_child, String f_order_national,
			CustomerBean customerBean, NationalBean nationalBean) {
		super();
		F_order_id = f_order_id;
		Customer_id = customer_id;
		F_order_name = f_order_name;
		F_order_phone = f_order_phone;
		F_order_email = f_order_email;
		F_order_salutation = f_order_salutation;
		F_order_total = f_order_total;
		F_order_segment = f_order_segment;
		F_order_adult = f_order_adult;
		F_order_child = f_order_child;
		F_order_national = f_order_national;
		CustomerBean = customerBean;
		NationalBean = nationalBean;
	}


	@Override
	public String toString() {
		return "FlightOrderBean [F_order_id=" + F_order_id + ", Customer_id=" + Customer_id + ", F_order_name="
				+ F_order_name + ", F_order_phone=" + F_order_phone + ", F_order_email=" + F_order_email
				+ ", F_order_salutation=" + F_order_salutation + ", F_order_total=" + F_order_total
				+ ", F_order_segment=" + F_order_segment + ", F_order_adult=" + F_order_adult + ", F_order_child="
				+ F_order_child + ", F_order_national=" + F_order_national + ", CustomerBean=" + CustomerBean
				+ ", NationalBean=" + NationalBean + "]";
	}

	public String getF_order_id() {
		return F_order_id;
	}
	public void setF_order_id(String f_order_id) {
		F_order_id = f_order_id;
	}
	public String getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(String customer_id) {
		Customer_id = customer_id;
	}
	public String getF_order_name() {
		return F_order_name;
	}
	public void setF_order_name(String f_order_name) {
		F_order_name = f_order_name;
	}
	public String getF_order_phone() {
		return F_order_phone;
	}
	public void setF_order_phone(String f_order_phone) {
		F_order_phone = f_order_phone;
	}
	public String getF_order_email() {
		return F_order_email;
	}
	public void setF_order_email(String f_order_email) {
		F_order_email = f_order_email;
	}
	public Boolean getF_order_salutation() {
		return F_order_salutation;
	}
	public void setF_order_salutation(Boolean f_order_salutation) {
		F_order_salutation = f_order_salutation;
	}
	public Integer getF_order_total() {
		return F_order_total;
	}
	public void setF_order_total(Integer f_order_total) {
		F_order_total = f_order_total;
	}
	public Boolean getF_order_segment() {
		return F_order_segment;
	}
	public void setF_order_segment(Boolean f_order_segment) {
		F_order_segment = f_order_segment;
	}
	public Integer getF_order_adult() {
		return F_order_adult;
	}
	public void setF_order_adult(Integer f_order_adult) {
		F_order_adult = f_order_adult;
	}
	public Integer getF_order_child() {
		return F_order_child;
	}
	public void setF_order_child(Integer f_order_child) {
		F_order_child = f_order_child;
	}
	public String getF_order_national() {
		return F_order_national;
	}
	public void setF_order_national(String f_order_national) {
		F_order_national = f_order_national;
	}

	public CustomerBean getCustomerBean() {
		return CustomerBean;
	}
	public void setCustomerBean(CustomerBean customerBean) {
		CustomerBean = customerBean;
	}
	
	public NationalBean getNationalBean() {
		return NationalBean;
	}
	public void setNationalBean(NationalBean nationalBean) {
		NationalBean = nationalBean;
	}
	
}
