package cn.nj.springbootone.pojo;

/**
 *  用来测试get、post请求时参数是中文而产生乱码的问题
 * */
public class Product {
    private  int id;
    private  String name;
    private  double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
