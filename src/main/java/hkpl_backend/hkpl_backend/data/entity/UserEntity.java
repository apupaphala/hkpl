package hkpl_backend.hkpl_backend.data.entity;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class UserEntity{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="name")
    private String name;
}
