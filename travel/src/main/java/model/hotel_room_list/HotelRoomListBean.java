package model.hotel_room_list;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.hotel_room.HotelRoomBean;
@Entity
@Table(name="Hotel_Room_List")
public class HotelRoomListBean implements Serializable {
	@Id
	@Column(columnDefinition="char(10)")
	private String Room_id;
	@Id
	private java.util.Date Room_date;
	private Integer Room_amount;
	private Integer Room_price;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Room_id")
	private HotelRoomBean HotelRoomBean;
	
	
	public HotelRoomListBean() { }
	public HotelRoomListBean(String room_id, Date room_date, Integer room_amount, Integer room_price,
			HotelRoomBean hotelRoomBean) {
		super();
		Room_id = room_id;
		Room_date = room_date;
		Room_amount = room_amount;
		Room_price = room_price;
		HotelRoomBean = hotelRoomBean;
	}
	@Override
	public String toString() {
		return "HotelRoomListBean [Room_id=" + Room_id + ", Room_date=" + Room_date + ", Room_amount=" + Room_amount
				+ ", Room_price=" + Room_price + ", HotelRoomBean=" + HotelRoomBean + "]";
	}
	public String getRoom_id() {
		return Room_id;
	}
	public void setRoom_id(String room_id) {
		Room_id = room_id;
	}
	public Date getRoom_date() {
		return Room_date;
	}
	public void setRoom_date(Date room_date) {
		Room_date = room_date;
	}
	public Integer getRoom_amount() {
		return Room_amount;
	}
	public void setRoom_amount(Integer room_amount) {
		Room_amount = room_amount;
	}
	public Integer getRoom_price() {
		return Room_price;
	}
	public void setRoom_price(Integer room_price) {
		Room_price = room_price;
	}
	public HotelRoomBean getHotelRoomBean() {
		return HotelRoomBean;
	}
	public void setHotelRoomBean(HotelRoomBean hotelRoomBean) {
		HotelRoomBean = hotelRoomBean;
	}
	
}
