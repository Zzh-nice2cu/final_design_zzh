package com.pwms.controller;

import com.pwms.entity.MerchantsInventory;
import com.pwms.service.MerchantsInventoryService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 商家库存表(MerchantsInventory)表控制层
 *
 * @author makejava
 * @since 2023-04-09 13:00:55
 */
@Controller
@RequestMapping("merchantsInventory")
public class MerchantsInventoryController {
    /**
     * 服务对象
     */
    @Resource
    private MerchantsInventoryService merchantsInventoryService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MerchantsInventory> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.merchantsInventoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param merchantsInventory 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MerchantsInventory> add(MerchantsInventory merchantsInventory) {
        return ResponseEntity.ok(this.merchantsInventoryService.insert(merchantsInventory));
    }

    /**
     * 编辑数据
     *
     * @param merchantsInventory 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MerchantsInventory> edit(MerchantsInventory merchantsInventory) {
        return ResponseEntity.ok(this.merchantsInventoryService.update(merchantsInventory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.merchantsInventoryService.deleteById(id));
    }

}

