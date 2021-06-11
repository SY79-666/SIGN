package com.project.signin.Dao;

import com.project.signin.Entity.SignPunch;
import com.project.signin.Entity.SignPunchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SignPunchMapper {
    long countByExample(SignPunchExample example);

    int deleteByExample(SignPunchExample example);

    int insert(SignPunch record);

    int insertSelective(SignPunch record);

    List<SignPunch> selectByExample(SignPunchExample example);

    int updateByExampleSelective(@Param("record") SignPunch record, @Param("example") SignPunchExample example);

    int updateByExample(@Param("record") SignPunch record, @Param("example") SignPunchExample example);
}