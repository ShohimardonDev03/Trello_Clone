package uz.jl.springbootfeatures.dtos.workspace;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Sunday 11:58:18
 * @product Name:  spring-boot-161
 * @Class Name: WorkSpaceUserDto
 * IntelliJ IDEA
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WorkSpaceUserDto {

    private String username;

    private String email;
}
