package com.pwms.service.impl;

import com.pwms.entity.Paints;
import com.pwms.dao.PaintsDao;
import com.pwms.service.PaintsService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;
//
//import javax.annotation.Resource;

/**
 * 涂料信息表(Paints)表服务实现类
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
@Service("paintsService")
public class PaintsServiceImpl implements PaintsService {
    @Resource
    private PaintsDao paintsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Paints queryById(Integer id) {
        return this.paintsDao.queryById(id);
    }

//    /**
//     * 分页查询
//     *
//     * @param paints 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @Override
//    public Page<Paints> queryByPage(Paints paints, PageRequest pageRequest) {
//        long total = this.paintsDao.count(paints);
//        return new PageImpl<>(this.paintsDao.queryAllByLimit(paints, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param paints 实例对象
     * @return 实例对象
     */
    @Override
    public Paints insert(Paints paints) {
        this.paintsDao.insert(paints);
        return paints;
    }

    /**
     * 修改数据
     *
     * @param paints 实例对象
     * @return 实例对象
     */
    @Override
    public Paints update(Paints paints) {
        this.paintsDao.update(paints);
        return this.queryById(paints.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.paintsDao.deleteById(id) > 0;
    }


}
