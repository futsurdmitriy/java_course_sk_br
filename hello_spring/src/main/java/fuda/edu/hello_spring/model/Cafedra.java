package fuda.edu.hello_spring.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Cafedra {

    private String id;
    private String name;
    private String chief;
    private LocalDateTime createdAt;
    private LocalDateTime modified;
    private String desc;

    public Cafedra(){}

    public Cafedra(String id, String name, String chief) {
        this.id = id;
        this.name = name;
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

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    @Override
    public String toString() {
        return "Cafedra{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", chief='" + chief + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cafedra cafedra = (Cafedra) o;
        return getId().equals(cafedra.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
