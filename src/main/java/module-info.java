module com.example.simplecalculatorteamcity {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simplecalculatorteamcity to javafx.fxml;
    exports com.example.simplecalculatorteamcity;
}