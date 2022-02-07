package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Covid Vaccine Portal");

        GridPane root = new GridPane();
        root.setAlignment(Pos.BASELINE_CENTER);
        root.setVgap(5);
        root.setHgap(5);

        GridPane root2 = new GridPane();
        root2.setAlignment(Pos.BASELINE_CENTER);
        root2.setHgap(5);
        root2.setVgap(5);

        GridPane root3 = new GridPane();
        root3.setAlignment(Pos.BASELINE_CENTER);
        root3.setHgap(5);
        root3.setVgap(5);

        Scene menu = new Scene(root, 750, 500);
        menu.setFill(Color.BLANCHEDALMOND);

        Scene search = new Scene(root2, 750, 500);

        Scene enter = new Scene(root3, 750, 500);


        Text text = new Text();
        text.setFont(Font.font("Helvetica",24));
        text.setFill(Color.SLATEGRAY);
        text.setUnderline(true);
        text.setText("Vaccination Details");

        Text text1 = new Text("Enter new Data");
        text1.setFont(Font.font("Helvetica",24));
        text1.setFill(Color.SLATEGRAY);
        text1.setUnderline(true);

        Text text2 = new Text("Search DB Using Name");
        text2.setFont(Font.font("Helvetica",24));
        text2.setFill(Color.SLATEGRAY);
        text2.setUnderline(true);

        Button button1 = new Button("Enter Details");
        button1.setOnAction(e -> primaryStage.setScene(enter));
        Button button2 = new Button("Search DataBase");
        button2.setOnAction(e -> primaryStage.setScene(search));
        Button back1 = new Button("Menu");
        back1.setOnAction(e -> primaryStage.setScene(menu));
        Button back2 = new Button("Menu");
        back2.setOnAction(e -> primaryStage.setScene(menu));

        Button submit1 = new Button("Submit");

        Button submit2 = new Button("Submit");

        root.add(text,0,0);
        root.add(button1,0,4);
        root.add(button2,1,4);

        root2.add(text2,0,0);
        root2.add(back1,12,0);

        root3.add(text1,0,0);
        root3.add(back2,12,0);

        //Labels for Searching
        Label name = new Label("Enter Name: ");
        Label name1 = new Label("Name: ");
        Label age = new Label("Age: ");
        Label date1 = new Label("Date of 1st Dose: ");
        Label date2 = new Label("Date of 2nd Dose: ");
        Label history = new Label("History of Infection: ");

        TextField ni = new TextField();

        TextField no = new TextField();
        no.setEditable(false);
        TextField a = new TextField();
        a.setEditable(false);
        TextField d1 = new TextField();
        d1.setEditable(false);
        TextField d2 = new TextField();
        d2.setEditable(false);
        TextField h = new TextField();
        h.setEditable(false);

        submit1.setOnAction(actionEvent -> {

            String target = ni.getText();
            ResultSet s=search(target);
            try {
                while (s.next())
                {
                    no.setText(s.getString(1));
                    d1.setText(s.getString(2));
                    d2.setText(s.getString(3));
                    a.setText(Integer.toString(s.getInt(4)));
                    h.setText(s.getString(5));
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
            }

        });

        root2.add(name,0,1);
        root2.add(ni,1,1);
        root2.add(submit1,1,2);

        root2.add(name1,0,3);
        root2.add(no,1,3);
        root2.add(age,0,4);
        root2.add(a,1,4);
        root2.add(date1,0,5);
        root2.add(d1,1,5);
        root2.add(date2,0,6);
        root2.add(d2,1,6);
        root2.add(history,0,7);
        root2.add(h,1,7);

        //Labels for Entering
        Label name2 = new Label("Name: ");
        Label age2 = new Label("Age: ");
        Label date12 = new Label("Date of 1st Dose: ");
        Label date22 = new Label("Date of 2nd Dose: ");
        Label history2 = new Label("History of Infection: ");

        TextField no2 = new TextField();
        TextField a2 = new TextField();
        TextField d12 = new TextField();
        TextField d22 = new TextField();
        CheckBox h2 = new CheckBox();
        h2.setIndeterminate(false);

        submit2.setOnAction(actionEvent -> {

            List<String> lis=new ArrayList<>();
            lis.add(no2.getText());
            lis.add(d12.getText());
            lis.add(d22.getText());
            lis.add(a2.getText());
            boolean is = h2.isSelected();
            if(is)
                lis.add("True");
            else
                lis.add("False");
            insert(lis);
        });

        root3.add(name2,0,3);
        root3.add(no2,1,3);
        root3.add(age2,0,4);
        root3.add(a2,1,4);
        root3.add(date12,0,5);
        root3.add(d12,1,5);
        root3.add(date22,0,6);
        root3.add(d22,1,6);
        root3.add(history2,0,7);
        root3.add(h2,1,7);
        root3.add(submit2,1,8);

        primaryStage.setScene(menu);
        primaryStage.show();
    }

    public ResultSet search(String target)
    {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_da", "root", "mohitmks");
            String sql = "Select * from vaccine_data where Name_ = ?";
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1,target);
            ResultSet r= pstm.executeQuery();
            return r;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        return null;
    }
    public void insert(List<String> lis)
    {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_da", "root", "mohitmks");
            String sql = "Insert into vaccine_data Values (?,?,?,?,?)";
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, lis.get(0));
            pstm.setString(2, lis.get(1));
            pstm.setString(3, lis.get(2));
            pstm.setInt(4,Integer.parseInt(lis.get(3)));
            pstm.setString(5,lis.get(4));
            pstm.executeUpdate();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
