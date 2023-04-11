package com.pwms.controller;

import com.pwms.entity.SupplyRelations;
import com.pwms.service.SupplyRelationsService;
import jakarta.annotation.Resource;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//import javax.annotation.Resource;

/**
 * 供应关系表(SupplyRelations)表控制层
 *
 * @author makejava
 * @since 2023-04-09 13:00:58
 */
@Controller
@RequestMapping("supplyRelations")
public class SupplyRelationsController {
    /**
     * 服务对象
     */
    @Resource
    private SupplyRelationsService supplyRelationsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SupplyRelations> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.supplyRelationsService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param supplyRelations 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SupplyRelations> add(SupplyRelations supplyRelations) {
        return ResponseEntity.ok(this.supplyRelationsService.insert(supplyRelations));
    }

    /**
     * 编辑数据
     *
     * @param supplyRelations 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SupplyRelations> edit(SupplyRelations supplyRelations) {
        return ResponseEntity.ok(this.supplyRelationsService.update(supplyRelations));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.supplyRelationsService.deleteById(id));
    }

}

