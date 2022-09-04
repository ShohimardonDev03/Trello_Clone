package uz.jl.springbootfeatures.dtos.checklist;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.springbootfeatures.domains.WorkSpaceUser;

import javax.persistence.Column;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Collection;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Saturday 23:17:52
 * @product Name:  spring-boot-161
 * @Class Name: CheckListDto
 * IntelliJ IDEA
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class CheckListDto {
    private String text;


    private String deadline;


    private boolean isMark;

    private Integer index;


    private Collection<WorkSpaceUser> members;

    private String username;
    private String workspace;

    private String boardColumnName;
    private String BoardName;
}
