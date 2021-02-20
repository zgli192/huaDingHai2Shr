package synchr.dao;


import org.mybatis.spring.annotation.Mapper;

import java.util.List;

@Mapper("seatDao")
public interface SeatDao<T> {
	// 查询所有
	public abstract List<T> findSeat(T t) throws Exception;

	// 数量
	public abstract int countSeat(T t) throws Exception;

	// 新增
	public abstract void insertSeat(T t) throws Exception;

	// 修改
	public abstract void modifySeat(T t) throws Exception;

	// 删除
	public abstract void deleteSeat(Integer id) throws Exception;
	
	// 占座
	public abstract void occupySeat(T t) throws Exception;
	
	// 取消占座
	public abstract void cancelSeat(String keyword) throws Exception;
	
	//查询余座
	public abstract int findBlock(T t) throws Exception;
	
}
