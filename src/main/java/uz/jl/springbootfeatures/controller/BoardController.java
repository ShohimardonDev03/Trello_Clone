package uz.jl.springbootfeatures.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static uz.jl.springbootfeatures.controller.ApiController.PATH;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Thursday 15:03:06
 * @product Name:  spring-boot-161
 * @Class Name: BoardController
 * IntelliJ IDEA
 **/
@Controller
@RequestMapping(PATH + "/board/")
public class BoardController {


    @PostMapping()
    public String createBoard() {
        return null;
    }

    @PutMapping()
    public String update() {
        return null;
    }

    @DeleteMapping()
    public String delete() {
        return null;
    }


    @GetMapping()
    public String getOne() {
        return null;
    }





}
