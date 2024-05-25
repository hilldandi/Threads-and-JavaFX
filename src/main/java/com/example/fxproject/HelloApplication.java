package com.example.fxproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;



public class HelloApplication extends Application {
    private void createText(VBox vbox){


        //t1.func1();
        TextArea textaa=new TextArea("your temperature is: ");
        //Label labell=new Label(t1.getName());
        //textaa.getChildrenUnmodifiable().add(labell);
        vbox.getChildren().add(textaa);
        Sensor t1 = new Sensor(textaa);
        t1.start();

    }
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        Button newButton = new Button("Click to Create");
        vbox.getChildren().add(newButton);
        Scene scene = new Scene(vbox, 400, 300);
        stage.setTitle("Temperature");
        newButton.setOnAction(e->createText(vbox));

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}