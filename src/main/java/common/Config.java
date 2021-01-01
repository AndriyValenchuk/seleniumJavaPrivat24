package common;


public class Config {

    /**
    * Specify the browser and platform for test;
    * CHROME_WIN
    * MOZILA_WIN
     */
    public static final String BROWSER_AND_PLATFORM = "CHROME_WIN";
    /** Clean browser cookies after each iteration */
    public static final Boolean CLEAR_COOKIES = false;
    /** To keep the brouser open after all scenario/test. */
    public static final Boolean HOLD_BROUSER_OPEN = true;
    /** Clear the directory with the screen before starting the build */
    public static final Boolean CLEAR_REPORT_DIR = true;

}
