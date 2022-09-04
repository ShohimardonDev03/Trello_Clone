package uz.jl.springbootfeatures.dtos.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Saturday 12:33:04
 * @product Name:  spring-boot-161
 * @Class Name: BoardColumnCreateDto
 * IntelliJ IDEA
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BoardColumnCreateDto {
    private String name;
    private int index;

    private String username;
    private String workspaceName;
    private String boardName;
}
