package com.ananta.logger.utils;

import android.util.Log;

/**
 * Api class for printing log out put to android console.
 * Uses android Log library to perform the opration.
 *
 * <P>Generally use the logDebug(),logInfo(),logError() methods</P>
 *
 *
 */

public final class Logger {
    /*
       constant used as default TAG while using metods.
     */
        private static final String TAG="LOGLIBRARY";

        private Logger(){

        }

        /**
         * log debug message with predefine TAG {@link #TAG}
          @param message the message you want to log.
         */
        public static void logDebug(String message){
            Log.d(TAG,message);
        }

        /**
         * log informational message with predefine TAG {@link #TAG}
         @param message the message you want to log.
         */
        public static void logInfo(String message){
          Log.i(TAG,message);
        }

        /**
         * log error message with predefine TAG {@link #TAG}
         @param message the message you want to log.
         */
        public static void logError(String message){
          Log.e(TAG,message);
        }
}
