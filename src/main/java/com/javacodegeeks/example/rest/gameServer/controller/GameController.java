package com.javacodegeeks.example.rest.gameServer.controller;

import com.javacodegeeks.example.rest.gameServer.daoservice.DaoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @RequestMapping("/score")
    public String doAdd(@RequestParam(defaultValue="NoName") String playerName) {
        System.out.println("I AM WORRRKKKKIINNGG!!!!!!!!!!!!!!!!!!! "+playerName);
        return "{\"playerbestscore !!!!!!!!!!!!!!!!!!!\":\"" + playerName + "\"}";
    }
}
