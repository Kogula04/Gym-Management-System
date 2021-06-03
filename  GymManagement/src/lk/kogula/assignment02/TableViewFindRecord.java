package lk.kogula.assignment02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import  java.util.*;

public class TableViewFindRecord extends Application
{
    static int dx=0;
    public String MemID="";
    Scanner sn=new Scanner(System.in);
    DefaultMember obj = new DefaultMember();

    public void Display( )
    {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {

        obj.Load();
        System.out.println("Enter Your ID");
        MemID=sn.next();
        dx=obj.AStno.indexOf(MemID);
        System.out.println(dx);
        TableView tableView = new TableView();


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

        tableView.getItems().add(new AllMembers(
                obj.AStno.get(dx),
                obj.AName.get(dx),
                obj.AAddress.get(dx),
                obj.ATelephone.get(dx),
                obj.AEmail.get(dx),
                obj.ABloodSugarLvl.get(dx),
                obj.ACholesterolLVl.get(dx),
                obj.ABloodPressureLvl.get(dx),
                obj.AOverallBodyCond.get(dx)
        ));


        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
