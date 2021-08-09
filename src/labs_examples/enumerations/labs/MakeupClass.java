package labs_examples.enumerations.labs;

public class MakeupClass {
    Makeup makeup;

    public MakeupClass(Makeup makeup) {
        this.makeup = makeup;
    }

    public void makeupProduct(Makeup makeup) {
        switch (makeup) {
            case MASCARA:
                System.out.println("Mascara goes on eyelashes.");
                break;
            case EYELINER:
                System.out.println("Eyeliner goes on the water line.");
                break;
            case LIPSTICK:
                System.out.println("Lipstick goes on the lips");
                break;
            case BLUSH:
                System.out.println("Blush goes on the cheeks.");
                break;
            case EYESHADOW:
                System.out.println("Eyeshadow goes on the eyelids");
                break;
            case FOUNDATION:
                System.out.println("Foundation goes on the face");
                break;
            case CONCEALER:
                System.out.println("Concealer goes under the eyes.");
                break;
            case BRONZER:
                System.out.println("Bronzer goes on the cheek bones");
                break;

            default:
                System.out.println("All of the makeup products go on the face");
                break;
        }

    }
}
