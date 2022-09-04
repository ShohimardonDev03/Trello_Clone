package uz.jl.springbootfeatures.dtos.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.springbootfeatures.dtos.generic.TaskDtoGenericDto;
import uz.jl.springbootfeatures.dtos.workspace.WorkSpaceUserDto;

import java.util.List;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Sunday 12:24:46
 * @product Name:  spring-boot-161
 * @Class Name: TaskAddMember
 * IntelliJ IDEA
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskAddMemberDtoDtoGenericDto extends TaskDtoGenericDto {
    private List<WorkSpaceUserDto> members;

}
