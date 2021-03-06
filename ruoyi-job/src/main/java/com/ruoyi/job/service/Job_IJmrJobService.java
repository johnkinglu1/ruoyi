package com.ruoyi.job.service;

import java.util.List;
import com.ruoyi.job.domain.Job_JmrJob;

/**
 * 岗位信息查询Service接口
 * 
 * @author 李佳鹏
 * @date 2020-09-28
 */
public interface Job_IJmrJobService
{
    /**
     * 查询岗位信息查询
     * 
     * @param jCId 岗位信息查询ID
     * @return 岗位信息查询
     */
    public List<Job_JmrJob> selectJmrJobById(Integer jCId);

    /**
     * 查询岗位信息查询列表
     * 
     * @param jobJmrJob 岗位信息查询
     * @return 岗位信息查询集合
     */
    public List<Job_JmrJob> selectJmrJobList(Job_JmrJob jobJmrJob);

    /**
     * 新增岗位信息查询
     * 
     * @param jobJmrJob 岗位信息查询
     * @return 结果
     */
    public int insertJmrJob(Job_JmrJob jobJmrJob);

    /**
     * 修改岗位信息查询
     * 
     * @param jobJmrJob 岗位信息查询
     * @return 结果
     */
    public int updateJmrJob(Job_JmrJob jobJmrJob);

    /**
     * 批量删除岗位信息查询
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrJobByIds(String ids);

    /**
     * 删除岗位信息查询信息
     * 
     * @param jId 岗位信息查询ID
     * @return 结果
     */
    public int deleteJmrJobById(Integer jId);
}
