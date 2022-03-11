package com.example.demo_javafx_chat;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class UiController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> fileList;
    @FXML
    private Button homebutton;
    String path= "D:\\";

    @FXML
    void initialize() {



        fileList.getItems().addAll(new File(path).list());
       System.out.println(fileList.getSelectionModel().getSelectedItem());




    }
    Stack<String >pathstack=new Stack<String>();
    @FXML
    void inverse(){
        pathstack.push(path);
        path=path+fileList.getSelectionModel().getSelectedItem()+"\\";
        System.out.println(path);
        fileList.getItems().setAll(new File(path).list());
    }

    @FXML
    void backword(){
        path=pathstack.pop();
     fileList.getItems().setAll(new File(path).list());



    }
}
