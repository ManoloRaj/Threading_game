package src.com.inata.carapp.graphique;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CarPanel extends JPanel {
    List<VoitureGraphics> vgs = new ArrayList<>();
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(VoitureGraphics v: vgs){
            v.updatePosition();
            v.paint((Graphics2D)g);
        }
    }

    public List<VoitureGraphics> getVgs() {
        return vgs;
    }

    public void setVgs(List<VoitureGraphics> vgs) {
        this.vgs = vgs;
    }
}
