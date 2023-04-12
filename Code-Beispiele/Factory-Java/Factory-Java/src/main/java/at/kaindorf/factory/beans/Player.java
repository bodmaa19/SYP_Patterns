package at.kaindorf.factory.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Player extends GameObject {
    private String playerName;
}
