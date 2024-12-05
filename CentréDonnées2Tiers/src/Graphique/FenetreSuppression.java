package Graphique;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Logique.ConnexionBD;

public class FenetreSuppression extends JFrame {

    private JLabel idLabel;
    private JTextField idTextField;
    private JButton deleteButton;
    private JButton cancelButton;

    public FenetreSuppression() {
        setTitle("Suppression d'un étudiant");
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        setSize(400, 200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        idLabel = new JLabel("ID de l'étudiant à supprimer:");
        idTextField = new JTextField(10);
        deleteButton = new JButton("Supprimer");
        cancelButton = new JButton("Annuler");

        add(idLabel);
        add(idTextField);
        add(deleteButton);
        add(cancelButton);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idToDelete = Integer.parseInt(idTextField.getText());
                ConnexionBD connexionBD = new ConnexionBD();
                connexionBD.deleteStudent(idToDelete);
                JOptionPane.showMessageDialog(null, "Étudiant supprimé avec succès!", "Suppression réussie", JOptionPane.INFORMATION_MESSAGE);
                dispose(); // Fermer la fenêtre après la suppression
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fermer la fenêtre si l'utilisateur annule
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FenetreSuppression();
    }
}
