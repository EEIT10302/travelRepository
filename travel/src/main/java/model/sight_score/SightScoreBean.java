package model.sight_score;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.customer.CustomerBean;
import model.sight.SightBean;
@Entity
@Table(name="Sight_score")
public class SightScoreBean implements Serializable {
	@Id
	@Column(columnDefinition="char(10)")
	private String Sight_id;
	@Id
	@Column(columnDefinition="char(10)")
	private String Customer_id;
	private Integer Sight_score;
	@Column(columnDefinition="nvarchar(max)")
	private String Sight_message;
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Sight_id")
	private SightBean SightBean;
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Customer_id")
	private CustomerBean CustomerBean;
	public SightScoreBean() { }
	public SightScoreBean(String sight_id, String customer_id, Integer sight_score, String sight_message,
			SightBean sightBean, CustomerBean customerBean) {
		super();
		Sight_id = sight_id;
		Customer_id = customer_id;
		Sight_score = sight_score;
		Sight_message = sight_message;
		SightBean = sightBean;
		CustomerBean = customerBean;
	}
	@Override
	public String toString() {
		return "SightScoreBean [Sight_id=" + Sight_id + ", Customer_id=" + Customer_id + ", Sight_score=" + Sight_score
				+ ", Sight_message=" + Sight_message + ", SightBean=" + SightBean + ", CustomerBean=" + CustomerBean
				+ "]";
	}
	public String getSight_id() {
		return Sight_id;
	}
	public void setSight_id(String sight_id) {
		Sight_id = sight_id;
	}
	public String getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(String customer_id) {
		Customer_id = customer_id;
	}
	public Integer getSight_score() {
		return Sight_score;
	}
	public void setSight_score(Integer sight_score) {
		Sight_score = sight_score;
	}
	public String getSight_message() {
		return Sight_message;
	}
	public void setSight_message(String sight_message) {
		Sight_message = sight_message;
	}
	public SightBean getSightBean() {
		return SightBean;
	}
	public void setSightBean(SightBean sightBean) {
		SightBean = sightBean;
	}
	public CustomerBean getCustomerBean() {
		return CustomerBean;
	}
	public void setCustomerBean(CustomerBean customerBean) {
		CustomerBean = customerBean;
	}
	
	
}
