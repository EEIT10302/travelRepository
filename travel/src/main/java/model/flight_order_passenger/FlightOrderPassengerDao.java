package model.flight_order_passenger;

import java.util.List;

import model.flight_order.FlightOrderBean;

public interface FlightOrderPassengerDao {
	public FlightOrderBean select(String fOrderId);

	public FlightOrderBean insert(FlightOrderBean FlightOrderPassengerBean);

	public FlightOrderBean update(FlightOrderBean FlightOrderPassengerBean);

	public FlightOrderBean delete(FlightOrderBean FlightOrderPassengerBean);
	public List<FlightOrderPassengerBean> select();
}
