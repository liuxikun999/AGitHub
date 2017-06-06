package com.test.web;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.web.commons.bean.Area;
import com.test.web.commons.dao.AreaMapper;

@Controller
public class IndexController {
	private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

	@Resource
    private AreaMapper areaMapper;
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)   
    public ModelAndView getFirstPage() {  
        ModelAndView mv = new ModelAndView(); 
        mv.setViewName("index"); 
        mv.addObject("name", "this is freemaker test!!!333");  
        logger.info("AAA", "BBB");
        logger.error("ccc");
        System.out.println("ddd");
        Area area = areaMapper.selectByPrimaryKey("A01P011C010D003");
        System.out.println(area.getCode()+"->"+area.getName());
        return mv;  
    }  
}
