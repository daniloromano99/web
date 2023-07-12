package com.task5.web.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class matchmodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idUser;
    private String idMatch;

    public robotmodel robot;
    public classmodel classe;
    public String mode;
    
    public matchmodel() {
    }
    public matchmodel(String idUser, String idMatch, robotmodel robot, classmodel classe, String mode) {
        this.idUser = idUser;
        this.idMatch = idMatch;
        this.robot = robot;
        this.classe = classe;
        this.mode = mode;
    }
    public String getIdUser() {
        return idUser;
    }
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
    public String getIdMatch() {
        return idMatch;
    }
    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }
    public robotmodel getRobot() {
        return robot;
    }
    public void setRobot(robotmodel robot) {
        this.robot = robot;
    }
    public classmodel getClasse() {
        return classe;
    }
    public void setClasse(classmodel classe) {
        this.classe = classe;
    }
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
}
