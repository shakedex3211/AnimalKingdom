import java.util.Random;

public enum CatTypes {
    NINJA,
    SAMORAI,
    POLISH_RUNNER,
    GERMAN_HUNTER,
    NORWAY_VIKING;

    public static CatTypes randomCatType(){
        int a = (new Random().nextInt(5));

        switch (a){
            case 0: return CatTypes.NINJA;
            case 1: return CatTypes.SAMORAI;
            case 2: return CatTypes.POLISH_RUNNER;
            case 3: return CatTypes.GERMAN_HUNTER;
            case 4: return CatTypes.NORWAY_VIKING;
            default: return null;
        }
    }
}
