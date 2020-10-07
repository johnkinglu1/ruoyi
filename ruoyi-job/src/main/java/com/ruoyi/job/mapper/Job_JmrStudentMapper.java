package com.ruoyi.job.mapper;

import java.util.List;
import com.ruoyi.job.domain.Job_JmrStudent;

/**
 * 学生信息查询Mapper接口
 * 
 * @author 李佳鹏
 * @date 2020-09-27
 */
public interface Job_JmrStudentMapper
{
    /**
     * 查询学生信息查询
     * 
     * @param sId 学生信息查询ID
     * @return 学生信息查询
     */
    public Job_JmrStudent selectJmrStudentById(Long sId);

    /**
     * 查询学生信息查询列表
     * 
     * @param jobJmrStudent 学生信息查询
     * @return 学生信息查询集合
     */
    public List<Job_JmrStudent> selectJmrStudentList(Job_JmrStudent jobJmrStudent);

    /**
     * 新增学生信息查询
     * 
     * @param jobJmrStudent 学生信息查询
     * @return 结果
     */
    public int insertJmrStudent(Job_JmrStudent jobJmrStudent);

    /**
     * 修改学生信息查询
     * 
     * @param jobJmrStudent 学生信息查询
     * @return 结果
     */
    public int updateJmrStudent(Job_JmrStudent jobJmrStudent);

    /**
     * 删除学生信息查询
     * 
     * @param sId 学生信息查询ID
     * @return 结果
     */
    public int deleteJmrStudentById(Long sId);

    /**
     * 批量删除学生信息查询
     * 
     * @param sIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrStudentByIds(String[] sIds);
}
