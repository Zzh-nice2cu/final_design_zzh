package com.pwms.controller;

import com.pwms.common.Result;
import com.pwms.entity.MerchantsInfo;
import com.pwms.service.MerchantsInfoService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 商家信息表(MerchantsInfo)表控制层
 *
 * @author makejava
 * @since 2023-04-09 13:00:34
 */
@Controller
@RequestMapping("merchantsInfo")
public class MerchantsInfoController {
    /**
     * 服务对象
     */
    @Resource
    private MerchantsInfoService merchantsInfoService;

    //默认根目录跳转登陆页
    @GetMapping("")
    public String tologin() {
        return "login";
    }

    @GetMapping("/toregister")
    public String toregister() {
        return "register";
    }

    //登陆验证
    @PostMapping("/login")
    public String login(@ModelAttribute MerchantsInfo merchantsInfo, HttpSession session, Model model) {
        MerchantsInfo merchantsInfo1=merchantsInfoService.queryByUsername(merchantsInfo.getUsername());
        if(merchantsInfo1 != null)
        {
            if((merchantsInfo1.getPassword()).equals(merchantsInfo.getPassword()))
            {
                //成功则存入session
                session.setAttribute("user_login", merchantsInfo1);
                return "redirect:/static/welcome.html";
            }
            else{
                //带error说明是登陆失败，前端页面对应显示错误信息
                System.out.println("222222");
                model.addAttribute("error","用户名或账户错误，请重新输入~");
                return "login";
                //return "redirect:/templates/login.html";
                //return "redirect:/templates/login.html?error";
            }
        }
        else{
            model.addAttribute("error","用户名或账户错误，请重新输入~");
            return "login";
        }
    }




    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/select/{id}")
    public ResponseEntity<MerchantsInfo> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.merchantsInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param merchantsInfo 实体
     * @return 新增结果
     */
    @PostMapping("/insert")
    public String add(@ModelAttribute MerchantsInfo merchantsInfo) {
        try {
            // 调用 DAO 层的 insert 方法进行插入操作
            merchantsInfoService.insert(merchantsInfo);
            return "redirect:/static/register_success.html";
            // 如果插入成功，则 result 会返回插入的实体
            // 在这里可以进行插入成功后的其他操作
        } catch (DataIntegrityViolationException e) {
            // 如果出现异常，则说明插入失败
            // 在这里可以进行插入失败后的其他操作
            return "redirect:/static/register_fail.html";
        }
    }

    /**
     * 编辑数据
     *
     * @param merchantsInfo 实体
     * @return 编辑结果
     */
    @PutMapping("/update")
    public ResponseEntity<MerchantsInfo> edit(MerchantsInfo merchantsInfo) {
        return ResponseEntity.ok(this.merchantsInfoService.update(merchantsInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.merchantsInfoService.deleteById(id));
    }

}

