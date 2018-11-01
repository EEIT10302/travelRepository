package model.flight_order;

import java.util.List;

public interface FlightOrderDao {
	public FlightOrderBean select(String F_order_id);

	public FlightOrderBean insert(FlightOrderBean flightOrderBean);

	public FlightOrderBean update(FlightOrderBean flightOrderBean);

	public FlightOrderBean delete(FlightOrderBean flightOrderBean);
	public List<FlightOrderBean> select();
}
