package uz.jl.springbootfeatures.dtos.task;

import lombok.*;
import uz.jl.springbootfeatures.dtos.generic.TaskDtoGenericDto;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Friday 14:21:18
 * @product Name:  spring-boot-161
 * @Class Name: TaskCreateDto
 * IntelliJ IDEA
 **/

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreateDtoTaskDtoGenericDto extends TaskDtoGenericDto {

    private String description;
    private Integer index;


}
