/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author SUHAIB
 */
public class Regsterpage extends Stage{
    

    public Regsterpage() {
        CheckBox startModeCheck = new CheckBox("Dark Mode");
        Label usernameLabel = new Label("User name :");
        TextField usernameTF = new TextField();
        Label passwordLlabel = new Label("Password :");
        passwordField passwordTF = new passwordField();
        Label emailLable = new Label("Email :");
        TextField emailTF = new TextField();
        Button registerBtn = new Button("Register");
        
        
    }
    
    
}
