package com.example.tokengrabber.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "registration_table")
public class UserDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;
    @Column
    @Getter
    @Setter
    private String username;
    @Column
    @JsonIgnore
    @Getter
    @Setter
    private String password;

}