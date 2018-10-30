package model.schedule_favorite;

import java.util.List;

import org.hibernate.Session;

public interface ScheduleFavoriteDao {

	Session getSession();

	ScheduleFavoriteBean select(ScheduleFavoriteBean bean);

	List<ScheduleFavoriteBean> select();
	
	List<ScheduleFavoriteBean> selectByCustomer(String CustId);

	boolean insert(ScheduleFavoriteBean bean);

	boolean update(ScheduleFavoriteBean bean);

	boolean delete(ScheduleFavoriteBean bean);

}