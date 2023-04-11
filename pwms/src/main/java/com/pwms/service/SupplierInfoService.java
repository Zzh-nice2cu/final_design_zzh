package com.pwms.service;

import com.pwms.entity.SupplierInfo;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * 供应商信息表(SupplierInfo)表服务接口
 *
 * @author makejava
 * @since 2023-04-09 13:00:58
 */
public interface SupplierInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SupplierInfo queryById(Integer id);


    /**
     * 新增数据
     *
     * @param supplierInfo 实例对象
     * @return 实例对象
     */
    SupplierInfo insert(SupplierInfo supplierInfo);

    /**
     * 修改数据
     *
     * @param supplierInfo 实例对象
     * @return 实例对象
     */
    SupplierInfo update(SupplierInfo supplierInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
