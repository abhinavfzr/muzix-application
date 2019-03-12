package com.stackroute.userservice.controller;

import com.stackroute.userservice.domain.Restaurent;
import com.stackroute.userservice.service.RestaurentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@CrossOrigin
public class RestaurentController
{
    private RestaurentService restaurentService;

    @Autowired
    public RestaurentController(RestaurentService restaurentService) {

        this.restaurentService = restaurentService;
    }




    @PostMapping("/food")
    public ResponseEntity<Restaurent> saveRest(@RequestBody  Restaurent restaurent)
    {
        Restaurent savedR=restaurentService.saveRest(restaurent);
        return new ResponseEntity<Restaurent>(savedR, HttpStatus.OK);
    }

    @GetMapping("foods")
    public  List<Restaurent> getALlUsers()
    {
        List<Restaurent> list=restaurentService.getALLRest();
        return list;
    }


}
