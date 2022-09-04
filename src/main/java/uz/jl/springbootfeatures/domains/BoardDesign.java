package uz.jl.springbootfeatures.domains;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * @author: Shohimardon Abdurashitov
 * @since; August  Monday 14:43:27
 * @product Name:  spring-boot-161
 * @Class Name: BoardTemplete
 * IntelliJ IDEA
 **/
@Entity
//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardDesign extends Audible {
    private String color;
    private String backgroundImagePath;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBackgroundImagePath() {
        return backgroundImagePath;
    }

    public void setBackgroundImagePath(String backgroundImage) {
        this.backgroundImagePath = backgroundImage;
    }
}
