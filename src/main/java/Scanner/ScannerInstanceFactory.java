package Scanner;

import jpos.JposConst;
import jpos.JposException;
import jpos.config.JposEntry;
import jpos.config.JposEntry.Prop;
import jpos.loader.JposServiceInstance;
import jpos.loader.JposServiceInstanceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ScannerInstanceFactory implements JposServiceInstanceFactory {
    public JposServiceInstance createInstance(String paramString, JposEntry paramJposEntry) throws JposException {

        final Logger logger = LogManager.getLogger();

        if (!(paramJposEntry.hasPropertyWithName("serviceClass")))
            throw new JposException(JposConst.JPOS_E_NOSERVICE,
                    "The JposEntry does not contain the 'serviceClass' property");
        if (!(paramJposEntry.hasPropertyWithName("portName")))
            throw new JposException(JposConst.JPOS_E_NOSERVICE,
                    "The JposEntry does not contain the 'commPortNumber' property");
        int lCommPortNumber = -1;
        Prop lCommPortNumberProp = paramJposEntry.getProp("portName");
        lCommPortNumber = Integer.parseInt(lCommPortNumberProp
                .getValueAsString());

        ScannerService localJposServiceInstance;
        try {
            localJposServiceInstance = new ScannerService();
            localJposServiceInstance.setCommPortNumber(lCommPortNumber);
        } catch (Exception localException) {
            throw new JposException(jpos.JposConst.JPOS_E_NOSERVICE,
                    "Could not create the service instance!", localException);
        }
        return localJposServiceInstance;
    }
}
