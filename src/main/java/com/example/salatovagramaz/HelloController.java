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
        int piece = Integer.parseInt(numbOfSack.getText()) * 570 / 100; // kolko salatov spravim
        int ostatok = Integer.parseInt(numbOfSack.getText()) * 570 % 100; // kolko zostane gramaze
        welcomeText.setText("z "+ numbOfSack.getText() +" sackov bude "+piece + "salatov a ostane "+ostatok+" gramaze");
    }
    @FXML
    protected void onMalySal() {
        int piece = Integer.parseInt(numbOfSack.getText()) * 570 / 60; // kolko salatov spravim
        int ostatok = Integer.parseInt(numbOfSack.getText()) * 570 % 60;// kolko zostane gramaze
        welcomeText.setText("z "+ numbOfSack.getText() +" sackov bude "+piece + "salatov a ostane "+ostatok+" gramaze");
    }
}