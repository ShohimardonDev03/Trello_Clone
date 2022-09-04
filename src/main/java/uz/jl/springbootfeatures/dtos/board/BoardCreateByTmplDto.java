package uz.jl.springbootfeatures.dtos.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.springbootfeatures.enums.AccessType;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Friday 12:21:29
 * @product Name:  spring-boot-161
 * @Class Name: BoardCreateByTmplDto
 * IntelliJ IDEA
 **/

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class BoardCreateByTmplDto {
    private String name;
    private String templateName;
    private String workspace;
    private AccessType accessType;
    private boolean isKeepCard;
}
