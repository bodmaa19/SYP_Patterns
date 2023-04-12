package at.kaindorf.factory.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Enemy extends GameObject {
    private String enemyName;
    private String description;
}
