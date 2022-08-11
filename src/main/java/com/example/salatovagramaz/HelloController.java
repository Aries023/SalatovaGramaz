package com.example.salatovagramaz;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField numbOfSack;

    @FXML
    protected void onVelkySal() {
        if (numbOfSack.getText().matches("[0-9]+")){
            int piece = Integer.parseInt(numbOfSack.getText()) * 570 / 100; // kolko salatov spravim
            int ostatok = Integer.parseInt(numbOfSack.getText()) * 570 % 100; // kolko zostane gramaze
            welcomeText.setText("z "+ numbOfSack.getText() +" sackov bude "+piece + "salatov a ostane "+ostatok+" gramaze");
        }else {
            welcomeText.setText("pravdepodobne si nezadal čislo alebo si zadal nejaky text.");
        }

    }
    @FXML
    protected void onMalySal() {
        if (numbOfSack.getText().matches("[0-9]+")){
            int piece = Integer.parseInt(numbOfSack.getText()) * 570 / 60; // kolko salatov spravim
            int ostatok = Integer.parseInt(numbOfSack.getText()) * 570 % 60;// kolko zostane gramaze
            welcomeText.setText("z "+ numbOfSack.getText() +" sackov bude "+piece + "salatov a ostane "+ostatok+" gramaze");
        }else {
            welcomeText.setText("pravdepodobne si nezadal čislo alebo si zadal nejaky text.");
        }

    }
}