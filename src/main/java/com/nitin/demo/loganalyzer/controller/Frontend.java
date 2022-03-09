package com.nitin.demo.loganalyzer.controller;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 3/8/2022, Tuesday
 **/

import com.nitin.demo.loganalyzer.LogAnalyzerApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 What this program snippet doing?
 **/
@RestController
public class Frontend {

  Logger logger = LoggerFactory.getLogger(LogAnalyzerApplication.class);



@GetMapping("/home")
    public String getMessage(){
    logger.info("home controller accessed in info mode");
    logger.warn("home controller accessed in warning mode ");
    logger.error("home controller accessed in error mode ");
    logger.debug("home controller accessed in debug mode ");
    logger.trace("home controller accessed in trace mode");

    return "Starting with Log-analyzer";
}



}
