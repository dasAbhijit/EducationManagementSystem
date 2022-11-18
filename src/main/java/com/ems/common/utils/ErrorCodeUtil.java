
package com.ems.common.utils;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.List;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;

import com.ems.common.models.EmsError;

import com.ems.common.models.ImmutableEmsError;
import lombok.extern.slf4j.Slf4j;

/**
 * A util class for Error code.
 */
@Slf4j
public final class ErrorCodeUtil {

    /** ERROR_PROPERTIES. */
    private static final Properties ERROR_PROPERTIES = new Properties();

    static {
        try (InputStream errorInput = new ClassPathResource("error-code.properties").getInputStream()) {
            ERROR_PROPERTIES.load(errorInput);
            log.debug("Error properties loaded successfully");

        } catch (final Exception ex) {
            log.error("Exception occured while loading error codes and messages", ex);
        }

    }

    /**
     *  Private constructor for util class.
     */
    private ErrorCodeUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * builds error description from properties.
     * 
     * @param error , the input error
     * @return the output error
     */
    public static EmsError buildDescription(final EmsError error) {
        final String errorDescription = (String) ERROR_PROPERTIES.get(error.getErrorCode());
        if (errorDescription == null) {
            return error;
        }
        return ImmutableEmsError.builder().from(error).description(errorDescription)
            .message(getErrorMessage(errorDescription, error.getPlaceHolders())).build();
    }

    /**
     * returns error description from properties.
     * 
     * @param error , the input error
     * @return the error description
     */
    public static String getErrorDescription(final EmsError error) {
        final String errorDescription = (String) ERROR_PROPERTIES.get(error.getErrorCode());
        return errorDescription == null ? error.getDescription() : errorDescription;
    }

    /**
     * returns error description from properties.
     * 
     * @param errorCode , the input error code
     * @return the error description
     */
    public static String getErrorDescription(final String errorCode) {
        return (String) ERROR_PROPERTIES.get(errorCode);
    }

    /**
     * returns error description from properties.
     *
     * @param format , the input error code
     * @param placeholders the placeholders
     * @return the error message
     */
    public static String getErrorMessage(final String format, final List<Object> placeholders) {
        return placeholders != null && format != null ? MessageFormat.format(format, placeholders.toArray()) : format;
    }

}
