package cn.nj.springbootone.mapper;

import cn.nj.springbootone.pojo.Test;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 进行批量操作的对应mapper
 * */
@Mapper
public interface TestMapper {
    //批量插入
    public int  pilianginsert(@Param("pl") List<Test> pl);


}
