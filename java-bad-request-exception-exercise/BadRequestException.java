public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}
/**
 * Custom checked exception class representing a bad request.
 */
/**
* Constructor that accepts a custom error message
* and passes it to the Exception superclass.
*
* @param message the detail message describing the bad request
*/
