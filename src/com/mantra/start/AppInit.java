package com.mantra.start;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.mantra.capture.info.BasicInformation;
import com.mantra.model.BasicInformationTO;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
// 
public class AppInit extends Application{
	
	public static Properties prop = new Properties();
	BasicInformation basicInfo = new BasicInformation();
	BasicInformationTO infoTO = new BasicInformationTO();
	
	Stage window;
	Scene scene1, scene2;
	Button button, buttonBasicInfo;
	
	 
    public static void main(String[] args) throws IOException {
    	InputStream in = AppInit.class.getResourceAsStream("/resource.properties");
    	prop.load(in);
    	in.close();
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
    	window = primaryStage;    	
    	window.setTitle(prop.getProperty("company.name"));
        button = new Button();
        button.setText("Welcome " +prop.getProperty("vendor.name"));        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        scene1 = new Scene(layout, 300, 250);
        window.setScene(scene1);
        button.setOnAction(e -> {
        	System.out.println("Clicked 1");
        	window.setScene(scene2);
        	window.show();
        });
        
        
       // VBox basicInfo = new VBox(20);
        Text text = new Text("Company Name ");
        TextField textField = new TextField();
        
        Text tenderStartDate = new Text("Tender Start Date");
        TextField tenderStartDateInput = new TextField();
        GridPane gridPane = new GridPane();
        gridPane.add(text, 0, 0);       
        gridPane.add(textField, 1, 0);
        gridPane.add(tenderStartDate, 0, 1);
        gridPane.add(tenderStartDateInput, 1, 1);
        buttonBasicInfo = new Button("Next : Start");
        gridPane.add(buttonBasicInfo, 0, 2);
       // gridPane.add(button6, 2, 1, 1, 1);

       
       
       // basicInfo.getChildren().addAll(gridPane);
        scene2 = new Scene(gridPane, 300, 250);
        buttonBasicInfo.setOnAction(e -> {
        	System.out.println("Clicked 2" +textField.getText() );
        	window.setScene(scene1);
        	
        	
        });
      
        window.show();
    }


 
    //When button is clicked, handle() gets called
    //Button click is an ActionEvent (also MouseEvents, TouchEvents, etc...)
    /*@Override
    public void handle(ActionEvent event) {
    	System.out.println("Clicked");
        if (event.getSource() == button) {
        	System.out.println("Button 1");
        	primaryStage.setScene(scene2);
        	primaryStage.show();
        } else  if (event.getSource() == basicInfo) {
        	System.out.println("Button 1");
        	primaryStage.setScene(scene2);
        	primaryStage.show();
        }
    }*/

}
