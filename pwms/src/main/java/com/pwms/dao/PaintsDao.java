package com.pwms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pwms.entity.Paints;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
//import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 涂料信息表(Paints)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
@Mapper
public interface PaintsDao extends BaseMapper<Paints> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Paints queryById(Integer id);

//    /**
//     * 查询指定行数据
//     *
//     * @param paints 查询条件
//     * @param pageable         分页对象
//     * @return 对象列表
//     */
//    List<Paints> queryAllByLimit(Paints paints, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param paints 查询条件
     * @return 总行数
     */
    long count(Paints paints);

    /**
     * 新增数据
     *
     * @param paints 实例对象
     * @return 影响行数
     */
    int insert(Paints paints);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Paints> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Paints> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Paints> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Paints> entities);

    /**
     * 修改数据
     *
     * @param paints 实例对象
     * @return 影响行数
     */
    int update(Paints paints);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

