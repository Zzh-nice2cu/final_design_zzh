package com.pwms.dao;

import com.pwms.entity.MerchantsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
//import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 商家信息表(MerchantsInfo)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-06 18:42:23
 */
@Mapper
public interface MerchantsInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MerchantsInfo queryById(Integer id);

//    /**
//     * 查询指定行数据
//     *
//     * @param merchantsInfo 查询条件
//     * @param pageable         分页对象
//     * @return 对象列表
//     */
//    List<MerchantsInfo> queryAllByLimit(MerchantsInfo merchantsInfo, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param merchantsInfo 查询条件
     * @return 总行数
     */
    long count(MerchantsInfo merchantsInfo);

    /**
     * 新增数据
     *
     * @param merchantsInfo 实例对象
     * @return 影响行数
     */
    int insert(MerchantsInfo merchantsInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MerchantsInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MerchantsInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MerchantsInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MerchantsInfo> entities);

    /**
     * 修改数据
     *
     * @param merchantsInfo 实例对象
     * @return 影响行数
     */
    int update(MerchantsInfo merchantsInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

