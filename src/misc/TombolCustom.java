/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.border.Border;
/**
 *
 * @author Aditio
 */
public class TombolCustom extends JButton implements MouseListener, MouseMotionListener {
    //Warna tombol
    private Color colorNormal = new Color(100, 255, 90);
    private Color colorHover = new Color(255, 255, 255);
    private Color colorPressed = new Color(15, 20, 15);
    

    private Border bordeMoved = javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255));

    //Warna teks pada tombol
    private Color colorTextNormal = new Color(0, 0, 0);
    private Color colorTextHover = new Color(0, 0, 0);
    private Color colorTextPressed = new Color(255, 255, 255);
    

    private Font f = new Font("Segoe UI", Font.BOLD, 14);

    //Constructor class
    @SuppressWarnings("LeakingThisInConstructor")
    public TombolCustom() {
        this.setFont(f);
        this.setPreferredSize(new Dimension(150, 35));
        this.setSize(new Dimension(150, 35));
        this.setBorder(null);
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setBackground(this.colorNormal);
        this.setForeground(this.colorTextNormal);
        this.setOpaque(true);
        this.setVisible(true);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    //the image is painted with width and height dimensions equal to the height of the jbutton
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    public void mouseClicked(MouseEvent e) {
    }

    //When the button is pressed the background and text colors are changed
    public void mousePressed(MouseEvent e) {
        this.setForeground(this.colorTextPressed);
        this.setBackground(this.colorPressed);
    }
    //When the mouse is lifted from the jbutton, the original colors are restored
    public void mouseReleased(MouseEvent e) {
        this.setBackground(this.colorNormal);
        this.setForeground(this.colorTextNormal);
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
        this.setBorder(null);
        this.setBackground(this.colorNormal);
        this.setForeground(this.colorTextNormal);
    }

    public Color getColorPressed() {
        return colorPressed;
    }

    public void setColorPressed(Color colorPressed) {
        this.colorPressed = colorPressed;
    }

    public Color getColorTextPressed() {
        return colorTextPressed;
    }

    public void setColorTextPressed(Color colorTextPressed) {
        this.colorTextPressed = colorTextPressed;
    }

    public Color getColorHover() {
        return colorHover;
    }

    public void setColorHover(Color colorHover) {
        this.colorHover = colorHover;
    }

    public Color getColorTextHover() {
        return colorTextHover;
    }

    public void setColorTextHover(Color colorTextHover) {
        this.colorTextHover = colorTextHover;
    }

    public Color getColorNormal() {
        return colorNormal;
    }

    public void setColorNormal(Color colorNormal) {
        this.setBackground(colorNormal);
        this.colorNormal = colorNormal;
    }

    public Color getColorTextNormal() {
        return colorTextNormal;
    }

    public void setColorTextNormal(Color colorTextNormal) {
        this.setForeground(colorTextNormal);
        this.colorTextNormal = colorTextNormal;
    }

    public Border getColorBorde() {
        return bordeMoved;
    }

    public void setColorBorde(Border bordeMoved) {
        this.bordeMoved = bordeMoved;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        this.setForeground(this.colorTextHover);
        this.setBackground(this.colorHover);
        this.setBorder(bordeMoved);
    }

}