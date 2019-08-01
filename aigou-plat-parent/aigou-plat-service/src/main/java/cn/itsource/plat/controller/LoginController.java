package cn.itsource.plat.controller;

import cn.itsource.basic.util.AjaxResult;
import cn.itsource.plat.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login")
    public AjaxResult login(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();
        if("admin".equals(username)&&"admin".equals(password)){
            return AjaxResult.getAjax().setSuccess(true).setMessage("登录成功!").setObject(user);
        }
        return AjaxResult.getAjax().setSuccess(false).setMessage("登录失败!");
    }
}
