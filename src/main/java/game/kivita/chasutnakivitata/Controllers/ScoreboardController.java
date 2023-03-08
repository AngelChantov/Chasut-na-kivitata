package game.kivita.chasutnakivitata.Controllers;

import game.kivita.chasutnakivitata.DataBaseDetails;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class ScoreboardController implements Initializable {

    @FXML
    private TableView<ObservableList> table;

    @FXML
    private Button exit;


    public void exitApp() {
        Platform.exit();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        final Connection connection;
        try {
            connection = DriverManager.getConnection(DataBaseDetails.DB_URL, DataBaseDetails.USER, DataBaseDetails.PASS);
            final PreparedStatement stmt = connection.prepareStatement(
                    "SELECT register.`First name`, register.`Last name`, scores.score, scores.Date " +
                            "FROM register JOIN scores " +
                            "ON register.idRegister = scores.idRegister " +
                            "order by scores.score desc " +
                            "LIMIT 15;");

            ResultSet result = stmt.executeQuery();


            ObservableList<ObservableList> data = FXCollections.observableArrayList();
            for (int i = 0; i < result.getMetaData().getColumnCount(); i++) {

                final int j = i;
                TableColumn col = new TableColumn(result.getMetaData().getColumnName(i + 1));
                col.setCellValueFactory((Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>) param ->
                        new SimpleStringProperty(param.getValue().get(j).toString()));

                table.getColumns().addAll(col);

            }

            while (result.next()) {

                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= result.getMetaData().getColumnCount(); i++) {

                    row.add(result.getString(i));
                }

                data.add(row);

            }

            table.setItems(data);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
