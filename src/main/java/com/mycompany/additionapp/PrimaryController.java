package com.mycompany.additionapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField firstNum;
    @FXML
    private TextField secondNum;
    @FXML
    private Button calcButton;
    @FXML
    private Label result;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void calcButtonClicked(ActionEvent event) {
        int sum;
        sum = Integer.parseInt(firstNum.getText()) + Integer.parseInt(secondNum.getText());
        
        result.setText(" " + sum);
    }
}
