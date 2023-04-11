package com.pwms.dao;

import com.pwms.entity.SupplierInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 供应商信息表(SupplierInfo)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-09 13:00:57
 */
@Mapper
public interface SupplierInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SupplierInfo queryById(Integer id);


    /**
     * 统计总行数
     *
     * @param supplierInfo 查询条件
     * @return 总行数
     */
    long count(SupplierInfo supplierInfo);

    /**
     * 新增数据
     *
     * @param supplierInfo 实例对象
     * @return 影响行数
     */
    int insert(SupplierInfo supplierInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SupplierInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SupplierInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SupplierInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SupplierInfo> entities);

    /**
     * 修改数据
     *
     * @param supplierInfo 实例对象
     * @return 影响行数
     */
    int update(SupplierInfo supplierInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

