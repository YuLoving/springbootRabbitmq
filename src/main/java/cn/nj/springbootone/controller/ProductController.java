package cn.nj.springbootone.controller;

import cn.nj.springbootone.mapper.ProductMapper;
import cn.nj.springbootone.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  用来测试get、post请求时参数是中文而产生乱码的问题
 * */
@Controller
public class ProductController {
    @Autowired
    private ProductMapper mapper;

    @GetMapping("/get")
    @ResponseBody
    public Product get(String name){
        Product product = mapper.getbyname(name);
        return product;
    }

}
