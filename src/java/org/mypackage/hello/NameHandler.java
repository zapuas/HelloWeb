/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mypackage.hello ;

/**
 *
 * @author DFuhri001
 */
import java.io.Serializable;

public class NameHandler implements Serializable
{
    private String name;
    public NameHandler () {
    name = null;
}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
    

