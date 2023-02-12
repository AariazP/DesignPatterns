package org.alejandroArias.application;

import org.alejandroArias.model.Enchufable;
import org.alejandroArias.model.LamparaEstudio;
import org.alejandroArias.model.LamparaHogar;
import org.alejandroArias.model.LamparaHogarUKAdapter;

public class Main {
    public static void main(String[] args) {

        /*

           Imaginemos que en nuestra casa tenemos una dos lámparas, una de hogar y otra de estudio.
           Sin embargo, imaginemos que nos regalan una lámpara de UK (United Kingdom) estándar.
           Esta lámpara tiene un puerto diferente al que solemos usar en Latinoamérica. Para utilizarla
           debemos conseguir un adaptador válido para nuestro país.

           Esta misma idea es la que se aplica en el patrón Adapter. En este caso, la lámpara de UK
           es el objeto que queremos adaptar para que pueda ser usado en nuestro país.

           Si hacemos uso del método
           encenderLamparaHogar(new lamparaHogarUK());

           El compilador nos arrojará un error, ya que la clase LamparaHogarUK no implementa la interfaz
           Enchufable. Por eso es que crearemos un envoltorio que implemente la interfaz Enchufable
           y poder encender la lámpara de UK. (LamparaHogarUKAdapter)


         */

        /*
            Estas son las lámparas que tenemos en casa
            y que funcionan con los puertos estándar de Latinoamérica
         */
        LamparaEstudio lamparaEstudio = new LamparaEstudio();
        enchufarLamparaHogar(lamparaEstudio);
        desenchufarLamparaHogar(lamparaEstudio);

        System.out.println();


        LamparaHogar lamparaHogar = new LamparaHogar();
        enchufarLamparaHogar(lamparaHogar);
        desenchufarLamparaHogar(lamparaHogar);

        System.out.println();

        /*
            Esta es la lámpara de UK que nos regalaron
            y que no funciona con los puertos estándar de Latinoamérica
            Es por eso que debemos crear un adaptador para poder usarla
         */

        LamparaHogarUKAdapter lamparaHogarUKAdapter = new LamparaHogarUKAdapter();
        enchufarLamparaHogar(lamparaHogarUKAdapter);
        desenchufarLamparaHogar(lamparaHogarUKAdapter);


    }


    /**
     * Metodo que permite echufar un objeto que implemente la interfaz Enchufable
     * si no la implementa, no se pondrá en funcionamiento
     * @param enchufable objeto que implemente la interfaz Enchufable
     */
    public static void enchufarLamparaHogar(Enchufable enchufable){
        enchufable.enchufar(); //se enciende la lámpara
    }

    /**
     * Metodo que permite desenchufar un objeto que implemente la interfaz Enchufable
     * @param enchufable objeto que implemente la interfaz Enchufable
     */
    public static void desenchufarLamparaHogar(Enchufable enchufable){
        enchufable.desenchufar(); //se apaga la lámpara
    }





}