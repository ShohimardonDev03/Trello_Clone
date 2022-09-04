package uz.jl.springbootfeatures.dtos.board;

import lombok.*;
import uz.jl.springbootfeatures.domains.BoardDesign;
import uz.jl.springbootfeatures.enums.AccessType;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Thursday 15:14:55
 * @product Name:  spring-boot-161
 * @Class Name: BoardCreateDto
 * IntelliJ IDEA
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BoardCreateDto {

    private String name;
    private String description;
//    private BoardDesignDto boardDesignDto;
    private AccessType accessType;
    private String color;
    private String backgroundImagePath;
    private String username;
    private String workspaceName;

}




