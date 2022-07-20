package com.sun.contact.service;

import com.sun.contact.model.Infomation;

import java.util.List;

/**
 * (Infomation)表服务接口
 *
 * @author makejava
 * @since 2022-05-12 14:58:11
 */
public interface InfomationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Infomation queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Infomation> queryAllByLimit(int offset, int limit);

    List<Infomation> queryByName(String name);

    /**
     * 新增数据
     *
     * @param infomation 实例对象
     * @return 实例对象
     */
    Infomation insert(Infomation infomation);

    /**
     * 修改数据
     *
     * @param infomation 实例对象
     * @return 实例对象
     */
    Infomation update(Infomation infomation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}