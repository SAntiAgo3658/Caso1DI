import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage escenario) {

        Pane escena = new Pane();
        Line linea1 = new Line();
        linea1.setStartX(4);
        linea1.setStartY(8);
        linea1.setEndX(300);
        linea1.setEndY(400);
        Line linea2 = new Line(200, 200, 300, 300);
        linea2.setStrokeWidth(80);
        Line linea3 = new Line(300, 300, 400, 400);
        linea3.setStroke(Color.BLUEVIOLET);

        Circle circulo = new Circle(200, 300, 50);
        circulo.setFill(Color.BURLYWOOD);

        Rectangle rectangulo = new Rectangle();
        rectangulo.setWidth(40);
        rectangulo.setHeight(40);
        rectangulo.setX(100);
        rectangulo.setY(100);
        rectangulo.setFill(Color.CRIMSON);

        Rectangle cuadrado = new Rectangle();
        cuadrado.setWidth(40);
        cuadrado.setHeight(40);
        cuadrado.setX(100);
        cuadrado.setY(100);
        cuadrado.setFill(Color.ALICEBLUE);

        Polygon pentagono = new Polygon();
        pentagono.getPoints().addAll(new Double[] {
                100.0, 100.0,
                200.0, 100.0,
                300.0, 150.0,
                200.0, 200.0,
                100.0, 200.0

        });

        pentagono.setFill(Color.BLUE);

        escena.getChildren().addAll(linea1, linea2, linea3, circulo, rectangulo, cuadrado, pentagono);
        escenario.setScene(new Scene(escena, 600, 400));
        escenario.show();

    }

}
