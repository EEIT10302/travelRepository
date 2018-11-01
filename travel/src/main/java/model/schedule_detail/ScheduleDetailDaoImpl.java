package model.schedule_detail;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.schedule.ScheduleBean;
@Repository
public class ScheduleDetailDaoImpl implements ScheduleDetailDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public ScheduleDetailBean select(ScheduleDetailBean bean) {
		return this.getSession().get(ScheduleDetailBean.class, bean);
	}

	@Override
	public List<ScheduleDetailBean> select() {
		return this.getSession().createQuery(
				"from ScheduleDetailBean", ScheduleDetailBean.class).setMaxResults(50).list();
	}

	@Override
	public boolean insert(ScheduleDetailBean bean) {
		if(bean!=null) {
			ScheduleDetailBean temp = this.getSession().get(ScheduleDetailBean.class, bean);
			if(temp==null) {
				this.getSession().save(bean);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update(ScheduleDetailBean bean) {//此方法不會用到，使用者更新行程時，直接把所有detail殺光，再全部重新insert
		if(bean!=null) {
			this.getSession().update(bean);
//			ScheduleDetailBean temp = new ScheduleDetailBean();
//			temp = this.getSession().get(ScheduleDetailBean.class, bean);
//			if(temp!=null) {
//				temp.setSightId(bean.getSightId());
//				temp.setScheduleDetailEndTime(bean.getScheduleDetailEndTime());
//				temp.setScheduleDetailStartTime(bean.getScheduleDetailStartTime());
//				temp.setScheduleDetailDayX(bean.getScheduleDetailDayX());
				return true;
//			}
		}
		return false;
	}

	@Override
	public boolean delete(ScheduleDetailBean bean) {
		if(bean!=null) {
			ScheduleDetailBean temp = this.getSession().get(ScheduleDetailBean.class, bean);
			if(temp!=null) {
				this.getSession().delete(temp);
				return true;
			}
		}
		return false;
	}
}
