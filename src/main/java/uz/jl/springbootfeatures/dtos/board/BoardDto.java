package uz.jl.springbootfeatures.dtos.board;

import lombok.*;
import uz.jl.springbootfeatures.domains.Activity;
import uz.jl.springbootfeatures.domains.BoardColumn;
import uz.jl.springbootfeatures.enums.AccessType;

import java.util.Collection;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Thursday 15:29:44
 * @product Name:  spring-boot-161
 * @Class Name: BoardDto
 * IntelliJ IDEA
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardDto {

    private String name;
    private String description;
    private AccessType accessType;
    private Collection<BoardColumn> boardColumns;
    private Collection<Activity> activities;
}
