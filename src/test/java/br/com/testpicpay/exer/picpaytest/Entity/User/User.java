package br.com.testpicpay.exer.picpaytest.Entity.User;

import java.math.BigDecimal;

import org.springframework.context.annotation.Primary;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "users")
@Table(name = "tb_user")


@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String last_name;

    private String fist_name;

    @Column(unique = true)
    private String document;

    @Column(unique = true)
    private String  email;


    private String password;


    private BigDecimal balance;


    @Enumerated(EnumType.STRING)
    private UserType userType;

    

    
}
