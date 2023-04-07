package com.pwms.service.impl;

import com.pwms.entity.SupplyRelations;
import com.pwms.dao.SupplyRelationsDao;
import com.pwms.service.SupplyRelationsService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;
//
//import javax.annotation.Resource;

/**
 * 供应关系表(SupplyRelations)表服务实现类
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
@Service("supplyRelationsService")
public class SupplyRelationsServiceImpl implements SupplyRelationsService {
    @Resource
    private SupplyRelationsDao supplyRelationsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SupplyRelations queryById(Integer id) {
        return this.supplyRelationsDao.queryById(id);
    }

//    /**
//     * 分页查询
//     *
//     * @param supplyRelations 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @Override
//    public Page<SupplyRelations> queryByPage(SupplyRelations supplyRelations, PageRequest pageRequest) {
//        long total = this.supplyRelationsDao.count(supplyRelations);
//        return new PageImpl<>(this.supplyRelationsDao.queryAllByLimit(supplyRelations, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param supplyRelations 实例对象
     * @return 实例对象
     */
    @Override
    public SupplyRelations insert(SupplyRelations supplyRelations) {
        this.supplyRelationsDao.insert(supplyRelations);
        return supplyRelations;
    }

    /**
     * 修改数据
     *
     * @param supplyRelations 实例对象
     * @return 实例对象
     */
    @Override
    public SupplyRelations update(SupplyRelations supplyRelations) {
        this.supplyRelationsDao.update(supplyRelations);
        return this.queryById(supplyRelations.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.supplyRelationsDao.deleteById(id) > 0;
    }
}
