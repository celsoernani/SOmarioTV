/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariotv;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
/**
 *
 * @author celso
 */
public class Movimento {

    

    TranslateTransition baixoFast= new TranslateTransition(Duration.millis(300));
    TranslateTransition cimaFastest = new TranslateTransition(Duration.millis(300));
    TranslateTransition baixoFastest = new TranslateTransition(Duration.millis(300));
    SequentialTransition cicloAssistir, cicloDescansar, cicloBloquear, cicloDeslocar, cicloAssistirDnv;
    ImageView personagem;

    public Movimento(ImageView personagem, int numThread) {    
        baixoFast.setNode(personagem);
        cimaFastest.setNode(personagem);
        baixoFastest.setNode(personagem);
   

        cicloAssistir = new SequentialTransition(baixoFast);
        cicloDescansar = new SequentialTransition(baixoFastest);
        cicloBloquear = new SequentialTransition(cimaFastest);
        cicloAssistirDnv = new SequentialTransition(baixoFast);
        
    
    }
    
  
    public void assistir(){
        Platform.runLater(() -> {
            baixoFast.setToY(-390);
            cicloAssistir.play();
        });
               
    }
    public void assistirDnv(){
        Platform.runLater(() -> {
        baixoFast.setToY(-390);
        cicloAssistirDnv.play();
        });
    }
   
    public void descansar(){
        Platform.runLater(() -> {
            baixoFastest.setToY(-95);
            cicloDescansar.play();
        });
             
    }
    public void bloquear(){
        Platform.runLater(() -> {
            cimaFastest.setToY(-240);
            cicloBloquear.play();
        });
      
        
    }
    
}
