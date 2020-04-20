package domain;
/**
 * Class that represents an editor
 * @author asus
 */
public class Editor extends Artist {
    /**
     * Constructor that accepts information for editor
     * @param electronicEditing means if editor can provide electronic editing
     * @param skiils editor's skils
     * @param name editor's
     * @param jobTitle editor's job title
     * @param level editor's level
     * @param dept departmen name
     */

    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
/**
 * Constructor that accepts incomplete editor's information
 * @param electronicEditing means if editor can provide electronic editing
 * @param skiils editor's skils
 */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    /**
     * Constructor that accepts boolean type of electronic editing
     * @param electronicEditing means if editor can provide electronic editing
     */

    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
   
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     * Method that returns editor's information
     * @return editor's information
     */

    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
    /**
     * Method that returns editor's preferences
     * @return means if editor can provide electronic editing
     */

    public boolean getPreferences() {
        return electronicEditing;
    }
/**
 * Method sets editor's preferences
 * @param electronic means if editor can provide electronic editing
 */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
