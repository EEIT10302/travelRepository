package model.sight_favorite;

import java.io.Serializable;

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
@Table(name="Sight_Favorite")
public class SightFavoriteBean implements Serializable {
	@Id
	@Column(columnDefinition="char(10)")
	private String Sight_id;
	@Id
	@Column(columnDefinition="char(10)")
	private String Customer_id;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Customer_id")
	private CustomerBean CustomerBean;
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Customer_id")
	private SightBean SightBean;
	
	public SightFavoriteBean() { }
	public SightFavoriteBean(String sight_id, String customer_id, CustomerBean customerBean,
			SightBean sightBean) {
		super();
		Sight_id = sight_id;
		Customer_id = customer_id;
		CustomerBean = customerBean;
		SightBean = sightBean;
	}
	@Override
	public String toString() {
		return "SightFavoriteBean [Sight_id=" + Sight_id + ", Customer_id=" + Customer_id + ", CustomerBean="
				+ CustomerBean + ", SightBean=" + SightBean + "]";
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
