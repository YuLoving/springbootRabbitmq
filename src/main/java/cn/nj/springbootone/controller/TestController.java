package cn.nj.springbootone.controller;

import cn.nj.springbootone.mapper.TestMapper;
import cn.nj.springbootone.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 批量操作的控制层
 * */
@Controller
public class TestController {
    @Autowired
    private TestMapper mapper;


    @RequestMapping(value = "/plinsert",method = RequestMethod.POST)
    @ResponseBody
    public Integer  plinsert(){
      List<Test> list = new ArrayList<>();
      for (int i=2;i<10;i++){
          Test test = new Test();
          test.setId(i);
          test.setName("名称"+i);
          test.setAge(15+i);
          list.add(test);
      }
        int j = mapper.pilianginsert(list);
      return j;
    }
}
