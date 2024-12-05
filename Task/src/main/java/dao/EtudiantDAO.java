package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import domaine.Etudiant;

public class EtudiantDAO {
    private SessionFactory factory;

    public EtudiantDAO(SessionFactory factory) {
        this.factory = factory;
    }


    public void create(Etudiant etudiant) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(etudiant);
        transaction.commit();
        session.close();
    }


    public Etudiant read(int id) {
        Session session = factory.openSession();
        Etudiant etudiant = session.get(Etudiant.class, id);
        session.close();
        return etudiant;
    }

 
    public void update(Etudiant etudiant) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(etudiant);
        transaction.commit();
        session.close();
    }


    public void delete(Etudiant etudiant) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(etudiant);
        transaction.commit();
        session.close();
    }
}

