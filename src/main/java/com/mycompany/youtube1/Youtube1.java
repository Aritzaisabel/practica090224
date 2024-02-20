/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube1;

public class Youtube1 {

   // private static String contenido;

    public static void main(String[] args) {
        Usuario usuario=new Usuario(" Limon");
        Video video=new Video(" aprendiendo java",2400,"http;//limon.com");     
        usuario.setsubirVideo(video);
        
        Usuario usuario2=new Usuario("perla");
        usuario.mostrarInfoUsuario();
            Comentario comentario1 =new Comentario(" buen video");
            System.out.println("El usuario "+usuario2.getNombre()+" publico el comentario "+comentario1.getContenido());
        
          

        Vizualizacion visualizacion=new Vizualizacion("visualizaciones recientes");         
      //visualizacion.setEspectador(usuario);
    visualizacion.mostrarInfoVizualizacion(); 
        
    
}}
                
                 
