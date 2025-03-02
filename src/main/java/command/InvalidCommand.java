package command;

import exception.DukeException;
import storage.Storage;
import ui.Ui;
import tasklist.TaskList;
/**
 * Represents an invalid command that is unrecognized by the application.
 */
public class InvalidCommand extends Command {
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        throw new DukeException("I have no idea what you just typed lmao");
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
