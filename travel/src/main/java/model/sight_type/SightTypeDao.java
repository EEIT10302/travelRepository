package model.sight_type;

import java.util.List;

public interface SightTypeDao {
	public boolean insert(SightTypeBean bean);
	
	public boolean update(SightTypeBean bean);
	
	public boolean delete(String id);
	
	public SightTypeBean select(String id);
	
	public List<SightTypeBean> selectAll();

}
