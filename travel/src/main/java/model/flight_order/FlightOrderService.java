package model.flight_order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class FlightOrderService {
//	@Autowired
	FlightOrderDao flightOrderDao;

	public void insertFlightOrder(FlightOrderBean flightOrderBean) {
		if(flightOrderBean!=null)
		{
			this.flightOrderDao.insert(flightOrderBean);
		}
		

	}
}
