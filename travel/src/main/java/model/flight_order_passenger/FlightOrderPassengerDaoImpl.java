package model.flight_order_passenger;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.flight_order.FlightOrderBean;

@Repository
public class FlightOrderPassengerDaoImpl implements FlightOrderPassengerDao {
	@Autowired
	SessionFactory sessionFactory;

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public FlightOrderBean select(String fOrderId) {
		// TODO Auto-generated method stub
		return getSession().get(FlightOrderBean.class, fOrderId);
	}

	@Override
	public FlightOrderBean insert(FlightOrderBean FlightOrderPassengerBean) {
		FlightOrderBean temp = getSession().get(FlightOrderBean.class, FlightOrderPassengerBean.getfOrderId());
		if (temp == null) {
			getSession().save(temp);
		}
		return null;
	}

	@Override
	public FlightOrderBean update(FlightOrderBean FlightOrderPassengerBean) {
		FlightOrderBean temp = getSession().get(FlightOrderBean.class, FlightOrderPassengerBean.getfOrderId());
		if (temp != null) {
			getSession().update(temp);
		}
		return null;
	}

	@Override
	public FlightOrderBean delete(FlightOrderBean FlightOrderPassengerBean) {
		FlightOrderBean temp = getSession().get(FlightOrderBean.class, FlightOrderPassengerBean.getfOrderId());
		if (temp != null) {
			getSession().delete(temp);
		}
		return null;
	}

	@Override
	public List<FlightOrderPassengerBean> select() {

		return this.getSession().createQuery("from model.FlightOrderPassengerBean", FlightOrderPassengerBean.class)
				.setMaxResults(50).list();
	}

}
