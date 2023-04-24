package com.jacckx.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jacckx.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * 员工Mapper接口，继承于mybatisplus提供的BaseMapper，其提供常见的增删改查方法
 */

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
