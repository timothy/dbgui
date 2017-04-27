/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbguiapp;

/**
 * This class was created to store database author objects.
 * @author Timothy Bradford
 */
public class Author {

    private String fName;
    private String lName;
    private int id;

    /**
     * 
     * @param fName first name of author
     * @param lName last name of author
     * @param id The AUTHORID in the database that is associated with this author
     */
    public Author(String fName, String lName, Integer id) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
    }

    /**
     * first and last name of author
     * @return first and last name of author
     */
    @Override
    public String toString() {
        return lName + ", " + fName;
    }

    /**
     * first name of author
     * @return first name of author
     */
    public String getfName() {
        return fName;
    }

    /**
     * last name of author
     * @return last name of author
     */
    public String getlName() {
        return lName;
    }

    /**
     * The AUTHORID in the database that is associated with this author
     * @return the AuthorID
     */
    public int getId() {
        return id;
    }

}
