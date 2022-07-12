package com.mj.domain;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class Skill {
    private Integer id;
    private String name;
    private Integer level;

    public Skill() {

    }

    public Skill(String name, Integer level) {
        this.name = name;
        this.level = level;
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
