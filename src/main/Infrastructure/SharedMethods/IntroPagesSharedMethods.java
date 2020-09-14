package SharedMethods;

import Utilities.CommonOps;

import java.io.IOException;

import static Utilities.BankUi.introPagesObjects;

public class IntroPagesSharedMethods extends CommonOps {

    public void nextTimeButton(boolean fail) throws IOException {
        click.onElement(introPagesObjects.nextTimeBtn, "introPages", "nextTimeBtn", fail);
    }

}
