package com.is.compromise.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 健康检查等
 * 
 * @author Jongly Ran（斑石）
 * @version 2018年4月6日
 */
@Controller
public class MainController {
	private static Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String root() {
        return "index";
    }

    /**
     * 健康检查
     */
    @GetMapping("/check.htm")
    public @ResponseBody String checkPreload() {
    	logger.warn("test slf4j");
        return "success";
    }
}
