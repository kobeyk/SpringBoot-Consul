package com.appleyk.controller;

import com.appleyk.config.DbConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author yukun24@126.com
 * @version V.1.0.1
 * @company 苏州中科蓝迪
 * @date created on 15:59 2019/12/5
 */
@CrossOrigin
@RestController
@RequestMapping("/consul")
public class DbController {

    @Autowired
    private DbConfig config ;

    @Value("${name}")
    private String name;

    @GetMapping("/config/get")
    public ResponseEntity getConfig(){
        return ResponseEntity.ok(config);
    }

    @GetMapping("/config/getName")
    public String getName(){
        return name;
    }


}
