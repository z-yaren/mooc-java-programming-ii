import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbreviations;
 

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
 


    //adds a new abbreviation and its explanation.
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }
 

    //checks if an abbreviation has already been added; returns true if it has and false if it has not.
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }

 
    //finds the explanation for an abbreviation; returns null if the abbreviation has not been added yet.
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(abbreviation);
    }
}
