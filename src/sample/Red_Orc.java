package sample;

import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class Red_Orc extends Orc{

    private ImageView im;
    private int Strength;

    public Red_Orc(int R, ImageView im){
        this.Strength = R;
        this.im = im;


    }

    @Override
    public void orc_jump(ImageView im) {
        TranslateTransition jump = new TranslateTransition();
        jump.setNode(im);
        jump.setDuration(Duration.millis(600));
        jump.setInterpolator(Interpolator.EASE_OUT);
        jump.setCycleCount(TranslateTransition.INDEFINITE);
        jump.setByY(-120);
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
