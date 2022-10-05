package cf.janga.knit.compiler.constructs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import cf.janga.knit.compiler.constructs.Command.Type;
import cf.janga.knit.vm.core.VirtualMachine;

@RunWith(MockitoJUnitRunner.class)
public class CommandTest {

    @Mock
    private VirtualMachine vm;

    @Test
    public void sanitisesListOutputCommand() {
        Command command = new Command(this.vm, " $[ ls -al | grep 'emerson' $]  \n\r\t", Type.LIST_OUTPUT);
        assertEquals("ls -al | grep 'emerson'", command.getCommand());;
    }

    @Test
    public void sanitisesSingleOutputCommand() {
        Command command = new Command(this.vm, " $\\ ls -al | grep 'emerson' $\\  \n\r\t", Type.SINGLE_OUTPUT);
        assertEquals("ls -al | grep 'emerson'", command.getCommand());;
    }

    @Test
    public void sanitisesStandardOutputCommand() {
        Command command = new Command(this.vm, " $( ls -al | grep 'emerson' $)  \n\r\t", Type.STANDARD);
        assertEquals("ls -al | grep 'emerson'", command.getCommand());;
    }
}
