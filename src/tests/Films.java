package tests;

import java.util.Locale;

public enum Films {
    TERMINATOR("Best movie ever"),
    DIE_HARD("Best after terminator"),
    ADOLF_HITLER("Best historic film");
    String description;
    Films(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase(Locale.ROOT);
        return id.charAt(0) + lower;
    }
}
