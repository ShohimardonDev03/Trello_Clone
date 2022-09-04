package uz.jl.springbootfeatures.dtos.workspace;

import lombok.Data;

import java.util.List;

/**
 * @author: Shohimardon Abdurashitov
 * @since; August  Wednesday 15:40:45
 * @product Name:  spring-boot-161
 * @Class Name: WorkspaceRmMemeberDto
 * IntelliJ IDEA
 **/
@Data
public class WorkspaceRmMemberDto {

    private String name;
    private Long userId;
    private List<Long> member;
}
