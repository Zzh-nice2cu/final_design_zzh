package com.pwms.controller;

import com.pwms.entity.MerchantsLogin;
import com.pwms.service.MerchantsLoginService;
import jakarta.annotation.Resource;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.annotation.Resource;

/**
 * 商家登陆表(MerchantsLogin)表控制层
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
@RestController
@RequestMapping("merchantsLogin")
public class MerchantsLoginController {
    /**
     * 服务对象
     */
    @Resource
    private MerchantsLoginService merchantsLoginService;

//    /**
//     * 分页查询
//     *
//     * @param merchantsLogin 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @GetMapping
//    public ResponseEntity<Page<MerchantsLogin>> queryByPage(MerchantsLogin merchantsLogin, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.merchantsLoginService.queryByPage(merchantsLogin, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MerchantsLogin> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.merchantsLoginService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param merchantsLogin 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MerchantsLogin> add(MerchantsLogin merchantsLogin) {
        return ResponseEntity.ok(this.merchantsLoginService.insert(merchantsLogin));
    }

    /**
     * 编辑数据
     *
     * @param merchantsLogin 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MerchantsLogin> edit(MerchantsLogin merchantsLogin) {
        return ResponseEntity.ok(this.merchantsLoginService.update(merchantsLogin));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.merchantsLoginService.deleteById(id));
    }

}

