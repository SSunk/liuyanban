package com.sun.contact.controller;

import com.sun.contact.model.Infomation;
import com.sun.contact.service.InfomationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.sun.contact.utils.IPUtils;
import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * (Infomation)表控制层
 *
 * @author makejava
 * @since 2022-05-12 14:58:15
 */
@Controller
public class InfomationController {
    /**
     * 服务对象
     */
    @Resource
    private InfomationService infomationService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/getcontact")
    public String getcontact() {
        return "getcontact";
    }

    @GetMapping("/getcontactByname")
    @ResponseBody
    public HashMap getcontactByname(String name) {
        HashMap res = new HashMap();
        List<Infomation> info_list = infomationService.queryByName(name);
        if (info_list.size()==0){
            res.put("status",1);
        }
        else {
            res.put("status",0);
            res.put("size",info_list.size());
            res.put("result",info_list);
        }
        return res;

    }

    @PostMapping("/insert")
    @ResponseBody
    public String insert(Infomation info) {
        if (info.getProvince().equals(""))
        {
            info.setProvince("匿名好友");
        }
        Date dt = new Date();
        String ip = IPUtils.getIpAddr();
        info.setPostTime(dt);
        info.setIp(ip);
        Infomation res = infomationService.insert(info);
        if (res!=null)
        {
            return "给"+info.getName()+"留言成功!";
        }
        else {
            return "留言失败啦!";
        }

    }

}