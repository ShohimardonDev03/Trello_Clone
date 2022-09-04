package uz.jl.springbootfeatures.dtos.checklist;

import lombok.*;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Saturday 23:17:59
 * @product Name:  spring-boot-161
 * @Class Name: CheckListCreateDto
 * IntelliJ IDEA
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CheckListCreateDto {
    private String text;
    private String username;
    private String workspace;
    private String taskName;
    private String boardColumnName;
    private String BoardName;
}
