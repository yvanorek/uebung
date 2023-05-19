package com.example.uebungswlc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class main {

    @RequestMapping("/calc/sum")                                  // mit @RequestMapping ändert/erstellt man den Pfad der Webseite -->http://localhost:8080/calc/sum
    public int sum (@RequestParam int a, @RequestParam int b){      // http://localhost:8080/calc/sum?a=3&b=4
        return a+b;
    }

}
