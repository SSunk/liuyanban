package com.sun.contact.mapper;

import com.sun.contact.model.Infomation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Infomation)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-12 14:58:08
 */
@Mapper
public interface Infomationmapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Infomation queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Infomation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Infomation> queryByName(String name);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param infomation 实例对象
     * @return 对象列表
     */
    List<Infomation> queryAll(Infomation infomation);

    /**
     * 新增数据
     *
     * @param infomation 实例对象
     * @return 影响行数
     */
    int insert(Infomation infomation);

    /**
     * 修改数据
     *
     * @param infomation 实例对象
     * @return 影响行数
     */
    int update(Infomation infomation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}