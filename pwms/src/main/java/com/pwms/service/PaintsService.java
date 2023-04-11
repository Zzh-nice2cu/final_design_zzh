package com.pwms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pwms.entity.Paints;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * 涂料信息表(Paints)表服务接口
 *
 * @author makejava
 * @since 2023-04-09 13:00:57
 */
public interface PaintsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Paints queryById(Integer id);


    /**
     * 新增数据
     *
     * @param paints 实例对象
     * @return 实例对象
     */
    Paints insert(Paints paints);

    /**
     * 修改数据
     *
     * @param paints 实例对象
     * @return 实例对象
     */
    Paints update(Paints paints);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    IPage pageCC(IPage<Paints> page, Wrapper wrapper);
}
