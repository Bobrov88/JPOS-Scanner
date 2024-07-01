package Thread;

import gnu.io.RXTXPort;
import gnu.io.SerialPort;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;

import java.io.InputStream;

public class ScannerSerialThread implements Runnable{

    private RXTXPort serialPort;
    private InputStream inputStream;
    private Thread readThread;
    private boolean busy;
    private final WaitNotBusyHelper notBusyWaiter = new WaitNotBusyHelper();

    private final WaitDataHelper dataWaiter = new WaitDataHelper();
    private ScannerSerialThread() {};

    public ScannerSerialThread(String commName) throws PortInUseException, UnsupportedCommOperationException {
        this();
        serialPort = new RXTXPort(commName);
        inputStream = serialPort.getInputStream();

        // activate the DATA_AVAILABLE notifier
        serialPort.notifyOnDataAvailable(true);

        // these are default values for Scanner check readers.
        serialPort.setSerialPortParams(9600, SerialPort.DATABITS_7, SerialPort.STOPBITS_2, SerialPort.PARITY_EVEN);

        this.busy = true;

        // start the read thread
        readThread = new Thread(this);
        readThread.start();
    }
    @Override
    public void run() {

    }
    public WaitNotBusyHelper getNotBusyWaiter() {
        return this.notBusyWaiter;
    }
    public WaitDataHelper getDataWaiter() {
        return this.dataWaiter;
    }
}
