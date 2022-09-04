package uz.jl.springbootfeatures.dtos.task;

import lombok.*;
import uz.jl.springbootfeatures.dtos.generic.TaskDtoGenericDto;

import java.sql.Timestamp;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Saturday 14:23:49
 * @product Name:  spring-boot-161
 * @Class Name: TaskUpdateDto
 * IntelliJ IDEA
 **/

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateDtoTaskDtoGenericDto extends TaskDtoGenericDto {


    private String fromColumnName;
    private Integer fromIndex;

    private String toText;
    private String toDescription;


    private Timestamp toDeadline;
    private String toColumnName;
    private Integer toIndex;




}
