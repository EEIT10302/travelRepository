package model.flight_order_passenger;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.flight_order.FlightOrderBean;
import model.national.NationalBean;

@Entity
@Table(name="Flight_Order_Passenger")
public class FlightOrderPassengerBean {
	@Id
	@Column(columnDefinition="char(10)")
	private String F_order_id;
	@Column(columnDefinition="varchar(50)")
	private String F_passenger_firstName;
	@Column(columnDefinition="varchar(50)")
	private String F_passenger_lastName;
	@Column(columnDefinition="char(2)")
	private String F_passenger_national;
	private Date F_passenger_birthday;
	@Column(columnDefinition="varchar(50)")
	private String F_passenger_phone;
	private Boolean F_passenger_salutation;
	private Integer F_adult_price;
	private Integer F_child_price;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="F_order_id")
	private FlightOrderBean FlightOrderBean;
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="F_passenger_national")
	private NationalBean NationalBean;
	
	public FlightOrderPassengerBean() { }

	public FlightOrderPassengerBean(String f_order_id, String f_passenger_firstName, String f_passenger_lastName,
			String f_passenger_national, Date f_passenger_birthday, String f_passenger_phone,
			Boolean f_passenger_salutation, Integer f_adult_price, Integer f_child_price,
			FlightOrderBean flightOrderBean, NationalBean nationalBean) {
		super();
		F_order_id = f_order_id;
		F_passenger_firstName = f_passenger_firstName;
		F_passenger_lastName = f_passenger_lastName;
		F_passenger_national = f_passenger_national;
		F_passenger_birthday = f_passenger_birthday;
		F_passenger_phone = f_passenger_phone;
		F_passenger_salutation = f_passenger_salutation;
		F_adult_price = f_adult_price;
		F_child_price = f_child_price;
		FlightOrderBean = flightOrderBean;
		NationalBean = nationalBean;
	}

	@Override
	public String toString() {
		return "FlightOrderPassengerBean [F_order_id=" + F_order_id + ", F_passenger_firstName=" + F_passenger_firstName
				+ ", F_passenger_lastName=" + F_passenger_lastName + ", F_passenger_national=" + F_passenger_national
				+ ", F_passenger_birthday=" + F_passenger_birthday + ", F_passenger_phone=" + F_passenger_phone
				+ ", F_passenger_salutation=" + F_passenger_salutation + ", F_adult_price=" + F_adult_price
				+ ", F_child_price=" + F_child_price + ", FlightOrderBean=" + FlightOrderBean + ", NationalBean="
				+ NationalBean + "]";
	}

	public String getF_order_id() {
		return F_order_id;
	}

	public void setF_order_id(String f_order_id) {
		F_order_id = f_order_id;
	}

	public String getF_passenger_firstName() {
		return F_passenger_firstName;
	}

	public void setF_passenger_firstName(String f_passenger_firstName) {
		F_passenger_firstName = f_passenger_firstName;
	}

	public String getF_passenger_lastName() {
		return F_passenger_lastName;
	}

	public void setF_passenger_lastName(String f_passenger_lastName) {
		F_passenger_lastName = f_passenger_lastName;
	}

	public String getF_passenger_national() {
		return F_passenger_national;
	}

	public void setF_passenger_national(String f_passenger_national) {
		F_passenger_national = f_passenger_national;
	}

	public Date getF_passenger_birthday() {
		return F_passenger_birthday;
	}

	public void setF_passenger_birthday(java.sql.Date f_passenger_birthday) {
		F_passenger_birthday = f_passenger_birthday;
	}

	public String getF_passenger_phone() {
		return F_passenger_phone;
	}

	public void setF_passenger_phone(String f_passenger_phone) {
		F_passenger_phone = f_passenger_phone;
	}

	public Boolean getF_passenger_salutation() {
		return F_passenger_salutation;
	}

	public void setF_passenger_salutation(Boolean f_passenger_salutation) {
		F_passenger_salutation = f_passenger_salutation;
	}

	public Integer getF_adult_price() {
		return F_adult_price;
	}

	public void setF_adult_price(Integer f_adult_price) {
		F_adult_price = f_adult_price;
	}

	public Integer getF_child_price() {
		return F_child_price;
	}

	public void setF_child_price(Integer f_child_price) {
		F_child_price = f_child_price;
	}

	public FlightOrderBean getFlightOrderBean() {
		return FlightOrderBean;
	}

	public void setFlightOrderBean(FlightOrderBean flightOrderBean) {
		FlightOrderBean = flightOrderBean;
	}

	public NationalBean getNationalBean() {
		return NationalBean;
	}

	public void setNationalBean(NationalBean nationalBean) {
		NationalBean = nationalBean;
	}
	
	
}
