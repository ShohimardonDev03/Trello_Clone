package uz.jl.springbootfeatures.dtos.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.springbootfeatures.dtos.generic.TaskDtoGenericDto;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Sunday 12:26:36
 * @product Name:  spring-boot-161
 * @Class Name: TaskGenericDto
 * IntelliJ IDEA
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AddLabelDtoTaskDtoGenericDto extends TaskDtoGenericDto {
    private String labelName;

}
