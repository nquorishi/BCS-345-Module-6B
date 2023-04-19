module com.mycompany.additionapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.additionapp to javafx.fxml;
    exports com.mycompany.additionapp;
}
