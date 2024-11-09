/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectfinal;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class Home extends JPanel{
    private ImageIcon bg = new ImageIcon("src/pic/BgIm.png");
    private Image bgImage =bg.getImage().getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
    private ImageIcon bgIcon = new ImageIcon(bgImage);
    
    private ImageIcon s = new ImageIcon("src/pic/start.png");
    private Image sImage =s.getImage().getScaledInstance(280, 180, Image.SCALE_SMOOTH);
    private ImageIcon sIcon = new ImageIcon(sImage);
    public JButton jbtStart = new JButton(sIcon);
    
    
    private ImageIcon e = new ImageIcon("src/pic/exit.png");
    private Image eImage =e.getImage().getScaledInstance(280, 180, Image.SCALE_SMOOTH);
    private ImageIcon eIcon = new ImageIcon(eImage);
    public JButton jbtExit = new JButton(eIcon);
    
    
    Home(){
        setLayout(null);
        jbtStart.setBounds(240, 300, 280, 180);
        jbtStart.setContentAreaFilled(false);
        jbtStart.setBorderPainted(false);
        jbtStart.setFocusPainted(false);
        add(jbtStart);
        
        jbtExit.setBounds(630, 300,280,180);
        jbtExit.setContentAreaFilled(false);
        jbtExit.setBorderPainted(false);
        jbtExit.setFocusPainted(false);
        add(jbtExit);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bg.getImage(),0,0,1200,700,this);
        g.setColor(Color.RED);
        g.setFont(new Font("2005_iannnnnTKO",Font.CENTER_BASELINE,90));
        g.drawString("APPLE GURL", 300, 200);
        
    
    }
}
