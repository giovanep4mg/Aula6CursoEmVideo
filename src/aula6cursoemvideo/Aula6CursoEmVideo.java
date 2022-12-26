
package aula6cursoemvideo;
/*
 * aula sobre encapsulamento , falando sobre interface 
 * 
 * a interface será usada para você se comunicar com a capsula
 * 
 */

public class Aula6CursoEmVideo {

  
    public static void main(String[] args) {
        // criando objeto controle remoto 
        ControleRemoto c = new ControleRemoto();
        
        // comandos do controle
        c.abrirMenu();
        c.fecharMenu();
        
        c.ligar();
        c.play();
        c.maisVolume();
    
        c.maisVolume();
       
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.ligarMudo();
        c.desligarMudo();
        c.pause();
        c.play();
        c.pause();
        c.desligar();
        c.abrirMenu();
        
        
    }
    
}
