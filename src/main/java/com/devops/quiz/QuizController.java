package com.devops.quiz;
import org.springframework.web.bind.annotation.*;
@RestController
public class QuizController{
 @GetMapping("/quiz")
 public String quiz(){return "Java Quiz: JVM stands for? A)Java Virtual Machine";}
 @GetMapping("/score")
 public String score(){int total=5,correct=4; return "Score:"+correct+" Percentage:"+(correct*100/total)+'%';}
}