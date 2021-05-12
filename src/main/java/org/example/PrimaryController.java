package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML Label lblResultado;
    @FXML TextField inputPrimerNro;
    @FXML TextField inputSegundoNro;

    @FXML private void calcular(){
        try {
            Integer primerNro = Integer.parseInt(inputPrimerNro.getText());
            Integer segundoNro = Integer.parseInt(inputSegundoNro.getText());
            String resultado = primerNro + " + " + segundoNro + " = " + (primerNro+segundoNro);
            lblResultado.setText(resultado);
        }catch (NumberFormatException e){
            lblResultado.setText("¡SÓLO PUEDO SUMAR NÚMEROS!");
            inputPrimerNro.setText("");
            inputSegundoNro.setText("");
        }
        inputPrimerNro.requestFocus();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Título");
        alert.setHeaderText("Cabecera");
        alert.setContentText("Texto principal!");
        alert.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {
                //lblResultado.setText("Apretaste OK");
                System.out.println("Apretaste OK");
            }
        });
    }
}
