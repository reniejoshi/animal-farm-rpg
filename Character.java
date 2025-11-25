import java.util.Locale;

public class Character {
    public String name;
    public SocialStatus socialStatus;
    public int laborStrength;
    public int educationLevel;
    public int loyalty;

    public enum SocialStatus {
        CORRUPT_LEADER,
        WORKING_CLASS
    }

    public Character(String name, SocialStatus socialStatus, int laborStrength, int educationLevel) {
        this.name = name;
        this.socialStatus = socialStatus;
        this.laborStrength = laborStrength;
        this.educationLevel = educationLevel;
    }

    public Character(String name, SocialStatus socialStatus, int laborStrength, int educationLevel, int loyalty) {
        this.name = name;
        this.socialStatus = socialStatus;
        this.laborStrength = laborStrength;
        this.educationLevel = educationLevel;
        this.loyalty = loyalty;
    }

    public String getName() {
        return name;
    }

    public SocialStatus getSocialStatus() {
        return socialStatus;
    }

    public String getSocialStatusString() {
        return socialStatus.toString().toLowerCase().replace('_', ' ');
    }

    public int getLaborStrength() {
        return laborStrength;
    }

    public int getEducationLevel() {
        return educationLevel;
    }

    public int getLoyalty() {
        return loyalty;
    }
}