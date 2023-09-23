package br.com.testpicpay.exer.picpaytest.Entity.Transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.testpicpay.exer.picpaytest.Entity.User.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "trasactions")
@Table(name = "tb_trasaction")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private BigDecimal amonut;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;



    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;

    private LocalDateTime timestamp;


    
}
