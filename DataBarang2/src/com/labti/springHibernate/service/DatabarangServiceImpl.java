/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.service;

import com.labti.springHibernate.model.Databarang;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.labti.springHibernate.dao.DatabarangDAO;

@Service("MahasiswaService")
@Transactional(readOnly = true)

public class DatabarangServiceImpl implements DatabarangService {
    @Autowired
    private DatabarangDAO mahasiswaDao;
    
    @Transactional
    @Override
    public void save(Databarang mahasiswa){
        mahasiswaDao.save(mahasiswa);
    }
    
    @Transactional
    @Override
    public void update(Databarang mahasiswa){
        mahasiswaDao.update(mahasiswa);
    }
    
    @Transactional
    @Override
    public void delete(Databarang mahasiswa){
        mahasiswaDao.delete(mahasiswa);
    }
    
    @Override
    public Databarang getMahasiswa(String npm){
        return mahasiswaDao.getMahasiswa(npm);
    }
    
    @Override
    public List<Databarang> getMahasiswas(){
        return mahasiswaDao.getMahasiswas();
    }
}
