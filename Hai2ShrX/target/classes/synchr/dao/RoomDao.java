package synchr.dao;


import org.mybatis.spring.annotation.Mapper;


import java.util.List;

@Mapper("roomDao")
public interface RoomDao<T> {
	// 查询所有
	public abstract List<T> findRoom(T t) throws Exception;

	// 数量
	public abstract int countRoom(T t) throws Exception;

	// 新增
	public abstract void addRoom(T t) throws Exception;

	// 修改
	public abstract void updateRoom(T t) throws Exception;

	// 删除
	public abstract void deleteRoom(Integer id) throws Exception;
	
	// 通过roomid查找进入该教室所需积分
	public abstract int findScoreByRoomid(int roomid) throws Exception;
}
