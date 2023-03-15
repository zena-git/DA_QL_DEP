/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "NSX")
public class MauSac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "Ma")
    private String ma;
    
    @Column(name = "MauSac")
    private String mauSac;
    
    @Column(name = "NgayTao")
    @Temporal(TemporalType.DATE)
    private Date ngayTao;
    
    @Column(name = "NgaySua")
    @Temporal(TemporalType.DATE)
    private Date ngaySua;
    
    @Column(name = "TinhTrang")
    private int tinhTrang;
    
    @OneToMany(mappedBy = "chatLieu", fetch = FetchType.LAZY)
    List<ChiTietDep> listCTD;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MauSac() {
    }

    public MauSac(int id, String ma, String mauSac, Date ngayTao, Date ngaySua, int tinhTrang, List<ChiTietDep> listCTD) {
        this.id = id;
        this.ma = ma;
        this.mauSac = mauSac;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.tinhTrang = tinhTrang;
        this.listCTD = listCTD;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public List<ChiTietDep> getListCTD() {
        return listCTD;
    }

    public void setListCTD(List<ChiTietDep> listCTD) {
        this.listCTD = listCTD;
    }

    
    

}