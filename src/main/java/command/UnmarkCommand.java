package command;

import exception.DukeException;
import storage.Storage;
import ui.Ui;
import task.Task;
import tasklist.TaskList;

public class UnmarkCommand extends Command {
    private int index;

    public UnmarkCommand(String index) {
        this.index = Integer.parseInt(index) - 1;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        Task task = tasks.unmarkAsDone(index);
        ui.showTaskUnmarked(task); // Make sure to implement this method in the Ui class
        storage.saveTasks(tasks);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}