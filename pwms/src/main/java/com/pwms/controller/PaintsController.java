package com.pwms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pwms.common.QueryPageParam;
import com.pwms.entity.MerchantsInfo;
import com.pwms.entity.Paints;
import com.pwms.service.PaintsService;
import jakarta.annotation.Resource;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * 涂料信息表(Paints)表控制层
 *
 * @author makejava
 * @since 2023-04-09 13:00:56
 */
@Controller
@RequestMapping("paints")
public class PaintsController {
    /**
     * 服务对象
     */
    @Resource
    private PaintsService paintsService;


    @PostMapping("/listpage")
    public List<Paints> listpage(@RequestBody QueryPageParam query) {
        HashMap param=query.getParam();
        Page<Paints> page = new Page();

        String name=(String)param.get("name");
        //设置当前页和页大小
        page.setCurrent(query.getPageNum());
        page.setSize(query.getPageSize());
        LambdaQueryWrapper<Paints> lambdaQueryWrapper=new LambdaQueryWrapper();
        lambdaQueryWrapper.like(Paints::getName,name);

        IPage result = paintsService.pageCC(page,lambdaQueryWrapper);
        System.out.println("total="+result.getTotal());
        return result.getRecords();
    }


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/select/{id}")
    public ResponseEntity<Paints> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.paintsService.queryById(id));
    }



    /**
     * 新增数据
     *
     * @param paints 实体
     * @return 新增结果
     */
    @PostMapping("/insert")
    public ResponseEntity<Paints> add(Paints paints) {
        return ResponseEntity.ok(this.paintsService.insert(paints));
    }

    /**
     * 编辑数据
     *
     * @param paints 实体
     * @return 编辑结果
     */
    @PutMapping("/update")
    public ResponseEntity<Paints> edit(Paints paints) {
        return ResponseEntity.ok(this.paintsService.update(paints));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.paintsService.deleteById(id));
    }

}

