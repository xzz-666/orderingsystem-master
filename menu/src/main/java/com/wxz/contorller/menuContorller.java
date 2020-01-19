package com.wxz.contorller;

import com.wxz.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class menuContorller {
    @Autowired
    private  menuContorller menuContorller;

    @GetMapping("/All/{index}/{limit}")
    public List<Menu> All(@PathVariable("index") int index, @PathVariable("limit") int limit){
        return  menuContorller.All(index,limit);



    }


}
