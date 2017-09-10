package com.caioguedes.giflib.controller;

import com.caioguedes.giflib.data.GifRepository;
import com.caioguedes.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FavoriteController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/favorites")
    public String listFavorites(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.findFavorites();
        modelMap.put("gifs", gifs);
        return "favorites";
    }
}
