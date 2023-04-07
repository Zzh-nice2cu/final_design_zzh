package com.pwms.service;

import com.pwms.entity.MerchantsLogin;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * 商家登陆表(MerchantsLogin)表服务接口
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
public interface MerchantsLoginService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MerchantsLogin queryById(Integer id);

//    /**
//     * 分页查询
//     *
//     * @param merchantsLogin 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    Page<MerchantsLogin> queryByPage(MerchantsLogin merchantsLogin, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param merchantsLogin 实例对象
     * @return 实例对象
     */
    MerchantsLogin insert(MerchantsLogin merchantsLogin);

    /**
     * 修改数据
     *
     * @param merchantsLogin 实例对象
     * @return 实例对象
     */
    MerchantsLogin update(MerchantsLogin merchantsLogin);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
