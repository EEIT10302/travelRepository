package model.sight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SightService {
	@Autowired
	private SightDao sightDao;
	
	public List<SightBean> selectIndex() {//查詢首頁推薦景點*9
		return sightDao.selectIndex();
	}
	
	public List<SightBean> selectResult10(String sightArea){//首頁跳至結果頁面，以地區查詢景點*10
		return sightDao.selectByArea(sightArea);
	}
	
	public List<SightBean> selectByType(String type){
		return sightDao.selectAll(type);
	}

	public SightBean select(SightBean bean){
		System.out.println(bean.getSightId());
		if(!"".equals(bean.getSightId())) 
			return sightDao.select(bean.getSightId());
		else
			return null;
	}
	
	public List<SightBean> selectTypeId(SightBean bean) {
		if(!"".equals(bean.getSightTypeId()))
			return sightDao.selectType(bean.getSightTypeId());
		else
			return null;
	}
	
	public List<SightBean> selectType(SightBean bean){
		if(!"".equals(bean.getSightType()))
			return sightDao.selectAll(bean.getSightType());
		else
			return null;
	}

}
