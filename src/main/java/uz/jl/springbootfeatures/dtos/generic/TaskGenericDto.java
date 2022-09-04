package uz.jl.springbootfeatures.dtos.generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class TaskGenericDto extends GenericTaskFieldDto {

    private String taskName;

    public TaskGenericDto(String columnName, String taskName) {
        super(columnName);
        this.taskName = taskName;
    }

}
