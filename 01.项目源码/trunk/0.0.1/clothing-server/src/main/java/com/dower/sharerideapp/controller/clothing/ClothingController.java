package com.dower.sharerideapp.controller.clothing;


import com.dower.sharerideapp.service.clothing.ClothingService;
import com.dower.sharerideapp.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 14:13   2018/6/28
 */
@Slf4j
@RequestMapping("/reposi")
@RestController
public class ClothingController {

    @Autowired
    ClothingService clothingService;

    @PostMapping("/creatProduct")
    public Result creatProduct(@RequestBody String params){
        return clothingService.creatProduct(params);
    }

    @PostMapping("/queryProductList")
    public Result queryProductList(@RequestBody String params){
        return clothingService.queryProductList(params);
    }

    @PostMapping("/queryProductPage")
    public Result queryProductPage(@RequestBody String params){
        return clothingService.queryProductPage2(params);
    }

    @PostMapping("/updateProduct")
    public Result updateProduct(@RequestBody String params){
        return clothingService.updateProduct(params);
    }
}
