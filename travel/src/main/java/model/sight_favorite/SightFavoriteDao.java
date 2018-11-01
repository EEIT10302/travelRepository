package model.sight_favorite;

import java.util.List;

public interface SightFavoriteDao {
	public boolean insert(SightFavoriteBean bean);
	
	public boolean update(SightFavoriteBean bean);
	
	public boolean delete(SightFavoriteBean bean);
	
	public List<SightFavoriteBean> selectAll(String customerId);
}
