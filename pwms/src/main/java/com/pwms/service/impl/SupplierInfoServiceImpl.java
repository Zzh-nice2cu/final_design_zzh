package com.pwms.service.impl;

import com.pwms.entity.SupplierInfo;
import com.pwms.dao.SupplierInfoDao;
import com.pwms.service.SupplierInfoService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;
//
//import javax.annotation.Resource;

/**
 * 供应商信息表(SupplierInfo)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 13:00:58
 */
@Service("supplierInfoService")
public class SupplierInfoServiceImpl implements SupplierInfoService {
    @Resource
    private SupplierInfoDao supplierInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SupplierInfo queryById(Integer id) {
        return this.supplierInfoDao.queryById(id);
    }


    /**
     * 新增数据
     *
     * @param supplierInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SupplierInfo insert(SupplierInfo supplierInfo) {
        this.supplierInfoDao.insert(supplierInfo);
        return supplierInfo;
    }

    /**
     * 修改数据
     *
     * @param supplierInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SupplierInfo update(SupplierInfo supplierInfo) {
        this.supplierInfoDao.update(supplierInfo);
        return this.queryById(supplierInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.supplierInfoDao.deleteById(id) > 0;
    }
}
