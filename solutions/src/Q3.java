import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;

public class Q3 extends Application {
    final int BOUND = 400;
    final int RADIUS = 15;
    final int MAX_RADIUS = BOUND / 2;
    Pane pane = new StackPane();
    ArrayList<Circle> circles = new ArrayList<>();
    boolean flag = true;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        for (int i = 1; i <= 9; i++) {
            Circle c = new Circle(i * RADIUS);
            c.setFill(Color.TRANSPARENT);
            c.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            c.setStrokeWidth(7);
            pane.getChildren().add(c);
            circles.add(c);
        }

        pane.setPadding(new Insets(15, 15, 15, 15));

        pane.requestFocus();

        Scene scene = new Scene(pane, BOUND, BOUND);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Q3");
        primaryStage.centerOnScreen();
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setResizable(false);
        primaryStage.show();

        scene.setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.S) {
                animation();
            }
        });
    }

    public void animation() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(100), e -> {
            for (Circle c : circles) {
                if (flag) {
                    c.setRadius(c.getRadius() + 1);
                } else {
                    c.setRadius(c.getRadius() - 1);
                }

                if (c.getRadius() > MAX_RADIUS) {
                    flag = false;
                }
                if (c.getRadius() <= RADIUS) {
                    flag = true;
                }
            }
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

}
