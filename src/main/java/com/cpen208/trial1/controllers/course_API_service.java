package com.cpen208.trial1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.cpen208.trial1.model.coursedescription;

@RestController

@RequestMapping("/course_service")
public class course_API_service {
   
    @GetMapping("/list_of_courses")
    public String list_of_courses(){
        return "Prince Phil";   
    }
}

    // @GetMapping("/get_course_info")
    // public String get_course_info(){
    //    return "void";        
    //  }
    // coursedescription  coursedescription;
    // @GetMapping("{id}")
    // public coursedescription getcoursedescription(String id){
    //     return  coursedescription("CPEN208", "Software Engineering", "A course intended to introduce students to SE", 200);
    //      //used to view this array
    // }
    // @PostMapping   //beacuse it is a create request hense the annotation
    // public String createcoursedescription(@RequestBody coursedescription coursedescription) {// it should accept course description object. it will be recieved as a request body
    //     this.coursedescription = coursedescription;
    //     return "course description created! ";
    // }
    

    // {
    // "timestamp": "2024-05-10T18:41:43.099+00:00",
    // "status": 415,
    // "error": "Unsupported Media Type", this error was because by default spring boot takes only json files
    // "path": "/course_service"
    //  }
