package model.hotel_room;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.hotel.HotelBean;

@Entity
@Table(name="Hotel_room")
public class HotelRoomBean {
	@Id
	@Column(columnDefinition="char(10)")
	private String Room_id;
	@Column(columnDefinition="char(8)")
	private String Hotel_id;
	@Column(columnDefinition="nvarchar(100)")
	private String Room_name;
	@Column(columnDefinition="nvarchar(100)")
	private String Room_bed;
	private Integer Room_accommodate;
	@Column(columnDefinition="varchar(max)")
	private String Room_img;
	@Column(columnDefinition="nvarchar(max)")
	private String Room_suite;
	private Integer Room_amount_total;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Hotel_id")
	private HotelBean HotelBean;
	
	
	public HotelRoomBean() {}
	public HotelRoomBean(String room_id, String hotel_id, String room_name, String room_bed, Integer room_accommodate,
			String room_img, String room_suite, Integer room_amount_total, HotelBean hotelBean) {
		super();
		Room_id = room_id;
		Hotel_id = hotel_id;
		Room_name = room_name;
		Room_bed = room_bed;
		Room_accommodate = room_accommodate;
		Room_img = room_img;
		Room_suite = room_suite;
		Room_amount_total = room_amount_total;
		HotelBean = hotelBean;
	}
	@Override
	public String toString() {
		return "HotelRoomBean [Room_id=" + Room_id + ", Hotel_id=" + Hotel_id + ", Room_name=" + Room_name
				+ ", Room_bed=" + Room_bed + ", Room_accommodate=" + Room_accommodate + ", Room_img=" + Room_img
				+ ", Room_suite=" + Room_suite + ", Room_amount_total=" + Room_amount_total + ", HotelBean=" + HotelBean
				+ "]";
	}
	public String getRoom_id() {
		return Room_id;
	}
	public void setRoom_id(String room_id) {
		Room_id = room_id;
	}
	public String getHotel_id() {
		return Hotel_id;
	}
	public void setHotel_id(String hotel_id) {
		Hotel_id = hotel_id;
	}
	public String getRoom_name() {
		return Room_name;
	}
	public void setRoom_name(String room_name) {
		Room_name = room_name;
	}
	public String getRoom_bed() {
		return Room_bed;
	}
	public void setRoom_bed(String room_bed) {
		Room_bed = room_bed;
	}
	public Integer getRoom_accommodate() {
		return Room_accommodate;
	}
	public void setRoom_accommodate(Integer room_accommodate) {
		Room_accommodate = room_accommodate;
	}
	public String getRoom_img() {
		return Room_img;
	}
	public void setRoom_img(String room_img) {
		Room_img = room_img;
	}
	public String getRoom_suite() {
		return Room_suite;
	}
	public void setRoom_suite(String room_suite) {
		Room_suite = room_suite;
	}
	public Integer getRoom_amount_total() {
		return Room_amount_total;
	}
	public void setRoom_amount_total(Integer room_amount_total) {
		Room_amount_total = room_amount_total;
	}
	public HotelBean getHotelBean() {
		return HotelBean;
	}
	public void setHotelBean(HotelBean hotelBean) {
		HotelBean = hotelBean;
	}
	
}
