
package com.ems.common.models;

import java.io.Serializable;
import java.util.List;

import org.immutables.value.Value.Default;
import org.immutables.value.Value.Immutable;
import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This object contains error details of an business exception.
 */
@Immutable
@JsonInclude(Include.NON_NULL)
public interface EmsError extends Serializable{

    /**
     * Gets the error code.
     *
     * @return the error code
     */
    @Schema(example = "XX0000")
    String getErrorCode();

    /**
     * Gets the description.
     *
     * @return the description
     */
    @Nullable
    @Schema(example = "error description")
    String getDescription();

    /**
     * Gets the place holders.
     *
     * @return the place holders
     */
    @Nullable
    List<Object> getPlaceHolders();

    /**
     * Gets the transaction id.
     *
     * @return the transaction id
     */
    @Nullable
    @Schema(description = "Id for tracing root cause", example = "aa5da9240e1640b9")
    String getTransactionId();
    
    /**
     * Gets the description.
     *
     * @return the description
     */
    @Nullable
    @Schema(example = "error message")
    @Default
    default String getMessage() {
        return getDescription();
    }
}
