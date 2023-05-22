package com.aninfo.model;

import com.aninfo.model.Account;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Account account;

    private Double amount;

    public Transaction(){
    }

    public Transaction(Account account,Double amount) {
        this.account = account;
        this.amount = amount;
    }

}
