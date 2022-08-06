module com.example.salatovagramaz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.salatovagramaz to javafx.fxml;
    exports com.example.salatovagramaz;
}