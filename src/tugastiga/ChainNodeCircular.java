/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugastiga;

/**
 *
 * @author user
 */
public class ChainNodeCircular {
    Object element;
    ChainNodeCircular next;
    ChainNodeCircular last;
    
    ChainNodeCircular(){
       
    }
    ChainNodeCircular(Object element){
        this.element=element;
    }
    ChainNodeCircular(Object element, ChainNodeCircular next){
        this.element=element;
        this.next=next;
    }

    public  void setLast(ChainNodeCircular last) {
        this.last = last;
    }
}