
package com.ems.common.utils;

import java.util.List;

import com.ems.common.exceptions.EmsBusinessException;
import com.ems.common.models.ImmutableEmsError;

/**
 * Util class for {@link EmsBusinessException}.
 */
public final class ExceptionUtil {

    /**
     *  Private constructor for util class.
     */
    private ExceptionUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * Builds exception.
     *
     * @param errorCode , The error code
     * @return {@link EmsBusinessException}
     */
    public static EmsBusinessException buildException(final String errorCode) {
        final String errorDescription = ErrorCodeUtil.getErrorDescription(errorCode);
        return new EmsBusinessException(
            ImmutableEmsError.builder().errorCode(errorCode).description(errorDescription).build(),
            errorDescription);
    }

    /**
     * Builds exception.
     *
     * @param errorCode , The error code
     * @param placeHolders the place holders
     * @return {@link EmsBusinessException}
     */
    public static EmsBusinessException buildException(final String errorCode,
        final List<Object> placeHolders) {
        final String errorDescription = ErrorCodeUtil.getErrorDescription(errorCode);
        final String errorMessage = ErrorCodeUtil.getErrorMessage(errorDescription, placeHolders);
        return new EmsBusinessException(ImmutableEmsError.builder().errorCode(errorCode)
            .message(errorMessage).description(errorDescription).placeHolders(placeHolders).build(), errorMessage);
    }

}
