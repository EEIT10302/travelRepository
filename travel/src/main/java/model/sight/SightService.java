package model.sight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SightService {
	@Autowired
	private SightDao dao;
	
	public SightBean select(SightBean bean){
		System.out.println(bean.getSightId());
		if(!"".equals(bean.getSightId())) 
			return dao.select(bean.getSightId());
		else
			return null;
	}
	
	public List<SightBean> selectTypeId(SightBean bean) {
		if(!"".equals(bean.getSightTypeId()))
			return dao.selectType(bean.getSightTypeId());
		else
			return null;
	}
	
	public List<SightBean> selectType(SightBean bean){
		if(!"".equals(bean.getSightType()))
			return dao.selectAll(bean.getSightType());
		else
			return null;
	}

}
