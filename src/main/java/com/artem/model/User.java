package com.artem.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Artem Vecher on 12.11.2017.
 */
@Entity
@Table(name = "user")
@Setter
@Getter
@EqualsAndHashCode
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }
}
