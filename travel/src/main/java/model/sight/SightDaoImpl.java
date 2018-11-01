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
//			if(test==null)
//				this.getSession().save(bean);
//			return true;
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
		return this.getSession().createQuery(hqlCode, SightBean.class).setParameter("sightType", type).setMaxResults(12).getResultList();
	}
		
	public List<SightBean> selectIndex(){//首頁使用，取最受歡迎前九個景點
		String hqlCode="FROM SightBean s WHERE s.sightType<>'tr' ORDER BY Sight_score_avg ASC";
		return this.getSession().createQuery(hqlCode, SightBean.class).setMaxResults(9).getResultList();
	}
	
	public List<SightBean> selectByArea(String sightArea){//跳至查詢結果，以地區查詢景點
		String hqlCode=null;
		if ("".equals(sightArea)) {//地區不限
			hqlCode="FROM SightBean s WHERE s.sightType='si' ORDER BY Sight_id ASC";
			return this.getSession().createQuery(hqlCode, SightBean.class).setMaxResults(12).getResultList();
		}else{//限定地區
			hqlCode="FROM SightBean s WHERE s.sightArea=:sightArea AND s.sightType='si' ORDER BY Sight_id ASC";
			return this.getSession().createQuery(hqlCode, SightBean.class).setParameter("sightArea", sightArea).setMaxResults(12).getResultList();
		}
	}
}
