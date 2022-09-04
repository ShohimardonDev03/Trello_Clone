package uz.jl.springbootfeatures.dtos.workspace;

import lombok.*;
import uz.jl.springbootfeatures.domains.WorkspaceVisibility;

import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;

/**
 * @author: Shohimardon Abdurashitov
 * @since; August  Monday 19:43:24
 * @product Name:  spring-boot-161
 * @Class Name: WorkSpaceDto
 * IntelliJ IDEA
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkSpaceUpdateDto {

    private String name;

    @NotBlank
    private String oldName;

    private String description;

    @NotBlank
    private Long createdBy;

    private Long userid;

    private WorkspaceVisibility workspaceVisibility;

}
