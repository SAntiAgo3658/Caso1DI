import javafx.animation.FillTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {
    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage escenario) {

        Pane escena = new Pane();

        Line linea1 = new Line(10, 2, 10, 300);
        linea1.setStartX(50);
        linea1.setStartY(5);
        linea1.setEndX(50);
        linea1.setEndY(300);

        Line linea2 = new Line(100, 5, 100, 300);
        Line linea3 = new Line(150, 5, 150, 300);

        linea2.setStrokeWidth(10);
        linea3.setStroke(Color.BLUEVIOLET);

        Circle circulo = new Circle(800, 600, 50);
        circulo.setFill(Color.BURLYWOOD);

        Rectangle cuadrado = new Rectangle();
        cuadrado.setWidth(40);
        cuadrado.setHeight(40);
        cuadrado.setX(300);
        cuadrado.setY(600);
        cuadrado.setFill(Color.AQUAMARINE);

        Polygon pentagono = new Polygon();
        pentagono.getPoints().addAll(new Double[] {
                600.0, 100.0,
                700.0, 100.0,
                750.0, 150.0,
                650.0, 200.0,
                550.0, 150.0

        });

        pentagono.setFill(Color.BLUE);

        RotateTransition rotarCuadrado = new RotateTransition(Duration.seconds(5), cuadrado);
        rotarCuadrado.setFromAngle(0);
        rotarCuadrado.setToAngle(360);
        rotarCuadrado.setInterpolator(Interpolator.LINEAR);
        rotarCuadrado.setCycleCount(RotateTransition.INDEFINITE);
        rotarCuadrado.play();

        FillTransition pentagonoColor = new FillTransition(Duration.seconds(5), pentagono);
        pentagonoColor.setFromValue((Color)pentagono.getFill());
        pentagonoColor.setToValue(Color.CHOCOLATE);
        pentagonoColor.setInterpolator(Interpolator.LINEAR);
        pentagonoColor.setAutoReverse(true);
        pentagonoColor.setCycleCount(RotateTransition.INDEFINITE);
        pentagonoColor.play();

        escena.getChildren().addAll(linea1, linea2, linea3, circulo, cuadrado, pentagono);
        escenario.setScene(new Scene(escena, 1000, 800));
        escenario.show();

    }

}
