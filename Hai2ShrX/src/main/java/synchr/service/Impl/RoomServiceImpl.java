package synchr.service.Impl;

import synchr.dao.RoomDao;
import synchr.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("roomService")
public class RoomServiceImpl<T> implements RoomService<T> {
	
	@Autowired
	private RoomDao<T> dao;

	public List<T> findRoom(T t) throws Exception {
		return dao.findRoom(t);
	}

	public int countRoom(T t) throws Exception {
		return dao.countRoom(t);
	}

	public void addRoom(T t) throws Exception {
		dao.addRoom(t);
	}

	public void updateRoom(T t) throws Exception {
		dao.updateRoom(t);
	}

	public void deleteRoom(Integer id) throws Exception {
		dao.deleteRoom(id);
	}

	public int findScoreByRoomid(int roomid) throws Exception {
		return dao.findScoreByRoomid(roomid);
	}

}
