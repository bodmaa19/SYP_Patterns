package at.kaindorf.factory.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class GameObject {
    private int id;
    private int healthPoints;
    private int attackPoints;
}
