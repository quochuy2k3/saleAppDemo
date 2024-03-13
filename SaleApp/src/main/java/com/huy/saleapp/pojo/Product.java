/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huy.saleapp.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.Data;

/**
 *
 * @author admin
 */
@Entity
@Table (name = "product")
@Data
public class Product implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name; 
    private String description;
    private double price;
    private String manufactuturer; 
    private String image; 
    @Column(name = "created_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created_date;
    private Boolean active;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
   
}
