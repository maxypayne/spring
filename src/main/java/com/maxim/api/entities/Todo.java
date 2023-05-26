package com.maxim.api.entities;

//import com.maxim.api.domains.TodoType;
import jakarta.persistence.*;
import org.springframework.context.event.EventListener;

import java.util.Date;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;
    @Column(name="done")
    private boolean done;
    @Column(name="dateCreated")
    private Date dateCreated;
    @Column(name="dueDate")
    private Date dueDate;
    @Column(name="dateDone")
    private Date dateDone;
    @Column(name="lastUpdated")
    private Date lastUpdated;
//    @Column(name="type")
//    private TodoType type;
    public Todo() {}
    public Todo(
            String title,
            String description,
            boolean done,
            Date dateCreated,
            Date dueDate,
            Date dateDone,
            Date lastUpdated
    ) {
        this.title = title;
        this.description = description;
        this.done = done;
        this.dateCreated = dateCreated;
        this.dueDate = dueDate;
        this.dateDone = dateDone;
        this.lastUpdated = lastUpdated;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDateDone() {
        return dateDone;
    }

    public void setDateDone(Date dateDone) {
        this.dateDone = dateDone;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

//    public TodoType getType() {
//        return type;
//    }
//
//    public void setType(TodoType type) {
//        this.type = type;
//    }

    @EventListener
    public void beforeSave(Todo todo) {
        System.out.println("Before save event is triggered");
        System.out.println(todo.toString());
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", done=" + done +
                ", dateCreated=" + dateCreated +
                ", dueDate=" + dueDate +
                ", dateDone=" + dateDone +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
