package com.sun.contact.service.impl;

import com.sun.contact.mapper.Infomationmapper;
import com.sun.contact.model.Infomation;
import com.sun.contact.service.InfomationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Infomation)表服务实现类
 *
 * @author makejava
 * @since 2022-05-12 14:58:12
 */
@Service("infomationService")
public class InfomationServiceImpl implements InfomationService {
    @Resource
    private Infomationmapper infomationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Infomation queryById(Integer id) {
        return this.infomationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Infomation> queryAllByLimit(int offset, int limit) {
        return this.infomationDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Infomation> queryByName(String name) {
        return this.infomationDao.queryByName(name);
    }

    /**
     * 新增数据
     *
     * @param infomation 实例对象
     * @return 实例对象
     */
    @Override
    public Infomation insert(Infomation infomation) {
        this.infomationDao.insert(infomation);
        return infomation;
    }

    /**
     * 修改数据
     *
     * @param infomation 实例对象
     * @return 实例对象
     */
    @Override
    public Infomation update(Infomation infomation) {
        this.infomationDao.update(infomation);
        return this.queryById(infomation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.infomationDao.deleteById(id) > 0;
    }
}