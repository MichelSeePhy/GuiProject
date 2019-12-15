package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import sample.CoffeeMachine;
import sample.Cup;

public class AppController implements Initializable {

	@FXML
	private AnchorPane root;

	private Text sugarLevelText;
	private Text coffeeTypeText;
	private ImageView cupImage;
	private ImageView machineImage;

	private AnchorPane decrementSugarButton;
	private AnchorPane incrementSugarButton;
	private AnchorPane changeTypeButton;
	private AnchorPane makeCoffeeButton;

	private CoffeeMachine coffeeMachine = new CoffeeMachine();
	private Cup cup = new Cup();

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		/** DON'T CHANGE ANYTHING FROM BELOW **/

		root.setPrefSize(400, 400);

		coffeeMachine = new CoffeeMachine();
		cup = new Cup();

		machineImage = new ImageView("file:coffeMach.png");
		cupImage = new ImageView("file:CupEm.png");
		cupImage.relocate(315, 225);

		Tooltip.install(cupImage, new Tooltip("Type: " + cup.getContent() + "\nSugar: " + cup.getSugarLevel()));

		sugarLevelText = new Text("3");
		sugarLevelText.relocate(178, 130);
		sugarLevelText.setFill(Color.GREENYELLOW);

		coffeeTypeText = new Text("A");
		coffeeTypeText.relocate(284, 130);
		coffeeTypeText.setFill(Color.GREENYELLOW);

		decrementSugarButton = new AnchorPane();
		decrementSugarButton.setPrefSize(9, 9);
		decrementSugarButton.relocate(160, 140);

		incrementSugarButton = new AnchorPane();
		incrementSugarButton.setPrefSize(9, 9);
		incrementSugarButton.relocate(160, 130);

		changeTypeButton = new AnchorPane();
		changeTypeButton.setPrefSize(9, 9);
		changeTypeButton.relocate(267, 136);

		makeCoffeeButton = new AnchorPane();
		makeCoffeeButton.setPrefSize(9, 9);
		makeCoffeeButton.relocate(304, 136);

		cupImage.setOnMouseDragged(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				cupImage.setLayoutX(event.getSceneX());
				cupImage.setLayoutY(event.getSceneY());
				coffeeMachine.putOutCup();
			}
		});

		cupImage.setOnMouseReleased(event -> {
			if (event.getSceneX() > 134 && event.getSceneX() < 323) {
				if (event.getSceneY() > 126 && event.getSceneY() < 249) {
					cupImage.setLayoutX(195);
					cupImage.setLayoutY(195);
					coffeeMachine.putInCup(cup);
				}
			}
		});

		setActions();

		root.getChildren().addAll(machineImage, decrementSugarButton, incrementSugarButton, changeTypeButton,
				makeCoffeeButton, sugarLevelText, coffeeTypeText, cupImage);

		/** DON'T CHANGE ANYTHING FROM ABOVE **/

	}

	private void setActions() {
		decrementSugarButton.setOnMouseClicked(e -> {

			coffeeMachine.decrementSugar();
			sugarLevelText.setText("" + coffeeMachine.getSugarLevel());
			// CODE HERE

		});

		incrementSugarButton.setOnMouseClicked(e -> {
			// CODE HERE
			coffeeMachine.incrementSugar();
			sugarLevelText.setText("" + coffeeMachine.getSugarLevel());

		});

		changeTypeButton.setOnMouseClicked(e -> {
			// CODE HERE
			coffeeMachine.nextType();
			coffeeTypeText.setText(coffeeMachine.getCurrentMode().toString().substring(0, 1));

		});

		makeCoffeeButton.setOnMouseClicked(e -> {
			// CODE HERE
			if (coffeeMachine.isCupInside()) {
				coffeeMachine.makeCoffee();
				;
				cupImage.setImage(new Image("file:" + coffeeMachine.getCurrentMode().toString() + ".png"));
			} else {
				System.out.println("Please insert cup");
			}

		});
	}

}
