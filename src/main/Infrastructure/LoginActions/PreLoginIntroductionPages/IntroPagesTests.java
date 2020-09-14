package LoginActions.PreLoginIntroductionPages;

import Utilities.CommonOps;

import java.io.IOException;

import static Utilities.BankUi.introPagesSharedMethods;

public class IntroPagesTests extends CommonOps {

    public void skipIntroPages(boolean fail) throws IOException {
        introPagesSharedMethods.nextTimeButton(fail);
    }
}
