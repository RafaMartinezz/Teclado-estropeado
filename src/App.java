import java.util.*;

/**
 * App class that processes text input according to cursor-based editing
 * commands.
 * The program reads lines of input, interprets special characters as cursor
 * commands, and
 * builds the output string based on these commands.
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read input line-by-line until no more input
		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			// Process each line of input and output the transformed result
			System.out.println(processInput(input));
		}
		sc.close();
	}

	/**
	 * Processes a line of input and applies cursor-based editing commands.
	 * Special characters in the input control cursor movement and editing:
	 * - '-' moves the cursor to the beginning of the text.
	 * - '+' moves the cursor to the end of the text.
	 * - '*' moves the cursor one character to the right.
	 * - '3' deletes the character at the cursor position.
	 * Any other character is inserted at the current cursor position.
	 *
	 * @param input The input string containing text and cursor commands.
	 * @return The resulting string after processing all commands.
	 */
	public static String processInput(String input) {
		List<Character> resultado = new ArrayList<>(); // List to store the result characters
		int cursor = 0; // Cursor position, starting at the beginning of the list

		// Iterate through each character in the input
		for (char c : input.toCharArray()) {
			switch (c) {
				// '-' command: Move cursor to the beginning
				case '-':
					if (!resultado.isEmpty()) {
						cursor = 0;
					}
					break;

				// '+' command: Move cursor to the end
				case '+':
					cursor = resultado.size();
					break;

				// '*' command: Move cursor one position to the right, if possible
				case '*':
					if (cursor < resultado.size()) {
						cursor++;
					}
					break;

				// '3' command: Delete the character at the cursor, if any
				case '3':
					if (cursor < resultado.size()) {
						resultado.remove(cursor);
					}
					break;

				// Default case: Insert the character at the cursor position
				default:
					resultado.add(cursor, c);
					cursor++;
			}
		}

		// Build the final output string from the result list
		StringBuilder output = new StringBuilder();
		for (char c : resultado) {
			output.append(c);
		}
		return output.toString();
	}
}
