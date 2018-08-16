package com.wulang.great.haha.entity;

import java.util.List;

public class Room {
    private String roomName;
    private String roomOwner;

    private List<MUser> memberList;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomOwner() {
        return roomOwner;
    }

    public void setRoomOwner(String roomOwner) {
        this.roomOwner = roomOwner;
    }
}

