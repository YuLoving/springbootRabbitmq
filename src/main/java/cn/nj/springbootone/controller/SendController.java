package cn.nj.springbootone.controller;

import cn.nj.springbootone.sender.FirstSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SendController {
    @Autowired
    private FirstSender firstSender;

    @GetMapping("/send")
    public String send(String message){
        String id = UUID.randomUUID().toString();
        firstSender.send(id,message);
        return id;


    }
}
