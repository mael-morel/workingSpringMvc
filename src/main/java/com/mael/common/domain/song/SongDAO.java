package com.mael.common.domain.song;

/**
 *
 * @author Mael
 */
public class SongDAO {
    
    private Song song;
    
    public Song getSongById(int id){
        if (id == 1){
            song = new Song("mySong1", 100, 1);
        }
        if (id == 2){
            song = new Song("mySong2", 200, 1);
        }
        if (id == 3){
            song = new Song("mySong3", 300, 3);
        }
        return song;
    }
    
}
