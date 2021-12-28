package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.ResourceBundle;

import static java.lang.Thread.sleep;


public class Controller extends JPanel implements Initializable {
    @FXML
    private ImageView warrior;
    @FXML
    private ImageView island1;
    @FXML
    private ImageView island2;
    @FXML
    private ImageView island3;
    @FXML
    private ImageView island4;
    @FXML
    private ImageView island5;
    @FXML
    private ImageView island6;
    @FXML
    private ImageView island7;
    @FXML
    private ImageView island8;
    @FXML
    private ImageView island9;
    @FXML
    private ImageView island10;
    @FXML
    private ImageView island11;
    @FXML
    private ImageView island12;
    @FXML
    private ImageView island13;
    @FXML
    private ImageView island14;
    @FXML
    private ImageView island15;
    @FXML
    private ImageView island16;
    @FXML
    private ImageView island17;
    @FXML
    private ImageView island18;
    @FXML
    private ImageView island19;
    @FXML
    private ImageView island20;
    @FXML
    private ImageView island21;
    @FXML
    private ImageView island22;
    @FXML
    private ImageView island23;
    @FXML
    private ImageView island24;
    @FXML
    private ImageView island25;
    @FXML
    private ImageView island26;
    @FXML
    private ImageView island27;
    @FXML
    private ImageView island28;
    @FXML
    private ImageView island29;
    @FXML
    private ImageView island30;
    @FXML
    private ImageView island31;
    @FXML
    private ImageView island32;

    public ArrayList<ImageView> island_list = new ArrayList<ImageView>();

    @FXML
    private Group back_components;
    @FXML
    private ImageView TNT1;
    @FXML
    private ImageView TNT2;
    @FXML
    private ImageView TNT3;
    @FXML
    private ImageView TNT4;
    @FXML
    private ImageView TNT5;
    @FXML
    private ImageView TNT6;
    @FXML
    private ImageView TNT7;
    @FXML
    private ImageView TNT8;
    @FXML
    private ImageView chest1;
    @FXML
    private ImageView chest2;
    @FXML
    private ImageView chest3;
    @FXML
    private ImageView green_orc1;
    @FXML
    private ImageView green_orc2;
    @FXML
    private ImageView green_orc3;
    @FXML
    private ImageView green_orc4;
    @FXML
    private ImageView green_orc5;
    @FXML
    private ImageView green_orc6;
    @FXML
    private ImageView green_orc7;
    @FXML
    private ImageView green_orc8;
    @FXML
    private ImageView green_orc9;
    @FXML
    private ImageView green_orc10;
    @FXML
    private ImageView green_orc11;
    @FXML
    private ImageView red_orc1;
    @FXML
    private ImageView red_orc2;
    @FXML
    private ImageView red_orc3;
    @FXML
    private ImageView red_orc4;
    @FXML
    private ImageView red_orc5;
    @FXML
    private ImageView red_orc6;
    @FXML
    private ImageView red_orc7;
    @FXML
    private ImageView red_orc8;
    @FXML
    private ImageView red_orc15;
    @FXML
    private ImageView red_orc9;
    @FXML
    private ImageView red_orc10;
    @FXML
    private ImageView red_orc11;
    @FXML
    private ImageView king_orc;
    @FXML
    private ImageView coin1;
    @FXML
    private ImageView coin2;
    @FXML
    private ImageView coin3;
    @FXML
    private ImageView coin4;
    @FXML
    private ImageView coin5;
    @FXML
    private ImageView coin6;
    @FXML
    private ImageView coin7;
    @FXML
    private ImageView coin8;
    @FXML
    private ImageView coin9;
    @FXML
    private ImageView coin10;
    @FXML
    private ImageView coin11;
    @FXML
    private ImageView coin12;
    @FXML
    private ImageView coin13;
    @FXML
    private ImageView coin14;
    @FXML
    private ImageView coin15;
    @FXML
    private ImageView coin16;
    @FXML
    private ImageView coin17;
    @FXML
    private ImageView coin18;
    @FXML
    private ImageView coin19;

    @FXML
    private ImageView BCR;

    @FXML
    private Button b1;

    @FXML
    private Button exit;

    @FXML
    private ImageView burried;

    @FXML
    private ImageView blasted;

    @FXML
    private ImageView falling;

    public ArrayList<ImageView> jump_objects = new ArrayList<ImageView>();
    @FXML
    private Label score;
    @FXML
    private Label coin;

    private Stage primaryStage;



    Warrior hero = new Warrior(warrior);
    Green_orc gr1 = new Green_orc(20, green_orc1);
    Green_orc gr2 = new Green_orc(20, green_orc2);
    Green_orc gr3 = new Green_orc(20, green_orc3);
    Green_orc gr4 = new Green_orc(20, green_orc4);
    Green_orc gr5 = new Green_orc(20, green_orc5);
    Green_orc gr6 = new Green_orc(20, green_orc6);
    Green_orc gr7 = new Green_orc(20, green_orc7);
    Green_orc gr8 = new Green_orc(20, green_orc8);
    Green_orc gr9 = new Green_orc(20, green_orc9);
    Green_orc gr10 = new Green_orc(20, green_orc10);
    Green_orc gr11 = new Green_orc(20, green_orc11);

    Red_Orc ro1 = new Red_Orc(25, red_orc1);
    Red_Orc ro2 = new Red_Orc(25, red_orc2);
    Red_Orc ro3 = new Red_Orc(25, red_orc3);
    Red_Orc ro4 = new Red_Orc(25, red_orc4);
    Red_Orc ro5 = new Red_Orc(25, red_orc5);
    Red_Orc ro6 = new Red_Orc(25, red_orc6);
    Red_Orc ro7 = new Red_Orc(25, red_orc7);
    Red_Orc ro8 = new Red_Orc(25, red_orc8);
    Red_Orc ro9 = new Red_Orc(25, red_orc9);
    Red_Orc ro10 = new Red_Orc(25, red_orc10);
    Red_Orc ro11 = new Red_Orc(25, red_orc11);
    Red_Orc ro15 = new Red_Orc(25, red_orc11);

    Boss_Orc bo = new Boss_Orc(50, king_orc);
    static int game_score=0;
    static int game_coins=0;
    static Double x_co=112.0;
    static Double x_back=-4.0;
    static int x_layout_warrior;
    static int x_layout_back;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        score.setText("Score : "+game_score);
        coin.setText("Coins : "+game_coins);
        warrior.setLayoutX(x_co);
        back_components.setLayoutX(x_back);
        BCR.setVisible(false);
        b1.setVisible(false);
        exit.setVisible(false);
        burried.setVisible(false);
        blasted.setVisible(false);
        falling.setVisible(false);
        island_list.add(island1);
        hero.warrior_jump(warrior);
        //hero.warrior_jump(BCR);
        island_list.add(island2);
        island_list.add(island3);
        island_list.add(island4);
        island_list.add(island5);
        island_list.add(island6);
        island_list.add(island7);
        island_list.add(island8);
        island_list.add(island9);
        island_list.add(island10);
        island_list.add(island11);
        island_list.add(island12);
        island_list.add(island13);
        island_list.add(island14);
        island_list.add(island15);
        island_list.add(island16);
        island_list.add(island17);
        island_list.add(island18);
        island_list.add(island19);
        island_list.add(island20);
        island_list.add(island21);
        island_list.add(island22);
        island_list.add(island23);
        island_list.add(island24);
        island_list.add(island25);
        island_list.add(island26);
        island_list.add(island27);
        island_list.add(island28);
        island_list.add(island29);
        island_list.add(island30);
        island_list.add(island31);
        island_list.add(island32);

        jump_objects.add(warrior);
        jump_objects.add(green_orc1);
        jump_objects.add(green_orc2);
        jump_objects.add(green_orc3);
        jump_objects.add(green_orc4);
        jump_objects.add(green_orc5);
        jump_objects.add(green_orc6);
        jump_objects.add(green_orc7);
        jump_objects.add(green_orc8);
        jump_objects.add(green_orc9);
        jump_objects.add(green_orc10);
        jump_objects.add(green_orc11);
        jump_objects.add(red_orc1);
        jump_objects.add(red_orc2);
        jump_objects.add(red_orc3);
        jump_objects.add(red_orc4);
        jump_objects.add(red_orc5);
        jump_objects.add(red_orc6);
        jump_objects.add(red_orc7);
        jump_objects.add(red_orc8);
        jump_objects.add(red_orc9);
        jump_objects.add(red_orc10);
        jump_objects.add(red_orc11);
        jump_objects.add(king_orc);

        gr1.orc_jump(green_orc1);
        gr2.orc_jump(green_orc2);
        gr3.orc_jump(green_orc3);
        gr4.orc_jump(green_orc4);
        gr5.orc_jump(green_orc5);
        gr6.orc_jump(green_orc6);
        gr7.orc_jump(green_orc7);
        gr8.orc_jump(green_orc8);
        gr9.orc_jump(green_orc9);
        gr10.orc_jump(green_orc10);
        gr11.orc_jump(green_orc11);

        ro1.orc_jump(red_orc1);
        ro2.orc_jump(red_orc2);
        ro3.orc_jump(red_orc3);
        ro4.orc_jump(red_orc4);
        ro5.orc_jump(red_orc5);
        ro6.orc_jump(red_orc6);
        ro7.orc_jump(red_orc7);
        ro8.orc_jump(red_orc8);
        ro9.orc_jump(red_orc9);
        ro10.orc_jump(red_orc10);
        ro11.orc_jump(red_orc11);
        ro15.orc_jump(red_orc15);
        bo.orc_jump(king_orc);
        collisionTimer.start();
    }



    AnimationTimer collisionTimer=new AnimationTimer() {
        @Override
        public void handle(long l) {
            try {
                collisiontry(warrior,green_orc1, gr1);
                collisiontry(warrior,green_orc2, gr2);
                collisiontry(warrior,green_orc3, gr3);
                collisiontry(warrior,green_orc4, gr4);
                collisiontry(warrior,green_orc5, gr5);
                collisiontry(warrior,green_orc6, gr6);
                collisiontry(warrior,green_orc7, gr7);
                collisiontry(warrior,green_orc8, gr8);
                collisiontry(warrior,green_orc9, gr9);
                collisiontry(warrior,green_orc10, gr10);
                collisiontry(warrior,green_orc11, gr11);
                collision_chest(warrior,chest1);
                collision_chest(warrior,chest2);
                collision_chest(warrior,chest3);
                collisiontry(warrior, red_orc1, ro1);
                collisiontry(warrior, red_orc2, ro2);
                collisiontry(warrior, red_orc3, ro3);
                collisiontry(warrior, red_orc4, ro4);
                collisiontry(warrior, red_orc5, ro5);
                collisiontry(warrior, red_orc6, ro6);
                collisiontry(warrior, red_orc7, ro7);
                collisiontry(warrior, red_orc8, ro8);
                collisiontry(warrior, red_orc9, ro9);
                collisiontry(warrior, red_orc10, ro10);
                collisiontry(warrior, red_orc11, ro11);
                collisiontry(warrior, red_orc15, ro15);
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }


            collision_tnt(warrior, TNT1);
            collision_coin(warrior,coin1);
            collision_coin(warrior,coin2);
            collision_coin(warrior,coin3);
            collision_coin(warrior,coin4);
            collision_coin(warrior,coin5);
            collision_coin(warrior,coin6);
            collision_coin(warrior,coin7);
            collision_coin(warrior,coin8);
            collision_coin(warrior,coin9);
            collision_coin(warrior,coin10);
            collision_coin(warrior,coin11);
            collision_coin(warrior,coin12);
            collision_coin(warrior,coin13);
            collision_coin(warrior,coin14);
            collision_coin(warrior,coin15);
            collision_coin(warrior,coin15);
            collision_coin(warrior,coin16);
            collision_coin(warrior,coin17);
            collision_coin(warrior,coin18);
            collision_coin(warrior,coin19);
            x_layout_warrior = (int) warrior.getLayoutX();
            x_layout_back = (int) back_components.getLayoutX();
            if((warrior.getBoundsInParent().getMinX() > 489 )&&(warrior.getBoundsInParent().getMaxX() < 533))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                        //System.exit(0);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 667 )&&(warrior.getBoundsInParent().getMaxX() < 740))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 916 )&&(warrior.getBoundsInParent().getMaxX() < 981))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 1300 )&&(warrior.getBoundsInParent().getMaxX() < 1333))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 1834)&&(warrior.getBoundsInParent().getMaxX() < 1840))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 1940 )&&(warrior.getBoundsInParent().getMaxX() < 1972))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 2132 )&&(warrior.getBoundsInParent().getMaxX() < 2171))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }

            }
            if((warrior.getBoundsInParent().getMinX() > 2286 )&&(warrior.getBoundsInParent().getMaxX() < 2325))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 2579 )&&(warrior.getBoundsInParent().getMinX() < 2608))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 3050 )&&(warrior.getBoundsInParent().getMinX() < 3084))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 3290)&&(warrior.getBoundsInParent().getMinX() < 3315))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 3489 )&&(warrior.getBoundsInParent().getMinX() < 3542))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 3692 )&&(warrior.getBoundsInParent().getMinX() < 3720))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 3890 )&&(warrior.getBoundsInParent().getMinX() < 3905))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 4005 )&&(warrior.getBoundsInParent().getMinX() < 4007))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 4405 )&&(warrior.getBoundsInParent().getMinX() < 4443))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 4560 )&&(warrior.getBoundsInParent().getMinX() < 4579))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 4760 )&&(warrior.getBoundsInParent().getMinX() < 4768))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 4912 )&&(warrior.getBoundsInParent().getMinX() < 4926))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        b1.setVisible(true);
                        b1.setDisable(false);
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }

        }
    };

    private void collision_island(ImageView warrior, ImageView island) {
        if(warrior.getBoundsInParent().intersects(island.getBoundsInParent())){
            System.out.println("ho gya re");
        }
    }

    @FXML
    private void pause(ActionEvent we) throws IOException {
//        Saving_class try_obj = new Saving_class();
        Saving_class try_obj = new Saving_class();
        try_obj.coins=game_coins;
        try_obj.score=game_score;
        try_obj.x_coordinate=warrior.getLayoutX();
        try_obj.screen_back=back_components.getLayoutX();
        try_obj.stage=primaryStage;
        FileOutputStream fileout = new FileOutputStream("saved.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(try_obj);
        out.close();
        fileout.close();
        System.out.println("x coordinate of warrior: "+warrior.getLayoutX());
        System.out.println("y coordinate of warrior: "+warrior.getLayoutY());

        System.out.println("oh yeah this is working!!");
        Parent root = FXMLLoader.load(getClass().getResource("pause_scene.fxml"));
        primaryStage = (Stage)((Node)we.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }


    public void collisiontry(ImageView im1, ImageView im2, Orc gr) throws InterruptedException, IOException {

        double w_miny = im1.getBoundsInParent().getMinY();
        double o_maxy = im2.getBoundsInParent().getMaxY();
        double w_minx = im1.getBoundsInParent().getMinX();
        double w_maxx = im1.getBoundsInParent().getMaxX();
        double o_minx = im2.getBoundsInParent().getMinX();
        double o_maxx = im2.getBoundsInParent().getMaxX();



        if((w_miny > o_maxy) && (((w_minx>o_minx) && (w_minx < o_maxx)) || ((w_maxx > o_minx) && (w_maxx < o_maxx)))){

            im1.setImage(null);
            BCR.setLayoutX(BCR.getLayoutX() - 40);
            BCR.setVisible(true);

            b1.setVisible(true);
            b1.setDisable(false);
            exit.setVisible(true);
            exit.setDisable(false);
            burried.setVisible(true);
            //im1.removeEventHandler(MouseEvent.MOUSE_CLICKED, );
            //System.exit(0);

        }

        else if(im1.getBoundsInParent().intersects(im2.getBoundsInParent())){
            System.out.println("Yeh kya nautanki ho gayi");

            TranslateTransition jump2 = new TranslateTransition();
            jump2.setNode(im2);
            jump2.setDuration(Duration.millis(10));
            jump2.setInterpolator(Interpolator.LINEAR);
            im2.setLayoutX(im2.getLayoutX() + 60);

            System.out.println("this is the min : " + im2.getBoundsInParent().getMinX());
            System.out.println("this is the max : " + im2.getBoundsInParent().getMaxX());

            if((im2.getBoundsInParent().getMinX() > 666 )&&(im2.getBoundsInParent().getMaxX() < 740)) {
                 if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMinX() > 916 )&&(im2.getBoundsInParent().getMaxX() < 981))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMaxX() > 1300 )&&(im2.getBoundsInParent().getMinX() < 1333))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMinX() > 1834)&&(im2.getBoundsInParent().getMaxX() < 1840))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMaxX() > 1940 )&&(im2.getBoundsInParent().getMinX() < 1972))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMinX() > 2132 )&&(im2.getBoundsInParent().getMaxX() < 2171))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMinX() > 2286 )&&(im2.getBoundsInParent().getMaxX() < 2325))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMinX() > 2579 )&&(im2.getBoundsInParent().getMaxX() < 2608))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMaxX() > 3050 )&&(im2.getBoundsInParent().getMinX() < 3084))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMaxX() > 3290)&&(im2.getBoundsInParent().getMinX() < 3315))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMaxX() > 3489 )&&(im2.getBoundsInParent().getMinX() < 3542))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMaxX() > 3692 )&&(im2.getBoundsInParent().getMinX() < 3720))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMaxX() > 3890 )&&(im2.getBoundsInParent().getMinX() < 3905))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMaxX() > 4005 )&&(im2.getBoundsInParent().getMinX() < 4007))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMaxX() > 4405 )&&(im2.getBoundsInParent().getMinX() < 4443))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMaxX() > 4560 )&&(im2.getBoundsInParent().getMinX() < 4579))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMaxX() > 4760 )&&(im2.getBoundsInParent().getMinX() < 4768))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            if((im2.getBoundsInParent().getMaxX() > 4912 )&&(im2.getBoundsInParent().getMinX() < 4926))  {
                if (im2.getBoundsInParent().getMaxY() > 140) {
                    gr.orc_jump_down(im2);
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        new java.util.Timer().schedule(
                                new java.util.TimerTask(){
                                    @Override
                                    public void run(){
                                        im2.setImage(null);
                                    }
                                },
                                500
                        );
                    }
                }
            }
            jump2.play();
        }


    }

    public void checkthis(ActionEvent e1) throws IOException, ClassNotFoundException {
        System.out.println("The Button is working");
        Saving_class try_obj = new Saving_class();
        try_obj.coins=game_coins;
        try_obj.score=game_score;
        try_obj.x_coordinate=warrior.getLayoutX();
        try_obj.screen_back=back_components.getLayoutX();
        try_obj.stage=primaryStage;
        FileOutputStream fileout = new FileOutputStream("saved.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(try_obj);
        out.close();
        fileout.close();
        Saving_class get_it = null;
        FileInputStream filein = new FileInputStream("C:\\Users\\Shivansh\\Downloads\\game (1)\\game\\saved.ser");
        ObjectInputStream in = new ObjectInputStream(filein);
        get_it = (Saving_class) in.readObject();
        in.close();
        filein.close();
        System.out.println("score: "+get_it.score);
        Controller.game_coins=get_it.coins;
        Controller.game_score= get_it.score;
        Controller.x_co = get_it.x_coordinate;
        Controller.x_back = get_it.screen_back;

        System.out.println("oh yeah this is working!!");
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage = (Stage)((Node)e1.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    public void bhaagja(ActionEvent e1) throws IOException {
        System.exit(0);
    }
    public void collision_chest(ImageView im1, ImageView im2){
        if(im1.getBoundsInParent().intersects(im2.getBoundsInParent())){
            Image burst = new Image("ChestOpen.png");
            im2.setImage(burst);
        }
    }

    public void collision_tnt(ImageView im1, ImageView im2){
        if(im1.getBoundsInParent().intersects(im2.getBoundsInParent())){

            final boolean[] condition = {false};
            new java.util.Timer().schedule(
                    new java.util.TimerTask(){
                        @Override
                        public void run(){
                            System.out.println("x of tnt "+im2.getLayoutX());
                            Image burst = new Image("burst2.png");
                            im2.setScaleX(3);
                            im2.setScaleY(3);
                            im2.setImage(burst);
                            System.out.println("x of tnt "+im2.getLayoutX());
                            // your code here
                            if(im1.getBoundsInParent().intersects(im2.getBoundsInParent())){
                                condition[0] =true;
                            }
                            if(condition[0]){
                                im1.setImage(null);
                                blasted.setVisible(true);
                                b1.setVisible(true);
                                b1.setDisable(false);
                                exit.setVisible(true);
                                exit.setDisable(false);

                            }
                        }

                    },
                    500
            );
        }
    }
    public void collision_coin(ImageView im1, ImageView im2){
        if(im1.getBoundsInParent().intersects(im2.getBoundsInParent())){
            if (im2.getImage()!=null) {
                game_coins++;
                String x = Integer.toString(game_coins);
                coin.setText("Coins : " + x);
            }
            im2.setImage(null);
        }
    }

    public void collision_TNT(){
//        System.out.println("TNT1 "+TNT1.getLayoutX()+" "+TNT1.getLayoutY());
//        System.out.println("warrior"+warrior.getLayoutX()+" "+warrior.getLayoutY());
        if(warrior.getLayoutX()>=(TNT1.getLayoutX()-48) && warrior.getLayoutX()<=(TNT1.getLayoutX()+5)){
            System.out.println("this is here");
            game_score=0;
        }
    }
    public void warrior_move_forward(MouseEvent mouseEvent){
        if ((warrior.getImage() != null)&&(BCR.getImage()!=null)) {
            game_score++;
            String x = Integer.toString(game_score);
            score.setText("Score : " + x);
            TranslateTransition jump = new TranslateTransition();
            jump.setNode(warrior);
            jump.setDuration(Duration.millis(10));
            jump.setInterpolator(Interpolator.LINEAR);
//        jump.setByX(48);
            warrior.setLayoutX(warrior.getLayoutX() + 48);
            System.out.println("this is something " + warrior.getBoundsInParent().getMinX());
            System.out.println("this is bcr " + BCR.getBoundsInParent().getMinX());
            BCR.setLayoutX(BCR.getLayoutX() + 48);
//            b1.setLayoutX(b1.getLayoutX() + 48);
            //burried.setLayoutX(burried.getLayoutX() + 48);
//        System.out.println("warrior inside"+warrior.getLayoutX()+" "+warrior.getLayoutY());
            collision_TNT();
            jump.play();
        }
    }

    public void scene_move_back(MouseEvent mouseEvent) {
        if (warrior.getImage() != null) {
            TranslateTransition jump = new TranslateTransition();
            jump.setNode(back_components);
            jump.setDuration(Duration.millis(1340));
            jump.setInterpolator(Interpolator.LINEAR);
//            jump.setByX(-48);
            back_components.setLayoutX(back_components.getLayoutX()-48);
            jump.play();

        }
    }
}