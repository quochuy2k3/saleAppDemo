/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huy.saleapp.pojo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "category")
@Data
public class Category implements Serializable{
    @Id
    private int id;
    private String name; 
    private String description; 
   @OneToMany(mappedBy = "category")
   private Set<Product> product;
}
