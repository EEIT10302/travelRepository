package model.traffic_order;

import java.util.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.customer.CustomerBean;
@Entity
@Table(name="Traffic_order")
public class TrafficOrderBean {
	@Id
	@Column(columnDefinition="char(10)")
	private String R_order_id;
	@Column(columnDefinition="char(10)")
	private String Customer_id;
	@Column(columnDefinition="nvarchar(50)")
	private String R_order_firstName;
	@Column(columnDefinition="nvarchar(50)")
	private String R_order_lastName;
	@Column(columnDefinition="char(2)")
	private String R_order_national;
	private Integer R_order_total;
	private Integer R_order_amount;
	@Column(columnDefinition="varchar(100)")
	private String R_order_email;
	@Column(columnDefinition="char(4)")
	private String R_order_trainNo;
	@Column(columnDefinition="nvarchar(10)")
	private String R_order_type;
	private Date R_order_date;
	private Time R_order_startT;
	private Time R_order_endT;
	@Column(columnDefinition="char(4)")
	private String R_order_stratP;
	@Column(columnDefinition="char(4)")
	private String R_order_endP;
	private Time R_order_travelT;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Customer_id")
	private CustomerBean CustomerBean;
	public TrafficOrderBean() { }
	public TrafficOrderBean(String r_order_id, String customer_id, String r_order_firstName, String r_order_lastName,
			String r_order_national, Integer r_order_total, Integer r_order_amount, String r_order_email,
			String r_order_trainNo, String r_order_type, Date r_order_date, Time r_order_startT, Time r_order_endT,
			String r_order_stratP, String r_order_endP, Time r_order_travelT,
			CustomerBean customerBean) {
		super();
		R_order_id = r_order_id;
		Customer_id = customer_id;
		R_order_firstName = r_order_firstName;
		R_order_lastName = r_order_lastName;
		R_order_national = r_order_national;
		R_order_total = r_order_total;
		R_order_amount = r_order_amount;
		R_order_email = r_order_email;
		R_order_trainNo = r_order_trainNo;
		R_order_type = r_order_type;
		R_order_date = r_order_date;
		R_order_startT = r_order_startT;
		R_order_endT = r_order_endT;
		R_order_stratP = r_order_stratP;
		R_order_endP = r_order_endP;
		R_order_travelT = r_order_travelT;
		CustomerBean = customerBean;
	}
	@Override
	public String toString() {
		return "TrafficOrderBean [R_order_id=" + R_order_id + ", Customer_id=" + Customer_id + ", R_order_firstName="
				+ R_order_firstName + ", R_order_lastName=" + R_order_lastName + ", R_order_national="
				+ R_order_national + ", R_order_total=" + R_order_total + ", R_order_amount=" + R_order_amount
				+ ", R_order_email=" + R_order_email + ", R_order_trainNo=" + R_order_trainNo + ", R_order_type="
				+ R_order_type + ", R_order_date=" + R_order_date + ", R_order_startT=" + R_order_startT
				+ ", R_order_endT=" + R_order_endT + ", R_order_stratP=" + R_order_stratP + ", R_order_endP="
				+ R_order_endP + ", R_order_travelT=" + R_order_travelT + ", CustomerBean=" + CustomerBean + "]";
	}
	public String getR_order_id() {
		return R_order_id;
	}
	public void setR_order_id(String r_order_id) {
		R_order_id = r_order_id;
	}
	public String getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(String customer_id) {
		Customer_id = customer_id;
	}
	public String getR_order_firstName() {
		return R_order_firstName;
	}
	public void setR_order_firstName(String r_order_firstName) {
		R_order_firstName = r_order_firstName;
	}
	public String getR_order_lastName() {
		return R_order_lastName;
	}
	public void setR_order_lastName(String r_order_lastName) {
		R_order_lastName = r_order_lastName;
	}
	public String getR_order_national() {
		return R_order_national;
	}
	public void setR_order_national(String r_order_national) {
		R_order_national = r_order_national;
	}
	public Integer getR_order_total() {
		return R_order_total;
	}
	public void setR_order_total(Integer r_order_total) {
		R_order_total = r_order_total;
	}
	public Integer getR_order_amount() {
		return R_order_amount;
	}
	public void setR_order_amount(Integer r_order_amount) {
		R_order_amount = r_order_amount;
	}
	public String getR_order_email() {
		return R_order_email;
	}
	public void setR_order_email(String r_order_email) {
		R_order_email = r_order_email;
	}
	public String getR_order_trainNo() {
		return R_order_trainNo;
	}
	public void setR_order_trainNo(String r_order_trainNo) {
		R_order_trainNo = r_order_trainNo;
	}
	public String getR_order_type() {
		return R_order_type;
	}
	public void setR_order_type(String r_order_type) {
		R_order_type = r_order_type;
	}
	public Date getR_order_date() {
		return R_order_date;
	}
	public void setR_order_date(Date r_order_date) {
		R_order_date = r_order_date;
	}
	public Time getR_order_startT() {
		return R_order_startT;
	}
	public void setR_order_startT(Time r_order_startT) {
		R_order_startT = r_order_startT;
	}
	public Time getR_order_endT() {
		return R_order_endT;
	}
	public void setR_order_endT(Time r_order_endT) {
		R_order_endT = r_order_endT;
	}
	public String getR_order_stratP() {
		return R_order_stratP;
	}
	public void setR_order_stratP(String r_order_stratP) {
		R_order_stratP = r_order_stratP;
	}
	public String getR_order_endP() {
		return R_order_endP;
	}
	public void setR_order_endP(String r_order_endP) {
		R_order_endP = r_order_endP;
	}
	public Time getR_order_travelT() {
		return R_order_travelT;
	}
	public void setR_order_travelT(Time r_order_travelT) {
		R_order_travelT = r_order_travelT;
	}
	public CustomerBean getCustomerBean() {
		return CustomerBean;
	}
	public void setCustomerBean(CustomerBean customerBean) {
		CustomerBean = customerBean;
	}
	
}
