package model.sight;

import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.sight_type.SightTypeBean;

@Entity
@Table(name="Sight")
public class SightBean {
	@Id
	@Column(columnDefinition="char(10)")
	private String Sight_id;
	@Column(columnDefinition="char(2)")
	private String Sight_type;
	@Column(columnDefinition="char(4)")
	private String Sight_type_id;
	@Column(columnDefinition="nvarchar(100)")
	private String Sight_name;
	@Column(columnDefinition="varchar(50)")
	private String Sight_phone;
	@Column(columnDefinition="nvarchar(max)")
	private String Sight_address;
	@Column(columnDefinition="nvarchar(10)")
	private String Sight_area;
	@Column(columnDefinition="nvarchar(max)")
	private String Sight_url;
	@Column(columnDefinition="nvarchar(max)")
	private String Sight_description;
	@Column(columnDefinition="varchar(max)")
	private String Sight_img;
	@Column(columnDefinition="varchar(max)")
	private String Sight_bussinessHours;
	@Column(columnDefinition="varchar(max)")
	private Time Sight_estimatedTime;
	private Double Sight_score_avg;
	private Boolean Sight_ticket;
	private Integer Sight_price;
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Sight_type_id")
	private SightTypeBean SightTypeBean;
	
	public SightBean() { }

	public SightBean(String sight_id, String sight_type, String sight_type_id, String sight_name, String sight_phone,
			String sight_address, String sight_area, String sight_url, String sight_description, String sight_img,
			String sight_bussinessHours, Time sight_estimatedTime, Double sight_score_avg, Boolean sight_ticket,
			Integer sight_price, SightTypeBean sightTypeBean) {
		super();
		Sight_id = sight_id;
		Sight_type = sight_type;
		Sight_type_id = sight_type_id;
		Sight_name = sight_name;
		Sight_phone = sight_phone;
		Sight_address = sight_address;
		Sight_area = sight_area;
		Sight_url = sight_url;
		Sight_description = sight_description;
		Sight_img = sight_img;
		Sight_bussinessHours = sight_bussinessHours;
		Sight_estimatedTime = sight_estimatedTime;
		Sight_score_avg = sight_score_avg;
		Sight_ticket = sight_ticket;
		Sight_price = sight_price;
		SightTypeBean = sightTypeBean;
	}

	@Override
	public String toString() {
		return "SightBean [Sight_id=" + Sight_id + ", Sight_type=" + Sight_type + ", Sight_type_id=" + Sight_type_id
				+ ", Sight_name=" + Sight_name + ", Sight_phone=" + Sight_phone + ", Sight_address=" + Sight_address
				+ ", Sight_area=" + Sight_area + ", Sight_url=" + Sight_url + ", Sight_description=" + Sight_description
				+ ", Sight_img=" + Sight_img + ", Sight_bussinessHours=" + Sight_bussinessHours
				+ ", Sight_estimatedTime=" + Sight_estimatedTime + ", Sight_score_avg=" + Sight_score_avg
				+ ", Sight_ticket=" + Sight_ticket + ", Sight_price=" + Sight_price + ", SightTypeBean=" + SightTypeBean
				+ "]";
	}

	public String getSight_id() {
		return Sight_id;
	}

	public void setSight_id(String sight_id) {
		Sight_id = sight_id;
	}

	public String getSight_type() {
		return Sight_type;
	}

	public void setSight_type(String sight_type) {
		Sight_type = sight_type;
	}

	public String getSight_type_id() {
		return Sight_type_id;
	}

	public void setSight_type_id(String sight_type_id) {
		Sight_type_id = sight_type_id;
	}

	public String getSight_name() {
		return Sight_name;
	}

	public void setSight_name(String sight_name) {
		Sight_name = sight_name;
	}

	public String getSight_phone() {
		return Sight_phone;
	}

	public void setSight_phone(String sight_phone) {
		Sight_phone = sight_phone;
	}

	public String getSight_address() {
		return Sight_address;
	}

	public void setSight_address(String sight_address) {
		Sight_address = sight_address;
	}

	public String getSight_area() {
		return Sight_area;
	}

	public void setSight_area(String sight_area) {
		Sight_area = sight_area;
	}

	public String getSight_url() {
		return Sight_url;
	}

	public void setSight_url(String sight_url) {
		Sight_url = sight_url;
	}

	public String getSight_description() {
		return Sight_description;
	}

	public void setSight_description(String sight_description) {
		Sight_description = sight_description;
	}

	public String getSight_img() {
		return Sight_img;
	}

	public void setSight_img(String sight_img) {
		Sight_img = sight_img;
	}

	public String getSight_bussinessHours() {
		return Sight_bussinessHours;
	}

	public void setSight_bussinessHours(String sight_bussinessHours) {
		Sight_bussinessHours = sight_bussinessHours;
	}

	public Time getSight_estimatedTime() {
		return Sight_estimatedTime;
	}

	public void setSight_estimatedTime(Time sight_estimatedTime) {
		Sight_estimatedTime = sight_estimatedTime;
	}

	public Double getSight_score_avg() {
		return Sight_score_avg;
	}

	public void setSight_score_avg(Double sight_score_avg) {
		Sight_score_avg = sight_score_avg;
	}

	public Boolean getSight_ticket() {
		return Sight_ticket;
	}

	public void setSight_ticket(Boolean sight_ticket) {
		Sight_ticket = sight_ticket;
	}

	public Integer getSight_price() {
		return Sight_price;
	}

	public void setSight_price(Integer sight_price) {
		Sight_price = sight_price;
	}

	public SightTypeBean getSightTypeBean() {
		return SightTypeBean;
	}

	public void setSightTypeBean(SightTypeBean sightTypeBean) {
		SightTypeBean = sightTypeBean;
	}
	
	
}
