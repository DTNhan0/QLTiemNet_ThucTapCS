module mainscript.qltiemnet {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainscript.qltiemnet to javafx.fxml;
    exports mainscript.qltiemnet;
}