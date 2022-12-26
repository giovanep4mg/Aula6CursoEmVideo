
package aula6cursoemvideo;
/* implements >  o ControleRemoto vai receber os metodos que estão na interface Controlador
  quando estiver na classe ControleRemoto  ai vai ser modificado .

*/
public class ControleRemoto implements Controlador {
    
    // atributos todos privados para serem protegidos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //construtor

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    

     // metodos de acesso

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

   ///>> metodos interface

    @Override
    public void ligar() {
   // vai tratar possiveis erros      
        try {
            
          // vai na variavel "ligado" e muda para "true" > verdadeiro
            this.setLigado(true);
            
         //exibir mensagem se está ligado
          //  System.out.println("Esta ligado ");
            
         // se deu erro vai exibir uma mensagem   
        } catch (Exception e) {
            System.out.println("ERRO, não está ligando");
        }
    }

    @Override
    public void desligar() {
    // vai tratar possiveis erros      
        try {
            
          // vai na variavel "ligado" e muda para "false" > falso
            this.setLigado(false);
            
         //exibir mensagem se está ligado
           // System.out.println("Esta desligando.... ");
            
         // se deu erro vai exibir uma mensagem   
        } catch (Exception e) {
            System.out.println("ERRO, não está desligano....");
        }

    }
    
    
    @Override
    public void abrirMenu() {
         // vai tratar possiveis erros      
        try {
          // vai na variavel "ligado" e muda para "false" > falso
            System.out.println("_________________________________________");
            
            System.out.println("Está ligado "+this.isLigado());
            
            System.out.println("Está tocando "+this.isTocando());
            
            System.out.println("Volume "+this.getVolume());
            for(int i = 0; i <= this.getVolume(); i+= 10){
                 System.out.println("|");            
            }
            
        
         // se deu erro vai exibir uma mensagem   
        } catch (Exception e) {
            System.out.println("ERRO, menu não está funcionando ....");
        }

    }
    
    @Override
    public void fecharMenu() {
       // vai tratar possiveis erros      
        try {
            
          // vai exibir mensagem que está fechando o menu
            System.out.println("Fechando o menu....");  
         
         // se deu erro vai exibir uma mensagem   
        } catch (Exception e) {
            System.out.println("ERRO, fechar  menu não está funcionando ....");
        }

    }
    
    @Override
    public void menosVolume() {
       // vai tratar possiveis erros      
        try {
          // se estiver ligado
           if(this.isLigado()){
               
            // vai na variavel " volume" , vê o que tem lá ,e diminui 10
              this.setVolume(this.getVolume() - 10);
              
              // exibi mensagem que está diminuindo o volume 
          //  System.out.println("Diminuindo o volume ");
          
          
            //senao
           }   else {
               
            // exibir mensagem que deu erro ao aumentar o volume
               System.out.println("Erro ao diminuir o volume ");
           }       
          // se deu erro no codigo vai exibir uma mensagem   
        } catch (Exception e) {
            System.out.println("ERRO, menos volume não está funcionando ....");
        }

    }
    
    
     @Override
    public void maisVolume() {
       // vai tratar possiveis erros      
        try {
            
          // se estiver ligado
           if(this.isLigado()){
               
            // vai na variavel " volume" , vê o que tem lá ,e adiciona mais 10
              this.setVolume(this.getVolume() + 10);
              
              
              // exibir mensagem que está aumentando o volume
         //   System.out.println("Aumentando o volume ");
         
            //senao
           }   else {
               
            // exibir mensagem que deu erro ao aumentar o volume
               System.out.println("Erro ao aumentar o volume ");
           }       
          // se deu erro no código vai exibir uma mensagem   
        } catch (Exception e) {
            System.out.println("ERRO, mais volume não está funcionando ....");
        }

    }
    
     @Override
    public void ligarMudo() {
       // vai tratar possiveis erros      
        try {
            
          // se estiver ligado e se o volume for maior que zero 
           if(this.isLigado() && this.getVolume() > 0 ){
               
            // vai na variavel " volume" , vê o que tem lá ,e coloca em zero
              this.setVolume(0);
              
              //exibir mensagem que está no mudo
       //     System.out.println("Está no mudo ");
       
       
            //senao
           }  else {
               
            // exibir mensagem que deu erro ao colocar no mudo
               System.out.println("Erro ao colocar no mudo ");
           }       
          // se deu erro no código vai exibir uma mensagem   
        } catch (Exception e) {
            System.out.println("ERRO, ligar mudo não está funcionando ....");
        }

    }
    
     @Override
    public void desligarMudo() {
     // vai tratar possiveis erros      
        try {
            
          // se estiver ligado e se o volume for igual a  zero 
           if(this.isLigado() && this.getVolume() == 0 ){
               
            // vai na variavel " volume" ,e coloca em 50
              this.setVolume(50);
              
            // exibi mensagem que não está mais no mudo
  //        System.out.println("Não está mais no mudo  ");
  
  
            //senao
           } else {
               
            // exibir mensagem que deu erro ao colocar no mudo
               System.out.println("Erro ao sair do mudo ");
           }  
           
          // se deu erro no código vai exibir uma mensagem   
        } catch (Exception e) {
            System.out.println("ERRO, desligar mudo não está funcionando ....");
        }

    }
    
     @Override
    public void play() {
     // vai tratar possiveis erros      
        try {
            
          // se estiver ligado e se Não estiver tocando 
           if(this.isLigado() && !(this.isTocando()) ){
               
            // vai na variavel " tocando " , e coloca como "true" verdadeiro
              this.setTocando(true);
              
              //exibi mensagem dizendo que está tocando
        //    System.out.println("Está tocando.. ");
               
            //senao
           }   else {
               
            // exibi mensagem que deu erro ao colocar no mudo
               System.out.println("Erro ao tocar...");
               
           }       
          // se deu erro no código vai exibir uma mensagem   
        } catch (Exception e) {
            System.out.println("ERRO, play não está funcionando ....");
        }
        
     
    }
    
    
     @Override
    public void pause() {
     // vai tratar possiveis erros      
        try {
            
          // se estiver ligado e se estiver tocando 
           if(this.isLigado() && this.isTocando() ){
               
            // vai na variavel " tocando " , e coloca como "false" falso
              this.setTocando(false);
               System.out.println("Não está  tocando.. ");
               
            //senao
           }   else {
               
            // exibir mensagem que deu erro ao colocar no mudo
       //    System.out.println("Erro ao parar de  tocar...");
       
           }       
           
          // se deu erro no código vai exibir uma mensagem   
        } catch (Exception e) {
            System.out.println("ERRO, pause não está funcionando ....");
        }
    
    } 
        
        
}// <<<< fim classe

    
    
    
    

