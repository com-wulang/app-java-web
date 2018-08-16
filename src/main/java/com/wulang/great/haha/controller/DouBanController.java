package com.wulang.great.haha.controller;

import com.wulang.great.haha.dao.RoomDao;
import com.wulang.great.haha.entity.Room;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DouBanController {
    private Logger logger = LogManager.getLogger(DouBanController.class);

    @Autowired
    private RoomDao roomDao;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        logger.debug("logindebug");
        logger.info("logininfo");
        logger.warn("warnlogin");
        logger.error("errorlogin");
        return "login";
    }

    @RequestMapping("/loginValidation")
    public ModelAndView loginValidation(@RequestParam("userName") String userName) {
        final String str = "123";
        if (str.equals(userName)) {
            System.out.println(userName);
        }
        ModelAndView modelAndView = new ModelAndView("roomList");
        modelAndView.addObject("userName", userName);
        modelAndView.addObject("roomList", roomDao.getRoomList());
        return modelAndView;
    }

    @RequestMapping("/createRoom")
    public ModelAndView createRoom(@RequestParam("roomName") String roomName, @RequestParam("userName") String userName) {
        Room room = new Room();
        room.setRoomName(roomName);
        room.setRoomOwner(userName);
        roomDao.addRoom(room);
        ModelAndView modelAndView = new ModelAndView("room");
        modelAndView.addObject("userName", userName);
        return modelAndView;
    }

    @RequestMapping("/joinRoom")
    public ModelAndView joinRoom(@RequestParam("roomName") String roomName, @RequestParam("userName") String userName) {
        ModelAndView modelAndView = new ModelAndView("room");
        modelAndView.addObject("userName", userName);
        modelAndView.addObject("roomName", roomName);
        return modelAndView;
    }

    @RequestMapping(value = "/HelloWorld.vue", produces = "text/plain")
    @ResponseBody
    public String HelloWorld() {
        return "index";
    }
}

