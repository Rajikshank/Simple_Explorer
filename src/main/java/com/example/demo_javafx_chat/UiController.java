package com.example.demo_javafx_chat;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;

public class UiController {

    String path= "D:\\"; // path to be visited

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TitledPane explorerhead;

    @FXML
    private ListView<String> fileList;

    @FXML
    private Button homebutton;

    Stack<String >pathstack=new Stack<String>();
    @FXML
    void backword(MouseEvent event) {
        path=pathstack.pop();
        fileList.getItems().setAll(new File(path).list());
        explorerhead.setText(path);


    }

    @FXML
    void inverse(MouseEvent event) {
        pathstack.push(path);
        path=path+fileList.getSelectionModel().getSelectedItem()+"\\";
        explorerhead.setText(path);
        System.out.println(path);
        fileList.getItems().setAll(new File(path).list());
    }

    @FXML
    void initialize() {
        assert explorerhead != null : "fx:id=\"explorerhead\" was not injected: check your FXML file 'FileExplorer.fxml'.";
        assert fileList != null : "fx:id=\"fileList\" was not injected: check your FXML file 'FileExplorer.fxml'.";
        assert homebutton != null : "fx:id=\"homebutton\" was not injected: check your FXML file 'FileExplorer.fxml'.";

        fileList.getItems().addAll(new File(path).list());
        System.out.println(fileList.getSelectionModel().getSelectedItem());
        explorerhead.setText(path);
    }

}
