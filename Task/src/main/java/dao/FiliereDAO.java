package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import domaine.filiere;

public class FiliereDAO {
    private SessionFactory factory;

    public FiliereDAO(SessionFactory factory) {
        this.factory = factory;
    }

    public void create(filiere filiere) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(filiere);
        transaction.commit();
        session.close();
    }


    public filiere read(int id) {
        Session session = factory.openSession();
        filiere filiere = session.get(filiere.class, id);
        session.close();
        return filiere;
    }


    public void update(filiere filiere) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(filiere);
        transaction.commit();
        session.close();
    }

    public void delete(filiere filiere) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(filiere);
        transaction.commit();
        session.close();
    }
}

