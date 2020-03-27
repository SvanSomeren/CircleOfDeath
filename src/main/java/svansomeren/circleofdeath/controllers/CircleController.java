package svansomeren.circleofdeath.controllers;


import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import svansomeren.circleofdeath.models.Card;
import svansomeren.circleofdeath.models.Deck;
import svansomeren.circleofdeath.services.CircleService;

@RestController
@RequestMapping("/circle")
public class CircleController {

    private CircleService circleService;

    public CircleController(){
        circleService = new CircleService();
    }

    @PostMapping(path = "/start")
    public ResponseEntity<?> startGame(){
        circleService.startGame();
        return ResponseEntity.accepted().body("Game Started");
    }

    @GetMapping(path = "/")
    public ResponseEntity<Card> pickCard(){
        return ResponseEntity.accepted().body(circleService.pickCard());
    }
}