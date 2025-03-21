package com.example.webservice.nhom10.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ban {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idban;
    @Column
    private String vitri;
    @Column
    private int sochongoi;
    @Column 
    private String trangthai;
    
    @ManyToOne
    @JoinColumn(name = "idloaiban")
    private loaiban loaiban;

    @ManyToOne
    @JoinColumn(name = "iddonhang")
    private dondathang dondathang;

}
