package model.sight;

import java.util.List;

public interface SightDao {
	public boolean insert(SightBean bean);
	
	public boolean update(SightBean bean);
	
	public boolean delete(String id);
	
	public SightBean select(String id);
	
	public List<SightBean> selectType(String sightTypeId);
	
	public List<SightBean> selectAll(String type);

	public List<SightBean> selectIndex();
	
	public List<SightBean> selectByArea(String sightArea);
}
