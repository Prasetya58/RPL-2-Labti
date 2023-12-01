/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.dao;

import com.labti.springHibernate.model.Databarang;
import java.util.List;

public interface DatabarangDAO {
    public void save(Databarang databarang);
    public void update(Databarang databarang);
    public void delete(Databarang databarang);
    public Databarang getMahasiswa(String id);
    public List<Databarang> getMahasiswas();
}
