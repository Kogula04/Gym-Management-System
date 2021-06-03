package lk.kogula.assignment02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewExample extends Application {

    public static void main(String[] args)
    {
        TableViewExample obj=new TableViewExample();
        obj.Display();
    }

    public void Display()
    {
        launch();
    }

    @Override
    public void start(Stage primaryStage)
    {

        TableView tableView = new TableView();
        DefaultMember obj=new DefaultMember();

        TableColumn<String, AllMembers> column1 = new TableColumn<>("StNo");
        column1.setCellValueFactory(new PropertyValueFactory<>("StNo"));

        TableColumn<String, AllMembers> column2 = new TableColumn<>("Name");
        column2.setCellValueFactory(new PropertyValueFactory<>("Name"));

        TableColumn<String, AllMembers> column3 = new TableColumn<>("Address");
        column3.setCellValueFactory(new PropertyValueFactory<>("Address"));

        TableColumn<String, AllMembers> column4 = new TableColumn<>("Telephone");
        column4.setCellValueFactory(new PropertyValueFactory<>("Telephone"));

        TableColumn<String, AllMembers> column5 = new TableColumn<>("Email");
        column5.setCellValueFactory(new PropertyValueFactory<>("Email"));

        TableColumn<String, AllMembers> column6 = new TableColumn<>("BloodSugarLvl");
        column6.setCellValueFactory(new PropertyValueFactory<>("BloodSugarLvl"));

        TableColumn<String, AllMembers> column7 = new TableColumn<>("CholesterolLVl");
        column7.setCellValueFactory(new PropertyValueFactory<>("CholesterolLVl"));

        TableColumn<String, AllMembers> column8 = new TableColumn<>("BloodPressureLvl");
        column8.setCellValueFactory(new PropertyValueFactory<>("BloodPressureLvl"));

        TableColumn<String, AllMembers> column9 = new TableColumn<>("OverallBodyCond");
        column9.setCellValueFactory(new PropertyValueFactory<>("OverallBodyCond"));


        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);
        tableView.getColumns().add(column3);
        tableView.getColumns().add(column4);
        tableView.getColumns().add(column5);
        tableView.getColumns().add(column6);
        tableView.getColumns().add(column7);
        tableView.getColumns().add(column8);
        tableView.getColumns().add(column9);

        obj.Load();

        for(int i=0;i<obj.AStno.size();i++)
        {
            tableView.getItems().add(new AllMembers(
                    obj.AStno.get(i),
                    obj.AName.get(i),
                    obj.AAddress.get(i),
                    obj.ATelephone.get(i),
                    obj.AEmail.get(i),
                    obj.ABloodSugarLvl.get(i),
                    obj.ACholesterolLVl.get(i),
                    obj.ABloodPressureLvl.get(i),
                    obj.AOverallBodyCond.get(i)
            ));
        }

        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

}
