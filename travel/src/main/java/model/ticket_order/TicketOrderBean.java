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
	@Column(name="T_order_id")
	private String tOrderId;
	@Column(name="customer_id")
	private String customerId;
	@Column(name="Sight_id")
	private String sightId;
	@Column(name="T_order_name")
	private String tOrderName;
	@Column(name="T_order_total")
	private Integer tOrderTotal;
	@Column(name="T_order_amount")
	private Integer tOrderAmount;
	@Column(name="T_order_national")
	private String tOrderNational;
	@Column(name="T_order_email")
	private String tOrderEmail;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="customer_id")
	private CustomerBean customerBean;
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="sight_id")
	private SightBean sightBean;
	public TicketOrderBean() { }
	public TicketOrderBean(String tOrderId, String customerId, String sightId, String tOrderName, Integer tOrderTotal,
			Integer tOrderAmount, String tOrderNational, String tOrderEmail, CustomerBean customerBean,
			SightBean sightBean) {
		super();
		this.tOrderId = tOrderId;
		this.customerId = customerId;
		this.sightId = sightId;
		this.tOrderName = tOrderName;
		this.tOrderTotal = tOrderTotal;
		this.tOrderAmount = tOrderAmount;
		this.tOrderNational = tOrderNational;
		this.tOrderEmail = tOrderEmail;
		this.customerBean = customerBean;
		this.sightBean = sightBean;
	}
	@Override
	public String toString() {
		return "TicketOrderBean [tOrderId=" + tOrderId + ", customerId=" + customerId + ", sightId=" + sightId
				+ ", tOrderName=" + tOrderName + ", tOrderTotal=" + tOrderTotal + ", tOrderAmount=" + tOrderAmount
				+ ", tOrderNational=" + tOrderNational + ", tOrderEmail=" + tOrderEmail + "]";
	}
	public String gettOrderId() {
		return tOrderId;
	}
	public void settOrderId(String tOrderId) {
		this.tOrderId = tOrderId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getSightId() {
		return sightId;
	}
	public void setSightId(String sightId) {
		this.sightId = sightId;
	}
	public String gettOrderName() {
		return tOrderName;
	}
	public void settOrderName(String tOrderName) {
		this.tOrderName = tOrderName;
	}
	public Integer gettOrderTotal() {
		return tOrderTotal;
	}
	public void settOrderTotal(Integer tOrderTotal) {
		this.tOrderTotal = tOrderTotal;
	}
	public Integer gettOrderAmount() {
		return tOrderAmount;
	}
	public void settOrderAmount(Integer tOrderAmount) {
		this.tOrderAmount = tOrderAmount;
	}
	public String gettOrderNational() {
		return tOrderNational;
	}
	public void settOrderNational(String tOrderNational) {
		this.tOrderNational = tOrderNational;
	}
	public String gettOrderEmail() {
		return tOrderEmail;
	}
	public void settOrderEmail(String tOrderEmail) {
		this.tOrderEmail = tOrderEmail;
	}
	public CustomerBean getCustomerBean() {
		return customerBean;
	}
	public void setCustomerBean(CustomerBean customerBean) {
		this.customerBean = customerBean;
	}
	public SightBean getSightBean() {
		return sightBean;
	}
	public void setSightBean(SightBean sightBean) {
		this.sightBean = sightBean;
	}
	
	
}
