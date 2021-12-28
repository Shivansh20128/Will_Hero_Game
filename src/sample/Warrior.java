package sample;

import javafx.animation.*;
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class Warrior{

    private Helmet h;
    private int coins;
    private ImageView im;

    public Warrior(ImageView im){
        h = new Helmet();
        coins = 0;
        this.im = im;
    }

    public void warrior_jump(ImageView w){
        if (w.getImage() != null) {
            TranslateTransition jump = new TranslateTransition();
            jump.setNode(w);
            jump.setDuration(Duration.millis(500));
            jump.setInterpolator(Interpolator.EASE_OUT);
            jump.setCycleCount(TranslateTransition.INDEFINITE);
            jump.setByY(120);
            jump.setAutoReverse(true);
            jump.play();
        }
    }
    public void warrior_jump_down(ImageView w){
        TranslateTransition jump = new TranslateTransition();
        jump.setNode(w);
        jump.setDuration(Duration.millis(500));
        jump.setInterpolator(Interpolator.EASE_OUT);
        //jump.setCycleCount(TranslateTransition.INDEFINITE);
        jump.setByY(200);
        //w.setLayoutY(w.getLayoutY() + 120);
//        jump.se(200);
//        jump.setAutoReverse(true);
        jump.play();
    }

    public void warrior_opp_jump(ImageView w){
        TranslateTransition jump = new TranslateTransition();
        jump.setNode(w);
        jump.setDuration(Duration.millis(500));
        jump.setInterpolator(Interpolator.EASE_OUT);
        //jump.setCycleCount(TranslateTransition.INDEFINITE);
        jump.setByY(500);
        //w.setLayoutY(w.getLayoutY() + 120);
//        jump.se(200);
//        jump.setAutoReverse(true);
        jump.play();
    }




}
