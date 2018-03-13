package entity;

/**
 * 用户信息实体类
 */
public class SysUser {

    private  int id;//主键id

    private  String name;//用户姓名

    private  String userName;//用户登录名

    private  int age;//用户年龄

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
