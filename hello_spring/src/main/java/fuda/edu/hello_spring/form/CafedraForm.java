/*
 * Class name :  CafedraForm
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 11-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.edu.hello_spring.form;

import java.util.Objects;

public class CafedraForm {
    private String id;
    private String name;
    private String desc;
    private String chief;

    public CafedraForm() {
    }

    public CafedraForm(String id, String name, String desc, String chief) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.chief = chief;
    }

    public CafedraForm(String name, String desc, String chief) {
        this.name = name;
        this.desc = desc;
        this.chief = chief;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    @Override
    public String toString() {
        return "CafedraForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", chief='" + chief + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CafedraForm that = (CafedraForm) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
