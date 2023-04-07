package com.pwms.service;

import com.pwms.entity.SupplyRelations;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * 供应关系表(SupplyRelations)表服务接口
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
public interface SupplyRelationsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SupplyRelations queryById(Integer id);

//    /**
//     * 分页查询
//     *
//     * @param supplyRelations 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    Page<SupplyRelations> queryByPage(SupplyRelations supplyRelations, PageRequest pageRequest);

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
