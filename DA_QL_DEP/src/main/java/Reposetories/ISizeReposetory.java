/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reposetories;

import Models.Size;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ISizeReposetory {

    public List<Size> getLstDb();

    public List<Size> getLstBySize(Float size);

    public boolean save(Size s);

    public boolean delete(Size s);

    public Size getObj(String ma);
    
    public Size getObjBySize(Float size);

    public Size getObjById(int id);
}
