package seedu.duke.apps.capcalculator;

import seedu.duke.apps.capcalculator.commands.CurrentCommand;
import seedu.duke.apps.capcalculator.commands.SetTargetCommand;
import seedu.duke.exceptions.CommandParserException;
import seedu.duke.globalcommons.Command;
import seedu.duke.objects.Person;
import seedu.duke.ui.Ui;

public class CapCalculatorParser {

    public static final String NEW_LINE = "\n";
    public static final String EXITING_CURRENT_COMMAND = "Exiting current command back to Cap Calculator Main Menu.";
    public static final String ERROR_INVALID_COMMAND = "INVALID COMMAND";
    private static final String CURRENT_COMMAND = "current";
    private static final String SET_TARGET_COMMAND = "set target";
    private static final String EXIT_COMMAND = "exit";
    private static final String INVALID_COMMAND_MESSAGE = "OOPS!!! I'm sorry, but I don't know what that means :-(";

    public static Command parse(String userInput, Person currentPerson, Ui ui) throws CommandParserException {
        userInput = userInput.trim().toLowerCase();

        if (userInput.equals(CURRENT_COMMAND)) {
            return new CurrentCommand(currentPerson);
        } else if (userInput.equals(SET_TARGET_COMMAND)) {
            return new SetTargetCommand(currentPerson, ui);
        } else if (userInput.equals(EXIT_COMMAND)) {
            return new Command(true);
        } else {
            throw new CommandParserException(INVALID_COMMAND_MESSAGE);
        }
    }
}
