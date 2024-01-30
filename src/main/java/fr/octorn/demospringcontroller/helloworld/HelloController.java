package fr.octorn.demospringcontroller.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping // GET http://localhost:8080/hello
    public String hello()  {
        return "GET sur Hello World !";
    }

//    @RequestMapping(
//            value = "/post",
//            method = RequestMethod.POST
//    )
//    public String helloPost() {
//        return "POST sur Hello World !";
//    }

    @PutMapping
    public String helloPut() {
        return "PUT sur Hello World";
    }

    @DeleteMapping
    public String helloDelete() {
        return "DELETE sur Hello World";
    }

    @PatchMapping
    public String helloPatch() {
        return "PATCH sur Hello World";
    }

//    @PostMapping("/{name}")
//    public String helloPostWithName(@PathVariable String name){
//        return "Hello " + name;
//    }
//
//    @PostMapping
//    public String helloPostWithRequestParam(@RequestParam(defaultValue = "Alex") String name) {
//        return "Hello " + name;
//    }

    @PostMapping
    public String helloPostWithBody(@RequestBody String name) {
        return "Hello " + name;
    }

}
