module com.example.dio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dio to javafx.fxml;
    exports com.example.dio;
}