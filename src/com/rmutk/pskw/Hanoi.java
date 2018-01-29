/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rmutk.pskw;

import javax.swing.JApplet;

/**
 *
 * @author admaun
 */
public class Hanoi extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    private MainPanel  MP=new MainPanel();
    
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        add (MP);
        MP.setBounds(10, 10, 850, 300);
                
        
    }
    // TODO overwrite start(), stop() and destroy() methods
}
