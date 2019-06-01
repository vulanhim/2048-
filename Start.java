/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048;

import javax.swing.JFrame;

/**
 *
 * @author LeeBen
 */
public class Start {
    public static void main(String[] args){
        Game game = new Game();
        JFrame window = new JFrame("2048");
        window.setResizable(false);
        window.add(game);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        game.start();
    }
}
