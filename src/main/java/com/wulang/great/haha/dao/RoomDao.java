package com.wulang.great.haha.dao;

import com.wulang.great.haha.entity.Room;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RoomDao {
    public void addRoom(Room room) {
    }

    public void deleteRoom(Room room) {
    }

    public List<Room> getRoomList() {
        List<Room> roomList = new ArrayList<>();
        Room room1 = new Room();
        room1.setRoomOwner("wulang");
        room1.setRoomName("room1");
        roomList.add(room1);
        Room room2 = new Room();
        room2.setRoomOwner("leo");
        room2.setRoomName("room2");
        roomList.add(room2);
        return roomList;
    }
}

