package com.pwms.controller;

import com.pwms.entity.SupplyRelations;
import com.pwms.service.SupplyRelationsService;
import jakarta.annotation.Resource;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.annotation.Resource;

/**
 * 供应关系表(SupplyRelations)表控制层
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
@RestController
@RequestMapping("supplyRelations")
public class SupplyRelationsController {
    /**
     * 服务对象
     */
    @Resource
    private SupplyRelationsService supplyRelationsService;

//    /**
//     * 分页查询
//     *
//     * @param supplyRelations 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @GetMapping
//    public ResponseEntity<Page<SupplyRelations>> queryByPage(SupplyRelations supplyRelations, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.supplyRelationsService.queryByPage(supplyRelations, pageRequest));
//    }

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

