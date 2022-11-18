
package com.ems.common.exceptions;

import org.apache.commons.lang3.StringUtils;

import com.ems.common.models.EmsError;
import com.ems.common.utils.ErrorCodeUtil;


/**
 * Business Exception details holder for Bcs Admin Portal.
 */

public class EmsBusinessException extends RuntimeException {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1612474970281387450L;

    /** error. */
    private final EmsError error;

    /** errorMessage. */
    private final String errorMessage;

    /** The raw error message. */
    private final String rawErrorMessage;

    /**
     * Instantiates a new admint portal business exception.
     *
     * @param error the error
     * @param errorMessage the error message
     */
    public EmsBusinessException(final EmsError error, final String errorMessage) {
        super();
        this.error = error;
        this.errorMessage = errorMessage;
        rawErrorMessage = buildRawErrorMessage();
    }
   

    /**
     * Instantiates a new admint portal business exception.
     *
     * @param cause the cause
     * @param error the error
     * @param errorMessage the error message
     */
    public EmsBusinessException(final Throwable cause, final EmsError error,
        final String errorMessage) {
        super(cause);
        this.error = error;
        this.errorMessage = errorMessage;
        rawErrorMessage = buildRawErrorMessage();
    }

    /**
     * Instantiates a new admint portal business exception.
     *
     * @param cause the cause
     * @param error the error
     */

    public EmsBusinessException(final Throwable cause, final EmsError error) {
        super(cause);
        this.error = error;
        errorMessage = null;
        rawErrorMessage = buildRawErrorMessage();
    }

    /**
     * Instantiates a new admint portal business exception.
     *
     * @param cause the cause
     */
    public EmsBusinessException(final Throwable cause) {
        super(cause);
        error = null;
        errorMessage = null;
        rawErrorMessage = buildRawErrorMessage();
    }

    /**
     * Instantiates a new admint portal business exception.
     *
     * @param error the error
     */
    public EmsBusinessException(final EmsError error) {
        super();
        this.error = error;
        errorMessage = null;
        rawErrorMessage = buildRawErrorMessage();
    }

    /**
     * Instantiates a new admint portal business exception.
     *
     * @param errorMessage the error message
     */
    public EmsBusinessException(final String errorMessage) {
        super();
        error = null;
        this.errorMessage = errorMessage;
        rawErrorMessage = buildRawErrorMessage();
    }

    /**
     * Gets the error message.
     *
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage != null ? errorMessage : StringUtils.EMPTY;
    }

    /** {@inheritDoc} */
    @Override
    public String getMessage() {
        return rawErrorMessage;
    }

    /**
     * Builds the raw error message.
     *
     * @return the string
     */
    private String buildRawErrorMessage() {
        final StringBuilder sb = new StringBuilder();
        sb.append("\n{\n   error : ");
        if (error != null) {
            sb.append("{\n     code : ").append(error.getErrorCode()).append(",\n     message : ").append(ErrorCodeUtil
                .getErrorMessage(ErrorCodeUtil.getErrorDescription(error.getErrorCode()), error.getPlaceHolders()))
                .append("\n  }");
        }else {
            sb.append("null\n}");
        }
        sb.append(",\n  errorMessage : ").append(errorMessage).append("\n}");
        return sb.toString();
    }
    
    /**
     * Gets the error.
     *
     * @return the error
     */
    public EmsError getError() {
        return error;
    }

}
