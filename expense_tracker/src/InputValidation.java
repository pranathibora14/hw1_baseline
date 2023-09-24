/**
 * The InputValidation class validates user input.
 */
public class InputValidation {
	
	enum categories {
			food,
			travel,
			bills,
			entertainment,
			other
	}
	
	private boolean isValidCategory(String category) {

	    for (InputValidation.categories c : categories.values()) {
	        if (c.name().equals(category)) {
	            return true;
	        }
	    }

	    return false;
	}
	
	public boolean validateInput(String amount, String category){
		if (amount.matches(".*[a-zA-Z]+.*") || Double.parseDouble(amount) <= 0 || Double.parseDouble(amount) >=1000  || !isValidCategory(category)) {
			return false;
		}
		return true;
	}

}
