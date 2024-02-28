import javafx.fxml.FXML;
import javafx.scene.layout.HBox;
import tn.esprit.ServicePersonne;

import java.awt.*;
import java.awt.event.ActionEvent;

public class GestionPersonne
{
    package tn.esprit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

    public class Personne {

        @FXML
        private TextField age_tf;

        @FXML
        private HBox boxh;

        @FXML
        private TextField nom_tf;

        @FXML
        private TextField prenom_tf;

        @FXML
        void addPersonne(ActionEvent event)
        {
            ServicePersonne sp = new ServicePersonne();
            sp.add(new Personne(0,nom_tf.getText(), prenom_tf.getText(),Integer.parseInt(get)));

        }

        @FXML
        void showPersonne(ActionEvent event) {

        }

    }

}
