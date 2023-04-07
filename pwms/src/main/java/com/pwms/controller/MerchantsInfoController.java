package com.pwms.controller;

import com.pwms.entity.MerchantsInfo;
import com.pwms.service.MerchantsInfoService;
import jakarta.annotation.Resource;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.annotation.Resource;

/**
 * 商家信息表(MerchantsInfo)表控制层
 *
 * @author makejava
 * @since 2023-04-06 18:42:22
 */
@RestController
@RequestMapping("merchantsInfo")
public class MerchantsInfoController {
    /**
     * 服务对象
     */
    @Resource
    private MerchantsInfoService merchantsInfoService;

//    /**
//     * 分页查询
//     *
//     * @param merchantsInfo 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @GetMapping
//    public ResponseEntity<Page<MerchantsInfo>> queryByPage(MerchantsInfo merchantsInfo, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.merchantsInfoService.queryByPage(merchantsInfo, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MerchantsInfo> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.merchantsInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param merchantsInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MerchantsInfo> add(MerchantsInfo merchantsInfo) {
        return ResponseEntity.ok(this.merchantsInfoService.insert(merchantsInfo));
    }

    /**
     * 编辑数据
     *
     * @param merchantsInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MerchantsInfo> edit(MerchantsInfo merchantsInfo) {
        return ResponseEntity.ok(this.merchantsInfoService.update(merchantsInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.merchantsInfoService.deleteById(id));
    }

}

