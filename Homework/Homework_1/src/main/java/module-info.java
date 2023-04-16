module com.example.homework_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homework_1 to javafx.fxml;
    exports com.example.homework_1;
}