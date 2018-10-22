package model.schedule;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.customer.CustomerBean;
import model.sight_type.SightTypeBean;

@Entity
@Table(name="Schedule")
public class ScheduleBean {
	@Id
	@Column(columnDefinition="char(10)")
	private String Schedule_id;
	@Column(columnDefinition="char(10)")
	private String Customer_id;
	@Column(columnDefinition="char(4)")
	private String Schedule_type;
	private Integer Schedule_days;
	private Integer Schedule_totalPrice;
	@Column(columnDefinition="nvarchar(max)")
	private String Schedule_description;
	private Date Schedule_date;
	private Boolean Schedule_share;

	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Schedule_type")
	private SightTypeBean SightTypeBean;

	
	public ScheduleBean() { }

	public ScheduleBean(String schedule_id, String customer_id, String schedule_type, Integer schedule_days,
			Integer schedule_totalPrice, String schedule_description, Date schedule_date, Boolean schedule_share,
			CustomerBean customerBean, SightTypeBean sightTypeBean) {
		super();
		Schedule_id = schedule_id;
		Customer_id = customer_id;
		Schedule_type = schedule_type;
		Schedule_days = schedule_days;
		Schedule_totalPrice = schedule_totalPrice;
		Schedule_description = schedule_description;
		Schedule_date = schedule_date;
		Schedule_share = schedule_share;
		SightTypeBean = sightTypeBean;
	}

	@Override
	public String toString() {
		return "ScheduleBean [Schedule_id=" + Schedule_id + ", Customer_id=" + Customer_id + ", Schedule_type="
				+ Schedule_type + ", Schedule_days=" + Schedule_days + ", Schedule_totalPrice=" + Schedule_totalPrice
				+ ", Schedule_description=" + Schedule_description + ", Schedule_date=" + Schedule_date
				+ ", Schedule_share=" + Schedule_share + ", CustomerBean=" + ", SightTypeBean="
				+ SightTypeBean + "]";
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

	public String getSchedule_type() {
		return Schedule_type;
	}

	public void setSchedule_type(String schedule_type) {
		Schedule_type = schedule_type;
	}

	public Integer getSchedule_days() {
		return Schedule_days;
	}

	public void setSchedule_days(Integer schedule_days) {
		Schedule_days = schedule_days;
	}

	public Integer getSchedule_totalPrice() {
		return Schedule_totalPrice;
	}

	public void setSchedule_totalPrice(Integer schedule_totalPrice) {
		Schedule_totalPrice = schedule_totalPrice;
	}

	public String getSchedule_description() {
		return Schedule_description;
	}

	public void setSchedule_description(String schedule_description) {
		Schedule_description = schedule_description;
	}

	public Date getSchedule_date() {
		return Schedule_date;
	}

	public void setSchedule_date(Date schedule_date) {
		Schedule_date = schedule_date;
	}

	public Boolean getSchedule_share() {
		return Schedule_share;
	}

	public void setSchedule_share(Boolean schedule_share) {
		Schedule_share = schedule_share;
	}

	public SightTypeBean getSightTypeBean() {
		return SightTypeBean;
	}

	public void setSightTypeBean(SightTypeBean sightTypeBean) {
		SightTypeBean = sightTypeBean;
	} 
	
}
