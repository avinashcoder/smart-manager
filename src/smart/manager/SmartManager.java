/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.manager;

/**
 *
 * @author Hacker
 */
public class SmartManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Splash splash=new Splash();
        splash.setVisible(true);
        Welcome welcome=new Welcome();
        try {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(40);
                splash.loadingnum.setText(String.valueOf(i)+" %");
                splash.pbar.setValue(i);
                if(i==100)
                {
                    splash.setVisible(false);
                    welcome.setVisible(true);
                }
            }
            
        } catch (Exception e) {
        }
                
    }
    
}
