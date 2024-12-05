package Logique;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnexionBD {
    private Connection connexion;
    private Statement instruction;
    private ResultSet resultat;

    public ConnexionBD() {
        try {
            connexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gestionetudiants", "root", "hBM876,?YXb]z)%4T");
            instruction = connexion.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void arret() {
        try {
            if (resultat != null) {
                resultat.close();
            }
            if (instruction != null) {
                instruction.close();
            }
            if (connexion != null) {
                connexion.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getStudents() {
        try {
            resultat = instruction.executeQuery("SELECT * FROM etudiant");
            while (resultat.next()) {
                System.out.println("ID: " + resultat.getInt("id") + ", Nom: " + resultat.getString("nom"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertStudent(int id, String nom) {
        try {
            instruction.executeUpdate("INSERT INTO Etudiant(id,nom) VALUES (" + id + ", '" + nom + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteStudent(int id) {
        try {
            instruction.executeUpdate("DELETE FROM Etudiant WHERE id = " + id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
