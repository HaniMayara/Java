package dao;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import domaine.Etudiant;

public class EtudiantDAO {
	public static void updateEtudiant(int id, String nouveauNom) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
   	 	Session session = factory.openSession();
   	 Transaction transaction = null;
   	 try {
   	     transaction = session.beginTransaction();
   	     Etudiant etudiant = session.get(Etudiant.class, id);
   	     etudiant.setNom(nouveauNom);
   	     session.update(etudiant);
   	     transaction.commit();
   	     System.out.println("Étudiant avec l'ID " + id + " mis à jour avec succès.");
   	 } catch (Exception e) {
   	     if (transaction != null) {
   	         transaction.rollback();
   	     }
   	     e.printStackTrace();
   	 } finally {
   	     session.close();
   	 }
   	}

    public static void deleteEtudiant(int id) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Etudiant etudiant = session.get(Etudiant.class, id);
            if (etudiant != null) {
                session.delete(etudiant);
                System.out.println("Étudiant avec l'ID " + id + " supprimé avec succès.");
            } else {
                System.out.println("Aucun étudiant trouvé avec l'ID " + id);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
public static void main(String[] args) {
                  Configuration cfg=new Configuration();
                  cfg.configure("hibernate.cfg.xml");
                  SessionFactory factory=cfg.buildSessionFactory();
                  Session session=factory.openSession();
                  Transaction t=session.beginTransaction();
                  //insert first student
                  Etudiant e1=new Etudiant();
                  e1.setId(1);
                  e1.setNom("etudiant1");
                  session.persist(e1);
                  Etudiant e2=new Etudiant();
                  e2.setId(2);
                  e2.setNom("etudiant2");
                  session.persist(e2);
                  t.commit();//transaction is commited
                  System.out.println("successfully saved");
                  //list all students
                  List list = session.createQuery("from Etudiant").list();
                  Iterator it = list.iterator();
                  while(it.hasNext())
                  {Etudiant e = (Etudiant)it.next();
                   System.out.println(e.getId()+" "+ e.getNom());
                  }
                  updateEtudiant(100, "Mohamed");
                  deleteEtudiant(30);
                  session.close();        
         }



}