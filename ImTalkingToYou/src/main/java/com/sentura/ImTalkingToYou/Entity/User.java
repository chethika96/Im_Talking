package com.sentura.ImTalkingToYou.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="User_TBL")

public class User {

    private int id;
    private String UserName;
    private String Password;
    private String email;
}
/*
@Entity
@Data
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "FName")
    private String fName;

    @Column(name = "LName")
    private String lName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;

    @Column(name = "Number")
    private String number;

    @Column(name = "Create_Date")
    private Date createdate= new Date();

    @Column(name = "Is_Active")
    private Boolean isactive;

    @Column(name = "Is_Delete")
    private String isdelete;






}*/
