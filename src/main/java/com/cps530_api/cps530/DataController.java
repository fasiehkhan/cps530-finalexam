package com.cps530_api.cps530;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @GetMapping("/pageone")
    @CrossOrigin(origins = "https://cps530-final-fasiehkhan.herokuapp.com/")
    public List<PageData> getAllDataPageOne() {
        return PageDataService.getPageOneData();
    }
}
