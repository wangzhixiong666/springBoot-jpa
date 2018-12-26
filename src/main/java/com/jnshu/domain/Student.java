package com.jnshu.domain;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Column(nullable = false)
    private String name;
    private int qq;
    private String learn_type;
    private long entrance_time;
    private String school;
    @Id
    @GeneratedValue
    @Column(nullable = false,unique = true)
    private long id;
    private String daily_link;
    private String wish;
    private String senior;
    private String way;
    private long create_time;
    private long update_time;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQq() {
        return qq;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public String getLearn_type() {
        return learn_type;
    }

    public void setLearn_type(String learn_type) {
        this.learn_type = learn_type;
    }

    public long getEntrance_time() {
        return entrance_time;
    }

    public void setEntrance_time(long entrance_time) {
        this.entrance_time = entrance_time;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDaily_link() {
        return daily_link;
    }

    public void setDaily_link(String daily_link) {
        this.daily_link = daily_link;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public String getSenior() {
        return senior;
    }

    public void setSenior(String senior) {
        this.senior = senior;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(long create_time) {
        this.create_time = create_time;
    }

    public long getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(long update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", qq=" + qq +
                ", learn_type='" + learn_type + '\'' +
                ", entrance_time=" + entrance_time +
                ", school='" + school + '\'' +
                ", id=" + id +
                ", daily_link='" + daily_link + '\'' +
                ", wish='" + wish + '\'' +
                ", senior='" + senior + '\'' +
                ", way='" + way + '\'' +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}