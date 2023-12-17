/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mysql.cj.jdbc.Blob;

/**
 *
 * @author tyago
 */
public class Produto {
    
    private String idProduto, nomeProduto, descProduto, valorProduto;
    private Blob imgProduto;

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public String getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(String valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Blob getImgProduto() {
        return imgProduto;
    }

    public void setImgProduto(Blob imgProduto) {
        this.imgProduto = imgProduto;
    }

    public Produto(String idProduto, String nomeProduto, String descProduto, String valorProduto, Blob imgProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descProduto = descProduto;
        this.valorProduto = valorProduto;
        this.imgProduto = imgProduto;
    }

    public Produto() {
        
    }

}