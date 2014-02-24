

package com.mael.common.service;

import com.mael.common.domain.song.Song;
import com.mael.common.domain.song.SongDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SongService {
    
    private final SongDAO songDao;

    public SongService() {
        this.songDao = new SongDAO();
    }

    /**
     * Returns a list of songs matching to the given ids
     * 
     * @param listId
     * @return ArrayList song 
     */
    public List<Song> getSongsById(List<Integer> listId){
        ArrayList<Song> song = new ArrayList();
        for (Iterator<Integer> itListId = listId.iterator(); itListId.hasNext();) {
            song.add(songDao.getSongById(itListId.next()));
        }
        return song;
    }
}
