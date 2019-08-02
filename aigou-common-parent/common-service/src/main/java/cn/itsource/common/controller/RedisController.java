package cn.itsource.common.controller;


import cn.itsource.basic.util.AjaxResult;
import cn.itsource.basic.util.RedisUtils;
import cn.itsource.common.client.RedisClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//缓存数据
@RestController
public class RedisController implements RedisClient{


    //存
    @PostMapping("/redis")
    public AjaxResult set(@RequestParam("key")String key, @RequestParam("value") String value){
        try {
            RedisUtils.INSTANCE.set(key,value);
            return AjaxResult.getAjax().setSuccess(true).setMessage("save successful");
        } catch (Exception e) {
            return AjaxResult.getAjax().setSuccess(false).setMessage("save failed : "+e.getMessage());
        }
    }

    //取
    @GetMapping("/redis")
    public AjaxResult get(@RequestParam("key")String key){
        try {
            String value = RedisUtils.INSTANCE.get(key);
            return AjaxResult.getAjax().setSuccess(true).setMessage("get it").setObject(value);
        } catch (Exception e) {
            return AjaxResult.getAjax().setSuccess(false).setMessage("get failed : "+e.getMessage());
        }
    }



}
