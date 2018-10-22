package model.flight_order_detail;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.flight_order.FlightOrderBean;
@Entity
@Table(name="Flight_Order_Detail")
public class FlightOrderDetailBean implements Serializable {
	@Id
	@Column(columnDefinition="char(10)")
	private String F_order_id;
	@Id
	@Column(columnDefinition="char(1)")
	private String F_bound;
	@Column(columnDefinition="char(2)")
	private String F_company;
	@Column(columnDefinition="char(5)")
	private String F_number;
	private Time F_departure_time;
	private Time F_arrival_time;
	private Time F_travel_time;
	private Boolean F_transfer;
	@Column(columnDefinition="char(3)")
	private String F_origin;
	@Column(columnDefinition="char(3)")
	private String F_destination;
	@Column(columnDefinition="char(1)")
	private String F_class;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="F_order_id")
	private FlightOrderBean FlightOrderBean; 
	
	public FlightOrderDetailBean() {}
	
	@Override
	public String toString() {
		return "FlightOrderDetailBean [F_order_id=" + F_order_id + ", F_bound=" + F_bound + ", F_company=" + F_company
				+ ", F_number=" + F_number + ", F_departure_time=" + F_departure_time + ", F_arrival_time="
				+ F_arrival_time + ", F_travel_time=" + F_travel_time + ", F_transfer=" + F_transfer + ", F_origin="
				+ F_origin + ", F_destination=" + F_destination + ", F_class=" + F_class + ", FlightOrderBean="
				+ FlightOrderBean + "]";
	}

	public FlightOrderDetailBean(String f_order_id, String f_bound, String f_company, String f_number,
			Time f_departure_time, Time f_arrival_time, Time f_travel_time, Boolean f_transfer, String f_origin,
			String f_destination, String f_class, FlightOrderBean flightOrderBean) {
		super();
		F_order_id = f_order_id;
		F_bound = f_bound;
		F_company = f_company;
		F_number = f_number;
		F_departure_time = f_departure_time;
		F_arrival_time = f_arrival_time;
		F_travel_time = f_travel_time;
		F_transfer = f_transfer;
		F_origin = f_origin;
		F_destination = f_destination;
		F_class = f_class;
		FlightOrderBean = flightOrderBean;
	}



	public FlightOrderBean getFlightOrderBean() {
		return FlightOrderBean;
	}
	public void setFlightOrderBean(FlightOrderBean flightOrderBean) {
		FlightOrderBean = flightOrderBean;
	}
	public String getF_order_id() {
		return F_order_id;
	}
	public void setF_order_id(String f_order_id) {
		F_order_id = f_order_id;
	}
	public String getF_bound() {
		return F_bound;
	}
	public void setF_bound(String f_bound) {
		F_bound = f_bound;
	}
	public String getF_company() {
		return F_company;
	}
	public void setF_company(String f_company) {
		F_company = f_company;
	}
	public String getF_number() {
		return F_number;
	}
	public void setF_number(String f_number) {
		F_number = f_number;
	}
	public Time getF_departure_time() {
		return F_departure_time;
	}
	public void setF_departure_time(Time f_departure_time) {
		F_departure_time = f_departure_time;
	}
	public Time getF_arrival_time() {
		return F_arrival_time;
	}
	public void setF_arrival_time(Time f_arrival_time) {
		F_arrival_time = f_arrival_time;
	}
	public Time getF_travel_time() {
		return F_travel_time;
	}
	public void setF_travel_time(Time f_travel_time) {
		F_travel_time = f_travel_time;
	}
	public Boolean getF_transfer() {
		return F_transfer;
	}
	public void setF_transfer(Boolean f_transfer) {
		F_transfer = f_transfer;
	}
	public String getF_origin() {
		return F_origin;
	}
	public void setF_origin(String f_origin) {
		F_origin = f_origin;
	}
	public String getF_destination() {
		return F_destination;
	}
	public void setF_destination(String f_destination) {
		F_destination = f_destination;
	}
	public String getF_class() {
		return F_class;
	}
	public void setF_class(String f_class) {
		F_class = f_class;
	}

}
