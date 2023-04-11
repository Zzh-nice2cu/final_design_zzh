package com.pwms.service;

import com.pwms.entity.MerchantsInfo;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * 商家信息表(MerchantsInfo)表服务接口
 *
 * @author makejava
 * @since 2023-04-09 13:00:52
 */
public interface MerchantsInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MerchantsInfo queryById(Integer id);


    /**
     * 新增数据
     *
     * @param merchantsInfo 实例对象
     * @return 实例对象
     */
    MerchantsInfo insert(MerchantsInfo merchantsInfo);

    /**
     * 修改数据
     *
     * @param merchantsInfo 实例对象
     * @return 实例对象
     */
    MerchantsInfo update(MerchantsInfo merchantsInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    MerchantsInfo queryByUsername(String username);
}
