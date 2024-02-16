/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube1;

/**
 *
 * @author alvar
 */
public class Youtube1 {

    public static void main(String[] args) {
        Usuario usuario=new Usuario(" limon");
        Video video=new Video(" aprendiendo java",2400,"http;//limon.com");
        usuario.setsubirVideo(video);
        usuario.mostrarInfoUsuario();
    }
}
