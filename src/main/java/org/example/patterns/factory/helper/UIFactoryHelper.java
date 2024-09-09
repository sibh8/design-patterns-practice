package org.example.patterns.factory.helper;

import org.example.patterns.factory.SupportedPlatform;
import org.example.patterns.factory.UIFactory;
import org.example.patterns.factory.factories.AndroidUIFactory;
import org.example.patterns.factory.factories.MacUIFactory;
import org.example.patterns.factory.factories.WindowsUIFactory;

public class UIFactoryHelper {
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform){
        if(supportedPlatform.equals(SupportedPlatform.ANDROID))
            return new AndroidUIFactory();
        else if(supportedPlatform.equals(SupportedPlatform.WINDOWS))
            return new WindowsUIFactory();
        else if(supportedPlatform.equals(SupportedPlatform.MAC))
            return new MacUIFactory();
        else
            return null;
    }
}
