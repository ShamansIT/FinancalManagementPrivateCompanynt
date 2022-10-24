package FinancalManagment;

import Setings.Text;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Financial {
    public static void main(String[] args) {
    init();
    }
    public static void init(){
        Text.init();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/auto_radiographic_rg.ttf")));
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(Financial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
