package cn.zjc.common.entity;



/**
 * @author zhangjinci
 * @version 2016/8/31 9:05
 * @function
 */
public class Person {

    private Integer id;
    private String name;
    private City city;

    public Person() {
    }

    public Person(Integer id, String name, City city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
