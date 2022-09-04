package uz.jl.springbootfeatures.dtos.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Saturday 21:26:07
 * @product Name:  spring-boot-161
 * @Class Name: TaskLabelUpdateDto
 * IntelliJ IDEA
 **/
@Getter

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskLabelUpdateDto {
    private String fromLabelName;
    private String toLabelName;
    private String username;
    private String toColor;
    private String workspace;
}
