package com.zhangyuxuan.mybatis;

/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2022/3/8 下午1:56 周二
 */
public class User {
    private Integer id;
    private String name;
    private String schoolName;

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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
