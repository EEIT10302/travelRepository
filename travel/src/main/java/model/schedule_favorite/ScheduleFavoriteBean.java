package model.schedule_favorite;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.customer.CustomerBean;
import model.schedule.ScheduleBean;
@Entity
@Table(name="Schedule _Favorite")
public class ScheduleFavoriteBean implements Serializable {
	@Id
	@Column(columnDefinition="char(10)")
	private String Schedule_id;
	@Id
	@Column(columnDefinition="char(10)")
	private String Customer_id;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Customer_id")
	private CustomerBean CustomerBean;//-----??
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Schedule_id")
	private ScheduleBean ScheduleBean;//----??
	
	public ScheduleFavoriteBean() { }
	public ScheduleFavoriteBean(String schedule_id, String customer_id, CustomerBean customerBean,
			ScheduleBean scheduleBean) {
		super();
		Schedule_id = schedule_id;
		Customer_id = customer_id;
		CustomerBean = customerBean;
		ScheduleBean = scheduleBean;
	}
	@Override
	public String toString() {
		return "ScheduleFavoriteBean [Schedule_id=" + Schedule_id + ", Customer_id=" + Customer_id + ", CustomerBean="
				+ CustomerBean + ", ScheduleBean=" + ScheduleBean + "]";
	}
	public String getSchedule_id() {
		return Schedule_id;
	}
	public void setSchedule_id(String schedule_id) {
		Schedule_id = schedule_id;
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
	public ScheduleBean getScheduleBean() {
		return ScheduleBean;
	}
	public void setScheduleBean(ScheduleBean scheduleBean) {
		ScheduleBean = scheduleBean;
	}
	
}
