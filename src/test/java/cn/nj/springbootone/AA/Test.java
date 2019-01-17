package cn.nj.springbootone.AA;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 对于Java 8 Lambda表达式的使用
 * */
public class Test {

    public static void main(String[] args) {
     /*   List<Double> list = new ArrayList<>();
        list.add(2.3);
        list.add(3.9);
        list.add(4.8);
        list.add(6.1);

        for (int i=0;i<list.size();i++){
            //四舍五入
            BigDecimal scale = new BigDecimal(list.get(i)).setScale(0, BigDecimal.ROUND_HALF_UP);
            System.out.println(scale);
        }*/


        /*List<Object> list = new ArrayList<>();
        list.add("测试数据1");
        list.add("测试数据2");
        list.add("测试数据3");
        list.add("测试数据12");
*/
       /* //传统的遍历
        for (Object ob:list) {
            System.out.println(ob);
        }*/

        //使用Lambda表达式的遍历
   /*  list.forEach(i->{
         System.out.println(i);
     });
*/
       /* //结合Predicate使用和过滤条件筛选元素
        Predicate<String> contain1 = n -> n.contains("1");
        Predicate<String> contain2 = n -> n.contains("2");*/
    }




    
}
