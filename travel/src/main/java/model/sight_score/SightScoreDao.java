package model.sight_score;

import java.util.List;

public interface SightScoreDao {
	public boolean insert(SightScoreBean bean);
	
	public boolean update(SightScoreBean bean);
	
	public boolean delete(String id);
	
	public List<SightScoreBean> selectAll(String sightId);
}
