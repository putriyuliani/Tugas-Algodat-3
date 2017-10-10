/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugastiga;

import javafx.scene.Node;

/**
 *
 * @author user
 */
public class ChainCircular implements LinearList {
    protected ChainNodeCircular firsNode;
    protected Node last;
    protected int size;
    
    public ChainCircular(int initialcapacity){
    }
    public ChainCircular(){
        this(0);
    }
    @Override
    public boolean isEmpty(){
        return size==0;     
    }
    @Override
    public int size() {
        return size;
    }
}
