package cn.nj.springbootone.controller;

import cn.nj.springbootone.mapper.TestMapper;
import cn.nj.springbootone.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    public List<Test>  plinsert(){
      List<Test> list = new ArrayList<>();
      for (int i=2;i<10;i++){
          Test test = new Test();
          test.setId(i);
          test.setYourname("名称"+i);
          test.setAge(15+i);
          list.add(test);
      }
        //int j = mapper.pilianginsert(list);
      return list;
    }

    @RequestMapping("/go")
    public String go(HttpServletRequest request, HttpServletResponse response)
    {
        String queryString = request.getQueryString();
        System.out.println(queryString);
        String b = request.getParameter("b");
        System.out.println(b);
        return  queryString;
    }


}
