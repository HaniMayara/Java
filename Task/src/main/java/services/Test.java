package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.EtudiantDAO;
import dao.FiliereDAO;
import domaine.Etudiant;
import domaine.filiere;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = Config.getSessionFactory();
        EtudiantDAO etudiantDAO = new EtudiantDAO(factory);
        FiliereDAO filiereDAO = new FiliereDAO(factory);
        

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        Etudiant etudiant = new Etudiant();
        etudiant.setNom("Heni Mayara");
        etudiantDAO.create(etudiant);

        filiere filiere1 = new filiere();
        filiere filiere2 = new filiere();
        filiere1.setNom("Informatique");
        filiere2.setNom("Finance");
        filiereDAO.create(filiere1);
        filiereDAO.create(filiere2);
        
        filiere filiereTest = filiereDAO.read(1);
        System.out.println("Filiere lu est : " + filiereTest.getNom());
        filiereTest.setNom("AOT");
        filiereDAO.update(filiereTest);
        System.out.println("Nouvau Filiere lu est : " + filiereTest.getNom());
        
        //filiereDAO.delete(filiereTest);

        Etudiant etudiantLu = etudiantDAO.read(1);
        System.out.println("Étudiant lu: " + etudiantLu.getNom());


        etudiantLu.setNom("Dr.Marouen");
        etudiantDAO.update(etudiantLu);
        System.out.println("Nouvau Étudiant lu: " + etudiantLu.getNom());

        
       // etudiantDAO.delete(etudiantLu);

        transaction.commit();
        session.close();
    }
}
