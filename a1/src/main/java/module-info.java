module com.son.a1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.son.a1 to javafx.fxml;
    exports com.son.a1;
}
