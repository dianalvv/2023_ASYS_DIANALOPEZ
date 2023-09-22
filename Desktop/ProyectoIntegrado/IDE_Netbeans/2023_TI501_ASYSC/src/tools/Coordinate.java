/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author Diana
 */
public class Coordinate {
    public static final float XMIN = -20.0f;
    public static final float YMIN = -20.0f;
    public static final float XMAX = 20.0f;
    public static final float YMAX = 20.0f;
    
    public static final float XSCR = 300;
    public static final float YSCR= 300;
    
    public static int toScreenX(float x){
        //return (int) (x * XSCR / XMAX);
        return (int) ((x - XMIN) * XSCR/ (XMAX- XMIN) );

}
    public static int toScreenY(float y){
        //return (int)((YMAX - y ) * YSCR / YMAX);
        return (int)(( y - YMAX ) * YSCR / (YMIN-YMAX));
    }
    
    
}
