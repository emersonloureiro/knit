import java.util.List;

public class ParsingResult {

	private final boolean success;
	private final List<String> errors;

	public ParsingResult(boolean success, List<String> errors) {
		this.success = success;
		this.errors = errors;
	}

	public boolean success() {
		return this.success;
	}

	public List<String> getErrors() {
		return this.errors;
	}
}
