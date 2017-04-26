/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbguiapp;

/**
 *
 * @author Timothy Bradford
 */
public class Author {
    String fName;
    String lName;
    int id;

    @Override
    public String toString() {
        return lName + ", " + fName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getId() {
        return id;
    }

    public Author(String fName, String lName, int id) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
    }
}
