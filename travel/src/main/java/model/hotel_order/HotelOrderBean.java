package model.hotel_order;

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
import model.hotel.HotelBean;
import model.hotel_room.HotelRoomBean;
import model.national.NationalBean;

@Entity
@Table(name="Hotel_order")
public class HotelOrderBean{
	@Id
	@Column(columnDefinition="char(10)")
	private String H_order_id;
	@Column(columnDefinition="char(10)")
	private String Customer_id;
	@Column(columnDefinition="char(8)")
	private String Hotel_id;
	@Column(columnDefinition="char(10)")
	private String Room_id;
	@Column(columnDefinition="char(2)")
	private String H_order_national;
	@Column(columnDefinition="varchar(50)")
	private String H_order_firstName;
	@Column(columnDefinition="varchar(50)")
	private String H_order_lastName;
	@Column(columnDefinition="varchar(50)")
	private String H_order_phone;
	@Column(columnDefinition="varchar(100)")
	private String H_order_email;
	private Date H_order_checkIn;
	private Date H_order_checkOut;
	private Integer H_order_total;
	@Column(columnDefinition="varchar(50)")
	private String H_stay_firstName;
	@Column(columnDefinition="varchar(50)")
	private String H_stay_lastName;
	@Column(columnDefinition="varchar(50)")
	private String H_stay_phone;
	@Column(columnDefinition="varchar(100)")
	private String H_stay_email;
	@Column(columnDefinition="char(2)")
	private String H_stay_national;
	private Integer H_score;
	@Column(columnDefinition="nvarchar(max)")
	private String H_message;
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="H_order_national")
	private NationalBean NationalBean; 
//	@ManyToOne(cascade=CascadeType.MERGE)
//	@JoinColumn(name="Customer_id")
//	private CustomerBean CustomerBean;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Room_id")
	private HotelRoomBean HotelRoomBean;
//	@ManyToOne(cascade=CascadeType.MERGE)
//	@JoinColumn(name="Hotel_id")
//	private HotelBean HotelBean;
	
	public HotelOrderBean() { }

	public HotelOrderBean(String h_order_id, String customer_id, String hotel_id, String room_id,
			String h_order_national, String h_order_firstName, String h_order_lastName, String h_order_phone,
			String h_order_email, Date h_order_checkIn, Date h_order_checkOut, Integer h_order_total,
			String h_stay_firstName, String h_stay_lastName, String h_stay_phone, String h_stay_email,
			String h_stay_national, Integer h_score, String h_message, NationalBean nationalBean,
			CustomerBean customerBean, HotelRoomBean hotelRoomBean,
			HotelBean hotelBean) {
		super();
		H_order_id = h_order_id;
		Customer_id = customer_id;
		Hotel_id = hotel_id;
		Room_id = room_id;
		H_order_national = h_order_national;
		H_order_firstName = h_order_firstName;
		H_order_lastName = h_order_lastName;
		H_order_phone = h_order_phone;
		H_order_email = h_order_email;
		H_order_checkIn = h_order_checkIn;
		H_order_checkOut = h_order_checkOut;
		H_order_total = h_order_total;
		H_stay_firstName = h_stay_firstName;
		H_stay_lastName = h_stay_lastName;
		H_stay_phone = h_stay_phone;
		H_stay_email = h_stay_email;
		H_stay_national = h_stay_national;
		H_score = h_score;
		H_message = h_message;
		NationalBean = nationalBean;
		HotelRoomBean = hotelRoomBean;
	}

	@Override
	public String toString() {
		return "HotelOrderBean [H_order_id=" + H_order_id + ", Customer_id=" + Customer_id + ", Hotel_id=" + Hotel_id
				+ ", Room_id=" + Room_id + ", H_order_national=" + H_order_national + ", H_order_firstName="
				+ H_order_firstName + ", H_order_lastName=" + H_order_lastName + ", H_order_phone=" + H_order_phone
				+ ", H_order_email=" + H_order_email + ", H_order_checkIn=" + H_order_checkIn + ", H_order_checkOut="
				+ H_order_checkOut + ", H_order_total=" + H_order_total + ", H_stay_firstName=" + H_stay_firstName
				+ ", H_stay_lastName=" + H_stay_lastName + ", H_stay_phone=" + H_stay_phone + ", H_stay_email="
				+ H_stay_email + ", H_stay_national=" + H_stay_national + ", H_score=" + H_score + ", H_message="
				+ H_message + ", NationalBean=" + NationalBean + ", CustomerBean=" + ", HotelRoomBean="
				+ HotelRoomBean + ", HotelBean=" + "]";
	}
	
	
	public String getH_order_id() {
		return H_order_id;
	}
	public void setH_order_id(String h_order_id) {
		H_order_id = h_order_id;
	}
	public String getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(String customer_id) {
		Customer_id = customer_id;
	}
	public String getHotel_id() {
		return Hotel_id;
	}
	public void setHotel_id(String hotel_id) {
		Hotel_id = hotel_id;
	}
	public String getRoom_id() {
		return Room_id;
	}
	public void setRoom_id(String room_id) {
		Room_id = room_id;
	}
	public String getH_order_national() {
		return H_order_national;
	}
	public void setH_order_national(String h_order_national) {
		H_order_national = h_order_national;
	}
	public String getH_order_firstName() {
		return H_order_firstName;
	}
	public void setH_order_firstName(String h_order_firstName) {
		H_order_firstName = h_order_firstName;
	}
	public String getH_order_lastName() {
		return H_order_lastName;
	}
	public void setH_order_lastName(String h_order_lastName) {
		H_order_lastName = h_order_lastName;
	}

	public String getH_order_phone() {
		return H_order_phone;
	}
	public void setH_order_phone(String h_order_phone) {
		H_order_phone = h_order_phone;
	}
	public String getH_order_email() {
		return H_order_email;
	}
	public void setH_order_email(String h_order_email) {
		H_order_email = h_order_email;
	}
	public Date getH_order_checkIn() {
		return H_order_checkIn;
	}
	public void setH_order_checkIn(Date h_order_checkIn) {
		H_order_checkIn = h_order_checkIn;
	}
	public Date getH_order_checkOut() {
		return H_order_checkOut;
	}
	public void setH_order_checkOut(Date h_order_checkOut) {
		H_order_checkOut = h_order_checkOut;
	}
	public Integer getH_order_total() {
		return H_order_total;
	}
	public void setH_order_total(Integer h_order_total) {
		H_order_total = h_order_total;
	}
	public String getH_stay_firstName() {
		return H_stay_firstName;
	}
	public void setH_stay_firstName(String h_stay_firstName) {
		H_stay_firstName = h_stay_firstName;
	}
	public String getH_stay_lastName() {
		return H_stay_lastName;
	}
	public void setH_stay_lastName(String h_stay_lastName) {
		H_stay_lastName = h_stay_lastName;
	}
	public String getH_stay_phone() {
		return H_stay_phone;
	}
	public void setH_stay_phone(String h_stay_phone) {
		H_stay_phone = h_stay_phone;
	}
	public String getH_stay_email() {
		return H_stay_email;
	}
	public void setH_stay_email(String h_stay_email) {
		H_stay_email = h_stay_email;
	}
	public String getH_stay_national() {
		return H_stay_national;
	}
	public void setH_stay_national(String h_stay_national) {
		H_stay_national = h_stay_national;
	}
	public Integer getH_score() {
		return H_score;
	}
	public void setH_score(Integer h_score) {
		H_score = h_score;
	}
	public String getH_message() {
		return H_message;
	}
	public void setH_message(String h_message) {
		H_message = h_message;
	}
	public NationalBean getNationalBean() {
		return NationalBean;
	}
	public void setNationalBean(NationalBean nationalBean) {
		NationalBean = nationalBean;
	}

	public HotelRoomBean getHotelRoomBean() {
		return HotelRoomBean;
	}
	public void setHotelRoomBean(HotelRoomBean hotelRoomBean) {
		HotelRoomBean = hotelRoomBean;
	}

	
}
