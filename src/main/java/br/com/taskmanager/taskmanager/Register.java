package br.com.taskmanager.taskmanager;

import br.com.taskmanager.dao.Dao;
import br.com.taskmanager.model.Task;
import br.com.taskmanager.useful.MsgException;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

public class Register implements Serializable {

    @Inject
    private Dao<Task> dao;

    public void salve(Task t) throws MsgException{
        dao.salve(t);
    }

    public void remove(Task t) throws MsgException {
        dao.remove(Task.class, t.getId());
    }


    public List<Task> list(){
        return dao.fetchAll("select t from Task t order by t.id");
    }

}
