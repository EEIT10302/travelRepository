package model.flight_order_detail;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class FlightOrderDetailDaoImpl implements FlightOrderDetailDao {
	@Autowired
	private SessionFactory sessionfactory;

	public Session getSession() {
		return this.sessionfactory.getCurrentSession();
	}

	@Override
	public FlightOrderDetailBean select(String fOrderId) {
		// TODO Auto-generated method stub
		return this.getSession().get(FlightOrderDetailBean.class, fOrderId);
	}

	@Override
	public FlightOrderDetailBean insert(FlightOrderDetailBean flightOrderDetailBean) {
		FlightOrderDetailBean temp = this.getSession().get(FlightOrderDetailBean.class,
				flightOrderDetailBean.getfOrderId());
		if (temp == null) {
			this.getSession().save(temp);
		}
		return null;
	}

	@Override
	public FlightOrderDetailBean update(FlightOrderDetailBean flightOrderDetailBean) {
		if (flightOrderDetailBean != null) {
			FlightOrderDetailBean temp = this.getSession().get(FlightOrderDetailBean.class,
					flightOrderDetailBean.getfOrderId());
			if (temp != null) {
				this.getSession().update(temp);
			}
		}
		return null;
	}

	@Override
	public FlightOrderDetailBean delete(FlightOrderDetailBean flightOrderDetailBean) {
		if (flightOrderDetailBean != null) {
			FlightOrderDetailBean temp = this.getSession().get(FlightOrderDetailBean.class,
					flightOrderDetailBean.getfOrderId());
			if (temp != null) {
				this.getSession().delete(temp);
			}
		}
		return null;
	}

	@Override
	public List<FlightOrderDetailBean> select() {
		return this.getSession().createQuery("from model.FlightOrderDetailBean", FlightOrderDetailBean.class)
				.setMaxResults(50).list();

	}

}
