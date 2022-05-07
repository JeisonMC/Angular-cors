package Home.angularProject.service;

import Home.angularProject.entity.task;
import Home.angularProject.repository.RepositoryTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTask {

    @Autowired
    private RepositoryTask repositoryTask;

    public ServiceTask(RepositoryTask repositoryTask) {
        this.repositoryTask = repositoryTask;
    }

    public List<task> findAllTask() {
        return repositoryTask.findAll();
    }

}
