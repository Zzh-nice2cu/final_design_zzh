package com.pwms.controller;

import com.pwms.entity.SupplierInfo;
import com.pwms.service.SupplierInfoService;
import jakarta.annotation.Resource;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//import javax.annotation.Resource;

/**
 * 供应商信息表(SupplierInfo)表控制层
 *
 * @author makejava
 * @since 2023-04-09 13:00:57
 */
@Controller
@RequestMapping("supplierInfo")
public class SupplierInfoController {
    /**
     * 服务对象
     */
    @Resource
    private SupplierInfoService supplierInfoService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SupplierInfo> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.supplierInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param supplierInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SupplierInfo> add(SupplierInfo supplierInfo) {
        return ResponseEntity.ok(this.supplierInfoService.insert(supplierInfo));
    }

    /**
     * 编辑数据
     *
     * @param supplierInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SupplierInfo> edit(SupplierInfo supplierInfo) {
        return ResponseEntity.ok(this.supplierInfoService.update(supplierInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.supplierInfoService.deleteById(id));
    }

}

