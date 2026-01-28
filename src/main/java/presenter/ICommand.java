package presenter;

import java.util.List;

public interface ICommand {
    void execute(List<String> contextString) throws Exception;
}
