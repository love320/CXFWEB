package org.love320.web.app.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Start {
	
	@Autowired
	private JdbcTemplate resJdbc;
	
	@RequestMapping("/web/start")
	public String start(Model model){
		String sql = "select * from GPS_T_COMMAND";
		List list = resJdbc.queryForList(sql);
		
		for(Object obj : list){
			Map sing = (Map)obj;
			System.out.println(sing.get("DESCTIPTION"));
		}

		return "index";
	}
	
	
}
