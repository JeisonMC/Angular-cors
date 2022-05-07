package Home.angularProject.repository;

import Home.angularProject.entity.task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RepositoryTask extends JpaRepository<task, Integer> {
    @Query("select a from task a where a.name = :name")
    task getTaskByName(String name);

    @Query("select t from task t where t.completed=true")
    List<task> findAll();



}
