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
 * @since 2023-04-06 18:42:24
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

//    /**
//     * 分页查询
//     *
//     * @param merchantsInfo 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @Override
//    public Page<MerchantsInfo> queryByPage(MerchantsInfo merchantsInfo, PageRequest pageRequest) {
//        long total = this.merchantsInfoDao.count(merchantsInfo);
//        return new PageImpl<>(this.merchantsInfoDao.queryAllByLimit(merchantsInfo, pageRequest), pageRequest, total);
//    }

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
}
