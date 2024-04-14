package paola.mavenproject1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class App extends Application {
    private Label etiqueta;
    private TextField campoTexto;
    private Button boton, botonCambiarColor;
    private Color colorVentana = Color.WHITE;
    private int ancho = 400, alto = 300;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Interfaz de Usuario");

        etiqueta = new Label("Ingresa tu nombre:");
        campoTexto = new TextField();
        campoTexto.setPrefColumnCount(20);
        boton = new Button("Enviar");
        boton.setOnAction(event -> mostrarNombre());
        botonCambiarColor = new Button("Cambiar Color");
        botonCambiarColor.setOnAction(event -> cambiarColor(stage));


        FlowPane panel = new FlowPane();
        panel.getChildren().addAll(etiqueta, campoTexto, boton, botonCambiarColor);

        Scene scene = new Scene(panel, ancho, alto);
        scene.setFill(colorVentana);
        stage.setScene(scene);
        stage.show();
    }

    private void mostrarNombre() {
        String nombre = campoTexto.getText();
        Label labelNombre = new Label("¡Hola, " + nombre + "!");
        FlowPane panel = new FlowPane(labelNombre);
        Scene scenaNombre = new Scene(panel);
        Stage stageNombre = new Stage();
        stageNombre.setScene(scenaNombre);
        stageNombre.show();
    }

    private void cambiarColor(Stage stage) {
         colorVentana = Color.hsb(Math.random() * 360, 1.0, 1.0);
        stage.getScene().getRoot().setStyle("-fx-background-color: " + colorVentana.toString().replace("0x", "#") + ";");
    }

    public static void main(String[] args) {
        launch(args);
    }
}