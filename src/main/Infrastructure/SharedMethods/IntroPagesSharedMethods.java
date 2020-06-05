package SharedMethods;

import Utilities.CommonOps;

import java.io.IOException;

import static Utilities.BankUi.*;

public class IntroPagesSharedMethods extends CommonOps {

    public IntroPagesSharedMethods() {
        super();
    }

    public void nextTimeButton(boolean fail) throws IOException {
        click.on(introPages.nextTimeBtn, "introPages", "nextTimeBtn", fail);
    }

}
