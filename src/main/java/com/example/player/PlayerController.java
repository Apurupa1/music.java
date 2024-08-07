package com.example.player;


import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class PlayerController {
    PlayerService service = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return service.getPlayers();
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId) {
        return service.getPlayerById(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return service.addPlayer(player);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable ("playerId")int playerId,@RequestBody Player player){
        return service.updatePlayer(playerId,player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId) {
        service.deletePlayer(playerId);
    }

}