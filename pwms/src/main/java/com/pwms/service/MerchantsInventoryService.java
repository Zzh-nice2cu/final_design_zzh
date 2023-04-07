package com.pwms.service;

import com.pwms.entity.MerchantsInventory;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * 商家库存表(MerchantsInventory)表服务接口
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
public interface MerchantsInventoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MerchantsInventory queryById(Integer id);

//    /**
//     * 分页查询
//     *
//     * @param merchantsInventory 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    Page<MerchantsInventory> queryByPage(MerchantsInventory merchantsInventory, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param merchantsInventory 实例对象
     * @return 实例对象
     */
    MerchantsInventory insert(MerchantsInventory merchantsInventory);

    /**
     * 修改数据
     *
     * @param merchantsInventory 实例对象
     * @return 实例对象
     */
    MerchantsInventory update(MerchantsInventory merchantsInventory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
