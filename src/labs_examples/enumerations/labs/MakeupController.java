package labs_examples.enumerations.labs;

public class MakeupController {

        public static void main(String[] args) {
            MakeupClass myBlush = new MakeupClass(Makeup.BLUSH);
            myBlush.makeupProduct(Makeup.BLUSH);

            MakeupClass myMascara = new MakeupClass(Makeup.MASCARA);
            myMascara.makeupProduct(Makeup.MASCARA);

            MakeupClass myEyeliner = new MakeupClass(Makeup.EYELINER);
            myEyeliner.makeupProduct(Makeup.EYELINER);

            MakeupClass myEyeShadow = new MakeupClass(Makeup.EYESHADOW);
            myEyeShadow.makeupProduct(Makeup.EYESHADOW);

            MakeupClass myLipstick = new MakeupClass(Makeup.LIPSTICK);
            myLipstick.makeupProduct(Makeup.LIPSTICK);

            MakeupClass myFoundation = new MakeupClass(Makeup.FOUNDATION);
            myFoundation.makeupProduct(Makeup.FOUNDATION);

            MakeupClass myConcealer = new MakeupClass(Makeup.CONCEALER);
            myConcealer.makeupProduct(Makeup.CONCEALER);

            MakeupClass myBronzer = new MakeupClass(Makeup.BRONZER);
            myBronzer.makeupProduct(Makeup.BRONZER);


        }



}
