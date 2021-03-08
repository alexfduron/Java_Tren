/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica_basica;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

/**
 *
 * @author alexfduron
 */
public class Dibujo {
    
    public static void AjustarColorNegro(Graphics g){
        
        g.setColor(Color.black);
        
    }
    
    public static void AjustarColorRojo(Graphics g){
        
        g.setColor(Color.red);
        
    }
    
    public static void AjustarColorAzul(Graphics g){
        
        g.setColor(Color.blue);
        
    }
    
    public static void AjustarColorVerde(Graphics g){
        
        g.setColor(Color.green);
        
    }
    
    public static void AjustarColorAmarillo(Graphics g){
        
        g.setColor(Color.yellow);
        
    }
    
    public static void AjustarColorNaranja(Graphics g){
        
        g.setColor(Color.orange);
        
    }
    
    public static void AjustarColorRosado(Graphics g){
        
        g.setColor(Color.pink);
        
    }
    
    public static void AjustarColor(Graphics g, String xColor){
        
        switch(xColor){
            
            case "Rojo" :
                AjustarColorRojo(g);
                break;
                
            case "Azul" :
                AjustarColorAzul(g);
                break;
                
            case "Verde" :
                AjustarColorVerde(g);
                break;
                
            case "Amarillo" :
                AjustarColorAmarillo(g);
                break;
                
            case "Naranja" :
                AjustarColorNaranja(g);
                break;
                
            case "Rosado" :
                AjustarColorRosado(g);
                break;
                
            default :
                AjustarColorNegro(g);
            
        }
        
    }
    
    
    
    public static void HacerLinea(Graphics g, int X1, int Y1, int X2, int Y2, String xColor){
        
        AjustarColor(g, xColor);
        g.drawLine(X1, Y1, X2, Y2);
        
    }
    
    public static void HacerCuadro(Graphics g, int X1, int Y1, int Ancho, int Alto, String xColor){
        
        AjustarColor(g, xColor);
        g.drawRect(X1, Y1, Ancho, Alto);
        
    }
    
    public static void HacerCuadroRelleno(Graphics g, int X1, int Y1, int Ancho, int Alto, String xColor){
        
        AjustarColor(g, xColor);
        g.fillRect(X1, Y1, Ancho, Alto);
        HacerCuadro(g, X1, Y1, Ancho, Alto, "");
        
    }
    
    public static void HacerCirculo(Graphics g, int Centro_X, int Centro_Y, int Diametro, String xColor){
        
        int X1 = Centro_X - Diametro / 2;
        
        int Y1 = Centro_Y - Diametro / 2;
        
        AjustarColor(g, xColor);
        
        g.drawOval(X1, Y1, Diametro, Diametro);
        
    }
    
    public static void HacerCirculoRelleno(Graphics g, int Centro_X, int Centro_Y, int Diametro, String xColor){
        
        int X1 = Centro_X - Diametro / 2;
        
        int Y1 = Centro_Y - Diametro / 2;
        
        AjustarColor(g, xColor);
        
        g.fillOval(X1, Y1, Diametro, Diametro);
        
        HacerCirculo(g, Centro_X, Centro_Y, Diametro, "");
        
    }
    
    public static void HacerCuadroRedondeado(Graphics g, int X1, int Y1, int Ancho, int Alto, int AnchoArco, int AltoArco, String xColor){
        
        AjustarColor(g, xColor);
        
        g.drawRoundRect(X1, Y1, Ancho, Alto, AnchoArco, AltoArco);
        
    }
    
    public static void HacerCuadroRedondeadoRelleno(Graphics g, int X1, int Y1, int Ancho, int Alto, int AnchoArco, int AltoArco, String xColor){
        
        AjustarColor(g, xColor);
        
        g.fillRoundRect(X1, Y1, Ancho, Alto, AnchoArco, AltoArco);
        
        HacerCuadroRedondeado(g, X1, Y1, Ancho, Alto, AnchoArco, AltoArco, "");
        
    }
    
    public static void HacerArco(Graphics g, int X1, int Y1, int Ancho, int Alto, int AngINI, int Ang, String xColor){
        
        AjustarColor(g, xColor);
        
        g.drawArc(X1, Y1, Ancho, Alto, AngINI, Ang);
        
        HacerLinea(g, X1 + Ancho / 2, Y1 + Alto / 2, X1 + Ancho / 2, Y1, "");
        
        HacerLinea(g, X1 + Ancho / 2, Y1 + Alto / 2, X1, Y1 + Alto / 2, "");
        
    }
    
    public static void HacerArcoRelleno(Graphics g, int X1, int Y1, int Ancho, int Alto, int AngINI, int Ang, String xColor){
        
        AjustarColor(g, xColor);
        
        g.fillArc(X1, Y1, Ancho, Alto, AngINI, Ang);
        
        HacerArco(g, X1, Y1, Ancho, Alto, AngINI, Ang, "");
        
    }
    
    public static void HacerPoligono(Graphics g, int[] valoresX, int[] valoresY, int Lados, String xColor){
        
        AjustarColor(g, xColor);
        
        Polygon Poli = new Polygon(valoresX, valoresY, Lados);
        
        g.drawPolygon(Poli);
        
    }
    
    public static void HacerPoligonoRelleno(Graphics g, int[] valoresX, int[] valoresY, int Lados, String xColor){
        
        AjustarColor(g, xColor);
        
        Polygon Poli = new Polygon(valoresX, valoresY, Lados);
        
        g.fillPolygon(Poli);
        
        HacerPoligono(g, valoresX, valoresY, Lados, "");
        
    }
    
    
}
