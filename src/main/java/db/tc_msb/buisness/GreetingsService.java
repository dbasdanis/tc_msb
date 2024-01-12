package db.tc_msb.buisness;

import db.tc_msb.config.GreetingsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingsService {
    public String processGreeting(GreetingsDto greetingsDto) {
        return "Hello, "+ greetingsDto.getGreeting() + "!";
    }
}
