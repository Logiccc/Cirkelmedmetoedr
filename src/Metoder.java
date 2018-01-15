
/*
    David Persson
    Räkna ut cirkelns omkretts och area med hjälp av metoder.
    2018-01-15
 */


import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Metoder {
    public static void main(String[]args){
        String radien;
        radien = JOptionPane.showInputDialog(null, "Radien tack");
        double radie = Double.parseDouble(radien);
        double pi = 3.1415;
        double omkrets = RaknaUtOmkrets(radie, pi);
        double area = RaknaUtArea(pi, radie, radie);

        String svar1 = Double.toString(omkrets);
        String svar2 = Double.toString(area);
        showMessageDialog(null, svar1 + "cm" + "\n" + svar2 + "cm");

    }

    private static double RaknaUtArea(double pi, double radie, double radie1) {
        return pi*radie*radie;
    }

    private static double RaknaUtOmkrets(double radie, double pi) {
        return 2.0*radie*pi;
    }
}

class Cirkel{


}