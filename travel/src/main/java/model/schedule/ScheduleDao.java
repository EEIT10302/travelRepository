package model.schedule;

import java.util.List;

import org.hibernate.Session;

public interface ScheduleDao {

	Session getSession();

	ScheduleBean select(String id);

	List<ScheduleBean> select();

	List<ScheduleBean> selectByDays(Integer dayStart, Integer dayEnd);
	
	List<ScheduleBean> selectByType(String type);
	
	boolean insert(ScheduleBean bean);

	boolean update(ScheduleBean bean);

	boolean delete(ScheduleBean bean);

}