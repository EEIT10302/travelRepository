package model.sight_favorite;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SightFavoriteDaoImpl implements SightFavoriteDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public boolean insert(SightFavoriteBean bean) {
		if (bean != null) {
			SightFavoriteBean test = this.getSession().get(SightFavoriteBean.class, bean);
			if(test==null) {
				this.getSession().save(bean);
				return true;
			}
		}
		return false;
	}
	
	public boolean update(SightFavoriteBean bean) {
		return false;
	}
	
	public boolean delete(SightFavoriteBean bean) {
		this.getSession().delete(bean);
		return false;
	}
	
	public List<SightFavoriteBean> selectAll(String customerId){
		String hqlCode="from SightFavoriteBean s where s.customerId=:customerId";
		return this.getSession().createQuery(hqlCode, SightFavoriteBean.class).setParameter("customerId", customerId).getResultList();
	}
}
