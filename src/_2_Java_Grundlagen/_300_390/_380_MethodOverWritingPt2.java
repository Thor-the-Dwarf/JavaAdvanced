package _2_Java_Grundlagen._300_390;

public class _380_MethodOverWritingPt2 {

    /**
     * hier ist die zu überschreibende Methode
     */
    protected void toOverWrite() {
        // Some Logic
    }
}

class OverWriter extends _380_MethodOverWritingPt2 {

//    @Override
//    private void toOverWrite(){                     /** FUNKTIONIERT NICHT AccesModifier zu klein */
//        // Some different Logic
//    }

//    @Override
//    void toOverWrite(){                             /** FUNKTIONIERT NICHT AccesModifier zu klein */
//        // Some different Logic
//    }
//
//    @Override
//    protected void toOverWrite(){                   /** FUNKTIONIERT  AccesModifier ist so groß wie der des Parents */
//        // Some different Logic
//    }
//
    @Override
    public void toOverWrite(){                      /** FUNKTIONIERT AccesModifier ist Größer als der des Parents */
        // Some different Logic
    }
}
