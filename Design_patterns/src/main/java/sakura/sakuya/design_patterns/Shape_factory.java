/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakura.sakuya.design_patterns;

/**
 *
 * @author SakuyaYae
 */
public class Shape_factory {
    public I_shape getShape(String shape_type){
    if(shape_type.equalsIgnoreCase("RECTANGALE")){
        return new Rectangale();
    }
    else{
        return null;
    }
    
    
    }
}
