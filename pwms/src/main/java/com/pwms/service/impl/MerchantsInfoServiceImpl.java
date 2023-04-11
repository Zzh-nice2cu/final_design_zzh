package com.pwms.service.impl;

import com.pwms.entity.MerchantsInfo;
import com.pwms.dao.MerchantsInfoDao;
import com.pwms.service.MerchantsInfoService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;
//
//import javax.annotation.Resource;

/**
 * 商家信息表(MerchantsInfo)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 13:00:53
 */
@Service("merchantsInfoService")
public class MerchantsInfoServiceImpl implements MerchantsInfoService {
    @Resource
    private MerchantsInfoDao merchantsInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MerchantsInfo queryById(Integer id) {
        return this.merchantsInfoDao.queryById(id);
    }


    /**
     * 新增数据
     *
     * @param merchantsInfo 实例对象
     * @return 实例对象
     */
    @Override
    public MerchantsInfo insert(MerchantsInfo merchantsInfo) {
        this.merchantsInfoDao.insert(merchantsInfo);
        return merchantsInfo;
    }

    /**
     * 修改数据
     *
     * @param merchantsInfo 实例对象
     * @return 实例对象
     */
    @Override
    public MerchantsInfo update(MerchantsInfo merchantsInfo) {
        this.merchantsInfoDao.update(merchantsInfo);
        return this.queryById(merchantsInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.merchantsInfoDao.deleteById(id) > 0;
    }

    @Override
    public MerchantsInfo queryByUsername(String username) {
        return this.merchantsInfoDao.queryByUsername(username);
    }
}
