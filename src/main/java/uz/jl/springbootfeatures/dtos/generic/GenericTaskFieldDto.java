package uz.jl.springbootfeatures.dtos.generic;

import lombok.*;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Sunday 13:03:03
 * @product Name:  spring-boot-161
 * @Class Name: GenericTaskField
 * IntelliJ IDEA
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenericTaskFieldDto {
    private String username;
    private String boardName;
    private String columnName;
    private String workspaceName;
}
