/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposetories.implement;

import HibernateConfig.HibernateConfig;
import Models.ChucVu;
import Models.NguoiDung;
import Reposetories.INguoiDungReposetory;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class NguoiDungReposetory implements INguoiDungReposetory {

    private static Session session = HibernateConfig.getFACTORY().openSession();
    private Transaction transaction = session.getTransaction();

    @Override
    public List<NguoiDung> getLstDb() {
        List<NguoiDung> lst = new ArrayList<>();
        Query query = session.createQuery("SELECT nd FROM NguoiDung nd");
        lst = query.getResultList();
        return lst;
    }

    @Override
    public boolean save(NguoiDung nd) {
        try {
            transaction.begin();
            session.saveOrUpdate(nd);
            transaction.commit();

            return true;

        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(NguoiDung nd) {
        try {
            transaction.begin();
            session.delete(nd);
            transaction.commit();

            return true;

        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public NguoiDung getObj(String ma) {
        NguoiDung nd = null;
        try {
            Query query = session.createQuery("SELECT nd FROM NguoiDung nd WHERE nd.ma = :ma");
            query.setParameter("ma", ma);
            nd = (NguoiDung) query.getSingleResult();
        } catch (Exception e) {
//            e.printStackTrace();
        }
        return nd;

    }

    @Override
    public NguoiDung getObjById(int id) {
        NguoiDung nd = null;
        try {
            Query query = session.createQuery("SELECT nd FROM NguoiDung nd WHERE nd.id = :id");
            query.setParameter("id", id);
            nd = (NguoiDung) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nd;
    }

    @Override
    public List<NguoiDung> getAllByObj(String ten, String cv, int trangThai) {
        List<NguoiDung> lst = new ArrayList<>();
        Query query = null;
        if (trangThai != -1) {
            query = session.createQuery("SELECT nd FROM NguoiDung nd WHERE (nd.ma LIKE :ma OR nd.ten LIKE :ten) AND nd.chucVu.ten LIKE :cv AND nd.trangThai = :trangThai");
            query.setParameter("ma", "%" + ten + "%");
            query.setParameter("ten", "%" + ten + "%");
            query.setParameter("cv", "%" + cv + "%");
            query.setParameter("trangThai", trangThai);
        } else {
            query = session.createQuery("SELECT nd FROM NguoiDung nd WHERE (nd.ma LIKE :ma OR nd.ten LIKE :ten) AND nd.chucVu.ten LIKE :cv");
            query.setParameter("ma", "%" + ten + "%");
            query.setParameter("ten", "%" + ten + "%");
            query.setParameter("cv", "%" + cv + "%");
        }

        lst = query.getResultList();
        return lst;
    }

}
