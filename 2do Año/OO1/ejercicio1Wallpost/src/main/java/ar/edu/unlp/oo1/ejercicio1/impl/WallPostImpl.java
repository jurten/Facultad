package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
    private String text;
    private int likes;
    public boolean featured;

    /**
     * Retorna el texto descriptivo de la publicación
     * 
     * @return
     */
    public String getText() {
        return this.text;
    }

    /**
     * Setea el texto descriptivo de la publicación
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Setea el texto descriptivo de la publicación y la devulve
     * 
     * @param text
     * @return
     */
    public WallPost text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Retorna la cantidad de “me gusta”
     * 
     * @return
     */
    public int getLikes() {
        return this.likes;
    }

    /**
     * Incrementa la cantidad de likes en uno
     */
    public WallPost like() {
        this.likes++;
        return this;
    }

    /**
     * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
     */
    public WallPost dislike() {
        this.likes = (this.likes > 0) ? this.likes - 1 : 0;
        return this;
    }

    /**
     * Cambia el post del estado destacado a no destacado y viceversa
     */
    public WallPost toggleFeatured() {
        this.featured = !this.featured;
        return this;
    }

    /**
     * Retorna true si el post está marcado como destacado, false en caso contrario
     * 
     * @return
     */
    public boolean isFeatured() {
        return this.featured;
    }

    /*
     * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
     * forma adecuada
     */
    @Override
    public String toString() {
        return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
                + "'" + "}";
    }
}
