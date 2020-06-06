package LoginActions.PreLoginIntroductionPages;

import Utilities.CommonOps;
import org.testng.annotations.Test;

import java.io.IOException;

import static Utilities.BankUi.introPagesSharedMethods;

public class IntroductionPagesTests extends CommonOps {

    public IntroductionPagesTests() {
        super();
    }


    @Test
    public void skipIntroPages() throws IOException {
        introPagesSharedMethods.nextTimeButton(false);
    }
}
