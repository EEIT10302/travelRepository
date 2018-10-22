package model.hotel;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hotel")
public class HotelBean {
	@Id
	@Column(columnDefinition="char(8)")
	private String Hotel_id;
	@Column(columnDefinition="nvarchar(100)")
	private String Hotel_name;
	@Column(columnDefinition="varchar(50)")
	private String Hotel_phone;
	@Column(columnDefinition="varchar(max)")
	private String Hotel_address;
	@Column(columnDefinition="nvarchar(10)")
	private String Hotel_area;
	@Column(columnDefinition="varchar(50)")
	private String Hotel_url;
	@Column(columnDefinition="varchar(max)")
	private String Hotel_img;
	private Integer Hotel_star;
	private Double Hotel_score_avg;
	@Column(columnDefinition="nvarchar(100)")
	private String Hotel_language;
	private Boolean Hotel_wifi;
	@Column(columnDefinition="nvarchar(100)")
	private String Hotel_food;
	@Column(columnDefinition="nvarchar(max)")
	private String Hotel_convinience;
	private Time Hotel_checkInTime;
	private Time Hotel_checkOutTime;
	private Integer Hotel_floor;
	private Integer Hotel_roomAmount;
	private Integer Hotel_score_times;
	
	
	public HotelBean() { }
	public HotelBean(String hotel_id, String hotel_name, String hotel_phone, String hotel_address, String hotel_area,
			String hotel_url, String hotel_img, Integer hotel_star, Double hotel_score_avg, String hotel_language,
			Boolean hotel_wifi, String hotel_food, String hotel_convinience, Time hotel_checkInTime,
			Time hotel_checkOutTime, Integer hotel_floor, Integer hotel_roomAmount, Integer hotel_score_times) {
		super();
		Hotel_id = hotel_id;
		Hotel_name = hotel_name;
		Hotel_phone = hotel_phone;
		Hotel_address = hotel_address;
		Hotel_area = hotel_area;
		Hotel_url = hotel_url;
		Hotel_img = hotel_img;
		Hotel_star = hotel_star;
		Hotel_score_avg = hotel_score_avg;
		Hotel_language = hotel_language;
		Hotel_wifi = hotel_wifi;
		Hotel_food = hotel_food;
		Hotel_convinience = hotel_convinience;
		Hotel_checkInTime = hotel_checkInTime;
		Hotel_checkOutTime = hotel_checkOutTime;
		Hotel_floor = hotel_floor;
		Hotel_roomAmount = hotel_roomAmount;
		Hotel_score_times = hotel_score_times;
	}
	@Override
	public String toString() {
		return "HotelBean [Hotel_id=" + Hotel_id + ", Hotel_name=" + Hotel_name + ", Hotel_phone=" + Hotel_phone
				+ ", Hotel_address=" + Hotel_address + ", Hotel_area=" + Hotel_area + ", Hotel_url=" + Hotel_url
				+ ", Hotel_img=" + Hotel_img + ", Hotel_star=" + Hotel_star + ", Hotel_score_avg=" + Hotel_score_avg
				+ ", Hotel_language=" + Hotel_language + ", Hotel_wifi=" + Hotel_wifi + ", Hotel_food=" + Hotel_food
				+ ", Hotel_convinience=" + Hotel_convinience + ", Hotel_checkInTime=" + Hotel_checkInTime
				+ ", Hotel_checkOutTime=" + Hotel_checkOutTime + ", Hotel_floor=" + Hotel_floor + ", Hotel_roomAmount="
				+ Hotel_roomAmount + ", Hotel_score_times=" + Hotel_score_times + "]";
	}
	public String getHotel_id() {
		return Hotel_id;
	}
	public void setHotel_id(String hotel_id) {
		Hotel_id = hotel_id;
	}
	public String getHotel_name() {
		return Hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		Hotel_name = hotel_name;
	}
	public String getHotel_phone() {
		return Hotel_phone;
	}
	public void setHotel_phone(String hotel_phone) {
		Hotel_phone = hotel_phone;
	}
	public String getHotel_address() {
		return Hotel_address;
	}
	public void setHotel_address(String hotel_address) {
		Hotel_address = hotel_address;
	}
	public String getHotel_area() {
		return Hotel_area;
	}
	public void setHotel_area(String hotel_area) {
		Hotel_area = hotel_area;
	}
	public String getHotel_url() {
		return Hotel_url;
	}
	public void setHotel_url(String hotel_url) {
		Hotel_url = hotel_url;
	}
	public String getHotel_img() {
		return Hotel_img;
	}
	public void setHotel_img(String hotel_img) {
		Hotel_img = hotel_img;
	}
	public Integer getHotel_star() {
		return Hotel_star;
	}
	public void setHotel_star(Integer hotel_star) {
		Hotel_star = hotel_star;
	}
	public Double getHotel_score_avg() {
		return Hotel_score_avg;
	}
	public void setHotel_score_avg(Double hotel_score_avg) {
		Hotel_score_avg = hotel_score_avg;
	}
	public String getHotel_language() {
		return Hotel_language;
	}
	public void setHotel_language(String hotel_language) {
		Hotel_language = hotel_language;
	}
	public Boolean getHotel_wifi() {
		return Hotel_wifi;
	}
	public void setHotel_wifi(Boolean hotel_wifi) {
		Hotel_wifi = hotel_wifi;
	}
	public String getHotel_food() {
		return Hotel_food;
	}
	public void setHotel_food(String hotel_food) {
		Hotel_food = hotel_food;
	}
	public String getHotel_convinience() {
		return Hotel_convinience;
	}
	public void setHotel_convinience(String hotel_convinience) {
		Hotel_convinience = hotel_convinience;
	}
	public Time getHotel_checkInTime() {
		return Hotel_checkInTime;
	}
	public void setHotel_checkInTime(Time hotel_checkInTime) {
		Hotel_checkInTime = hotel_checkInTime;
	}
	public Time getHotel_checkOutTime() {
		return Hotel_checkOutTime;
	}
	public void setHotel_checkOutTime(Time hotel_checkOutTime) {
		Hotel_checkOutTime = hotel_checkOutTime;
	}
	public Integer getHotel_floor() {
		return Hotel_floor;
	}
	public void setHotel_floor(Integer hotel_floor) {
		Hotel_floor = hotel_floor;
	}
	public Integer getHotel_roomAmount() {
		return Hotel_roomAmount;
	}
	public void setHotel_roomAmount(Integer hotel_roomAmount) {
		Hotel_roomAmount = hotel_roomAmount;
	}
	public Integer getHotel_score_times() {
		return Hotel_score_times;
	}
	public void setHotel_score_times(Integer hotel_score_times) {
		Hotel_score_times = hotel_score_times;
	}
	
}
