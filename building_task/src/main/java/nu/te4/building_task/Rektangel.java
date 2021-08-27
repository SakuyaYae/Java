/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.building_task;

/**
 *
 * @author Elev
 */
public class Rektangel implements Comparable<Rektangel> {
    private int höjd;
    private int bredd;
    
    public Rektangel(int bredd, int höjd){
    this.bredd = bredd;
    this.höjd = höjd;
    }
    
    public int get_höjd(){
        return höjd;
    }
    
    public void set_höjd(int höjd){
        this.höjd = höjd;
    }
    
     public int get_bredd(){
        return höjd;
    }
    
    public void set_bredd(int bredd){
        this.bredd = bredd;
    }
    
    public int area(){
        int rek_area = höjd * bredd;
        return rek_area;
    }
    
    
        
    @Override
    public int compareTo(Rektangel o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
