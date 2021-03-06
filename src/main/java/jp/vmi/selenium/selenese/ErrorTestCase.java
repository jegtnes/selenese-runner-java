package jp.vmi.selenium.selenese;

import jp.vmi.junit.result.ITestCase;
import jp.vmi.selenium.selenese.command.CommandList;
import jp.vmi.selenium.selenese.inject.ExecuteTestCase;
import jp.vmi.selenium.selenese.result.Result;
import jp.vmi.selenium.selenese.utils.LogRecorder;

/**
 *
 */
public class ErrorTestCase extends ErrorSource implements ITestCase {

    private LogRecorder logRecorder = null;

    @Override
    public void setLogRecorder(LogRecorder logRecorder) {
        this.logRecorder = logRecorder;
    }

    @Override
    public LogRecorder getLogRecorder() {
        return logRecorder;
    }

    @Override
    public ErrorTestCase initialize(String filename, InvalidSeleneseException e) {
        return (ErrorTestCase) super.initialize(filename, e);
    }

    @Override
    public Type getType() {
        return Type.TEST_CASE;
    }

    @ExecuteTestCase
    @Override
    public Result execute(Selenese parent, Context context) throws InvalidSeleneseException {
        return super.execute(parent, context);
    }

    /**
     * Get command list.
     *
     * @return command list.
     */
    public CommandList getCommandList() {
        return new CommandList();
    }
}
