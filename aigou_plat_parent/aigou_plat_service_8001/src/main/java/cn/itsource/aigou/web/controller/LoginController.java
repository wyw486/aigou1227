package cn.itsource.aigou.web.controller;

import cn.itsouce.aigou.domain.Employee;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    // RequestBody:接收请求的body中的参数
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        //组null的判断
        if("xxx".equals(employee.getUsername())&&"xxxooo".equals(employee.getPassword())){
            return  AjaxResult.me().setObject(null);
        }else{
            return  AjaxResult.me().setSuccess(false).setMsg("登录失败").setObject(null);
        }
    }

    @RequestMapping(value = "/lget",method = RequestMethod.GET)
    public AjaxResult tttt(){
        return AjaxResult.me();
    }
}
