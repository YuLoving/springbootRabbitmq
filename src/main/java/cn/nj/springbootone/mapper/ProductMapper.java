package cn.nj.springbootone.mapper;

import cn.nj.springbootone.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 *  用来测试get、post请求时参数是中文而产生乱码的问题
 * */
@Mapper
public interface ProductMapper {
    @Select("SELECT * FROM `t_product` where `name`=#{name}")
    Product getbyname(String name);


}
