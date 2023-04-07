package com.pwms.controller;

import com.pwms.entity.Paints;
import com.pwms.service.PaintsService;
import jakarta.annotation.Resource;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.annotation.Resource;

/**
 * 涂料信息表(Paints)表控制层
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
@RestController
@RequestMapping("paints")
public class PaintsController {
    /**
     * 服务对象
     */
    //@Resource比@AutoWired更通用
    @Autowired
    private PaintsService paintsService;

//    /**
//     * 分页查询
//     *
//     * @param paints 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @GetMapping
//    public ResponseEntity<Page<Paints>> queryByPage(Paints paints, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.paintsService.queryByPage(paints, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    //这里的@PathVariable("id")意思是把url中的id当做函数参数id
    @GetMapping("/{id}")
    public ResponseEntity<Paints> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.paintsService.queryById(id));
    }


    /**
     * 新增数据
     *
     * @param paints 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Paints> add(Paints paints) {
        return ResponseEntity.ok(this.paintsService.insert(paints));
    }

    /**
     * 编辑数据
     *
     * @param paints 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Paints> edit(Paints paints) {
        return ResponseEntity.ok(this.paintsService.update(paints));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.paintsService.deleteById(id));
    }

}

