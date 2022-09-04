package uz.jl.springbootfeatures.dtos.board;

import lombok.*;
import org.springframework.stereotype.Service;
import uz.jl.springbootfeatures.domains.Board;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Thursday 16:12:07
 * @product Name:  spring-boot-161
 * @Class Name: BoardCheckDto
 * IntelliJ IDEA
 **/
@Getter
@Service
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardCheckDto {
    private Board board;
    private String boardWorkspaceName;
    private BoardCreateDto createDto;
    private Long userId;
}
