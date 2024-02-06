package com.springboot.blog.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "data_entity")
public class TcsDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long empId;

    private String name;
    private String tech;

    public TcsDataEntity(String s, String h0) {
    }

    public TcsDataEntity(String name,
                         String tech,Long seq) {
        this.empId=seq;
        this.name = name;
        this.tech = tech;
    }

    public TcsDataEntity() {
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TcsDataEntity{");
        sb.append("empId=").append(empId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", tech='").append(tech).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
