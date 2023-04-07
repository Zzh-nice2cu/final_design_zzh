package com.pwms.controller;

import com.pwms.entity.MerchantsInventory;
import com.pwms.service.MerchantsInventoryService;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.annotation.Resource;

/**
 * 商家库存表(MerchantsInventory)表控制层
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
@RestController
@RequestMapping("merchantsInventory")
public class MerchantsInventoryController {
    /**
     * 服务对象
     */
    @Resource
    private MerchantsInventoryService merchantsInventoryService;

//    /**
//     * 分页查询
//     *
//     * @param merchantsInventory 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @GetMapping
//    public ResponseEntity<Page<MerchantsInventory>> queryByPage(MerchantsInventory merchantsInventory, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.merchantsInventoryService.queryByPage(merchantsInventory, pageRequest));
//    }

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

