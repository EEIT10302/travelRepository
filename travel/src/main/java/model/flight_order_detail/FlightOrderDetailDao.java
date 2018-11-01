package model.flight_order_detail;

import java.util.List;

public interface FlightOrderDetailDao {
	public FlightOrderDetailBean select(String fOrderId);

	public FlightOrderDetailBean insert(FlightOrderDetailBean flightOrderDetailBean);

	public FlightOrderDetailBean update(FlightOrderDetailBean flightOrderDetailBean);

	public FlightOrderDetailBean delete(FlightOrderDetailBean flightOrderDetailBean);
	public List<FlightOrderDetailBean> select();
}
