/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reposetories;


import Models.KhuyenMai;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IKhuyenMaiReposetory {
    public List<KhuyenMai> getLstDb();
    public List<KhuyenMai> getAllByTen(String ten);
    
    public boolean save(KhuyenMai km);
    
    public boolean delete(KhuyenMai km);
    
    public KhuyenMai getObj(String ma);
    
    public KhuyenMai getObjById(int id);
}
