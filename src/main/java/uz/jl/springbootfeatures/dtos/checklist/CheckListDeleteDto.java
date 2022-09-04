package uz.jl.springbootfeatures.dtos.checklist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.springbootfeatures.dtos.generic.TaskDtoGenericDto;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Saturday 23:28:31
 * @product Name:  spring-boot-161
 * @Class Name: CheckListDeleteDto
 * IntelliJ IDEA
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CheckListDeleteDto extends TaskDtoGenericDto {





    private String checklistName;
}
