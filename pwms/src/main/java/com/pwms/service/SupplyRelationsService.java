package com.pwms.service;

import com.pwms.entity.SupplyRelations;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * 供应关系表(SupplyRelations)表服务接口
 *
 * @author makejava
 * @since 2023-04-09 13:00:59
 */
public interface SupplyRelationsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SupplyRelations queryById(Integer id);


    /**
     * 新增数据
     *
     * @param supplyRelations 实例对象
     * @return 实例对象
     */
    SupplyRelations insert(SupplyRelations supplyRelations);

    /**
     * 修改数据
     *
     * @param supplyRelations 实例对象
     * @return 实例对象
     */
    SupplyRelations update(SupplyRelations supplyRelations);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
