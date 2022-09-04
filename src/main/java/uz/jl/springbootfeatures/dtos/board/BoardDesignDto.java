package uz.jl.springbootfeatures.dtos.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Friday 11:44:27
 * @product Name:  spring-boot-161
 * @Class Name: BoardDesignDto
 * IntelliJ IDEA
 **/


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardDesignDto {
    private String color;
    private String backgroundImagePath;
}
