package com.oasystem.dao.system.dept;

import com.oasystem.model.DeptInfo;
import com.oasystem.model.dto.DeptQueryDTO;

import java.util.List;

public interface DeptInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(DeptInfo record);

    DeptInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeptInfo record);

//    List<DeptInfo>
    List<DeptInfo> selectAllPage(DeptQueryDTO deptQueryDTO);

}