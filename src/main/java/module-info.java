module game.kivita.chasutnakivitata {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens game.kivita.chasutnakivitata to javafx.fxml;
    exports game.kivita.chasutnakivitata;
    exports game.kivita.chasutnakivitata.Controllers;
    opens game.kivita.chasutnakivitata.Controllers to javafx.fxml;
}