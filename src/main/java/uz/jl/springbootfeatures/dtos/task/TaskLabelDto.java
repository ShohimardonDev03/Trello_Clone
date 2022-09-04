package uz.jl.springbootfeatures.dtos.task;

import lombok.*;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Saturday 21:24:22
 * @product Name:  spring-boot-161
 * @Class Name: TaskLabelDto
 * IntelliJ IDEA
 **/
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class TaskLabelDto {
    private String name;
    private String color;
    private String workspace;
}
