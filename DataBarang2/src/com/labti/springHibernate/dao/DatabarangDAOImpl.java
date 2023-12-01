/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.dao;

import com.labti.springHibernate.model.Databarang;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DatabarangDAOImpl implements DatabarangDAO{
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void save(Databarang databarang){
        sessionFactory.getCurrentSession().save(databarang);
    }
    
    @Override
    public void update(Databarang databarang){
        sessionFactory.getCurrentSession().update(databarang);
    }
    
    @Override
    public void delete(Databarang databarang){
        sessionFactory.getCurrentSession().delete(databarang);
    }
    
    @Override
    public Databarang getMahasiswa(String id){
        return (Databarang) sessionFactory.getCurrentSession().get(Databarang.class, id);        
    }
    
    @Override
    public List<Databarang> getMahasiswas(){
        return sessionFactory.getCurrentSession().createCriteria(Databarang.class).list();
    }
}
