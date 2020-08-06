package fuda.edu.hello_spring.model;

import java.time.LocalDateTime;

public class Group {
    private String id;
    private String name;
    private String desc;
    private LocalDateTime createdAt, updateAt;
    Cafedra cafedra;
    public Group () {}
    public Group(String id, String name, String desc, LocalDateTime createdAt
            , LocalDateTime updateAt, Cafedra cafedra) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.cafedra = cafedra;
    }
    public Group(String name, String desc, LocalDateTime createdAt
            , LocalDateTime updateAt, Cafedra cafedra) {
        this.name = name;
        this.desc = desc;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.cafedra = cafedra;
    }
    public Group(String name, String desc, Cafedra cafedra) {
        this.name = name;
        this.desc = desc;
        this.cafedra = cafedra;
    }


}
