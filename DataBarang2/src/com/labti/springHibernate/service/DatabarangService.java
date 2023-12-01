/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.service;

import com.labti.springHibernate.model.Databarang;
import java.util.List;

public interface DatabarangService {
    public void save(Databarang mahasiswa);
    public void update(Databarang mahasiswa);
    public void delete(Databarang mahasiswa);
    public Databarang getMahasiswa(String npm);
    public List<Databarang> getMahasiswas();
}
