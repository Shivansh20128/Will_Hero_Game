package sample;

import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Green_orc extends Orc {

    private int Strength;
    private ImageView im;
    public Green_orc(int S, ImageView im){
        this.Strength = S;
        this.im = im;

    }

    @Override
    public void orc_jump(ImageView im) {
        TranslateTransition jump = new TranslateTransition();
        jump.setNode(im);
        jump.setDuration(Duration.millis(500));
        jump.setInterpolator(Interpolator.EASE_OUT);
        jump.setCycleCount(TranslateTransition.INDEFINITE);
        jump.setByY(-100);
        jump.setAutoReverse(true);
        jump.play();
    }

    @Override
    public void orc_jump_down(ImageView im){
        TranslateTransition jump = new TranslateTransition();
        jump.setNode(im);
        jump.setDuration(Duration.millis(500));
        jump.setInterpolator(Interpolator.EASE_OUT);
        //jump.setCycleCount(TranslateTransition.INDEFINITE);
        jump.setByY(450);
        //w.setLayoutY(w.getLayoutY() + 120);
//        jump.se(200);
//        jump.setAutoReverse(true);
        jump.play();
    }

    @Override
    public ImageView getIm(){
        return im;
    }
}
