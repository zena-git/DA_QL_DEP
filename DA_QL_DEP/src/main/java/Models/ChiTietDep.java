/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "CHITIETDEP")
public class ChiTietDep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "IdDep")
    private Dep dep;

    @ManyToOne
    @JoinColumn(name = "IdLoaiDep")
    private LoaiDep loaiDep;

    @ManyToOne
    @JoinColumn(name = "IdSize")
    private Size size;

    @ManyToOne
    @JoinColumn(name = "IdMauSac")
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "IdChatLieu")
    private ChatLieu chatLieu;

    @ManyToOne
    @JoinColumn(name = "IdNSX")
    private Nsx nsx;

    @Column(name = "MaVach")
    private String maVach;

    @Column(name = "HinhAnh")
    private String hinhAnh;

    @Column(name = "SoLuong")
    private int soLuong;

    @Column(name = "GiaNhap")
    private BigDecimal giaNhap;

    @Column(name = "GiaBan")
    private BigDecimal giaBan;
    
    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "NgayTao")
    private Date ngayTao;

    @Column(name = "NgaySua")
    private Date ngaySua;

    @Column(name = "TinhTrang")
    private int tinhTrang;
    
    @OneToMany(mappedBy = "chiTietDep")
    private List<HoaDonChiTiet> listHdct;
    public ChiTietDep() {
    }

    public ChiTietDep(int id, Dep dep, LoaiDep loaiDep, Size size, MauSac mauSac, ChatLieu chatLieu, String maVach, String hinhAnh, int soLuong, BigDecimal giaNhap, BigDecimal giaBan, Date ngayTao, Date ngaySua, int tinhTrang) {
        this.id = id;
        this.dep = dep;
        this.loaiDep = loaiDep;
        this.size = size;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.maVach = maVach;
        this.hinhAnh = hinhAnh;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.tinhTrang = tinhTrang;
    }

    public ChiTietDep(int id, Dep dep, LoaiDep loaiDep, Size size, MauSac mauSac, ChatLieu chatLieu, Nsx nsx, String maVach, String hinhAnh, int soLuong, BigDecimal giaNhap, BigDecimal giaBan, String moTa, Date ngayTao, Date ngaySua, int tinhTrang, List<HoaDonChiTiet> listHdct) {
        this.id = id;
        this.dep = dep;
        this.loaiDep = loaiDep;
        this.size = size;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.nsx = nsx;
        this.maVach = maVach;
        this.hinhAnh = hinhAnh;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.moTa = moTa;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.tinhTrang = tinhTrang;
        this.listHdct = listHdct;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Nsx getNsx() {
        return nsx;
    }

    public void setNsx(Nsx nsx) {
        this.nsx = nsx;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dep getDep() {
        return dep;
    }

    public void setDep(Dep dep) {
        this.dep = dep;
    }

    public LoaiDep getLoaiDep() {
        return loaiDep;
    }

    public void setLoaiDep(LoaiDep loaiDep) {
        this.loaiDep = loaiDep;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public MauSac getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac mauSac) {
        this.mauSac = mauSac;
    }

    public ChatLieu getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(ChatLieu chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getMaVach() {
        return maVach;
    }

    public void setMaVach(String maVach) {
        this.maVach = maVach;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
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

    public List<HoaDonChiTiet> getListHdct() {
        return listHdct;
    }

    public void setListHdct(List<HoaDonChiTiet> listHdct) {
        this.listHdct = listHdct;
    }

    @Override
    public String toString() {
        return "ChiTietDep{" + "dep=" + dep.getTen() + '}';
    }


}
