package model.schedule;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.schedule_detail.ScheduleDetailBean;
import model.sight_type.SightTypeBean;
@Repository
public class ScheduleDaoImpl implements ScheduleDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public ScheduleBean select(String id) {
		return this.getSession().get(ScheduleBean.class, id);
	}
	
	@Override
	public List<ScheduleBean> selectByDays(Integer dayStart, Integer dayEnd) {//行程查詢首頁，依天數查詢
		String hql="FROM ScheduleBean WHERE schedule_days>=:dayStart AND schedule_days<=:dayEnd";	
		return this.getSession().createQuery(hql,ScheduleBean.class).setParameter("dayStart", dayStart).setParameter("dayEnd", dayEnd).getResultList();
	}

	@Override
	public List<ScheduleBean> selectByType(String type) {//行程查詢首頁，依類型查詢
		String hql="FROM ScheduleBean WHERE schedule_type = :type";	
		return this.getSession().createQuery(hql,ScheduleBean.class).setParameter("type",type).getResultList();
	}
	
	@Override
	public List<ScheduleBean> select() {
		return this.getSession().createQuery(
				"from ScheduleBean", ScheduleBean.class).setMaxResults(50).list();
	}

	@Override
	public boolean insert(ScheduleBean bean) {
		if(bean!=null) {
			ScheduleBean temp = this.getSession().get(ScheduleBean.class, bean.getScheduleId());
			if(temp==null) {
				this.getSession().save(bean);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update(ScheduleBean bean) {
		if(bean!=null) {
			ScheduleBean temp = this.getSession().get(ScheduleBean.class, bean.getScheduleId());
			if(temp!=null) {
				temp.setCustomerId(bean.getCustomerId());
				temp.setScheduleType(bean.getScheduleType());
				temp.setScheduleDays(bean.getScheduleDays());
				temp.setScheduleTotalPrice(bean.getScheduleTotalPrice());
				temp.setScheduleDescription(bean.getScheduleDescription());
				temp.setScheduleDate(bean.getScheduleDate());
				temp.setScheduleShare(bean.getScheduleShare());
				temp.setSightTypeBean(bean.getSightTypeBean());
				temp.setScheduleDetailBean(bean.getScheduleDetailBean());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(ScheduleBean bean) {
		if(bean!=null) {
			ScheduleBean temp = this.getSession().get(ScheduleBean.class, bean.getScheduleId());
			if(temp!=null) {
				this.getSession().delete(temp);
				return true;
			}
		}
		return false;
	}
}
