package com.appleyk.controller;

import com.appleyk.config.DbConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>（模拟）数据库参数配置访问，用户请求控制层</p>
 *
 * @author Appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/Appleyk
 * @date created on 15:57 2020/2/17
 */
@CrossOrigin
@RestController
@RequestMapping("/consul")
@RefreshScope // 如果参数变化，自动刷新
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
