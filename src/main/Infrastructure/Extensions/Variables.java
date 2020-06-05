package Extensions;

import PageObjects.*;
import Utilities.CommonOps;
import java.lang.reflect.Field;

public class Variables extends CommonOps {

    public static String myElementName;
    public static Field[] fld;

    public static String getName(String className, String name) {

        if (className.toLowerCase().contains("postLogin")) {
            fld = PostLoginPageObjects.class.getDeclaredFields();
            for (Field field : fld) {
                if (field.getName().equals(name))
                    myElementName = field.getName();
            }
        }

        else if (className.toLowerCase().contains("login")) {
            fld = LoginPageObjects.class.getDeclaredFields();
            for (int i = 0; i < fld.length; i++) {
                if (fld[i].getName().equals(name))
                    myElementName = fld[i].getName();
            }
        }

        else if (className.toLowerCase().contains("homepage")) {
            fld = HomePageObjects.class.getDeclaredFields();
            for (int i = 0; i < fld.length; i++) {
                if (fld[i].getName().equals(name))
                    myElementName = fld[i].getName();
            }
        }
        else if (className.toLowerCase().contains("setuptouchidindication")) {
            fld = SetupTouchIDIndicationPageObjects.class.getDeclaredFields();
            for (int i = 0; i < fld.length; i++) {
                if (fld[i].getName().equals(name))
                    myElementName = fld[i].getName();
            }
        }
        else if (className.toLowerCase().contains("intropages")) {
            fld = IntroPagesPageObjects.class.getDeclaredFields();
            for (int i = 0; i < fld.length; i++) {
                if (fld[i].getName().equals(name))
                    myElementName = fld[i].getName();
            }
        }
        else
            return null;

        return myElementName;
    }
}

