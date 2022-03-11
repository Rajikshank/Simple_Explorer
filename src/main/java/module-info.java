module com.example.demo_javafx_chat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo_javafx_chat to javafx.fxml;
    exports com.example.demo_javafx_chat;
}