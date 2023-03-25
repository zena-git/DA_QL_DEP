/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Models.NguoiDung;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INguoiDungService {

    public List<NguoiDung> getLst();

    public List<NguoiDung> getAllByObj(String ten, String cv);

    public boolean save(NguoiDung nd);

    public boolean delete(NguoiDung nd);

    public NguoiDung getObj(String ma);

    public NguoiDung getObjById(int id);
}
