package com.spring.mysql.mapper;

import com.spring.mysql.domin.User;


/**
 * @author：Fangle
 * @className:UserMapper
 * @description:
 * @date:2:59 PM 2019/3/13
 */

//@Mapper     //指定这是一个操作数据库的mapper
public interface UserMapper {

    public User byId(Integer id);

}
