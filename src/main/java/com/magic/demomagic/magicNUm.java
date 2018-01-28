package com.magic.demomagic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class magicNUm {
    @RequestMapping
    public String magicnumber(@RequestParam("number") int number) {
        String magicnumberr = "Starting Number: "+number+"</br>"+String.valueOf(number)+"  ";
        while (number != 1) {

            if (number % 2 == 0) number = number / 2;

            else if (number % 2 != 0) number = number * 3 + 1;

            magicnumberr += String.valueOf(number + " ");


        }
           return magicnumberr;
    }
}
