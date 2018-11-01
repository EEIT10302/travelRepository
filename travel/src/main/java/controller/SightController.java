package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import model.sight.SightBean;
import model.sight.SightService;

@Controller
public class SightController {
	@Autowired
	private SightService sightService;
	
	@RequestMapping(path= "/sight/sightIndex.controller",method = RequestMethod.GET,produces="application/json")
	@ResponseBody
	public List<SightBean> index() {
		List<SightBean> list = sightService.selectIndex();
//		Gson gson = new Gson();
//		String lists = gson.toJson(list);
//		System.out.println(lists);
//		JSONObject json = new JSONObject(list);
		System.out.println(list);
		return list;
	}
	
	@RequestMapping(path= "/sight/sightResult.controller",method = RequestMethod.GET)
	public String searchResult(int areaType, Model model, HttpSession session) {
		String area = null;
		switch (areaType) {
			case 0: area = ""; break;
			case 1: area = "基隆"; break;
			case 2: area = "臺北"; break;
			case 3: area = "新北"; break;
			case 4: area = "桃園"; break;
			case 5: area = "新竹"; break;
			case 6: area = "苗栗"; break;
			case 7: area = "臺中"; break;
			case 8: area = "彰化"; break;
			case 9: area = "雲林"; break;
			case 10: area = "嘉義"; break;
			case 11: area = "臺南"; break;
			case 12: area = "高雄"; break;
			case 13: area = "屏東"; break;
			case 14: area = "南投"; break;
			case 15: area = "宜蘭"; break;
			case 16: area = "花蓮"; break;
			case 17: area = "臺東"; break;
			case 18: area = "澎湖"; break;
			case 19: area = "綠島"; break;
			case 20: area = "馬祖"; break;
			case 21: area = "金門"; break;
		}
		List<SightBean> list = sightService.selectResult10(area);//回傳以地區搜尋的前十筆
		model.addAttribute("sightSpot", list);
		session.setAttribute("areaType", areaType);
		return "sightResult";
	}
	
	@RequestMapping(path= "/sight/sightType.controller",method = RequestMethod.GET,produces="application/json")
	@ResponseBody
	public List<SightBean> searchType(String sighType){
		List<SightBean> list = sightService.selectByType(sighType);
		return list;
	}
	
	public List<SightBean> searchResultWhere(String condition){
		
		return null;
	}
}
