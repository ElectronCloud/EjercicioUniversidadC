/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouniversidad;
import java.util.ArrayList;
/**
 *
 * @author Laura M
 */
public class Student {
    private String name;
    private ArrayList<Module>takes;

    public Student(String name, ArrayList<Module> takes) {
        this.name = name;
        this.takes = takes;
        ArrayList<Grade>grades;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getTakes() {
        return takes;
    }

    public void setTakes(ArrayList<Module> takes) {
        this.takes = takes;
    }

    
}
