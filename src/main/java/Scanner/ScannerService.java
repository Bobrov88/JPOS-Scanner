package Scanner;

import jpos.JposConst;
import jpos.JposException;
import jpos.events.DataEvent;
import jpos.events.ErrorEvent;
import jpos.services.EventCallbacks;
import jpos.services.ScannerService114;

public class ScannerService implements ScannerService114 {

    private int commPortNumber;

    public void setCommPortNumber(int pCommPortNumber) throws JposException {
        // save the port number
        this.commPortNumber = pCommPortNumber;
        if (!(pCommPortNumber > 0 && pCommPortNumber < 255)) {
            throw new JposException(JposConst.JPOS_E_FAILURE, "Invalid comm port number");
        }
    }
    @Override
    public void clearInputProperties() throws JposException {

    }

    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        return false;
    }

    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        return false;
    }

    @Override
    public void compareFirmwareVersion(String s, int[] ints) throws JposException {

    }

    @Override
    public void updateFirmware(String s) throws JposException {

    }

    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        return false;
    }

    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        return false;
    }

    @Override
    public void resetStatistics(String s) throws JposException {

    }

    @Override
    public void retrieveStatistics(String[] strings) throws JposException {

    }

    @Override
    public void updateStatistics(String s) throws JposException {

    }

    @Override
    public void deleteInstance() throws JposException {

    }

    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }

    @Override
    public int getPowerNotify() throws JposException {
        return 0;
    }

    @Override
    public void setPowerNotify(int i) throws JposException {

    }

    @Override
    public int getPowerState() throws JposException {
        return 0;
    }

    @Override
    public boolean getAutoDisable() throws JposException {
        return false;
    }

    @Override
    public void setAutoDisable(boolean b) throws JposException {

    }

    @Override
    public int getDataCount() throws JposException {
        return 0;
    }

    @Override
    public boolean getDataEventEnabled() throws JposException {
        return false;
    }

    @Override
    public void setDataEventEnabled(boolean b) throws JposException {

    }

    @Override
    public boolean getDecodeData() throws JposException {
        return false;
    }

    @Override
    public void setDecodeData(boolean b) throws JposException {

    }

    @Override
    public byte[] getScanData() throws JposException {
        return new byte[0];
    }

    @Override
    public byte[] getScanDataLabel() throws JposException {
        return new byte[0];
    }

    @Override
    public int getScanDataType() throws JposException {
        return 0;
    }

    @Override
    public void clearInput() throws JposException {

    }

    @Override
    public String getCheckHealthText() throws JposException {
        return null;
    }

    @Override
    public boolean getClaimed() throws JposException {
        return false;
    }

    @Override
    public boolean getDeviceEnabled() throws JposException {
        return false;
    }

    @Override
    public void setDeviceEnabled(boolean b) throws JposException {

    }

    @Override
    public String getDeviceServiceDescription() throws JposException {
        return null;
    }

    @Override
    public int getDeviceServiceVersion() throws JposException {
        return 0;
    }

    @Override
    public boolean getFreezeEvents() throws JposException {
        return false;
    }

    @Override
    public void setFreezeEvents(boolean b) throws JposException {

    }

    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        return null;
    }

    @Override
    public String getPhysicalDeviceName() throws JposException {
        return null;
    }

    @Override
    public int getState() throws JposException {
        return 0;
    }

    @Override
    public void claim(int i) throws JposException {

    }

    @Override
    public void close() throws JposException {

    }

    @Override
    public void checkHealth(int i) throws JposException {

    }

    @Override
    public void directIO(int i, int[] ints, Object o) throws JposException {

    }

    @Override
    public void open(String s, EventCallbacks eventCallbacks) throws JposException {

    }

    @Override
    public void release() throws JposException {

    }
}
