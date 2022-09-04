package uz.jl.springbootfeatures.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static uz.jl.springbootfeatures.controller.ApiController.PATH;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Saturday 21:12:57
 * @product Name:  spring-boot-161
 * @Class Name: TaskLabelController
 * IntelliJ IDEA
 **/

@RestController
@RequiredArgsConstructor
@RequestMapping(PATH+"/label")
public class TaskLabelController {
}
