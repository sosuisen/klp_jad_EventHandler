package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MyApp extends Application {

	@Override
	public void start(Stage stage) {
		var label = new Label("Hello, world");

		var redBtn = new Button("赤");
		redBtn.setOnAction(e -> {
			label.setStyle("-fx-text-fill: red");
		});
		/**
		 * 補足：処理が1行の場合は{}を省略できます。
		  redBtn.setOnAction(e -> label.setStyle("-fx-text-fill: red"));
		 */
		var blueBtn = new Button("青");
		blueBtn.setOnAction(e -> {
			label.setStyle("-fx-text-fill: blue");
		});
		var greenBtn = new Button("緑");
		greenBtn.setOnAction(e -> {
			label.setStyle("-fx-text-fill: green");
		});

		var bPane = new BorderPane();
		bPane.setTop(label);
		bPane.setLeft(redBtn);
		bPane.setCenter(blueBtn);
		bPane.setRight(greenBtn);
		BorderPane.setAlignment(redBtn, Pos.TOP_CENTER);
		BorderPane.setAlignment(blueBtn, Pos.TOP_CENTER);
		BorderPane.setAlignment(greenBtn, Pos.TOP_CENTER);

		var scene = new Scene(bPane, 160, 50);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}