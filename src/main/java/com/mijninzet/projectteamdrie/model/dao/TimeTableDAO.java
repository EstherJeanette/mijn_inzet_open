package com.mijninzet.projectteamdrie.model.dao;

import com.mijninzet.projectteamdrie.model.entity.TimeTable;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class TimeTableDAO {

    private SessionFactory sessionFactory;
    private Configuration configuration = new Configuration();

    public TimeTableDAO(SessionFactory factory) {
        super();
        sessionFactory = factory;
    }

    public List<TimeTable> findAllTimeTables() {
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        String hql = "FROM tijdtabel";
        Query query = session.createQuery(hql);
        List<TimeTable> results = query.list();
        session.close();
        //System.out.println("dit is wat er opgehaald is uit de database" + results);
        return results;
    }
}
