package model.ticket_order;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.customer.CustomerBean;
import model.sight.SightBean;

@Entity
@Table(name="Ticket_Order")
public class TicketOrderBean {
	@Id
	@Column(columnDefinition="char(10)")
	private String T_order_id;
	@Column(columnDefinition="char(10)")
	private String Customer_id;
	@Column(columnDefinition="char(10)")
	private String Sight_id;
	@Column(columnDefinition="nvarchar(50)")
	private String T_order_name;
	private Integer T_order_total;
	private Integer T_order_amount;
	@Column(columnDefinition="char(2)")
	private String T_order_national;
	@Column(columnDefinition="varchar(100)")
	private String T_order_email;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Customer_id")
	private CustomerBean CustomerBean;
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Sight_id")
	private SightBean SightBean;
	public TicketOrderBean() { }
	public TicketOrderBean(String t_order_id, String customer_id, String sight_id, String t_order_name,
			Integer t_order_total, Integer t_order_amount, String t_order_national, String t_order_email,
			CustomerBean customerBean, SightBean sightBean) {
		super();
		T_order_id = t_order_id;
		Customer_id = customer_id;
		Sight_id = sight_id;
		T_order_name = t_order_name;
		T_order_total = t_order_total;
		T_order_amount = t_order_amount;
		T_order_national = t_order_national;
		T_order_email = t_order_email;
		CustomerBean = customerBean;
		SightBean = sightBean;
	}
	@Override
	public String toString() {
		return "TicketOrderBean [T_order_id=" + T_order_id + ", Customer_id=" + Customer_id + ", Sight_id=" + Sight_id
				+ ", T_order_name=" + T_order_name + ", T_order_total=" + T_order_total + ", T_order_amount="
				+ T_order_amount + ", T_order_national=" + T_order_national + ", T_order_email=" + T_order_email
				+ ", CustomerBean=" + CustomerBean + ", SightBean=" + SightBean + "]";
	}
	public String getT_order_id() {
		return T_order_id;
	}
	public void setT_order_id(String t_order_id) {
		T_order_id = t_order_id;
	}
	public String getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(String customer_id) {
		Customer_id = customer_id;
	}
	public String getSight_id() {
		return Sight_id;
	}
	public void setSight_id(String sight_id) {
		Sight_id = sight_id;
	}
	public String getT_order_name() {
		return T_order_name;
	}
	public void setT_order_name(String t_order_name) {
		T_order_name = t_order_name;
	}
	public Integer getT_order_total() {
		return T_order_total;
	}
	public void setT_order_total(Integer t_order_total) {
		T_order_total = t_order_total;
	}
	public Integer getT_order_amount() {
		return T_order_amount;
	}
	public void setT_order_amount(Integer t_order_amount) {
		T_order_amount = t_order_amount;
	}
	public String getT_order_national() {
		return T_order_national;
	}
	public void setT_order_national(String t_order_national) {
		T_order_national = t_order_national;
	}
	public String getT_order_email() {
		return T_order_email;
	}
	public void setT_order_email(String t_order_email) {
		T_order_email = t_order_email;
	}
	public CustomerBean getCustomerBean() {
		return CustomerBean;
	}
	public void setCustomerBean(CustomerBean customerBean) {
		CustomerBean = customerBean;
	}
	public SightBean getSightBean() {
		return SightBean;
	}
	public void setSightBean(SightBean sightBean) {
		SightBean = sightBean;
	}
	
}
