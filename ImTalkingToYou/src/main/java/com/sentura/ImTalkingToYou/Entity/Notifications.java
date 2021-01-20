package com.sentura.ImTalkingToYou.Entity;

@Entity
@Data
@Table(name="Notifications")
public class Notifications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="FkUser")
    private User fkUser;

    @Column(name = "Description")
    private String description;

    @Column(name = "Create_Date")
    private Date createdate= new Date();
}
