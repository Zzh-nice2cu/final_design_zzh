package com.pwms.dao;

import com.pwms.entity.MerchantsLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
//import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 商家登陆表(MerchantsLogin)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
@Mapper
public interface MerchantsLoginDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MerchantsLogin queryById(Integer id);

//    /**
//     * 查询指定行数据
//     *
//     * @param merchantsLogin 查询条件
//     * @param pageable         分页对象
//     * @return 对象列表
//     */
//    List<MerchantsLogin> queryAllByLimit(MerchantsLogin merchantsLogin, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param merchantsLogin 查询条件
     * @return 总行数
     */
    long count(MerchantsLogin merchantsLogin);

    /**
     * 新增数据
     *
     * @param merchantsLogin 实例对象
     * @return 影响行数
     */
    int insert(MerchantsLogin merchantsLogin);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MerchantsLogin> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MerchantsLogin> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MerchantsLogin> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MerchantsLogin> entities);

    /**
     * 修改数据
     *
     * @param merchantsLogin 实例对象
     * @return 影响行数
     */
    int update(MerchantsLogin merchantsLogin);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

