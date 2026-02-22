/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
import java.util.HashMap;
public class IOU {
 
    private HashMap<String,Double> iou;
    
    public IOU(){
        iou = new HashMap<>();
    }
    public void setSum(String toWhom, double ammount){
        iou.put(toWhom, ammount);
        
    }
    public double howMuchDoIOweTo(String toWhom){
        
         return iou.getOrDefault(toWhom,0.0);
    }
    
    
}
