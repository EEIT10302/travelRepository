package model.sight_score;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SightScoreDaoImpl implements SightScoreDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public boolean insert(SightScoreBean bean) {
		if (bean != null) {
			SightScoreBean test = this.getSession().get(SightScoreBean.class, bean);
			if(test==null) {
				this.getSession().save(bean);
				return true;
			}
		}
		return false;
	}
	
	public boolean update(SightScoreBean bean) {
		if(bean!=null) {     
			this.getSession().update(bean);
			return true;
		}
		return false;
	}
	
	public boolean delete(String id) {
		return false;
	}
	
	public List<SightScoreBean> selectAll(String sightId){
		String hqlCode="from SightScoreBean where sightId=:sightId";
		return this.getSession().createQuery(hqlCode, SightScoreBean.class).setParameter("sightId", sightId).getResultList();     
	}
}
