package com.pwms.service.impl;

import com.pwms.entity.MerchantsInventory;
import com.pwms.dao.MerchantsInventoryDao;
import com.pwms.service.MerchantsInventoryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;
//
//import javax.annotation.Resource;

/**
 * 商家库存表(MerchantsInventory)表服务实现类
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
@Service("merchantsInventoryService")
public class MerchantsInventoryServiceImpl implements MerchantsInventoryService {
    @Resource
    private MerchantsInventoryDao merchantsInventoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MerchantsInventory queryById(Integer id) {
        return this.merchantsInventoryDao.queryById(id);
    }

//    /**
//     * 分页查询
//     *
//     * @param merchantsInventory 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @Override
//    public Page<MerchantsInventory> queryByPage(MerchantsInventory merchantsInventory, PageRequest pageRequest) {
//        long total = this.merchantsInventoryDao.count(merchantsInventory);
//        return new PageImpl<>(this.merchantsInventoryDao.queryAllByLimit(merchantsInventory, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param merchantsInventory 实例对象
     * @return 实例对象
     */
    @Override
    public MerchantsInventory insert(MerchantsInventory merchantsInventory) {
        this.merchantsInventoryDao.insert(merchantsInventory);
        return merchantsInventory;
    }

    /**
     * 修改数据
     *
     * @param merchantsInventory 实例对象
     * @return 实例对象
     */
    @Override
    public MerchantsInventory update(MerchantsInventory merchantsInventory) {
        this.merchantsInventoryDao.update(merchantsInventory);
        return this.queryById(merchantsInventory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.merchantsInventoryDao.deleteById(id) > 0;
    }
}
