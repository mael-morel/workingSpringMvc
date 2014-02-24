package com.mael.common.domain;

/**
 *
 * @author Mael
 */
public abstract class DomainObject {
    
    private String id;
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getClassName(){
        return this.getClass().getName();
    }
    
}
