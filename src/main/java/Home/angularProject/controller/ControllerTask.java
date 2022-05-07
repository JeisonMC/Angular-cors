package Home.angularProject.controller;

import Home.angularProject.entity.task;
import Home.angularProject.service.ServiceTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/task")
public class ControllerTask {

    @Autowired
    private ServiceTask serviceTask;

    @GetMapping()
    @CrossOrigin( origins = "*")
    public ResponseEntity<List<task>> findAllTask(){
        return new ResponseEntity<>(serviceTask.findAllTask(), HttpStatus.OK) ;
    }
}
