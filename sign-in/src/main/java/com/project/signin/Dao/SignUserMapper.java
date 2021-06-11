package com.project.signin.Dao;

import com.common.ReturnDataUtil.ReturnPageData;
import com.project.signin.Entity.SignUser;
import com.project.signin.Entity.SignUserExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author suyu
 */
@Repository
public interface SignUserMapper {

    /**
     * 单点登录
     * @param userId
     * @param password
     */
    void singleLogin(String userId,String password);

    /**
     * 查询用户信息
     * @param map
     * @return
     */
    List<SignUser> selectInformation(Map<String, Object> map);

    /**
     * 注册用户信息
     *
     * @param record
     * @return
     */
    void insert(List<SignUser> record);

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    void deleteByPrimaryKey(Map<String,Object> id);

    /**
     * 升级权限(普通员工--管理员)
     *
     * @param phone
     * @param id
     * @return
     */
    int upgrade(int phone, String id);

    /**
     * 降级权限(管理员--普通员工)
     *
     * @param phone
     * @param id
     * @return
     */
    int demotion(int phone, String id);

    void selectByPrimaryKey(List<String> ids);

    long countByExample(SignUserExample example);

    int deleteByExample(SignUserExample example);

    int insertSelective(SignUser record);

    List<SignUser> selectByExample(SignUserExample example);

    int updateByExampleSelective(@Param("record") SignUser record, @Param("example") SignUserExample example);

    int updateByExample(@Param("record") SignUser record, @Param("example") SignUserExample example);

    int updateByPrimaryKeySelective(SignUser record);

    int updateByPrimaryKey(SignUser record);
}