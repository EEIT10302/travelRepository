package model.schedule_favorite;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.schedule.ScheduleBean;
import model.schedule_detail.ScheduleDetailBean;

@Repository
public class ScheduleFavoriteDaoImpl implements ScheduleFavoriteDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public ScheduleFavoriteBean select(ScheduleFavoriteBean bean) {
		return this.getSession().get(ScheduleFavoriteBean.class, bean);
	}

	@Override
	public List<ScheduleFavoriteBean> select() {
		return this.getSession().createQuery(
				"from ScheduleFavoriteBean", ScheduleFavoriteBean.class).setMaxResults(50).list();
	}

	@Override
	public List<ScheduleFavoriteBean> selectByCustomer(String CustId) {
		String hql="FROM ScheduleFavoriteBean WHERE Customer_id = :CustId";	
		return this.getSession().createQuery(hql).setParameter("CustId",CustId).getResultList();
	}
	
	@Override
	public boolean insert(ScheduleFavoriteBean bean) {
		if(bean!=null) {
			ScheduleFavoriteBean temp = this.getSession().get(ScheduleFavoriteBean.class, bean);
			if(temp==null) {
				this.getSession().save(bean);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update(ScheduleFavoriteBean bean) {
		if(bean!=null) {
			ScheduleFavoriteBean temp = this.getSession().get(ScheduleFavoriteBean.class, bean);
			if(temp!=null) {
				temp.setScheduleId(bean.getScheduleId());
				temp.setCustomerId(bean.getCustomerId());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(ScheduleFavoriteBean bean) {
		if(bean!=null) {
			ScheduleFavoriteBean temp = this.getSession().get(ScheduleFavoriteBean.class, bean);
			if(temp!=null) {
				this.getSession().delete(temp);
				return true;
			}
		}
		return false;
	}
}
