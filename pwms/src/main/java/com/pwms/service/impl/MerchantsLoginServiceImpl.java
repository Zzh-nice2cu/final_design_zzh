package com.pwms.service.impl;

import com.pwms.entity.MerchantsLogin;
import com.pwms.dao.MerchantsLoginDao;
import com.pwms.service.MerchantsLoginService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;
//
//import javax.annotation.Resource;

/**
 * 商家登陆表(MerchantsLogin)表服务实现类
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
@Service("merchantsLoginService")
public class MerchantsLoginServiceImpl implements MerchantsLoginService {
    @Resource
    private MerchantsLoginDao merchantsLoginDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MerchantsLogin queryById(Integer id) {
        return this.merchantsLoginDao.queryById(id);
    }

//    /**
//     * 分页查询
//     *
//     * @param merchantsLogin 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @Override
//    public Page<MerchantsLogin> queryByPage(MerchantsLogin merchantsLogin, PageRequest pageRequest) {
//        long total = this.merchantsLoginDao.count(merchantsLogin);
//        return new PageImpl<>(this.merchantsLoginDao.queryAllByLimit(merchantsLogin, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param merchantsLogin 实例对象
     * @return 实例对象
     */
    @Override
    public MerchantsLogin insert(MerchantsLogin merchantsLogin) {
        this.merchantsLoginDao.insert(merchantsLogin);
        return merchantsLogin;
    }

    /**
     * 修改数据
     *
     * @param merchantsLogin 实例对象
     * @return 实例对象
     */
    @Override
    public MerchantsLogin update(MerchantsLogin merchantsLogin) {
        this.merchantsLoginDao.update(merchantsLogin);
        return this.queryById(merchantsLogin.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.merchantsLoginDao.deleteById(id) > 0;
    }
}
