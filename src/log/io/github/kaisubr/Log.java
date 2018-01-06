package log.io.github.kaisubr;

/**
 * Log, file created in log.io.github.kaisubr by Kailash Sub.
 * Adapted from Android's Log class.
 * This is redistributable and may be changed for any purposes
 *      (although it'd be great if you acknowledged me if you added/changed stuff on this file!)
 */
public class Log {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";
    private static final String ANSI_BLACK = "\u001B[30m";

    /**
     * Error (use to report definite errors)
     * @param error
     */
    public static void e(String error) {
        System.out.println(ANSI_RED + "[✗] " + error + ANSI_RESET);
    }

    /**
     * Warning (use to report possible errors in the future)
     * @param warn
     */
    public static void w(String warn) {
        System.out.println(ANSI_YELLOW + "[!] " + ANSI_RESET + warn);
    }

    /**
     * Something happened (use to report general information)
     * @param info
     */
    public static void i(String info) {
        System.out.println(ANSI_BLUE + "[i] " + ANSI_RESET + info);
    }

    /**
     * Debug (use to check flow of program)
     * @param debug
     */
    public static void d(String debug) {
        System.out.println(ANSI_PURPLE + "[d] " + debug + ANSI_RESET);
    }

    /**
     * Verbose (use to check flow in almost every part of program)
     * @param verbose
     */
    public static void v(String verbose) {
        System.out.println(ANSI_PURPLE + "[v] " + verbose + ANSI_RESET);
    }

    /**
     * Success (use to report successes)
     * @param success
     */
    public static void s(String success) {
        System.out.println(ANSI_GREEN + "[✓] " + success + ANSI_RESET);
    }

    /**
     * Expired/Invisible (use to report messages that are no longer in use)
     * @param expired
     */
    public static void n(String expired) {
        System.out.println(ANSI_WHITE + "[n] " + expired + ANSI_RESET);
    }
}
