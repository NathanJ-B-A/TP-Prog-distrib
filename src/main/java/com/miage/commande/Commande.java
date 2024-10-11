package com.miage.commande;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Commande {
    @GetMapping("/prix")
    public int price() {
        return 10;
    }

    @PostMapping("/loc")
    public void louer(@RequestBody Dates dates) {
        System.out.println(dates);
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date debut = dateFormat.parse(dates.getDebut());
        Date fin = dateFormat.parse(dates.getFin());
    }
}