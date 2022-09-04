package uz.jl.springbootfeatures.dtos.workspace;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: Shohimardon Abdurashitov
 * @since; August  Tuesday 17:36:53
 * @product Name:  spring-boot-161
 * @Class Name: WorkSpaceGetDto
 * IntelliJ IDEA
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WorkSpaceGetDto {
    private String workspaceName;
    private String username;
}
