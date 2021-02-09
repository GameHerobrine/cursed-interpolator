package net.glasslauncher.cursedinterpolator.gui;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class CursedMappingsPanel extends JDialog {

    public CursedMappingsPanel(JFrame parent) {
        super(parent);
        setModal(true);
        setBounds(0, 0, 400, 400);
        setLocationRelativeTo(parent);

        setVisible(true);
    }
}
