module com.jpos.test.jpostest {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.jpos.test.jpostest to javafx.fxml;
    exports com.jpos.test.jpostest;
}