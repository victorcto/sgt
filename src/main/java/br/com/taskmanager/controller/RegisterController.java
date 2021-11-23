package br.com.taskmanager.controller;

import br.com.taskmanager.model.Task;
import br.com.taskmanager.taskmanager.Register;
import br.com.taskmanager.useful.Messages;
import br.com.taskmanager.useful.MsgException;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class RegisterController implements Serializable {

    @Inject
    private Task task;

    @Inject
    private Register register;

    private List<Task> tasks;

    @PostConstruct
    private void init() {
        tasks = register.list();
    }

    public void add() {
        try {
            register.salve(task);
            task = new Task();
            init();

            Messages.Info("Tarefa Adicionada.");
        }
        catch (MsgException e) {
            Messages.Error(e.getMessage());
        }
    }

    public void remove() {
        try {
            register.remove(task);
            init();

            Messages.Error("Tarefa '" + task.getTitle() + "' de " + task.getManager() + " foi removida.");
        }
        catch (MsgException e) {
            Messages.Error(e.getMessage());
        }
    }

    public void complete() {
        try {
            register.remove(task);
            init();

            Messages.Info("Tarefa Concluída.");
        }
        catch (Exception e) {
            Messages.Error(e.getMessage());
        }
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public List<Task> getTasks() {
        return tasks;
    }

}
