package com.pwms.service;

import com.pwms.entity.Paints;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * 涂料信息表(Paints)表服务接口
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
public interface PaintsService{

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Paints queryById(Integer id);

//    /**
//     * 分页查询
//     *
//     * @param paints 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    Page<Paints> queryByPage(Paints paints, PageRequest pageRequest);

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


}
