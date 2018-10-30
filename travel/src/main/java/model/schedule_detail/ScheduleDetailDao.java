package model.schedule_detail;

import java.util.List;

import org.hibernate.Session;

public interface ScheduleDetailDao {

	Session getSession();

	ScheduleDetailBean select(ScheduleDetailBean bean);

	List<ScheduleDetailBean> select();

	boolean insert(ScheduleDetailBean bean);

	boolean update(ScheduleDetailBean bean);

	boolean delete(ScheduleDetailBean bean);

}