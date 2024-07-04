package com.jpos.test.jpostest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MainWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label AvailableDeviceId;

    @FXML
    private Button ClaimID;

    @FXML
    private Button ClearID;

    @FXML
    private ComboBox<?> DeviceListId;

    @FXML
    private AnchorPane MainWindowID;

    @FXML
    private Button OpenID;

    @FXML
    private Button ReleaseID;

    @FXML
    private Label ScannedDataID;

    @FXML
    private TextField ScannedDataTextAreaID;

    @FXML
    void initialize() {

    }

}
