package com.unillanos.saludador;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label lblTitulo = new Label("Sistema Saludador");
        lblTitulo.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Label lblNombre = new Label("Nombre:");
        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Ej. Johan");

        Label lblEdad = new Label("Edad:");
        TextField txtEdad = new TextField();
        txtEdad.setPromptText("Ej. 20");

        Label lblHora = new Label("Hora:");
        ComboBox<String> cbHora = new ComboBox<>();
        cbHora.getItems().addAll("AM", "PM");
        cbHora.setValue("AM");

        Button btnSaludar = new Button("Solicitar saludo");
        btnSaludar.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
        
        Label lblResultado = new Label();
        lblResultado.setStyle("-fx-text-fill: #333333; -fx-font-size: 14px;");
        lblResultado.setWrapText(true);

        btnSaludar.setOnAction(e -> {
            String nombre = txtNombre.getText().trim();
            String edad = txtEdad.getText().trim();
            String hora = cbHora.getValue();

            if (nombre.isEmpty() || edad.isEmpty()) {
                lblResultado.setText("⚠ Por favor ingresa todos los datos.");
                lblResultado.setStyle("-fx-text-fill: red; -fx-font-size: 14px;");
                return;
            }

            String saludo = hora.equals("AM") ? "Buenos días" : "Buenas tardes/noches";
            lblResultado.setStyle("-fx-text-fill: #2E86C1; -fx-font-size: 15px; -fx-font-weight: bold;");
            lblResultado.setText(saludo + " " + nombre + ", veo que tienes " + edad + " años.");
        });

        VBox root = new VBox(15);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER_LEFT);
        root.getChildren().addAll(lblTitulo, lblNombre, txtNombre, lblEdad, txtEdad, lblHora, cbHora, btnSaludar, lblResultado);

        Scene scene = new Scene(root, 320, 400);
        primaryStage.setTitle("Modelo de Requerimientos");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
