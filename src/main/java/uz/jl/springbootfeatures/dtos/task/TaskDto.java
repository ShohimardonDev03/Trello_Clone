package uz.jl.springbootfeatures.dtos.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.springbootfeatures.domains.TaskLabel;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Thursday 17:23:38
 * @product Name:  spring-boot-161
 * @Class Name: TaskDto
 * IntelliJ IDEA
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TaskDto  {
    private String text;
    private String description;
    private String attachment;
    private Collection<TaskLabel> labels;
    private String columnName;
    private Integer index;



}
