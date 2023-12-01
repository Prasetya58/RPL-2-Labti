/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate;

import com.labti.springHibernate.view.DatabarangView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.labti.springHibernate.service.DatabarangService;


public class app {
    private static ApplicationContext applicationContext;
    
    public static void main(String[] args){
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-configuration.xml");
        new DatabarangView().setVisible(true);
    }
    
    public static DatabarangService getDatabarangService(){
        return(DatabarangService)applicationContext.getBean("MahasiswaService");
    }
}
