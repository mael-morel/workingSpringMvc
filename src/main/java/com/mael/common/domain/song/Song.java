package com.mael.common.domain.song;

import com.mael.common.domain.DomainObject;

/**
 *
 * @author Mael
 */
public class Song extends DomainObject{
    
    private String name;
    private int length;
    private int interpretId;

    public Song(String name, int length, int interpretId) {
        this.name = name;
        this.length = length;
        this.interpretId = interpretId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getInterpretId() {
        return interpretId;
    }

    public void setInterpretId(int interpretId) {
        this.interpretId = interpretId;
    }
    
    
}
