package com.usermanagement.models.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detail_user")
public class Detailuser extends BaseEnities<String> implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String fullname;

    @Column(length = 255)
    private String name;

    @Column(name = "birth_date")
    private Date birthDate;
    
    @Column(name = "join_date")
    private Date joinDate;

    @ManyToOne
    private Position position;

    @Column(name = "NIK")
    private Integer NIK;

    @Column(name = "NPWP")
    private String NPWP;
    
    @Column(name = "email", unique = true)
    private String email;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Integer getNIK() {
        return NIK;
    }

    public void setNIK(Integer nIK) {
        NIK = nIK;
    }

    public String getNPWP() {
        return NPWP;
    }

    public void setNPWP(String nPWP) {
        NPWP = nPWP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

}
