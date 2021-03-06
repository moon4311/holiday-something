package com.holidaysomething.holidaysomething.domain;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MEMBER")
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 50, nullable = false, unique = true)
  private String loginId;

  @Column(nullable = false)
  private String password;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(length = 20, nullable = false)
  private String name;

  @Column(length = 50, nullable = false, unique = true)
  private String nickname;

  @Column(length = 50, nullable = false, unique = true)
  private String phone;

  @Column(columnDefinition = "integer default 0")
  private int mileage;

  @Column(nullable = false)
  @Temporal(TemporalType.DATE)
  private Date birthday;

  @Column(length = 20, nullable = false)
  private String postcode;

  @Column(nullable = false)
  private String address1;

  @Column(nullable = false)
  private String address2;

  @Column(nullable = false)
  private boolean receiveEmail;

  @Column(nullable = false)
  private boolean receiveSms;

  @Column(nullable = false)
  private boolean marketing;

  @Column(nullable = false)
  private boolean personalInfo;

  @Column(length = 20)
  private String recommender;

  @OneToMany(mappedBy = "member")
  private Set<CartProduct> cartProducts;
}
