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
    
    
    TranslateTransition cimaP = new TranslateTransition(Duration.millis(100));
    TranslateTransition baixoP = new TranslateTransition(Duration.millis(200));
    TranslateTransition esquerdaP = new TranslateTransition(Duration.seconds(1));
    TranslateTransition direitaP = new TranslateTransition(Duration.seconds(1));
    
    TranslateTransition cima = new TranslateTransition(Duration.seconds(1));
    TranslateTransition baixo = new TranslateTransition(Duration.seconds(1));
    TranslateTransition esquerda = new TranslateTransition(Duration.seconds(1));
    TranslateTransition direita = new TranslateTransition(Duration.seconds(1));
    
    TranslateTransition cimaFast = new TranslateTransition(Duration.millis(500));
    TranslateTransition baixoFast= new TranslateTransition(Duration.millis(500));
    TranslateTransition direitaFast = new TranslateTransition(Duration.millis(500));
    TranslateTransition esquerdaFast = new TranslateTransition(Duration.millis(500));
    
    TranslateTransition cimaFastest = new TranslateTransition(Duration.millis(200));
    TranslateTransition baixoFastest = new TranslateTransition(Duration.millis(200));
    TranslateTransition esquerdaFastest = new TranslateTransition(Duration.millis(300));
    TranslateTransition direitaFastest = new TranslateTransition(Duration.millis(200));
    
    SequentialTransition cicloAssistir, cicloDescansar, cicloBloquear, cicloDeslocar, cicloAssistirDnv;
    ImageView personagem;
    private long deslocamento;
    private int numThread;

    public Movimento(ImageView personagem, int numThread) {
        cimaP.setNode(personagem);
        baixoP.setNode(personagem);
        esquerdaP.setNode(personagem);
        direitaP.setNode(personagem);
        
        cima.setNode(personagem);
        baixo.setNode(personagem);
        esquerda.setNode(personagem);
        direita.setNode(personagem);
        
        cimaFast.setNode(personagem);
        baixoFast.setNode(personagem);
        esquerdaFast.setNode(personagem);
        direitaFast.setNode(personagem);
        
        cimaFastest.setNode(personagem);
        baixoFastest.setNode(personagem);
        esquerdaFastest.setNode(personagem);
        direitaFastest.setNode(personagem);
        
        cicloDeslocar = new SequentialTransition(cimaP, direitaP);
        cicloAssistir = new SequentialTransition(baixoFastest, direitaFastest, cima, esquerdaFast, baixoFast);
        cicloDescansar = new SequentialTransition(cimaFast, esquerda, baixoFastest, esquerdaFastest);
        cicloBloquear = new SequentialTransition(direitaFastest, baixo, direita, cimaFastest);
        cicloAssistirDnv = new SequentialTransition(direitaFastest, cimaFastest, direita, baixoFast);
        
        this.deslocamento = 25*numThread;
        this.numThread=numThread;
    
    }
    
  
    public void assistir(){
        Platform.runLater(() -> {
            esquerdaFast.setToX(215 - (75 * numThread));
            baixoFast.setToY(-380);
            cicloAssistir.play();
        });
               
    }
    public void assistirDnv(){
        Platform.runLater(() -> {
       direitaFastest.setToX(-310);
        direita.setToX(215-(25*numThread));
        baixoFast.setToY(-380);
        cicloAssistirDnv.play();
        });
    }
   
    public void descansar(){
        Platform.runLater(() -> {
            baixoFastest.setToY(-80);
            cicloDescansar.play();
        });
             
    }
    public void bloquear(){
        Platform.runLater(() -> {
//            direitaFastest.setToX(-500);
//            baixo.setToY(-300);
            direita.setToX(300 - deslocamento);
            cimaFastest.setToY(-210);
            cicloBloquear.play();
        });
      
        
    }
    
}
