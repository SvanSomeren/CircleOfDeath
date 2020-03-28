package svansomeren.circleofdeath.controllers;


import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import svansomeren.circleofdeath.models.Card;
import svansomeren.circleofdeath.models.Deck;
import svansomeren.circleofdeath.services.CircleService;

import java.util.List;

@RestController
@RequestMapping("/v1/circle")
public class CircleController {

    private CircleService circleService;

    public CircleController(){
        circleService = new CircleService();
    }

    @CrossOrigin
    @PostMapping(path = "/start")
    public ResponseEntity<?> startGame(){
        circleService.startGame();
        return ResponseEntity.accepted().body(new String("Game Started"));
    }

    @CrossOrigin
    @GetMapping(path = "/")
    public ResponseEntity<Card> pickCard(){
        try{
            return ResponseEntity.accepted().body(circleService.pickCard());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}