package model.sight;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SightDaoImpl implements SightDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public boolean insert(SightBean bean) {
//		if (bean != null) {
//			SightBean test = this.getSession().get(SightBean.class, bean.getSightId());
//			if(test==null) {
//				this.getSession().save(bean);
//				return true;
//			}
//		}
		return false;
	}
	
	public boolean update(SightBean bean) {
//		if(bean!=null) {
//			this.getSession().update(bean);
//			return true;
//		}
		return false;
	}
	
	public boolean delete(String id) {
		return false;
	}
	
	public SightBean select(String id) {
		return this.getSession().get(SightBean.class, id);
	}
	
	public List<SightBean> selectType(String sightTypeId){
		String hqlCode="from SightBean s where s.sightTypeId=:sightTypeId";
		return this.getSession().createQuery(hqlCode, SightBean.class).setParameter("sightTypeId", sightTypeId).getResultList();
	}
	
	public List<SightBean> selectAll(String type){
		String hqlCode="from SightBean s where s.sightType=:sightType";
		return this.getSession().createQuery(hqlCode, SightBean.class).setParameter("sightType", type).getResultList();
	}
			
}
