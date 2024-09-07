import javax.swing.*;

/**
 * @author Archil Sikharulidze
 * @implNote This is a MUST task for everyone on TMS
 * <ol>
 *     <li>
 *         Task 1. Make it possible to add numbers, not replace (123, 567)
 *     </li>
 *     <li>
 *         Task 2. Make it possible to calculate the string 4*4, 4/1, 4%3 by working with the string
 *     </li>
 *     <li>
 *         Task 3. Activate button equals that will trigger calculation process
 *     </li>
 * </ol>
 */
public class MyCalculator {
    public static void main(String[] args) {
        // Java AWT (Abstract Window Toolkit) is an API to develop
        // Graphical User Interface, Swing - JavaFX

        // SwingUtilities create threads
        // in the thread -> builds forms
        // Anonymous -> with no name or particular address
        // To avoid thread deadlock
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();
            }
        });
    }
}