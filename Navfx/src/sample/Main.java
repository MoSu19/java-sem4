package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Smiley Face");
        Pane pane = new StackPane();

        Circle head = new Circle();
        head.setRadius(50.0f);
        head.setCenterX(100.0f);
        head.setCenterY(100.0f);
        head.setStroke(Color.BLACK);
        head.setFill(Color.WHITE);

        Circle leftEye = new Circle();
        leftEye.setRadius(5.0f);
        leftEye.setCenterX(75.0f);
        leftEye.setCenterY(60.0f);
        leftEye.setFill(Color.WHITE);
        leftEye.setStroke(Color.BLACK);

        Circle rightEye = new Circle();
        rightEye.setRadius(5.0f);
        rightEye.setCenterX(125.0f);
        rightEye.setCenterY(60.0f);
        rightEye.setFill(Color.WHITE);
        rightEye.setStroke(Color.BLACK);

        Line line = new Line(100,75,100,125);

        Arc arc = new Arc();
        arc.setCenterX(100.0f);
        arc.setCenterY(125.0f);
        arc.setRadiusX(75.0f);
        arc.setRadiusY(75.0f);
        arc.setStartAngle(40.0f);
        arc.setLength(100.0f);
        arc.setType(ArcType.OPEN);

        pane.getChildren().addAll(head,leftEye,rightEye,line,arc);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
