/*
 * Recipe 11-3:  Allocating A Specific Bean for Injection
 */
package org.jakartaeerecipes.chapter11.recipe11_03;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author juneau
 */
@Named(value = "paperbackController")
@SessionScoped
@Paperback
public class PaperbackController implements Serializable, Book {

    /**
     * Creates a new instance of PaperbackController
     */
    public PaperbackController() {
    }
}
