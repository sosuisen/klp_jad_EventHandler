package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MyApp extends Application {

	@Override
	public void start(Stage stage) {
        var button = new Button("Hello");
        button.setOnAction(e->{
        	System.out.println("Hello, world");    
        });

        var bPane = new BorderPane(button);

        var scene = new Scene(bPane, 320, 240);
        stage.setScene(scene);
        stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}