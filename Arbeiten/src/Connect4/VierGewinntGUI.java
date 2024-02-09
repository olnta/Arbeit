package Connect4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class VierGewinntGUI extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VierGewinntGUI gui= new VierGewinntGUI();
            gui.setVisible(true);
        });
    }

    public VierGewinntGUI() {
        setTitle("Vier Gewinnt");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        erstelleSpielfeldAnsicht();
        char aktuellerSpieler = 'X';
    }



    private void erstelleSpielfeldAnsicht() {
        JPanel spielfeldAnsicht = new JPanel(new GridLayout(6, 7));
        for (int i = 0; i < 42; i++) {
            JPanel zelle = new JPanel();
            zelle.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            handleZellenAktionen(zelle, i % 7);
            spielfeldAnsicht.add(zelle);
        }
        add(spielfeldAnsicht, BorderLayout.CENTER);
    }

    private void handleZellenAktionen(JPanel zelle, int spaltenIndex) {
        zelle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Zelle in Spalte " + spaltenIndex + " wurde gecklickt: ");
                // super.mouseClicked(e);
                //Der Code für die Aktion bei einem Klick
            }
        });
    }

    private void platziereSpielstein(JPanel zelle, char spieler){
        JLabel spielstein = new JLabel( String.valueOf(spieler));
        spielstein.setFont(new Font("Arial", Font.BOLD, 40));
        spielstein.setForeground(spieler == 'X' ? Color.RED : Color.BLUE);
        zelle.add(spielstein);

    }
}