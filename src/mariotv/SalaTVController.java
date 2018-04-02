/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariotv;


import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import java.util.concurrent.Semaphore;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
 


public class SalaTVController implements Initializable {
     @FXML
    private TextArea logText;

    @FXML
    private ImageView hospede1;

    @FXML
    private ImageView hospede2;

    @FXML
    private ImageView hospede3;

    @FXML
    private ImageView hospede4;

    @FXML
    private ImageView hospede5;

    @FXML
    private ImageView hospede6;

    @FXML
    private ImageView hospede7;

    @FXML
    private ImageView hospede8;

    @FXML
    private ImageView hospede9;

    @FXML
    private ImageView hospede10;

    @FXML
    private ImageView Acerto;

    @FXML
    private ImageView DB;

    @FXML
    private ImageView Crazy;

    @FXML
    private ImageView Minions;

    @FXML
    private ImageView Mortal;

    @FXML
    private ImageView Rock;

    @FXML
    private ImageView Mario;

    @FXML
    private ImageView Top;

    @FXML
    private AnchorPane ancora0;

    @FXML
    private Label ch0;

    @FXML
    private Label dh0;

    @FXML
    private Label ah0;

    @FXML
    private AnchorPane ancora1;

    @FXML
    private Label ch1;

    @FXML
    private Label dh1;

    @FXML
    private Label ah1;

    @FXML
    private AnchorPane ancora2;

    @FXML
    private Label ch2;

    @FXML
    private Label dh2;

    @FXML
    private Label ah2;

    @FXML
    private AnchorPane ancora3;

    @FXML
    private Label ch3;

    @FXML
    private Label dh3;

    @FXML
    private Label ah3;

    @FXML
    private AnchorPane ancora4;

    @FXML
    private Label ch4;

    @FXML
    private Label dh4;

    @FXML
    private Label ah4;

    @FXML
    private AnchorPane ancora5;

    @FXML
    private Label ch5;

    @FXML
    private Label dh5;

    @FXML
    private Label ah5;

    @FXML
    private AnchorPane ancora6;

    @FXML
    private Label ch6;

    @FXML
    private Label dh6;

    @FXML
    private Label ah6;

    @FXML
    private AnchorPane ancora7;

    @FXML
    private Label ch7;

    @FXML
    private Label dh7;

    @FXML
    private Label ah7;

    @FXML
    private AnchorPane ancora8;

    @FXML
    private Label ch8;

    @FXML
    private Label dh8;

    @FXML
    private Label ah8;

    @FXML
    private AnchorPane ancora9;

    @FXML
    private Label ch9;

    @FXML
    private Label dh9;

    @FXML
    private Label ah9;
    
    @FXML
    private ImageView leao;
    
    
    @FXML
    private ImageView cassiano;

    
    @FXML
    private Label labelCanal;


       public SalaTVController(Hotel hotel) {
        this.hotel = hotel;
    }
       
        Semaphore descansar = new Semaphore(1);
        Semaphore assistir = new Semaphore(1);
        Semaphore printar = new Semaphore(1);
        Semaphore mutex = new Semaphore(1);
        Semaphore tv = new Semaphore(0);
        private final Hotel hotel;
        private final Thread hosp[] = new Thread[10];
        private final ImageView hospedes[] = new ImageView[10];
        private final ImageView canais[] = new ImageView[10];
        private final AudioClip audios[] = new AudioClip[10];
        private int referencia, info=0;
        private final Movimento move[] = new Movimento[10];
        private final long contagem[] = new long[10];
        boolean assistirDnv[] = new boolean[10];
        boolean verificarCanais=true, mesmosCanais=false;
        
        public int assistindo = 0;
	public int canaltv= 0;

        
          
    private final String acerto = getClass().getResource("AcertouMizeravi.mp3").toString();
    private final String Dragon = getClass().getResource("DragonBall.mp3").toString();
    private final String crazy = getClass().getResource("CrazyFrog.mp3").toString();
    private final String minion = getClass().getResource("Minions.mp3").toString();
    private final String combat = getClass().getResource("MortalKombat.mp3").toString();
    private final String rock = getClass().getResource("RockNRoll.mp3").toString();
    private final String mario = getClass().getResource("SuperMarioWorld.mp3").toString();
    private final String top = getClass().getResource("TopGear.mp3").toString();
    private final String hino = getClass().getResource("HinoLeao.mp3").toString();
    private final String cassi = getClass().getResource("cassiano.mp3").toString();
    
        
        
        
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        canais[0] = cassiano;
        audios[0] = new AudioClip(cassi);

        canais[1] = DB;
        audios[1] = new AudioClip(Dragon);

        canais[2] = Crazy;
        audios[2] = new AudioClip(crazy);
        
        canais[3] = Top;
        audios[3] = new AudioClip(top);
        
        canais[4] = Mortal;
        audios[4] = new AudioClip(combat);
        
        canais[5] = Rock;
        audios[5] = new AudioClip(rock);
        
        canais[6] = Mario;
        audios[6] = new AudioClip(mario);
        
        canais[7] = Minions;
        audios[7] = new AudioClip(minion);
        
        canais[8] = leao;
        audios[8] = new AudioClip(hino);
        
        canais[9] = Acerto;
        audios[9] = new AudioClip(cassi);
        
       
        
        
        hospedes[0] = hospede1;
        hospedes[1] = hospede2;
        hospedes[2] = hospede3;
        hospedes[3] = hospede4;
        hospedes[4] = hospede5;
        hospedes[5] = hospede6;
        hospedes[6] = hospede7;
        hospedes[7] = hospede8;
        hospedes[8] = hospede9;
        hospedes[9] = hospede10;
        
        
        criarHospedes();
    
        
    } 


    private void print(Label label, String x) {
        Platform.runLater(() -> {
            label.setText(x);
        });
    }
    private void paint(AnchorPane i, String x){ 
        try {
            printar.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(SalaTVController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Platform.runLater(() -> {i.setStyle(x);});
        printar.release();
    }
    public void logLigarTv(int x){
        Platform.runLater(() -> {
            logText.appendText("\n["+LocalDateTime.now().getHour()+":" + LocalDateTime.now().getMinute()+":"
                    + LocalDateTime.now().getSecond()+"] - Hóspede " + hotel.getNome(x) + " ligou a TV no canal " + hotel.getCanalFav(x));
        });
    }
    public void logAssistir(int x){
        Platform.runLater(() -> {
            logText.appendText("\n["+LocalDateTime.now().getHour()+":" + LocalDateTime.now().getMinute()+":"
                    + LocalDateTime.now().getSecond()+"] - Hóspede " + hotel.getNome(x) + " está assistindo no canal "+ hotel.getCanalFav(x));
        });
    }
    public void logDescansar(int x){
        Platform.runLater(() -> {
            logText.appendText("\n["+LocalDateTime.now().getHour()+":" + LocalDateTime.now().getMinute()+":"
                    + LocalDateTime.now().getSecond()+"] Hóspede " + hotel.getNome(x) + " está descansando");
        });
    }
    public void logDesligarTv(int x){
        Platform.runLater(() -> {
            logText.appendText("\n["+LocalDateTime.now().getHour()+":" + LocalDateTime.now().getMinute()+":"
                    + LocalDateTime.now().getSecond()+"] - Hóspede " + hotel.getNome(x) + " desligou a TV");
        });
    }
    
    public void mudarCanal(){//Seleção de canais da TV
        if(hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName())) == hotel.getCanalTv(0)){
            canais[0].setVisible(true);
            audios[0].play();
            canais[1].setVisible(false);
            audios[1].stop();
            canais[2].setVisible(false);
            audios[2].stop();
            canais[3].setVisible(false);
            audios[3].stop();
            canais[4].setVisible(false);
            audios[4].stop();
            canais[5].setVisible(false);
            audios[5].stop();
            canais[6].setVisible(false);
            audios[6].stop();
            canais[7].setVisible(false);
            audios[7].stop();
            canais[8].setVisible(false);
            audios[8].stop();
            canais[9].setVisible(false);
            audios[9].stop();
            
        }
        if(hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName())) == hotel.getCanalTv(1)){
            
            canais[0].setVisible(false);
            audios[0].stop();
            canais[1].setVisible(true);
            audios[1].play();
            canais[2].setVisible(false);
            audios[2].stop();
            canais[3].setVisible(false);
            audios[3].stop();
            canais[4].setVisible(false);
            audios[4].stop();
            canais[5].setVisible(false);
            audios[5].stop();
            canais[6].setVisible(false);
            audios[6].stop();
            canais[7].setVisible(false);
            audios[7].stop();
            canais[8].setVisible(false);
            audios[8].stop();
            canais[9].setVisible(false);
            audios[9].stop();
        }
        if(hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName())) == hotel.getCanalTv(2)){
            canais[0].setVisible(false);
            audios[0].stop();
            canais[1].setVisible(false);
            audios[1].stop();
            canais[2].setVisible(true);
            audios[2].play();
            canais[3].setVisible(false);
            audios[3].stop();
            canais[4].setVisible(false);
            audios[4].stop();
            canais[5].setVisible(false);
            audios[5].stop();
            canais[6].setVisible(false);
            audios[6].stop();
            canais[7].setVisible(false);
            audios[7].stop();
            canais[8].setVisible(false);
            audios[8].stop();
            canais[9].setVisible(false);
            audios[9].stop();
        }
        if(hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName())) == hotel.getCanalTv(3)){
            canais[0].setVisible(false);
            audios[0].stop();
            canais[1].setVisible(false);
            audios[1].stop();
            canais[2].setVisible(false);
            audios[2].stop();
            canais[3].setVisible(true);
            audios[3].play();
            canais[4].setVisible(false);
            audios[4].stop();
            canais[5].setVisible(false);
            audios[5].stop();
            canais[6].setVisible(false);
            audios[6].stop();
            canais[7].setVisible(false);
            audios[7].stop();
            canais[8].setVisible(false);
            audios[8].stop();
            canais[9].setVisible(false);
            audios[9].stop();
        }
        if(hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName())) == hotel.getCanalTv(4)){
           canais[0].setVisible(false);
            audios[0].stop();
            canais[1].setVisible(false);
            audios[1].stop();
            canais[2].setVisible(false);
            audios[2].stop();
            canais[3].setVisible(false);
            audios[3].stop();
            canais[4].setVisible(true);
            audios[4].play();
            canais[5].setVisible(false);
            audios[5].stop();
            canais[6].setVisible(false);
            audios[6].stop();
            canais[7].setVisible(false);
            audios[7].stop();
            canais[8].setVisible(false);
            audios[8].stop();
            canais[9].setVisible(false);
            audios[9].stop();
            
            
        }
        if(hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName())) == hotel.getCanalTv(5)){
            canais[0].setVisible(false);
            audios[0].stop();
            canais[1].setVisible(false);
            audios[1].stop();
            canais[2].setVisible(false);
            audios[2].stop();
            canais[3].setVisible(false);
            audios[3].stop();
            canais[4].setVisible(false);
            audios[4].stop();
            canais[5].setVisible(true);
            audios[5].play();
            canais[6].setVisible(false);
            audios[6].stop();
            canais[7].setVisible(false);
            audios[7].stop();
            canais[8].setVisible(false);
            audios[8].stop();
            canais[9].setVisible(false);
            audios[9].stop();
        }
        if(hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName())) == hotel.getCanalTv(6)){
             canais[0].setVisible(false);
            audios[0].stop();
            canais[1].setVisible(false);
            audios[1].stop();
            canais[2].setVisible(false);
            audios[2].stop();
            canais[3].setVisible(false);
            audios[3].stop();
            canais[4].setVisible(false);
            audios[4].stop();
            canais[5].setVisible(false);
            audios[5].stop();
            canais[6].setVisible(true);
            audios[6].play();
            canais[7].setVisible(false);
            audios[7].stop();
            canais[8].setVisible(false);
            audios[8].stop();
            canais[9].setVisible(false);
            audios[9].stop();
        }
        if(hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName())) == hotel.getCanalTv(7)){
             canais[0].setVisible(false);
            audios[0].stop();
            canais[1].setVisible(false);
            audios[1].stop();
            canais[2].setVisible(false);
            audios[2].stop();
            canais[3].setVisible(false);
            audios[3].stop();
            canais[4].setVisible(false);
            audios[4].stop();
            canais[5].setVisible(false);
            audios[5].stop();
            canais[6].setVisible(false);
            audios[6].stop();
            canais[7].setVisible(true);
            audios[7].play();
            canais[8].setVisible(false);
            audios[8].stop();
            canais[9].setVisible(false);
            audios[9].stop();
        }
         if(hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName())) == hotel.getCanalTv(8)){
           canais[0].setVisible(false);
            audios[0].stop();
            canais[1].setVisible(false);
            audios[1].stop();
            canais[2].setVisible(false);
            audios[2].stop();
            canais[3].setVisible(false);
            audios[3].stop();
            canais[4].setVisible(false);
            audios[4].stop();
            canais[5].setVisible(false);
            audios[5].stop();
            canais[6].setVisible(false);
            audios[6].stop();
            canais[7].setVisible(false);
            audios[7].stop();
            canais[8].setVisible(true);
            audios[8].play();
            canais[9].setVisible(false);
            audios[9].stop();
        }
        if(hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName())) == hotel.getCanalTv(9)){
             canais[0].setVisible(false);
            audios[0].stop();
            canais[1].setVisible(false);
            audios[1].stop();
            canais[2].setVisible(false);
            audios[2].stop();
            canais[3].setVisible(false);
            audios[3].stop();
            canais[4].setVisible(false);
            audios[4].stop();
            canais[5].setVisible(false);
            audios[5].stop();
            canais[6].setVisible(false);
            audios[6].stop();
            canais[7].setVisible(false);
            audios[7].stop();
            canais[8].setVisible(false);
            audios[8].stop();
            canais[9].setVisible(true);
            audios[9].play();
        }
        
      
        
    }
    
    
      public void thread(){  
       
        if (Integer.parseInt(Thread.currentThread().getName()) == 0) {
            print(ch0, Integer.toString(hotel.getCanalFav(0)));
            print(ah0, Integer.toString(hotel.getTemposThreadsTV(0)));
            print(dh0, Integer.toString(hotel.getTemposThreadsDesc(0)));
            ancora0.setOpacity(1);
            
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 1) {
            print(ch1, Integer.toString(hotel.getCanalFav(1)));
            print(ah1, Integer.toString(hotel.getTemposThreadsTV(1)));
            print(dh1, Integer.toString(hotel.getTemposThreadsDesc(1)));
            ancora1.setOpacity(1);
 
    
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 2) {
            print(ch2, Integer.toString(hotel.getCanalFav(2)));
            print(ah2, Integer.toString(hotel.getTemposThreadsTV(2)));
            print(dh2, Integer.toString(hotel.getTemposThreadsDesc(2)));
            ancora2.setOpacity(1);
          
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 3) {
            print(ch3, Integer.toString(hotel.getCanalFav(3)));
            print(ah3, Integer.toString(hotel.getTemposThreadsTV(3)));
            print(dh3, Integer.toString(hotel.getTemposThreadsDesc(3)));
            ancora3.setOpacity(1);
           
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 4) {
            print(ch4, Integer.toString(hotel.getCanalFav(4)));
            print(ah4, Integer.toString(hotel.getTemposThreadsTV(4)));
            print(dh4, Integer.toString(hotel.getTemposThreadsDesc(4)));
            ancora4.setOpacity(1);
          
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 5) {
            print(ch5, Integer.toString(hotel.getCanalFav(5)));
            print(ah5, Integer.toString(hotel.getTemposThreadsTV(5)));
            print(dh5, Integer.toString(hotel.getTemposThreadsDesc(5)));
            ancora5.setOpacity(1);
          
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 6) {
            print(ch6, Integer.toString(hotel.getCanalFav(6)));
            print(ah6, Integer.toString(hotel.getTemposThreadsTV(6)));
            print(dh6, Integer.toString(hotel.getTemposThreadsDesc(6)));
            ancora6.setOpacity(1);
     
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 7) {
            print(ch7, Integer.toString(hotel.getCanalFav(7)));
            print(ah7, Integer.toString(hotel.getTemposThreadsTV(7)));
            print(dh7, Integer.toString(hotel.getTemposThreadsDesc(7)));
            ancora7.setOpacity(1);
         
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 8) {
            print(ch8, Integer.toString(hotel.getCanalFav(8)));
            print(ah8, Integer.toString(hotel.getTemposThreadsTV(8)));
            print(dh8, Integer.toString(hotel.getTemposThreadsDesc(8)));
            ancora8.setOpacity(1);
         
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 9) {
            print(ch9, Integer.toString(hotel.getCanalFav(9)));
            print(ah9, Integer.toString(hotel.getTemposThreadsTV(9)));
            print(dh9, Integer.toString(hotel.getTemposThreadsDesc(9)));
            ancora9.setOpacity(1);
        
        }   
        
        contagem[Integer.parseInt(Thread.currentThread().getName())] = System.currentTimeMillis();
        while (contagem[Integer.parseInt(Thread.currentThread().getName())] > (System.currentTimeMillis() - 500)) {
}
      

    while (true){
        try {
            mutex.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(SalaTVController.class.getName()).log(Level.SEVERE, null, ex);
        }

            if(assistindo == 0 || hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName())) == canaltv){
                if(assistindo == 0) {
                                           
					canaltv = hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName()));
                                         Platform.runLater(() -> {labelCanal.setText(Integer.toString(canaltv));
                                          logLigarTv(Integer.parseInt(Thread.currentThread().getName()));//Adiciona ao log que a thread entrou na sala e ligou a Tv
                                         });
                                         logLigarTv(Integer.parseInt(Thread.currentThread().getName()));
                                        
                                         
                }
                 
                assistindo++;
               
                  mudarCanal();
                
                mutex.release();
                
		assistir();
            	assistindo--;
                
                try {
                mutex.acquire();
                } catch (InterruptedException ex) {
                Logger.getLogger(SalaTVController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                if(assistindo  == 0){  
                    
                    logDesligarTv(Integer.parseInt(Thread.currentThread().getName())); //Thread desligou a TV
                    long garantia = System.currentTimeMillis();
                     while (garantia > System.currentTimeMillis() - 100) {}
                     canais[referencia].setVisible(false);
                    audios[referencia].stop();
                    Platform.runLater(() -> {
                     labelCanal.setText("");
                    
                });
                    
                    tv.release();
               
            
                }
                mutex.release();
               descansar();
            }else{
              mutex.release();
           try {
               tv.acquire();           
           } 
           catch (InterruptedException ex) {
               Logger.getLogger(SalaTVController.class.getName()).log(Level.SEVERE, null, ex);           
                
            }
                    }
             tv.release();
    }
      }
                                 
                     
      
      
public void criarHospedes() {
        for (int i = 0; i < hotel.getQtdHospedes(); i++) {
            hosp[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    thread();
                }
            });
            hosp[i].setName(Integer.toString(i));
            
            hotel.setCanalFav(i);
            move[i] = new Movimento(hospedes[i], i);
        }
        
        for (int i = 0; i < hotel.getQtdHospedes(); i++) {
            for (int j = 0; j < hotel.getQtdHospedes(); j++) {
                if(i!=j){
                    if(hotel.getCanalTv(i) == hotel.getCanalTv(j)){
                        hotel.setCanalTv(i);
                    }
                }
            }
        }
      for (int i = 0; i < hotel.getQtdHospedes(); i++) {
            hosp[i].start();
        }  
    }

    
 public void assistir() {
        try {
            assistir.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(SalaTVController.class.getName()).log(Level.SEVERE, null, ex);
        }
        contagem[Integer.parseInt(Thread.currentThread().getName())] = System.currentTimeMillis();
        while (contagem[Integer.parseInt(Thread.currentThread().getName())] > (System.currentTimeMillis() - 200)) {}
        logAssistir(Integer.parseInt(Thread.currentThread().getName()));
        
        if (Integer.parseInt(Thread.currentThread().getName()) == 0) {
            assistir.release();
            if(assistirDnv[0] || mesmosCanais){move[0].assistirDnv();}
            else{move[0].assistir();}
            
            contagem[0] = System.currentTimeMillis();
            while (contagem[0] > (System.currentTimeMillis() - 2000)) {}
            
            for (int i = hotel.getTemposThreadsTV(0) - 1; i >= 0; i--) {
                contagem[0] = System.currentTimeMillis();
                while (contagem[0] > (System.currentTimeMillis() - 1000)) {}
                print(ah0, Integer.toString(i));
            }
            print(ah0, Integer.toString(hotel.getTemposThreadsTV(0)));
        }
        
        if (Integer.parseInt(Thread.currentThread().getName()) == 1) {
       
            assistir.release();
            if(assistirDnv[1] || mesmosCanais){move[1].assistirDnv();} 
            else {move[1].assistir();}
            contagem[1] = System.currentTimeMillis();
            while (contagem[1] > (System.currentTimeMillis() - 2000)) {}            
            for (int i = hotel.getTemposThreadsTV(1) - 1; i >= 0; i--) {
                contagem[1] = System.currentTimeMillis();
                while (contagem[1] > (System.currentTimeMillis() - 1000)) {
                }
                print(ah1, Integer.toString(i));
            }
            print(ah1, Integer.toString(hotel.getTemposThreadsTV(1)));
        }
        
        if (Integer.parseInt(Thread.currentThread().getName()) == 2) {
            assistir.release();
            if(assistirDnv[2] || mesmosCanais){move[2].assistirDnv();} 
            else {move[2].assistir();}
            contagem[2] = System.currentTimeMillis();
            while (contagem[2] > (System.currentTimeMillis() - 2000)) {}
            for (int i = hotel.getTemposThreadsTV(2) - 1; i >= 0; i--) {
                contagem[2] = System.currentTimeMillis();
                while (contagem[2] > (System.currentTimeMillis() - 1000)) {
                }
                print(ah2, Integer.toString(i));
            }
            print(ah2, Integer.toString(hotel.getTemposThreadsTV(2)));
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 3) {
            assistir.release();
            if(assistirDnv[3]|| mesmosCanais){move[3].assistirDnv();}
            else{move[3].assistir();}
            
            contagem[3] = System.currentTimeMillis();
            while (contagem[3] > (System.currentTimeMillis() - 2000)) {}
            
            for (int i = hotel.getTemposThreadsTV(3) - 1; i >= 0; i--) {
                contagem[3] = System.currentTimeMillis();
                while (contagem[3] > (System.currentTimeMillis() - 1000)) {}
                print(ah3, Integer.toString(i));
            }
            print(ah3, Integer.toString(hotel.getTemposThreadsTV(3)));
        }
        
        if (Integer.parseInt(Thread.currentThread().getName()) == 4) {
            assistir.release();
            if(assistirDnv[4]|| mesmosCanais){move[4].assistirDnv();}
            else{move[4].assistir();}
            
            contagem[4] = System.currentTimeMillis();
            while (contagem[4] > (System.currentTimeMillis() - 2000)) {}
            
            for (int i = hotel.getTemposThreadsTV(4) - 1; i >= 0; i--) {
                contagem[4] = System.currentTimeMillis();
                while (contagem[4] > (System.currentTimeMillis() - 1000)) {}
                print(ah4, Integer.toString(i));
            }
            print(ah4, Integer.toString(hotel.getTemposThreadsTV(0)));
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 5) {
            assistir.release();
            if(assistirDnv[5]|| mesmosCanais){move[5].assistirDnv();}
            else{move[5].assistir();}
            
            contagem[5] = System.currentTimeMillis();
            while (contagem[5] > (System.currentTimeMillis() - 2000)) {}
            
            for (int i = hotel.getTemposThreadsTV(5) - 1; i >= 0; i--) {
                contagem[5] = System.currentTimeMillis();
                while (contagem[5] > (System.currentTimeMillis() - 1000)) {}
                print(ah5, Integer.toString(i));
            }
            print(ah5, Integer.toString(hotel.getTemposThreadsTV(5)));
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 6) {
            assistir.release();
            if(assistirDnv[6]|| mesmosCanais){move[6].assistirDnv();}
            else{move[6].assistir();}
            
            contagem[6] = System.currentTimeMillis();
            while (contagem[6] > (System.currentTimeMillis() - 2000)) {}
            
            for (int i = hotel.getTemposThreadsTV(6) - 1; i >= 0; i--) {
                contagem[6] = System.currentTimeMillis();
                while (contagem[6] > (System.currentTimeMillis() - 1000)) {}
                print(ah6, Integer.toString(i));
            }
            print(ah6, Integer.toString(hotel.getTemposThreadsTV(6)));
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 7) {
            assistir.release();
            if(assistirDnv[7]|| mesmosCanais){move[7].assistirDnv();}
            else{move[7].assistir();}
            
            contagem[7] = System.currentTimeMillis();
            while (contagem[7] > (System.currentTimeMillis() - 2000)) {}
            
            for (int i = hotel.getTemposThreadsTV(7) - 1; i >= 0; i--) {
                contagem[7] = System.currentTimeMillis();
                while (contagem[7] > (System.currentTimeMillis() - 1000)) {}
                print(ah7, Integer.toString(i));
            }
            print(ah7, Integer.toString(hotel.getTemposThreadsTV(7)));
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 8) {
            assistir.release();
            if(assistirDnv[8] || mesmosCanais){move[8].assistirDnv();}
            else{move[8].assistir();}
            
            contagem[8] = System.currentTimeMillis();
            while (contagem[8] > (System.currentTimeMillis() - 2000)) {}
            
            for (int i = hotel.getTemposThreadsTV(8) - 1; i >= 0; i--) {
                contagem[8] = System.currentTimeMillis();
                while (contagem[8] > (System.currentTimeMillis() - 1000)) {}
            print(ah8, Integer.toString(i));
            }
            print(ah8, Integer.toString(hotel.getTemposThreadsTV(8)));
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 9) {
            assistir.release();
            if(assistirDnv[9] || mesmosCanais){move[9].assistirDnv();}
            else{move[9].assistir();}
            
            contagem[9] = System.currentTimeMillis();
            while (contagem[9] > (System.currentTimeMillis() - 2000)) {}
            
            for (int i = hotel.getTemposThreadsTV(9) - 1; i >= 0; i--) {
                contagem[9] = System.currentTimeMillis();
                while (contagem[9] > (System.currentTimeMillis() - 1000)) {}
                print(ah9, Integer.toString(i));
            }
            print(ah9, Integer.toString(hotel.getTemposThreadsTV(9)));
        }
        
       
    }
    
        
         public void descansar() {
        try {
            descansar.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(SalaTVController.class.getName()).log(Level.SEVERE, null, ex);
        }
        logDescansar(Integer.parseInt(Thread.currentThread().getName()));
        
        if (Integer.parseInt(Thread.currentThread().getName()) == 0) {
            descansar.release();
            move[0].descansar();
            contagem[0] = System.currentTimeMillis();
            while (contagem[0] > (System.currentTimeMillis() - 1600)) {
            }
            
            for (int i = hotel.getTemposThreadsDesc(0) - 1; i >= 0; i--) {
                contagem[0] = System.currentTimeMillis();
                while (contagem[0] > (System.currentTimeMillis() - 1000)) {
                }
                print(dh0, Integer.toString(i));
            }
            print(dh0, Integer.toString(hotel.getTemposThreadsDesc(0)));
            
         
           if(canaltv==hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName()))){
                assistirDnv[0]=true;
            }
            else{
                assistirDnv[0]=false;
                move[0].bloquear();
                contagem[0] = System.currentTimeMillis();
                while (contagem[0] > (System.currentTimeMillis() - 2000)) {
                }
            }
        }
        
        if (Integer.parseInt(Thread.currentThread().getName()) == 1) {
            
            descansar.release();
            move[1].descansar();
            contagem[1] = System.currentTimeMillis();
            while (contagem[1] > (System.currentTimeMillis() - 1600)) {
            }
            
            for (int i = hotel.getTemposThreadsDesc(1) - 1; i >= 0; i--) {
                contagem[1] = System.currentTimeMillis();
                while (contagem[1] > (System.currentTimeMillis() - 1000)) {
                }
                print(dh1, Integer.toString(i));
            }
            print(dh1, Integer.toString(hotel.getTemposThreadsDesc(1)));
           
            if (canaltv == hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName()))) {
                assistirDnv[1] = true;
            } else {
                assistirDnv[1] = false;
                move[1].bloquear();
                contagem[1] = System.currentTimeMillis();
                while (contagem[1] > (System.currentTimeMillis() - 2000)) {
                }
            }         
        }
        
        if (Integer.parseInt(Thread.currentThread().getName()) == 2) {
            descansar.release();
            move[2].descansar();
            contagem[2] = System.currentTimeMillis();
            while (contagem[2] > (System.currentTimeMillis() - 1600)) {
            }
            
            
            for (int i = hotel.getTemposThreadsDesc(2) - 1; i >= 0; i--) {
                contagem[2] = System.currentTimeMillis();
                while (contagem[2] > (System.currentTimeMillis() - 1000)) {
                }
                print(dh2, Integer.toString(i));
            }
            print(dh2, Integer.toString(hotel.getTemposThreadsDesc(2)));
            
            
             if (canaltv == hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName()))) {
                assistirDnv[2] = true;
            } else {
                assistirDnv[2] = false;
                move[2].bloquear();
                contagem[2] = System.currentTimeMillis();
                while (contagem[2] > (System.currentTimeMillis() - 2000)) {
                }
            }
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 3) {
            descansar.release();
            move[3].descansar();
            contagem[3] = System.currentTimeMillis();
            while (contagem[3] > (System.currentTimeMillis() - 1600)) {
            }
            
            for (int i = hotel.getTemposThreadsDesc(3) - 1; i >= 0; i--) {
                contagem[3] = System.currentTimeMillis();
                while (contagem[3] > (System.currentTimeMillis() - 1000)) {
                }
                print(dh3, Integer.toString(i));
            }
            print(dh3, Integer.toString(hotel.getTemposThreadsDesc(3)));
            
          
            if(canaltv==hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName()))){
                assistirDnv[3]=true;
            }
            else{
                assistirDnv[3]=false;
                move[3].bloquear();
                contagem[3] = System.currentTimeMillis();
                while (contagem[3] > (System.currentTimeMillis() - 2000)) {
                }
            }
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 4) {
            descansar.release();
            move[4].descansar();
            contagem[4] = System.currentTimeMillis();
            while (contagem[4] > (System.currentTimeMillis() - 1600)) {
            }
            
            for (int i = hotel.getTemposThreadsDesc(4) - 1; i >= 0; i--) {
                contagem[4] = System.currentTimeMillis();
                while (contagem[4] > (System.currentTimeMillis() - 1000)) {
                }
                print(dh4, Integer.toString(i));
            }
            print(dh4, Integer.toString(hotel.getTemposThreadsDesc(4)));
            
            if(canaltv==hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName()))){
                assistirDnv[4]=true;
            }
            else{
                assistirDnv[4]=false;
                move[4].bloquear();
                contagem[4] = System.currentTimeMillis();
                while (contagem[4] > (System.currentTimeMillis() - 2000)) {
                }
            }
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 5) {
            descansar.release();
            move[5].descansar();
            contagem[5] = System.currentTimeMillis();
            while (contagem[5] > (System.currentTimeMillis() - 1600)) {
            }
            
            for (int i = hotel.getTemposThreadsDesc(5) - 1; i >= 0; i--) {
                contagem[5] = System.currentTimeMillis();
                while (contagem[5] > (System.currentTimeMillis() - 1000)) {
                }
                print(dh5, Integer.toString(i));
            }
            print(dh5, Integer.toString(hotel.getTemposThreadsDesc(5)));
            
            
             if(canaltv==hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName()))){
                assistirDnv[5]=true;
            }
            else{
                assistirDnv[5]=false;
                move[5].bloquear();
                contagem[5] = System.currentTimeMillis();
                while (contagem[5] > (System.currentTimeMillis() - 2000)) {
                }
            }
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 6) {
            descansar.release();
            move[6].descansar();
            contagem[6] = System.currentTimeMillis();
            while (contagem[6] > (System.currentTimeMillis() - 1600)) {
            }
            
            for (int i = hotel.getTemposThreadsDesc(6) - 1; i >= 0; i--) {
                contagem[6] = System.currentTimeMillis();
                while (contagem[6] > (System.currentTimeMillis() - 1000)) {
                }
                print(dh6, Integer.toString(i));
            }
            print(dh6, Integer.toString(hotel.getTemposThreadsDesc(6)));
            
            
            if(canaltv==hotel.getCanalFav(6)){
                assistirDnv[6]=true;
            }
            else{
                assistirDnv[6]=false;
                move[6].bloquear();
                contagem[6] = System.currentTimeMillis();
                while (contagem[6] > (System.currentTimeMillis() - 2000)) {
                }
            }
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 7) {
            descansar.release();
            move[7].descansar();
            contagem[7] = System.currentTimeMillis();
            while (contagem[7] > (System.currentTimeMillis() - 1600)) {
            }
            
            for (int i = hotel.getTemposThreadsDesc(7) - 1; i >= 0; i--) {
                contagem[7] = System.currentTimeMillis();
                while (contagem[7] > (System.currentTimeMillis() - 1000)) {
                }
                print(dh7, Integer.toString(i));
            }
            print(dh7, Integer.toString(hotel.getTemposThreadsDesc(7)));
            
            
             if(canaltv==hotel.getCanalFav(7)){
                assistirDnv[7]=true;
            }
            else{
                assistirDnv[7]=false;
                move[7].bloquear();
                contagem[7] = System.currentTimeMillis();
                while (contagem[7] > (System.currentTimeMillis() - 2000)) {
                }
            }
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 8) {
            descansar.release();
            move[8].descansar();
            contagem[8] = System.currentTimeMillis();
            while (contagem[8] > (System.currentTimeMillis() - 1600)) {
            }
            
            for (int i = hotel.getTemposThreadsDesc(8) - 1; i >= 0; i--) {
                contagem[8] = System.currentTimeMillis();
                while (contagem[8] > (System.currentTimeMillis() - 1000)) {
                }
                print(dh8, Integer.toString(i));
            }
            print(dh8, Integer.toString(hotel.getTemposThreadsDesc(8)));
            

           if(canaltv==hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName()))){
                assistirDnv[8]=true;
            }
            else{
                assistirDnv[8]=false;
                move[8].bloquear();
                contagem[8] = System.currentTimeMillis();
                while (contagem[8] > (System.currentTimeMillis() - 2000)) {
                }
            }
        }
        if (Integer.parseInt(Thread.currentThread().getName()) == 9) {
            descansar.release();
            move[9].descansar();
            contagem[9] = System.currentTimeMillis();
            while (contagem[9] > (System.currentTimeMillis() - 1600)) {
            }
            
            for (int i = hotel.getTemposThreadsDesc(9) - 1; i >= 0; i--) {
                contagem[9] = System.currentTimeMillis();
                while (contagem[9] > (System.currentTimeMillis() - 1000)) {
                }
                print(dh9, Integer.toString(i));
            }
            print(dh9, Integer.toString(hotel.getTemposThreadsDesc(9)));
          
             if(canaltv==hotel.getCanalFav(Integer.parseInt(Thread.currentThread().getName()))){
                assistirDnv[9]=true;
            }
            else{
                assistirDnv[9]=false;
                move[9].bloquear();
                contagem[9] = System.currentTimeMillis();
                while (contagem[9] > (System.currentTimeMillis() - 2000)) {
                }
            }
        }
    }
           
        




}



    
    
    
    
    
    
    
    
    
    
    
    
    
    

