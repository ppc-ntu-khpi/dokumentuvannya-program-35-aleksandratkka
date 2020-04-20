
package domain;
/**
 * Class that represents an artist
 * @author asus
 */

public class Artist extends Employee {
    /**
     * 
     * @param skiils skils of the artist
     * @param name name of the artist
     * @param jobTitle artist's job title
     * @param level level of the artist
     * @param dept department name
     */

    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
/**
 * Method that accept skills of the artist
 * @param skiils skils of the artist
 */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
 
    public Artist() {
        super();
        this.skiils = new String[10];
    }
/**
 * Method that returns artist information
 * @return artist information
 */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    /**
     * Method that returns all artist skills
     * @return skill of the atrist
     */

    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
/**
 * Method that sets skills to the artist
 * @param skills string array that contains skills
 */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    public String[] getSkillsLSist() {
        return skiils;
    }
}
