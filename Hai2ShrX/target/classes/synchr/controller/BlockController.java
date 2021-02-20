package synchr.controller;

// 查看余坐

import synchr.entity.Room;
import synchr.entity.Seat;
import synchr.service.RoomService;
import synchr.service.SeatService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import synchr.entity.Room;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller("blockKelly")
public class BlockController {
	
	@Autowired
	private RoomService<Room> roomService;
	private Seat seat;
	@Autowired
	private SeatService<Seat> seatService;
	


	/*
	* 此处方法被调用
	* */
	public String blockKe(){
		String s="";
		try {
			List<Room> rooms = roomService.findRoom(new Room());
			System.out.println("@@@@@@@@@"+rooms.get(0).getName());
			s=rooms.get(1).getName();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	public static Date getNextDay(Date date,int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, day);
		date = calendar.getTime();
		return date;
	}


	
}
