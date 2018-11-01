package model.sight_type;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.sight.SightBean;

@Repository
public class SightTypeDaoImpl implements SightTypeDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public boolean insert(SightTypeBean bean) {
//		if (bean != null) {
//			SightTypeBean test = this.getSession().get(SightTypeBean.class, bean.getSightTypeId());
//			if(test==null) {
//				this.getSession().save(bean);
//				return true;
//			}
//		}
		return false;
	}
	
	public boolean update(SightTypeBean bean) {
//		if(bean!=null) {
//			this.getSession().update(bean);
//			return true;
//		}
		return false;
	}
	
	public boolean delete(String id) {
		return false;
	}
	
	public SightTypeBean select(String id) {
		return this.getSession().get(SightTypeBean.class, id);
	}
	
	public List<SightTypeBean> selectAll(){
		String hqlCode="from SightTypeBean";
		return this.getSession().createQuery(hqlCode, SightTypeBean.class).getResultList();
	}
}
