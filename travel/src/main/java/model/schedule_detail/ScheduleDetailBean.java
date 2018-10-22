package model.schedule_detail;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.schedule.ScheduleBean;
import model.sight.SightBean;
@Entity
@Table(name="Schedule_Detail")
public class ScheduleDetailBean implements Serializable {
	@Id
	@Column(columnDefinition="char(10)")
	private String Schedule_id;
	@Column(columnDefinition="char(10)")
	private String Sight_id;
	@Id
	private Integer Schedule_detail_dayX;
	@Id
	private Time Schedule_detail_startTime;
	private Time Schedule_detail_endTime;
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Schedule_id")
	private ScheduleBean ScheduleBean;
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="Sight_id")
	private SightBean SightBean;
	
	public ScheduleDetailBean() { }
	public ScheduleDetailBean(String schedule_id, String sight_id, Integer schedule_detail_dayX,
			Time schedule_detail_startTime, Time schedule_detail_endTime, ScheduleBean scheduleBean,
			SightBean sightBean) {
		super();
		Schedule_id = schedule_id;
		Sight_id = sight_id;
		Schedule_detail_dayX = schedule_detail_dayX;
		Schedule_detail_startTime = schedule_detail_startTime;
		Schedule_detail_endTime = schedule_detail_endTime;
		ScheduleBean = scheduleBean;
		SightBean = sightBean;
	}
	@Override
	public String toString() {
		return "ScheduleDetailBean [Schedule_id=" + Schedule_id + ", Sight_id=" + Sight_id + ", Schedule_detail_dayX="
				+ Schedule_detail_dayX + ", Schedule_detail_startTime=" + Schedule_detail_startTime
				+ ", Schedule_detail_endTime=" + Schedule_detail_endTime + ", ScheduleBean=" + ScheduleBean
				+ ", SightBean=" + SightBean + "]";
	}
	public String getSchedule_id() {
		return Schedule_id;
	}
	public void setSchedule_id(String schedule_id) {
		Schedule_id = schedule_id;
	}
	public String getSight_id() {
		return Sight_id;
	}
	public void setSight_id(String sight_id) {
		Sight_id = sight_id;
	}
	public Integer getSchedule_detail_dayX() {
		return Schedule_detail_dayX;
	}
	public void setSchedule_detail_dayX(Integer schedule_detail_dayX) {
		Schedule_detail_dayX = schedule_detail_dayX;
	}
	public Time getSchedule_detail_startTime() {
		return Schedule_detail_startTime;
	}
	public void setSchedule_detail_startTime(Time schedule_detail_startTime) {
		Schedule_detail_startTime = schedule_detail_startTime;
	}
	public Time getSchedule_detail_endTime() {
		return Schedule_detail_endTime;
	}
	public void setSchedule_detail_endTime(Time schedule_detail_endTime) {
		Schedule_detail_endTime = schedule_detail_endTime;
	}
	public ScheduleBean getScheduleBean() {
		return ScheduleBean;
	}
	public void setScheduleBean(ScheduleBean scheduleBean) {
		ScheduleBean = scheduleBean;
	}
	public SightBean getSightBean() {
		return SightBean;
	}
	public void setSightBean(SightBean sightBean) {
		SightBean = sightBean;
	}
	
	
	
}
