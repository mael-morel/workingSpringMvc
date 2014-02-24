package com.mael.common.controller;

import com.mael.common.domain.song.Song;
import com.mael.common.service.SongService;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    
    @Autowired
    private SongService songService;

	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public ModelAndView getSongs(ModelAndView mav) {
            
//            System.out.println("bonjour");
            
            List<Integer> listIds = Arrays.asList(1, 2, 3);
            mav.setViewName("hello");
            mav.addObject("listSongs", songService.getSongsById(listIds));
            
            List<Song> listSOngs = songService.getSongsById(listIds);
            for (Iterator<Song> it = listSOngs.iterator(); it.hasNext();) {
                System.out.println(it.next().getLength());              
            }
//            System.out.println(songService.getSongsById(listIds));
            
            return mav;

	}
/*	// /welcome/welcome/welcome2
	@RequestMapping(value = "/welcome/welcome2", method = RequestMethod.GET)
	public String printWelcome2(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World 2");
		return "hello";

	}
	// /welcome/w3
	@RequestMapping(value = "/w3", method = RequestMethod.GET)
	public String printWelcome3(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World 3");
		return "hello";

	}	*/
}