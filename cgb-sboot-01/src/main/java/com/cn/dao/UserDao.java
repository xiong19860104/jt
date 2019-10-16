package com.cn.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserDao {
	public int deleteObjects(@Param("ids")Integer []ids);

}
