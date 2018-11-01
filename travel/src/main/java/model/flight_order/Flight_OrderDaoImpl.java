package model.flight_order;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import misc.SpringHibernateConfiguration;

@Repository
public class Flight_OrderDaoImpl implements FlightOrderDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
		public static void main(String[] args) {
			ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringHibernateConfiguration.class);
			SessionFactory session = (SessionFactory) ctx.getBean("sessionFactory");
			session.getCurrentSession().beginTransaction();
			Flight_OrderDaoImpl flight_OrderDaoImpl=(Flight_OrderDaoImpl) ctx.getBean("Flight_OrderDaoImpl");
			List<FlightOrderBean> selects = flight_OrderDaoImpl.select();
			System.out.println("selects"+selects);
			session.getCurrentSession().getTransaction().commit();
		}
	@Override
	public FlightOrderBean select(String F_order_id) {

		return getSession().get(FlightOrderBean.class, F_order_id);

	}

	@Override
	public FlightOrderBean insert(FlightOrderBean flightOrderBean) {
		if (flightOrderBean != null) {
			FlightOrderBean temp = this.getSession().get(FlightOrderBean.class, flightOrderBean.getfOrderId());
			if (temp == null) {
				this.getSession().save(flightOrderBean);
			}

		}
		return null;
	}

	@Override
	public FlightOrderBean update(FlightOrderBean flightOrderBean) {
		FlightOrderBean temp = getSession().get(FlightOrderBean.class, flightOrderBean.getfOrderId());
		if (temp != null) {
			this.getSession().update(temp);
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlightOrderBean delete(FlightOrderBean flightOrderBean) {
		FlightOrderBean temp = getSession().get(FlightOrderBean.class, flightOrderBean.getfOrderId());
		if (temp != null) {
			this.getSession().delete(temp);
		}
		// TODO Auto-generated method stub
		return temp;
	}

	@Override
	public List<FlightOrderBean> select() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from model.FlightOrderBean", FlightOrderBean.class).setMaxResults(50).list();
	}

}
