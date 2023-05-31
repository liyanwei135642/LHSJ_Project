package com.uvi.digital.web.rest;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyTest1 {

    @RequestMapping(value="/hello/{id}/{name}",method= RequestMethod.GET)
    public String doGet(@PathVariable("id") Integer id, @PathVariable("name") String name, @RequestParam int age){
        System.out.println("id:"+id+" name:"+name+"age:"+age);
        return "id:"+id+" name:"+name+"age:"+age;
    }

    @RequestMapping(value="/hello/{id}/{name}",method= RequestMethod.POST)
    public String doPost(@PathVariable("id") Integer id,@PathVariable("name") String name,@RequestBody String text){
        System.out.println("id:"+id+" name:"+name);
        System.out.println(text);
        return "id:"+id+" name:"+name+"\n"+text;
    }


}
